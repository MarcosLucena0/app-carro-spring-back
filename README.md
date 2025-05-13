# 🚗 Projeto de Gerenciamento de Carros, Marcas e Acessórios

Este projeto consiste em uma aplicação web Full-Stack desenvolvida em Spring Boot no back-end e Angular no fron-tend (vale ressaltar que esse é o projeto back, para vê-lo funcionar deve baixar e rodar a versão do front). A aplicação realiza operações CRUD completas para entidades de Carros, Marcas e Acessórios, com relacionamento entre elas.



## 🛠 Tecnologias Utilizadas

### Backend (Spring Boot)
- Java 17+

- Spring Boot

- Spring Data JPA

- Spring Web

- MySQL

### Frontend (Angular)
- Angular 17+

- TypeScript

- Angular Material

- RxJS

- BootStrap



## 🔗 Relacionamentos Entre Entidades

### Carro
- Possui uma única Marca (Relacionamento: muitos para um)
- Pode ter vários Acessórios (Relacionamento: muitos para muitos)

### Marca
- Pode estar associada a vários Carros (Relacionamento: um para muitos)

### Acessório
- Pode estar associado a vários Carros (Relacionamento: muitos para muitos)




## 🚀 Funcionalidades
 ✅Cadastro, listagem, edição e exclusão de Carros

 ✅Cadastro, listagem, edição, exclusão e gerenciamento de Marcas

 ✅Cadastro, listagem, edição ,exclusão e associação de Acessórios

 ✅Integração entre frontend e backend via API REST

 ✅Validações de formulário



## 🔧 Como Rodar o Projeto

### Back-End (SpringBoot)
1. Clone o repositório.

2. Vá para a pasta do projeto:
3. Procure a pasta src/main/resources/application.properties e altere a url do banco de dados caso você utilize um BD diferente do mysql.
4. Altere a senha do BD, caso seja diferente.
5. Crie um Banco chamado carros para as tabelas serem criadas dentro.
6. Start o projeto, em seguida rode a aplicação do front para vê-lo funcionar.



## 🖼️ Capturas de Tela

![alt text](image.png)

![alt text](image-1.png)



## 📌 Observações

- Este projeto está com a url do banco de dados MySQL no arquivo do back src/main/resources/application.properties;

- Crie uma base de dados chamada (carros), para que ao rodar a versão do back, as tabelas sejam criadas dentro do schema;

- O projeto possui uma tela de login, onde o nome do Usuario é (admin) e a senha (admin);

- Projeto ideal para fins didáticos, portfólios ou bases para sistemas automotivos maiores;


## Licença
