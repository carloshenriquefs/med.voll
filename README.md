## :construction: - Projeto Voll Med:

- Aplicativo para monitorar uma clínica médica para gestão de consultas.
- Funcionalidades como: cadastro de médicos e de pacientes, e também o agendamento e cancelamento de consultas;

#

## ⚙️ - Funcionalidades:

- [x] - CRUD de médicos;
- [x] - CRUD de pacientes;
- [x] - Agendamento de consultas;
- [x] - Cancelamento de consultas.

#

## :white_check_mark: - Objetivos:

- Desenvolvimento de uma API Rest;
- CRUD (Create, Read, Update e Delete);
- Validações;
- Paginação e ordenação;
- Boas práticas na API;
- Tratamento de erros;
- Autenticação;
- Autorização (controle de acesso);
- Proteção contra ataques (CSRF, clickjacking, etc.);
- Tokens JWT;
- Funcionalidade de agendamentos de consultas;
- Documentação da API;
- Testes automatizados;
- Build do projeto;

#

## :computer: - Tecnologias:

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- Spring Boot 3;
- Java 17;
- Lombok;
- MySQL / Flyway;
- JPA / Hibernate;
- Maven;
- Insomnia;

#

## :video_game: - Comandos Flyway:

```
- mysql -u root  -p;
- use nome_do_banco;
- show tables;
- desc medicos;
- select * from medicos;
- insert into usuarios values (1, 'ana.souza@voll.med', '123456');
- insert into usuarios values (1, 'ana.souza@voll.med', '$2a$10$Y50UaMFOxteibQEYLrwuHeehHYfcoafCopUazP12.rqB41bsolF5.');
```

#

## :pushpin: - STATELESS:

- Autenticação em API REST: não guarda estado, não possui dados armazenados no lado do servidor; 

![filters drawio](https://github.com/carloshenriquefs/med.voll/assets/54969405/81e94c9c-6a5c-42ee-b03e-032f2d1a6299)

#

## :key: - Autenticação:

![autentificacao drawio (2)](https://github.com/carloshenriquefs/med.voll/assets/54969405/a181fa17-d3e0-4c6d-8082-cd229c8c4ba6)

#

## :closed_lock_with_key: - Autorização:

![autorizacao drawio](https://github.com/carloshenriquefs/med.voll/assets/54969405/b7a898de-4d73-414f-aa5f-02423c893016)

#

## :green_book: - Swagger:

```
http://localhost:8080/swagger-ui/index.html
```

#

## 📄 - Documentação:

- A documentação das funcionalidades da aplicação pode ser acessada neste link: <a href="https://trello.com/b/O0lGCsKb/api-voll-med">Trello</a>

#

## :framed_picture: - Layout: 

- O layout da aplicação mobile está disponível neste link: <a href="https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med">Figma</a>


![image](https://github.com/carloshenriquefs/med.voll/assets/54969405/6ac140bb-a5ce-4be3-9c08-3b3d444ef1f8)

