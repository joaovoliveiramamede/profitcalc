package com.profit.calc.api;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpStarter {
	
	private final static Integer PORT = 8080;
	
	public void start() throws IOException {
		
		try {
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Server init on port: " + PORT);
			while (true) {
				
				Socket socket = server.accept();
				new HttpRouter().handle(socket);
				
			}
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	} 
	
}
