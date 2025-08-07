# 💰 Sistema de Conta Bancária em Java

Este projeto é um **simulador de conta bancária** feito em Java, que permite ao usuário interagir com operações básicas como consultar saldo, sacar, pagar boletos e usar o cheque especial.

---

## 🚀 Funcionalidades

O sistema simula um menu bancário com as seguintes opções:

1 - Consultar saldo
2 - Consultar cheque especial
3 - Depositar dinheiro
4 - Sacar dinheiro
5 - Pagar boleto
6 - Verificar uso do cheque especial
0 - Sair

yaml
Copiar
Editar

---

## 📋 Lógica do Sistema

- Ao iniciar o programa, o usuário informa o valor inicial para depósito na criação da conta.
- Com base nesse valor, é definido automaticamente o **limite do cheque especial**:
  - Se o saldo for até R$500 → cheque especial = R$50
  - Se for acima de R$500 → cheque especial = 50% do valor depositado

---

## 💼 Regras das operações

### ✅ Depósito
- O valor informado é adicionado ao saldo.

### ✅ Saque
- Se houver saldo suficiente: o valor é debitado normalmente.
- Se não houver saldo, mas for possível cobrir com o cheque especial:
  - O cheque especial é usado.
  - Uma taxa de 20% sobre o valor usado do cheque é aplicada.
- Se nem o saldo nem o cheque especial forem suficientes → operação negada.

### ✅ Pagamento de Boleto
- Funciona igual ao saque: primeiro tenta pagar com saldo, depois com cheque especial, aplicando taxa se necessário.

### ✅ Consultas
- O menu permite verificar o saldo atual, o limite do cheque especial e se o usuário está utilizando parte do limite.

---

## 🧠 Tecnologias utilizadas

- Java (estrutura básica com `Scanner` para entrada de dados)
- Lógica condicional (`if`, `else if`, `switch`, `do-while`)
- Tipos primitivos (`double`, `int`)

---

👩‍💻 Autora
Desenvolvido por Eduarda durante o Bootcamp Santander Java.
