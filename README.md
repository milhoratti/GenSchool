GenSchool

Descrição da API
O projeto GenSchool é uma aplicação simples e direta para gerenciar os dados de estudantes de uma escola. Ele permite criar, listar, atualizar e excluir (CRUD) informações de estudantes, incluindo o nome, idade, notas dos semestres, nome do professor e número da sala.

Este projeto foi desenvolvido utilizando Spring Boot e MySQL como banco de dados relacional.

Funcionalidades

Criar Estudantes
Listar Estudantes cadastrados
Consultar Estudantes pelo ID
Atualizar Estudante
Excluir Estudante

Tecnologias Utilizadas
Java 17
Spring Boo
Spring Data JPA
MySQL
Springdoc OpenAPI (Swagger)
Insomnia (para testes de API)
MySQL Workbench ou Insomnia (para visualização e testes)

Configuração do Projeto

1. Clone o Repositório

git clone https://github.com/seu-usuario/genschool.git
cd genschool

2. Configurar o Banco de Dados
No arquivo application.properties, configure as credenciais do seu banco de dados MySQL:


spring.datasource.url=jdbc:mysql://localhost:3306/genschool
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update

3. Executar o Projeto
Use o Maven para compilar e rodar o projeto:

mvn spring-boot:run

4. Testar as Funcionalidades
Você pode usar o Insomnia ou outra ferramenta de sua preferência para testar os endpoints da API. Os principais endpoints são:

POST /api/estudantes - Cria um novo estudante.
GET /api/estudantes - Lista todos os estudantes.
GET /api/estudantes/{id} - Retorna detalhes de um estudante específico.
PUT /api/estudantes/{id} - Atualiza as informações de um estudante.
DELETE /api/estudantes/{id} - Exclui um estudante.

5. Documentação da API
A documentação da API está disponível via Swagger na URL:


http://localhost:8080/swagger-ui/index.html

Melhorias Futuras

Implementar autenticação e autorização.
Adicionar mais testes unitários e de integração.
Implementar paginação e filtros para listagem de estudantes.

