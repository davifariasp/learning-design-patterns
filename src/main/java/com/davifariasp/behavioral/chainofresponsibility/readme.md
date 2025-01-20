# Chain of Responsibility

Permite que um pedido seja processado por  uma cadeia de manipuladores. Cada  manipulador decide se processa ou passa para o próximo.

## Exemplo

Central de suporte

### Problema

Considere uma central de suporte  técnico que decide se a solicitação deve ir para o nível 1, nível 2 ou especialista.

### Solução

Cada nível de suporte é um manipulador. Se o nível 1 não puder resolver, ele passa para o nível 2 e assim por diante.