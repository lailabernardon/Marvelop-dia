## Tabela de decisão

Para a criação de novos cenários de teste para a aplicação Marvelopédia, foi usada a técnica de testes combinatória de tabela de decisão, a técnica especifica as entradas e os possíveis resultados a partir das entradas e ações do usuário.


   Pesquisa   |                  US1 |    US2  | US3 | US4 
--------------|----------------------|---------|-----|-----
Usuário logado, seleciona produto |  Sim  | Sim    | Sim  | Sim 
Usuário logado, adiciona item    |  Sim   |  Não    | Não  | Não 
Usuário logado, remove item   |  Não   |  Sim   | Não  | Não 
Usuário logado, atualiza quantidade do item |  Não   |  Não    | Sim  | Não 
Usuário logado, visualiza preço total      |  Não   |  Não    | Não  | Sim 
Usuário logado, adiciona item, remove item |  Não   |  Sim    | Não  | Sim 
Saída                        |  Item é adicionado ao carrinho de compras   | Item é removido do carrinho de compras    | A quantidade do item no carrinho de compras é atualizada   |O preço total exibido é a soma dos preços de todos os itens


