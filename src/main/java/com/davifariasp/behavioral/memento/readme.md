# Memento

O Memento é um padrão de projeto comportamental que permite salvar e restaurar o estado anterior de um objeto sem violar o encapsulamento. Esse padrão é útil quando você precisa implementar funcionalidades como "desfazer" ou "refazer" em um sistema, mantendo o histórico de estados de um objeto.

## Exemplo

Sistema de carrinho de compras (ShoppingCart) com funcionalidade de desfazer ações.

### Problema

No código original, a classe ShoppingCart permite adicionar e remover itens, mas não há uma maneira de desfazer ações, como a remoção de um item. Se o usuário remover um item por engano, ele não pode voltar ao estado anterior do carrinho. Isso limita a usabilidade do sistema e cria a necessidade de uma solução para gerenciar o histórico de estados do carrinho.

### Solução

O padrão Memento resolve esse problema ao introduzir um objeto Memento que armazena o estado interno do carrinho (lista de itens). Um Caretaker gerencia os estados salvos, permitindo que o carrinho restaure um estado anterior quando necessário. Isso permite implementar funcionalidades como "desfazer" sem expor os detalhes internos do carrinho ou violar o encapsulamento.