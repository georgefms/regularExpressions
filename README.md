# Validador de Campos com Expressões Regulares

Este projeto é uma aplicação Java que realiza a validação de campos comuns em formulários brasileiros, como nome, e-mail, senha, CPF e telefone, utilizando expressões regulares e lógica complementar. O sistema possui uma interface interativa no terminal com suporte completo a operações CRUD.

## 📋 Funcionalidades

- Validação de campos via expressões regulares
- Explicações em tempo real para entradas inválidas
- Cadastro e listagem de usuários
- Edição e remoção de usuários
- Interface de menu no terminal

## 📦 Tecnologias

- Java 11+
- Expressões Regulares (Regex)
- Programação Orientada a Objetos
- Terminal (CLI)

## 🚀 Como Executar

### Compilação

```bash
javac -d out src/**/*.java src/*.java
```

### Execução

```bash
java -cp out Main
```

## 🧪 Exemplos de Entrada
 - Nome: Ada Lovelace
 - E-mail: exemplo@teste.br
 - Senha: A1b2c3d4 (8 caracteres, com maiúscula e número)
 - CPF: 123.456.789-09
 - Telefone: (91) 99999-9999

## 📁 Estrutura do Projeto

 src/
 ├── Main.java
 ├── Menu.java
 ├── models/
 │   └── User.java
 └── validators/
    ├── Validador.java
    ├── NameValidator.java
    ├── EmailValidator.java
    ├── PwValidator.java
    ├── CpfValidator.java
    └── PhoneNumValidator.java

## 📚 Relatório
Este projeto foi desenvolvido como parte da disciplina de Teoria da Computação (UFPA), com entrega em formato de artigo técnico (modelo SBC).
