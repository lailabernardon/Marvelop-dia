## Tabela de decisão

Para a criação de novos cenários de teste para a aplicação Marvelopédia, foi usada a técnica de testes combinatória de tabela de decisão, a técnica especifica as entradas e os possíveis resultados a partir das entradas e ações do usuário.


   Cadastro  | UC1 |    UC2  | UC3 | UC4 | UC5
-----------|--------|----------------|-----------------|-----------------|-----------------
Existe um usuário? |  Não  | Não    | Não  | Não | Não
Senha válida? |  Sim   | Sim    | Sim | Não | Não 
Confirmação de senha válida? |  Sim   | Sim   | Não | Não | Sim 
Email válido? |  Sim   | Não   | Sim | Não | Sim 
Sáida |  usuário cadastrado   | mensagem de erro   | mensagem de erro | mensagem de erro | mensagem de erro
