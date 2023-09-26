# TesteCaixaBranca
ETAPA 1 - Teste Caixa Branca Estático
Erros e problemas potenciais encontrados no código

1. *Erro de Digitação no Nome do Driver*:
   - Em vez de `com.mysql.Driver.Menager`, deve ser `com.mysql.jdbc.Driver`.

2. *Erro no Nome da Classe DriverManager*:
   - Em vez de `DriverMenager.getConnection(url)`, deve ser `DriverManager.getConnection(url)`.

3. *Erro de SQL na Consulta*:
   - Há um espaço extra em "usuários" na consulta SQL. Deve ser "usuarios" (ou o nome real da tabela que você está usando).

4. *Possibilidade de Injeção de SQL*:
   - O código cria a consulta SQL concatenando diretamente as strings fornecidas pelo usuário (`login` e `senha`). Isso torna o código vulnerável a ataques de injeção de SQL. É altamente recomendável usar instruções preparadas (prepared statements) para proteger contra esse tipo de ataque.

5. *Tratamento de Exceções Inadequado*:
   - O código atualmente captura exceções, mas não faz nada com elas. Isso pode dificultar a depuração de problemas e não é uma boa prática de tratamento de exceções. Você deve pelo menos imprimir informações sobre as exceções ou realizar um tratamento adequado, como log ou notificação de erros.

6. *Uso de Recursos Não Fechados*:
   - Não há fechamento adequado das conexões, declarações (statements) ou conjuntos de resultados (result sets) após o uso. Isso pode causar vazamento de recursos e diminuir o desempenho do aplicativo. Você deve usar blocos `try-with-resources` ou garantir que todas as conexões e recursos sejam fechados corretamente.

7. *Falta de Autenticação e Autorização Adequadas*:
   - O código faz a verificação de usuário e senha diretamente no código Java, o que não é uma prática segura. Geralmente, as credenciais de autenticação devem ser tratadas com cuidado e, idealmente, em um contexto de segurança mais robusto.

8. *Mistura de Lógica de Negócios e Acesso a Banco de Dados*:
   - A classe `user` parece misturar lógica de negócios com acesso a banco de dados. É uma boa prática separar essas preocupações para tornar o código mais organizado e modular.

9. *Informações de Autenticação em Texto Plano*:
   - As informações de autenticação (usuário e senha) estão sendo passadas diretamente na URL, o que não é seguro. Em uma aplicação real, você deve usar arquivos de configuração externos ou outras abordagens mais seguras para armazenar essas informações.
