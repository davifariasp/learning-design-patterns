# Proxy

Um proxy atua como um intermediário. Ele  controla o acesso ao objeto real, permitindo  funções adicionais como cache ou verificação de permissões.

## Exemplo

Sistema de mensagem de boas-vindas.

### Problema

A priori temos uma classe, `WelcomeMessage`, que é responsável por exibir uma mensagem de boas-vindas quando o usuário está acessando o sistema.

Acontece que agora quero adicionar uma mensagem de boas-vindas em outro idioma, mas não quero alterar a classe `WelcomeMessage`.

### Solução

O padrão Proxy pode ser usado para resolver esse problema. Criamos uma interface `WelcomeMessageInterface` que será implementada por `WelcomeMessage` e `WelcomeMessageProxy`.