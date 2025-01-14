# Prototype

O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

## Exemplo

Clonar um documento.

### Problema

Queremos clonar o objeto da classe `Documento`. Então nesse caso só precisiaria criar outro objeto e repassar no construtor os memos valores do objeto que queremos clonar. Porém, em um cenário que temos muitos campos, isso pode ser um problema. Fora outros problemas.

### Solução

Em `Java` já possuímos uma interface que permite a clonagem de um objeto. Porém, na minha solução quis mostrar como seria a implementação do padrão `Prototype` sem usar a interface `Cloneable`.

No caso criamos uma interface chamada `Prototype` que tem o método `clone` que retorna um objeto do tipo `Prototype`. Sendo assim, na classe `Documento` implementamos essa interface e no método `clone` retornamos um novo objeto `Documento` com os mesmos valores do objeto atual, através de um construtor privado que recebe um objeto do tipo `Documento`.