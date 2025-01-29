# Template Method

O Template Method é um padrão de projeto comportamental que define o esqueleto de um algoritmo em uma operação, adiando alguns passos para as subclasses. Esse padrão é útil quando você tem um algoritmo que segue uma estrutura fixa, mas alguns de seus passos podem variar dependendo da implementação.

## Exemplo

Sistema de processamento de pagamentos com diferentes tipos de pagamento.

### Problema

No código original, a classe PayamentProcessor utiliza uma série de condicionais (if-else) para autorizar o pagamento com base no tipo de pagamento escolhido. Isso torna o código difícil de manter e estender, especialmente se novos tipos de pagamento forem adicionados no futuro.

### Solução

O padrão Template Method resolve esse problema ao definir um método template (processPayament) que encapsula a estrutura fixa do algoritmo (validação, autorização e conclusão do pagamento). Os passos que variam (como a autorização do pagamento) são delegados para métodos abstratos, que são implementados pelas subclasses.