# Multi3-BancoH2

### Proposta
<p>
  ''Realize um CRUD em REST com os métodos Get, Post, Put e Delete para a classe Pessoa, os atributos dessa classe são: id, nome, idade e e-mail. Como banco de dados use o Banco h2. O programa deve retornar um "json" com as informações.''
</p>

##

### Conectando-se ao banco de dados H2
<img src="https://imgur.com/3k3bNLt.png">

No campo JDBC URL: jdbc:h2:~/test <br>
User name: sa <br>
e password deixar em branco. <br>
*certifique-se de deixar o Driver Class: org.h2.Driver<br>
Acessar: http://localhost:8080/h2/login.jsp

### ENDPOINTS

- GET: http://localhost:8080/pessoas
- POST: http://localhost:8080/pessoas/cadastrar
- PUST: http://localhost:8080/pessoas
- DELETE: http://localhost:8080/pessoas/deletar/{id}

### MODEL
<div>
  {<br>
    "id": "0",<br>
    "nome": " ",<br>
    "idade":" ",<br>
    "email":" "<br>
  }<br>
</div>
