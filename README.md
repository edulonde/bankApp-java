# bankApp-java
Aplicação para lidar com clientes e requisições em um banco. 

Aplicação tarefas:
- ler um .csv 
- estrutura de dados para lidar com as contas
- poupanca e cona corrente terão estes métodos:
  - depósito()
  - saque()
  - transferir()
  - mostrarInfo()
- gerar conta: 1 ou 2 para poupança e corrente, ultimos dois numeros do documento, id de 5 numeros, a três numeros randomicos
- poupanca tem deposito de segurança com três numeros
- corrente recebem um numero de cartao com 12 digitos e 4 digitos de senha
- taxa base:
  - poupanca: .25 pontos menos que a taxa base
  - corrente: 15% da taxa base
- o método mostrarInfo() deverá mostrars informações relevantes.
