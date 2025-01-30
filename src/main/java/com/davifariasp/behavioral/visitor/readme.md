# Visitor 

O Visitor é um padrão de projeto comportamental que permite separar algoritmos dos objetos sobre os quais eles operam. Esse padrão é útil quando você tem uma estrutura de objetos complexa (como uma hierarquia de classes) e deseja adicionar novas operações sem modificar as classes dos objetos.

## Exemplo

Sistema de cálculo de frete para diferentes tipos de produtos.

### Problema

No código original, a classe CalculadoraFrete utiliza uma série de condicionais (instanceof) para calcular o frete com base no tipo de produto. Isso torna o código difícil de manter e estender, especialmente se novos tipos de produtos forem adicionados no futuro.

### Solução

O padrão Visitor resolve esse problema ao introduzir uma interface Visitor que define operações para cada tipo de produto. Cada produto aceita um Visitor e delega a execução da operação para o método correspondente. Isso permite adicionar novas operações sem modificar as classes dos produtos.