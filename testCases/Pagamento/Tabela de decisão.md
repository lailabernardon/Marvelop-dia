## Tabela de decisão

Para a criação de novos cenários de teste para a aplicação Marvelopédia, foi usada a técnica de testes combinatória de tabela de decisão, a técnica especifica as entradas e os possíveis resultados a partir das entradas e ações do usuário.


   Pesquisa   |                  UP1 |    UP2  | UP3 | UP4 | UP5
--------------|----------------------|---------|-----|-----|-----------
Nome de quadrinho existente? |  Sim  | Não    | Não  | Não | Não
Nome vazio?                  |  Não   | Sim    | Não  | Não | Não
Nome inexistente?            |  Não   |  Não    | Sim  | Não | Não
Tamanho minimo nãoa tingido? |  Não   |  Não    | Não  | Sim | Não
Tipo de dado inválido?       |  Não   |  Não    | Não  | Não | Sim
Saída                        |  Resultado da pesquisa é mostrado   | Mensagem de erro    | Mensagem de erro   |Mensagem de erro  |Mensagem de erro  
