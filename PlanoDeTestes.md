# Plano de Teste

**Marvelopédia**

*versão 0.0.1*

## Histórico das alterações

   Data    | Versão |    Descrição   | Autor(a)
-----------|--------|----------------|-----------------
19/05/2023 |  1.0   | Criação da Introdução e escopo    | Laila Bernardon
20/05/2023 |  1.0   | Criação e planejamento dos testes e cronograma    | Laila Bernardon

## 1 - Introdução

Este documento descreve os requisitos a testar, os  tipos de testes definidos para cada iteração, os recursos de hardware e software a serem empregados e o cronograma dos testes ao longo do projeto. As seções referentes aos requisitos, recursos e cronograma servem para permitir ao gerente do projeto acompanhar a evolução dos testes.


Escopo:
- Marvelopédia Version 0.0.1
- Android Version 9 
- Hardware Galaxy S10


Prioridade do problema
O campo Prioridade permite que você especifique a importância de um problema. Este campo é obrigatório. As equipes geralmente têm critérios diferentes para determinar a importância de um problema. A tabela a seguir mostra uma maneira comum de priorizar problemas:

Prioridade do problema	Descrição

P0 Um problema que precisa ser resolvido imediatamente e com todos os recursos necessários. Esse problema causa uma interrupção total ou faz com que uma função crítica do produto fique indisponível para todos, sem nenhuma solução conhecida.

P1 Um problema que precisa ser resolvido rapidamente. Esse problema impacta significativamente uma grande porcentagem de usuários. Se houver uma solução alternativa, ela é parcial ou muito dolorosa. O problema afeta uma função organizacional principal ou impede fundamentalmente outra equipe.

P2 Um problema que precisa ser resolvido em uma escala razoável. Esse tipo de problema pode ser qualquer um dos seguintes: 

1) Um problema que seria P0 ou P1, mas tem uma solução alternativa razoável, 
2) Um problema que é importante para uma grande porcentagem dos usuários e está conectado às principais funções organizacionais, 
3) Um problema que é um obstáculo para o trabalho de outras equipes e não tem uma solução razoável. P2 é especialmente relevante para problemas de primeiro uso ou tempo de instalação e é o nível de prioridade padrão.

P3 Um problema que precisa ser resolvido quando possível. Esse problema é relevante para as funções organizacionais principais ou para o trabalho de outras equipes, mas não impede o progresso ou tem uma alternativa razoável.

P4	Um problema que precisa ser resolvido. Esse problema não é relevante para as principais funções organizacionais ou para o trabalho de outras equipes, ou está relacionado apenas à atratividade ou ao prazer do sistema.
Referência: https://developers.google.com/issue-tracker/concepts/issues?hl=pt-br#priority

## 2 - Requisitos a Testar

### Casos de uso:

Identificador do caso de uso | Login
-----------------------------|---------------------
id UL1                       |       Login correto
id UL2                       |       Email incorreto
id UL3                       |       Senha incorreta
id UL4                       |       Campos vazios


Identificador do caso de uso | Cadastro
-----------------------------|---------------------
id UC1                       |       Cadastro correto
id UC2                       |       Email incorreto
id UC3                       |       Senha incorreta
id UC4                       |       Campos vazios
id UC5                       |       Confirmação de senha incorreto

### Requisitos não-funcionais:

Identificador do requisito   |  Login
-----------------------------|---------------------
id reqL1                      |      Usabilidade
id reqL2                      |      Segurança
id reqL3                      |      Tempo

Identificador do requisito   |  Cadastro
-----------------------------|---------------------
id reqC1                      |      Usabilidade
id reqC2                      |      Segurança
id reqC3                      |      Tempo

## 3 - Tipos de teste

Nesta seção contém os tipos de testes escolhidos para cada iteração do projeto.
Definido inicialmente apenas os tipos de testes que serão usadas na release em questão. 
Com base no guia de testes, os tipos de testes que melhor se adéquam aos requisitos, tipo da aplicação e seus recursos disponíveis:

- Teste de interface de usuário;
- Teste de performance;
- Teste de segurança e controle de acesso;
- Teste de instalação;
- Entre outros.

### 3.1 - Métodos da Classe 

Para teste de funcionalidade.
Aqui deve-se verificar se cada classe retorna o esperado.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Validar a função de Login
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade (x)
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Validar a função de Cadastro
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade (x)
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

### 3.2 - Persistência de Dados

Para teste de integridade de dados e do banco de dados.
Aqui deve-se verificar se os dados não se perdem ao desligar o programa. Se o programa consegue se recuperar em caso de falha ou fechamento repentino.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se dados de cadastro são mantidos após súbito desligamento do programa 
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema (x)
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se Login é mantido após súbito desligamento do programa 
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema (x)
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon 
        </th>
    </tr>
</table>
<br/>


### 3.3 - Integração dos Componentes

Para teste de funcionalidade.
Aqui deve-se verificar se as classes e métodos conseguem fazer a integração entre elas para uma sequência de ações do programa.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se as classes e métodos da função de Login fazem a integração entre elas com ações em sequência 
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração (x)
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca (x)
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se as classes e métodos da função de cadastro fazem a integração entre elas com ações em sequência 
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            (x) manual
        </th>
        <th colspan="2">
            (x) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração (x)
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca (x)
        </th>
        <th colspan="2">
            Caixa preta (x)
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

### 3.4 - Tempo de Resposta

Para teste de funcionalidade.
Aqui deve-se verificar se o tempo de respostas das ações do programa são consideradas aceitáveis.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verficiar se o tempo de resposta de Login são aceitáveis
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            ( ) manual
        </th>
        <th colspan="2">
            ( ) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta ( )
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verficiar se o tempo de resposta de Cadastro são aceitáveis
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            ( ) manual
        </th>
        <th colspan="2">
            ( ) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta ( )
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

### 3.5 - Feedbacks

Aqui deve-se verificar se os feedbacks existentes no programa são disparados quando devem.
Se possível usar teste automatizado.

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se feedback de Cadastro são disparados quando necessário e com clareza
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            ( ) manual
        </th>
        <th colspan="2">
            ( ) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta ( )
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>

<br/>
<table>
    <tr>
        <th>
            Objetivo
        </th>
        <th colspan="4">
            Verificar se feedback de Login são disparados quando necessário e com clareza
        </th>
    </tr>
    <tr>
        <th>
            Técnica:
        </th>
        <th colspan="2">
            ( ) manual
        </th>
        <th colspan="2">
            ( ) automática
        </th>
    </tr>
    <tr>
        <th>
            Estágio do teste
        </th>
        <th>
            Integração ( )
        </th>
        <th>
            Sistema ( )
        </th>
        <th>
            Unidade ( )
        </th>
        <th>
            Aceitação ( )
        </th>
    </tr>
    <tr>
        <th>
            Abordagem do teste
        </th>
        <th colspan="2">
            Caixa branca ( )
        </th>
        <th colspan="2">
            Caixa preta ( )
        </th>
    </tr>
    <tr>
        <th>
            Responsável(is)
        </th>
        <th colspan="4">
            Laila Bernardon
        </th>
    </tr>
</table>
<br/>




## 4 - Recursos

Esta seção descreve os recursos humanos, de ambiente de teste (hardware e software) e de ferramentas de automatização de testes necessários para execução dos testes que devem ser descritos nas subseções que seguem.

### 4.1 - Ambiente de teste - Software e Hardware

- Marvelopédia Version 0.0.1
- Android Version 9 
- Hardware Galaxy S10
- Git Bash
- Git hub
- selenium-java 4.9.0
- java-client 8.3.0
- AppiumDemoProject 0.0.1-SNAPSHOT
- Eclipse
- Android Studio

### 4.2 - Ferramenta de teste

Cucumber

## 5 - Cronograma

Tipo de teste      | Duração | data de início | data de término
-------------------|---------|----------------|-----------------
planejar teste     |    3h     | 20/05/2023     | 20/05/2023 
projetar teste     |    3h    | 20/05/2023     | 20/05/2023 
implementar teste  |    3h     | 20/05/2023     | 20/05/2023
executar teste     |    3h     | 21/05/2023     | 21/05/2023
avaliar teste      |    3h     | 21/05/2023     | 21/05/2023
