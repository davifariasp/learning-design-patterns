# Bridge

O Design Pattern Bridge (Ponte) é um padrão estrutural cujo objetivo é desacoplar a abstração da implementação, permitindo que ambos possam variar e evoluir de forma independente. Ele é útil em cenários onde temos duas hierarquias de classes que precisam colaborar, mas não devem ser rigidamente dependentes uma da outra.

## Exemplo

Criação de diferentes formas com diferentes cores.

### Problema

Imagine que você precia criar diferentes tipos de formas (como círculos e quadrados) e cada forma pode ter uma cor diferente. Uma abordagem comum seria criar uma classe para cada forma e cor. No exemplo usamos `CircleBlue`, `CircleRed`, `SquareBlue` e `SquareRed`. No entanto, se você quiser adicionar uma nova cor, você terá que criar uma nova classe e isso pode levar a um grande número de classes e a um código difícil de manter.

### Solução

Primeiro, criamos a interface `Color` que define o método `applyColor` que será implementado pelas classes de cores concretas. Em seguida, criamos a classe abstrata `Shape` que possui um atributo do tipo `Color` e um método `draw` que chama o método `applyColor` da cor.

Por último, criamos as classes concretas das formas e cores. As classes de formas extendem da classe abstrata `Shape` e as classes de cores implementam a interface `Color`. Assim podemos criar novas formas e cores sem a necessidade de criar uma nova classe para cada combinação.