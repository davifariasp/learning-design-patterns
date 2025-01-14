# Builder

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

## Exemplo

Construindo um objeto da classe Pedido.

### Problema

Você está criando um objeto da classe `Pedido`, que vai ter nome do item, valor unitário, quantidade e etc. Pode ser que instanciação desse objeto acabe ficando muito grande e complexa dependendo do número de campos. Outro problema também é que talvez alguns pedidos não necessitem de alguns dos campos. 

### Solução

Podemos refatorar o código para que a criação do objeto seja feita através de um `Builder`. 

O `PedidoBuilder` vai ter uma instância do tipo `Pedido` e através de métodos vamos setando os campos do objeto. No final invocamos o método `build()` que vai retornar o objeto `Pedido` com os campos setados.

Dessa forma, podemos criar um objeto da classe `Pedido` passo a passo, sem a necessidade de passar todos os campos de uma vez.