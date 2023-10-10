# TesteCaixaBranca
ETAPA 3 – Documentação
# Sistema de Autenticação de Usuários

Este repositório contém um sistema simples de autenticação de usuários em Java, que interage com um banco de dados MySQL para verificar as credenciais dos usuários.

## Conteúdo do Repositório

- [UserDAO.java](UserDAO.java): Este é o principal arquivo Java que contém a classe `UserDAO`. Esta classe é responsável por se conectar ao banco de dados e verificar se um usuário com um determinado login e senha existe no banco de dados.

## Pré-requisitos

- Java Development Kit (JDK)
- MySQL Server
- Biblioteca JDBC do MySQL

## Configuração

Antes de usar este sistema, você precisa configurar o banco de dados MySQL com as tabelas e dados necessários. Certifique-se de atualizar as constantes `URL`, `USER` e `PASSWORD` na classe `UserDAO` com as informações corretas do seu banco de dados.

## Como Usar

1. Clone este repositório para o seu ambiente de desenvolvimento.

2. Configure o banco de dados conforme mencionado na seção de Configuração.

3. Importe o arquivo `UserDAO.java` para o seu projeto Java.

4. Use a classe `UserDAO` para verificar a autenticidade dos usuários no seu aplicativo Java.

## Exemplo de Uso

Aqui está um exemplo de como você pode usar a classe `UserDAO` para verificar um usuário:

```java
public static void main(String[] args) {
    UserDAO userDAO = new UserDAO();
    String login = "usuario123";
    String senha = "senha123";

    if (userDAO.verificarUsuario(login, senha)) {
        System.out.println("Usuário autenticado com sucesso.");
    } else {
        System.out.println("Falha na autenticação do usuário.");
    }
}
