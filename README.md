# Conversor de Moeda

Um aplicativo simples e interativo de Conversão de Moeda desenvolvido em Java. Este aplicativo permite aos usuários converter valores entre diferentes moedas utilizando as taxas de câmbio mais recentes da ExchangeRate-API.

## Funcionalidades

- **Menu Interativo**: Os usuários podem selecionar as moedas de origem e destino e inserir o valor que desejam converter.
- **Taxas de Câmbio em Tempo Real**: Obtém as taxas de câmbio mais recentes da ExchangeRate-API.
- **Suporte a Múltiplas Moedas**: Suporta várias moedas como USD, EUR, BRL e mais.
- **Requisições Dinâmicas**: Realiza requisições à API dinamicamente com base na entrada do usuário para moedas de origem e destino.
- **Tratamento de Erros**: Lida com entradas inválidas e erros de requisição à API de forma elegante.

## Começando

### Pré-requisitos

- Java Development Kit (JDK) 8 ou superior
- Biblioteca Gson (para parsing de JSON)



### Uso


  **Siga as Instruções na Tela**: Insira a moeda de origem, a moeda de destino e o valor que deseja converter.

### Exemplo
Escolha a moeda de origem (ex: USD, EUR, BRL): USD
Escolha a moeda de destino (ex: USD, EUR, BRL): EUR
Digite o valor a ser convertido: 100

Moeda de Origem: USD
Moeda de Destino: EUR
Taxa de Conversão (USD para EUR): 0.85
Valor em USD: 100
Valor em EUR: 85
