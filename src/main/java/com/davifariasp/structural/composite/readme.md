# Composite

Permite criar uma estrutura hierárquica em que objetos compostos e individuais podem ser tratados da mesma forma.

## Exemplo
Sistema de Pedidos com diversos Produtos e Caixas.

### Problema

Uma Caixa pode conter diversos Produtos bem como um número de Caixas menores. Essas Caixas menores também podem ter alguns Produtos ou até mesmo Caixas menores que elas, e assim em diante.

Digamos que você decida criar um sistema de pedidos que usa essas classes. Os pedidos podem conter produtos simples sem qualquer compartimento, bem como caixas recheadas com produtos... e outras caixas.

No exemplo, temos `Produto` que representa um produto simples, `Caixa` que representa uma caixa que pode conter produtos(`List<Produto>`) e outras caixas`List<Caixa>`.

`Produto` tem o método `getValor` que retorna o valor do produto de forma simples. Já a `Caixa`tem o método `getValor` que retorna o valor total da caixa. O problema é nesse método tem que que iterar cada list de produtos e caixas para calcular o valor total.

### Solução

Para evitar essa iteração sobre cada lista de produtos e caixas, podemos usar o padrão Composite. O padrão Composite sugere que você trabalhe com objetos de árvore e objetos de folha através de uma interface comum. Neste caso, a interface comum é a classe `Item` que tem o método `getValor`.

`Produto` e `Caixa` implementam a interface `Item`. `Produto` tem o método `getValor` que retorna o valor do produto de forma simples. Agora a classe `Caixa`passa ter apenas um atributo `List<Item> itens` que pode ser um `Produto` ou `Caixa`. Agora para calcular o valor total não precisa iterar sobre cada lista de produtos e caixas para calcular o valor total. Basta apenas iterar sobre a lista de itens e chamar o método `getValor` de cada item.