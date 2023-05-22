## Tabela de decisão

Para a criação de novos cenários de teste para a aplicação Marvelopédia, foi usada a técnica de testes combinatória de tabela de decisão, a técnica especifica as entradas e os possíveis resultados a partir das entradas e ações do usuário.


   Pesquisa   |                  US1 |    US2  | US3 | US4 
--------------|----------------------|---------|-----|-----
Usuário está logado? |  Sim  | Não    | Não  | Não | Não
Itens estão presentes no carrinho de compras?              |  Não   | Sim    | Não  | Não | Não
Remover item do carrinho de compraS?            |  Não   |  Não    | Sim  | Não | Não
Atualizar quantidade de um item no carrinho de compras? |  Não   |  Não    | Não  | Sim | Não
Calcular preço total no carrinho de compras?      |  Não   |  Não    | Não  | Não | Sim
Saída                        |  Resultado da pesquisa é mostrado   | Mensagem de erro    | Mensagem de erro   |Mensagem de erro  |Mensagem de erro  
