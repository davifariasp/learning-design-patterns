# Factory Method

O padrão Factory Method é um padrão de criação de objetos que encapsula a lógica de instanciamento. Em vez de usar diretamente o operador new, utilizamos métodos específicos (geralmente chamados de fábricas) para criar instâncias de objetos, permitindo maior flexibilidade e controle sobre o processo de criação.

## Exemplo

Criação de diferentes tipos de conta bancária.

### Problema

No exemplo, temos que criar uma conta baseada no tipo de input do usuário. Do jeito que está, nos atende bem. Mas imagine que seja criado um novo tipo de conta, vamos ter que procurar em todo o código onde é feita a criação de conta e adicionar um novo `if` para o novo tipo.

### Solução

Para resolvermos isso devemos criar uma interface `IBankAccount` e implementar essa interface em diferentes tipos de conta. Em seguida, criamos uma fábrica de contas `BankAccountFactory` que retorna uma instância de conta baseada no tipo de conta que o usuário deseja criar.

Sendo assim, se houver necessidade de adição de um novo tipo de conta, basta adicionar uma nova classe que implementa a interface `IBankAccount` e adicionar um novo `case` na fábrica de contas. Assim alterando apenas uma vez o código.