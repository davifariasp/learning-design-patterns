# Mediator

O Mediator é um padrão de projeto comportamental que promove o desacoplamento entre objetos ao centralizar a comunicação entre eles em um único objeto (o mediador). Esse padrão é útil quando você tem um conjunto de objetos que precisam se comunicar, mas você quer evitar que eles se refiram diretamente uns aos outros, reduzindo a complexidade e as dependências.

## Exemplo

Sistema de finalização de compras em um e-commerce.

### Problema

No código original, a classe Ecomerce chama diretamente os métodos de outras classes (PayamentSystem, StockSystem, ShippingSystem) para finalizar uma compra. Isso cria um acoplamento forte entre a classe Ecomerce e os sistemas, dificultando a manutenção e a extensão do código. Se novos sistemas forem adicionados ou se a lógica de finalização de compras mudar, a classe Ecomerce precisará ser modificada, violando o princípio de aberto/fechado (OCP). Além disso, a comunicação direta entre os sistemas torna o código mais difícil de testar e reutilizar.

### Solução

O padrão Mediator resolve esse problema ao introduzir um objeto mediador (EcomerceMediator) que centraliza a comunicação entre os sistemas. Em vez de os sistemas se comunicarem diretamente, eles interagem apenas com o mediador, que coordena as ações necessárias. Isso reduz o acoplamento, facilita a manutenção e permite que novos sistemas sejam adicionados sem modificar o código existente.