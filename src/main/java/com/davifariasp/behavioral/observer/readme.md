# Observer

O Padrão Observer é um padrão de projeto comportamental que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. Esse padrão é amplamente utilizado para implementar sistemas de eventos, onde um objeto (chamado de Subject ou Observável) mantém uma lista de dependentes (chamados de Observers) que precisam ser notificados sobre mudanças em seu estado.

## Exemplo

Sistema de Notificação de Atualização de Estoque

### Problema

No código inicial, a classe Iventory é responsável por atualizar o estoque e notificar diretamente o time de marketing e os clientes. Isso cria um acoplamento forte entre a classe Iventory e as classes Marketing e Customer. Qualquer mudança na lógica de notificação ou a adição de novos observadores exigiria a modificação da classe Iventory, o que viola o princípio de aberto/fechado (open/closed principle) do SOLID.

### Solução

Para resolver esse problema, foi aplicado o padrão de projeto Observer. Esse padrão permite que objetos interessados sejam notificados de mudanças em outro objeto, sem que o objeto observado precise conhecer detalhes sobre seus observadores.

A solução envolve a criação de uma interface Observer que define um método update. As classes Marketing e Customer implementam essa interface, permitindo que sejam notificadas de mudanças no estoque. A classe Iventory agora mantém uma lista de observadores e notifica todos eles quando o estoque é atualizado.

No método main, os observadores são registrados na classe Iventory, e quando o estoque é atualizado, todos os observadores são notificados automaticamente.