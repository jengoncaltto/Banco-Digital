# Banco Digital 🏦

## 📌 Sobre o Projeto

O **Banco Digital** é uma aplicação desenvolvida em **Java** com foco em conceitos de **Programação Orientada a Objetos (POO)**.
O sistema simula um banco, permitindo a criação e gerenciamento de clientes, contas bancárias (corrente e poupança), além de lidar com funcionários e departamentos internos.

## 🚀 Funcionalidades

* 👤 **Clientes**

  * Cadastro de clientes
  * Abertura de contas (corrente e poupança)
  * Operações de saque, depósito e transferência

* 🏦 **Contas**

  * Conta Corrente
  * Conta Poupança
  * Interface `iConta` para padronizar operações

* 👨‍💼 **Funcionários**

  * Classe base `Funcionario`
  * Interface `IFuncionario`
  * Departamentos:

    * Administração
    * Financeiro
    * Tecnologia da Informação (TI)

## 🛠 Estrutura do Projeto

```
Banco-Digital-main/
├── src/
│   ├── Banco.java
│   ├── Main.java
│   ├── FrontCliente/
│   │   ├── Cliente.java
│   │   ├── Conta.java
│   │   ├── ContaCorrente.java
│   │   ├── ContaPoupanca.java
│   │   └── iConta.java
│   └── ParteInterna/
│       ├── Funcionario.java
│       ├── IFuncionario.java
│       ├── Administracao/
│       │   └── DepartamentoAdm.java
│       ├── Financeiro/
│       │   └── DepartamentoFinanca.java
│       └── TI/
│           └── DepartamentoTI.java
```

## ▶️ Como Executar

1. Certifique-se de ter o **Java JDK 11+** instalado.
2. Clone este repositório ou extraia o `.zip`.
3. Compile os arquivos:

   ```bash
   javac src/**/*.java
   ```
4. Execute o programa principal:

   ```bash
   java src/Main
   ```

## 📚 Conceitos Abordados

* Programação Orientada a Objetos (POO)

  * Abstração
  * Herança
  * Polimorfismo
  * Encapsulamento
* Interfaces
* Organização em pacotes
* Simulação de regras de negócio bancário

## 👨‍💻 Autor
Desenvolvido por Jenifer Gonçalves Brito.
Projeto desenvolvido para fins acadêmicos de estudo em **Java** e **POO**.
