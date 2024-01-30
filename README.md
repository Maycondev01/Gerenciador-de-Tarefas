# Gerenciador de Tarefas em Java.

## Nesse projeto foram utilizadas as seguintes dependências:
1. **spring-boot-starter-data-jpa | Spring Data JPA**
2. **spring-boot-starter-web | Spring WEB**
3. **spring-boot-devtools | Spring Boot DevTools** 
4. **mysql-connector-j | MySQL Driver**

## Para iniciar o projeto, basta seguir os seguintes passos:
1. Faça um clone para algum diretório da sua preferência: git clone https://github.com/Maycondev01/Gerenciador-de-Tarefas.git
2. Navegue até o diretório do projeto recém-clonado.
3. Compile o projeto/instale suas dependências: mvn clean install
4. Execute a aplicação: mvn spring-boot:run
5. Certifique-se de que um servidor MySQL esteja em execução localmente na porta padrão 3306.
6. Confirme se o banco de dados to_do já foi criado no MySQL.
7. Acesse a Aplicação (Postman):

-   Após a aplicação estar funcionando, para testar as operações do seu controller no Postman, você pode seguir os seguintes passos:
1. **Criar uma nova Tarefa:**
   - Método: POST
   - URL: http://localhost:8080/todos
   - Corpo (em JSON):
     `{"titulo": "Nova Tarefa", "descricao": "Descrição da nova tarefa", "concluido": false, "prioridade": 1}`
  
     **Exemplo:**
     ![image](https://github.com/Maycondev01/Gerenciador-de-Tarefas/assets/89277603/79bb38f6-858c-490a-88c6-c8aa7dfd054d)

2. **Listar Todas as Tarefas:**
   - Método: GET
   - URL: http://localhost:8080/todos

    **Exemplo**
   ![image](https://github.com/Maycondev01/Gerenciador-de-Tarefas/assets/89277603/b9363ecd-485d-43d3-a898-516e7e5efe8c)

3. **Atualizar uma Tarefa por ID:**
   - Método: PUT
   - URL: http://localhost:8080/todos/{id} (substitua {id} pelo ID da tarefa)
   - Corpo (em JSON):
     `{"titulo": "Tarefa Atualizada", "descricao": "Nova descrição", "concluido": true, "prioridade": 2}`

4. **Deletar uma Tarefa por ID:**
   - Método: DELETE
   - URL: http://localhost:8080/todos/{id} (substitua {id} pelo ID da tarefa)


**FIM!!!**

