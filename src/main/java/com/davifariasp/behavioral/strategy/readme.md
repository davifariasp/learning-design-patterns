# Strategy

O Strategy é um padrão de projeto comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Esse padrão é útil quando você tem várias maneiras de realizar uma tarefa e deseja escolher o algoritmo apropriado em tempo de execução, sem modificar o código que utiliza o algoritmo.

## Exemplo

Sistema de cálculo de frete com diferentes formas de entrega.

### Problema

No código original, a classe FreteService utiliza uma série de condicionais (if-else) para calcular o frete com base na transportadora escolhida. Isso torna o código difícil de manter e estender, especialmente se novas transportadoras forem adicionadas no futuro.

### Solução

O padrão Strategy resolve esse problema ao encapsular cada algoritmo de cálculo de frete em uma classe separada. Cada classe de estratégia implementa uma interface comum (CalculoFrete), que define o método calcularFrete. A classe FreteContext mantém uma referência para a estratégia atual e delega a execução do cálculo de frete para a estratégia escolhida.