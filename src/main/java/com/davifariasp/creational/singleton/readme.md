# Singleton

## Exemplo

Lidando com mensagens de log dentro do sistema.

### Problema

Temos uma classe `Logger` respomsável pela exibição de mensagens de log no sistema. A classe `Logger` é responsável por exibir mensagens de log no console. O problema é que a classe `Logger` é instanciada várias vezes, o que causa alocação de memória descenecessária.

### Solução

Para resolvermos isso podemos aplicar o padrão Singleton. O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância.