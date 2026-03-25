# 📦 Sistema de Controle de Produtos em Java

## 📌 Sobre o projeto

Aplicação desenvolvida em Java com foco em Programação Orientada a Objetos (POO), permitindo o cadastro e gerenciamento de produtos em estoque.

O sistema possibilita cadastrar múltiplos produtos, listar suas informações e atualizar o estoque com base no ID informado.

---

## 🚀 Funcionalidades

* Cadastro de produtos (ID, nome, preço e quantidade)
* Armazenamento em lista dinâmica
* Exibição de todos os produtos cadastrados
* Busca de produto por ID
* Atualização de estoque (adição de quantidade)
* Validação de entrada para evitar valores inválidos

---

## 🛠️ Tecnologias utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Estruturas de dados (`List`, `ArrayList`)

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto em uma IDE (IntelliJ, Eclipse ou VS Code)

3. Execute a classe `Program.java`

---

## 💻 Exemplo de execução

```text
Quantos produtos serão cadastrados? 2

Produto #1
ID: 1
Nome: Mouse
Preço: 50.00
Quantidade: 10

Produto #2
ID: 2
Nome: Teclado
Preço: 100.00
Quantidade: 5

Lista de produtos:
ID: 1, Nome: Mouse, Preço: 50.00, Quantidade: 10
ID: 2, Nome: Teclado, Preço: 100.00, Quantidade: 5

Digite o ID do produto para atualizar estoque: 1
Digite a quantidade para adicionar ao estoque: 5

Produto atualizado:
ID: 1, Nome: Mouse, Preço: 50.00, Quantidade: 15
```

---

## 📚 Conceitos aplicados

* Classes e objetos
* Encapsulamento (atributos privados + getters/setters)
* Manipulação de listas (`ArrayList`)
* Estruturas de repetição (`for`)
* Busca em coleção
* Validação de dados

---

## 🧠 Regras de negócio

* Só é possível adicionar estoque com valores positivos
* Não é possível remover mais itens do que o disponível em estoque

---

## 📄 Licença

Projeto desenvolvido para fins de estudo e prática em Java.
