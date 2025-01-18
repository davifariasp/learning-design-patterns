# Decorator

O Decorator é um padrão de projeto estrutural que permite que você acople novos comportamentos para objetos ao colocá-los dentro de invólucros de objetos que contém os comportamentos.

## Exemplo

Envio de notificação através de diversos canais.

### Problema

Na implementação inicial tenho a classe `Notifier` que contém um método para envio de notificação genérico. As classes `SMSNotifier`e `WhatsAppNotifier` são especializações de `Notifier` que implementam o método de envio de notificação para os respectivos canais.

Na primeira versão da aplicação eu tenho apenas um canal de envio de mensagens, o SMS. Agora, quero que a aplicação além de enviar a notificação por SMS envie também pelo WhatsApp. Para isso criei `SMSAndWhatsAppNotifier` que extebde da classe `Notifier` e implementa o método de envio de notificação para os dois canais.

Seguindo essa lógica, caso eu queira adicionar um novo canal de envio de notificação, por exemplo, e-mail, eu teria que criar uma nova classe `SMSAndWhatsAppAndEmailNotifier` que extende de `Notifier` e implementa o método de envio de notificação para os três canais. E isso se torna inviável conforme a quantidade de canais aumenta.

### Solução

O padrão Decorator introduz um invólucro (ou camada) ao redor de objetos existentes, adicionando funcionalidades sem alterar a classe base ou criar uma hierarquia complexa de subclasses.

Agora temos a classe `NotifierDecorator` que extende de `Notifier` e contém um atributo do tipo `Notifier` e o método de envio de notificação. Agora, cada canal deve ser uma especialização de `NotifierDecorator` e implementar o método de envio de notificação.

Dessa forma, posso adicionar novos canais de envio de notificação sem a necessidade de criar uma nova classe para cada combinação de canais.