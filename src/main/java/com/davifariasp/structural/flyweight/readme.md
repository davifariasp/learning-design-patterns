# Flyweight

Permite compartilhar dados imutáveis entre múltiplos objetos, reduzindo drasticamente o consumo de memória.

## Exemplo

Classe Produto

### Problema

Description e category são a mesma coisa para todos os produtos, porém, cada produto tem uma instância própria desses atributos.

### Solução

O padrão **Flyweight** permite que atributos comuns sejam compartilhados entre objetos. No exemplo, as informações **description** e **category** são encapsuladas na classe `ProductType` e armazenadas em um cache gerenciado pela classe `ProductTypeFactory`. Com isso, essas informações são criadas uma única vez e reutilizadas em diversos produtos.