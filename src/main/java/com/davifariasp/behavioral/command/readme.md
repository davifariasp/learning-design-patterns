# Command

O Command é um padrão de projeto comportamental que transforma um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação permite que você parametrize métodos com diferentes pedidos, atrase ou coloque a execução do pedido em uma fila, e suporte operações que não podem ser feitas.

## Exemplo

Gerenciador de arquivos.

### Problema

O código de exemplo apresenta problemas de acoplamento direto entre o cliente (main) e a lógica concreta (FileOperationHandler), dificultando extensões, testes e manutenção. Qualquer alteração na lógica de createFile ou deleteFile exige mudanças no cliente, violando o princípio de aberto/fechado (OCP). Além disso, o código não suporta funcionalidades como histórico, reversibilidade ou fácil escalabilidade para novas operações. O padrão Command resolve isso ao encapsular cada operação em classes separadas, permitindo desacoplamento, maior extensibilidade, testabilidade isolada e a implementação de funcionalidades adicionais, como desfazer ou registrar comandos.

### Solução

O padrão Command resolve esse tipo de código ao desacoplar o cliente (neste caso, o método main) das operações específicas (createFile e deleteFile). Com o padrão Command, você encapsula cada operação em uma classe separada que implementa uma interface comum. Isso permite que as operações sejam tratadas de forma uniforme e facilita a extensão, o teste e a manutenção do código.