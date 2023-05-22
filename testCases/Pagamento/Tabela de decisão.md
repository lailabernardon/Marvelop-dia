## Tabela de decisão

Para a criação de novos cenários de teste para a aplicação Marvelopédia, foi usada a técnica de testes combinatória de tabela de decisão, a técnica especifica as entradas e os possíveis resultados a partir das entradas e ações do usuário.


| Pagamento                | Caso de Teste 1 | Caso de Teste 2 | Caso de Teste 3 | Caso de Teste 4 | Caso de Teste 5 | Caso de Teste 6 | Caso de Teste 7 | Caso de Teste 8 | Caso de Teste 9 | Caso de Teste 10 | Caso de Teste 11 |
|-------------------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|-----------------|------------------|------------------|
| Número do Cartão        | Válido          | Inválido        | Válido          | Válido          | Válido          | Válido          | Válido          | Válido          |                 |                  |                  |
| Nome Impresso           | Válido          | Válido          |                 | Válido          | Válido          | Válido          |                 |                 |                 |                  |                  |
| Validade                | Futura          | Válido          | Válido          | Expirada        | Válido          | Válido          | Válido          | Válido          | Válido          |                  |                  |
| Código de Segurança     | Válido          | Válido          | Válido          | Válido          | Inválido        | Válido          | Válido          |                 | Válido          |                  |                  |
| Clique no Botão Pagar   | Sim             | Sim             | Sim             | Sim             | Sim             | Sim             | Sim             | Sim             | Sim             | Sim              | Sim              |
| Resultado Esperado      | Sucesso         | Erro            | Erro            | Erro            | Erro            | Erro            | Erro            | Erro            | Erro            | Erro             | Erro             |

