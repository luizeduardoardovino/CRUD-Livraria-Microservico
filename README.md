# CRUD Livraria Microserviço

Este projeto é uma aplicação básica de CRUD com o tema de uma livraria, onde o gerenciamento de **autores** é feito por um microserviço separado chamado **AutorService**. A aplicação principal da livraria, **Livraria**, se comunica com esse microserviço via API REST para realizar operações de cadastro e gerenciamento de autores.

- **Livraria**: Responsável pelo CRUD completo de livros.
- **AutorService**: Microserviço dedicado exclusivamente ao CRUD de autores.

## Tecnologias Utilizadas

- **Java 17**: Linguagem principal para o desenvolvimento do projeto.
- **Spring Boot**: Para facilitar a configuração e o desenvolvimento dos microserviços.
- **Spring Web**: Para criar APIs RESTful que conectam os serviços.
- **Spring Data JPA**: Com integração ao Hibernate, para facilitar as operações com o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para persistência temporária de dados.
- **Lombok**: Utilizado para reduzir a verbosidade do código com anotações como `@Data`, `@NoArgsConstructor`, e `@AllArgsConstructor`.
- **Spring RestTemplate**: Ferramenta para realizar a comunicação entre os serviços de forma eficiente via HTTP.
- **Maven**: Usado para gerenciar dependências e facilitar a construção do projeto.

## Comunicação entre os Serviços

A aplicação **Livraria** se comunica com o microserviço **AutorService** via chamadas HTTP, utilizando o **RestTemplate** para buscar e cadastrar informações sobre autores.

## Estrutura

Cada serviço possui seu próprio repositório e configuração de banco de dados, garantindo escalabilidade e separação de responsabilidades. Isso permite uma arquitetura mais modular e de fácil manutenção.

## Como Testar

- Para acessar o CRUD de autores: `http://localhost:8080/cadastro-autor.html`
- Para acessar o CRUD de livros: `http://localhost:8080/cadastro-livro.html`

O projeto inclui dois front-ends básicos que permitem testar os endpoints do microserviço de autores e o CRUD de livros.
