# CRUD Livraria Microservico
 Um CRUD básico com tema de livraria, onde o gerenciamento de autores é realizado por um microserviço separado (autorservice). A aplicação de livraria (livraria) se comunica com o microserviço de autores via API REST para realizar operações de cadastro e gerenciamento de autores.  
Livraria: Responsável pelo CRUD de livros.  
Autorservice: Um microserviço dedicado aoCRUD de autores.  

# Tecnologias Utilizadas:
Java 17  
Spring Boot para facilitar o desenvolvimento e a configuração dos serviços.  
Spring Web para criar APIs RESTful.  
Spring Data JPA com Hibernate para interações com o banco de dados H2.  
H2 Database para persistência de dados em memória, permitindo fácil configuração e execução.  
Lombok para reduzir a verbosidade do código com anotações como @Data, @NoArgsConstructor e @AllArgsConstructor.  
Spring RestTemplate para facilitar a comunicação entre o serviço livraria e o microserviço autorservice por meio de chamadas RESTful.  
Maven para gerenciamento de dependências e construção do projeto.  

# Comunicação entre os Serviços:  
A aplicação livraria se comunica com o microserviço autorservice via chamadas HTTP, utilizando o RestTemplate para buscar e cadastrar informações sobre autores.  

# Estrutura:  
Cada serviço possui seu próprio repositório e configuração de banco de dados, permitindo escalabilidade e separação de responsabilidades.

# Como Testar:
para acessar o crud de autores: localhost:8080/cadastro-autor.html  
para acessar o crud de livros: localhost:8080/cadastro-livro.html  
dois front-end bem básicos que fiz só para testar os endpoints.  
