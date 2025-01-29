# State

O State é um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. Esse padrão é útil quando um objeto precisa mudar seu comportamento dinamicamente com base em seu estado, evitando o uso de condicionais complexas (como if-else ou switch-case) para gerenciar diferentes estados.

## Exemplo

Sistema de pedidos (Order) com diferentes estados: New, Processed, Shipped, Delivered, e Closed.

### Problema

No código original, a classe Order utiliza uma série de condicionais (if-else) para alterar o comportamento do método processOrder com base no estado atual do pedido. Isso torna o código difícil de manter e estender, especialmente se novos estados forem adicionados no futuro.

### Solução

O padrão State resolve esse problema ao encapsular cada estado em uma classe separada. Cada classe de estado implementa uma interface comum (OrderState), que define o comportamento do pedido para aquele estado específico. A classe OrderContext (ou Order) mantém uma referência para o estado atual e delega a execução do método process para o estado atual.