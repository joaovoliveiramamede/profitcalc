## Introdução

Está projeto é destinado a obter o lucro de uma empresa que venda produtos por unidades. Com uma determinada venda, você deve 
levar em consideração que teria custo para a produção do produto, e um custo fixo que você tem para fazer a produção, seja ela um aluguel, funcionarios, energia ou aguá, etc. A receita é o valor final do produto.

## Estrutura de pastas

O projeto contem duas pastas padrão, onde:

- `src`: pasta que contem os arquivos de codigo.
- `lib`: pasta que contem as libs que utilizamos no projeto.

## Dados processados
Aqui nos definiremos as propriedades que precisaremos para analisar e chegar a um valor que defina o lucro em determinado tempo:

- `revenue`: receita, seria o valor do produto por unidade.
- `costPerunit`: custo por unidade, ou seja, custo que teve para produzir uma unidade do produto.
- `costForProduction`: custo para produção, ou seja, custo que você teve em `x` tempo.

## Começando

Para rodar o projeto, você deve primeiro compilar as libs juntamente com as classes de codigo utilizando o compilador `javac`do java, em sua versão 17. 
Logo em seguida, execute utilizando os comandos:

- compile: `javac -cp "lib/*" -d bin $(find src -name "*.java")` - linux
- execute: `java -cp "bin:lib/*" com.profit.calc.Main` - linux