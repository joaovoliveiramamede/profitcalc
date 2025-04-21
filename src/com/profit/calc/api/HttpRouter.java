package com.profit.calc.api;

import java.io.*;
import java.net.Socket;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HttpRouter {

    public void handle(Socket socket) {
        try (
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input))
        ) {
            // Lê a primeira linha da requisição (ex: POST / HTTP/1.1)
            String requestLine = reader.readLine();
            System.out.println("Request: " + requestLine);

            // Lê os cabeçalhos (até uma linha em branco)
            String line;
            String contentLength = null;
            while (!(line = reader.readLine()).isEmpty()) {
                System.out.println("Header: " + line);
                if (line.startsWith("Content-Length:")) {
                    contentLength = line.split(":")[1].trim();
                }
            }

            // Se Content-Length não estiver presente, não sabemos o tamanho do corpo
            if (contentLength == null) {
                System.out.println("Erro: Content-Length não encontrado!");
                return;
            }

            // Lê o corpo da requisição conforme o tamanho indicado no cabeçalho Content-Length
            int contentLengthInt = Integer.parseInt(contentLength);
            char[] requestBody = new char[contentLengthInt];
            reader.read(requestBody);

            // Converte o corpo da requisição (JSON) para uma string
            String jsonString = new String(requestBody);
            System.out.println("Request Body: " + jsonString);

            // Usando o Gson para fazer o parse do JSON
            JsonObject json = JsonParser.parseString(jsonString).getAsJsonObject();
            
            // Extraímos o valor de "name" do JSON
            String name = json.get("name").getAsString();
            System.out.println("Nome extraído do JSON: " + name);

            // Monta a resposta com o nome extraído
            String responseText = "Olá, " + name + "!";
            // Calcula o tamanho do corpo da resposta
            String httpResponse = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/plain\r\n" +
                    "Content-Length: " + responseText.length() + "\r\n" +
                    "\r\n" +
                    responseText;

            // Envia a resposta de volta ao cliente
            output.write(httpResponse.getBytes("UTF-8"));
            output.flush();
            socket.close();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
