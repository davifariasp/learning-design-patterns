# Iterator

O Iterator é um padrão de projeto comportamental que fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado (como uma lista ou mapa) sem expor sua representação interna. Esse padrão permite que você percorra uma coleção de objetos sem precisar conhecer os detalhes de como essa coleção é implementada.

## Exemplo

Gerenciamento de produtos em uma loja.

### Problema

No código original, a classe Loja possui métodos (getPromocoes e getEstoque) que realizam a iteração diretamente sobre as listas e mapas internos. Isso cria um acoplamento forte entre a lógica de iteração e a estrutura de dados usada para armazenar os produtos. Se a estrutura de dados mudar (por exemplo, de List para Set ou de Map para outra coisa), o código de iteração precisará ser modificado, violando o princípio de aberto/fechado (OCP). Além disso, a lógica de iteração está espalhada pelos métodos, o que dificulta a reutilização e a manutenção.

### Solução

O padrão Iterator resolve esse problema ao encapsular a lógica de iteração em objetos separados. Cada iterador sabe como percorrer uma coleção específica, e a classe Loja pode fornecer esses iteradores sem expor sua estrutura interna. Isso permite que a lógica de iteração seja reutilizada, testada e modificada independentemente da classe Loja.