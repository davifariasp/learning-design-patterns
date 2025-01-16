# Adapter

Atua como um conversor, adaptando a interface de uma classe existente para que ela possa ser usada por outra classe que espera
uma interface diferente.

## Exemplo

Notificação

### Problema

Alteramos a forma de notificação de um sistema, e agora precisa-se seguir um novo padrão de notificação. No exemplo temos o `LegacyNotifier` que era o antigo padrão de notificação e o `NewNotifier` que é o novo padrão de notificação. Nesse novo padrão seguimos a interface `Notifier`. O problema é que o sistema já está implementado com o `LegacyNotifier` e não queremos alterar o código existente.

### Solução

Sendo assim podemos criar um `Adapter` que irá adaptar o `LegacyNotifier` para seguir o padrão `Notifier`. Dessa forma o sistema não precisa ser alterado e o `Adapter` irá fazer a adaptação necessária.

No exemplo o adapter é representado pela classe `NotificationAdapter`.