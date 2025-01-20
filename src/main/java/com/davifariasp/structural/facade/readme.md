# Facade

Oferece uma interface única e simplificada para interagir com um ou mais subsistemas complexos.

## Exemplo

Processamento de pedido em um e-commerce.

### Problema

O código expõe diretamente as classes InventoryService e PayamentService no método main, o que significa que o cliente (o método main) precisa conhecer e interagir diretamente com os subsistemas. Isso viola o propósito do padrão Facade, pois o cliente não deveria precisar lidar com os detalhes internos do sistema.

### Solução

A classe `CheckoutFacade` encapsula a lógica de interação entre os subsistemas, expondo apenas um método de alto nível: `checkout. O cliente (o método main) não precisa saber como os subsistemas funcionam internamente nem quais operações precisam ser chamadas, pois isso é responsabilidade do Facade.