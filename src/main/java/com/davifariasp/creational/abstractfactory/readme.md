# Abstract Factory

Jogo de RPG com Criaturas e Itens por Fação

## Problema

Imagine que você está desenvolvendo um jogo de RPG com diferentes facções (ex.: Elfos e Orcs). Cada facção tem suas próprias criaturas e itens especiais.

No código atual, você verifica a facção do jogador e cria objetos (criaturas e itens) de forma manual, com várias condições (if/else ou switch). Isso dificulta adicionar novas facções ou alterar os comportamentos.

## Solução

Podemos refatorar esse código para usar o padrão Abstract Factory, tornando o jogo mais flexível e modular.

1. Defina Interfaces: Crie interfaces para os tipos de objetos que você quer criar (ex.: Creature e Weapon).

2. Implemente Produtos Concretos: Crie classes específicas para cada tipo de objeto dentro de cada facção (ex.: ElfArcher, OrcWarrior, ElfBow, OrcAxe).

3. Crie uma Fábrica Abstrata: Defina uma interface (FactionFactory) para criar famílias de objetos relacionados.

4. Implemente Fábricas Concretas: Crie fábricas específicas para cada facção (ex.: ElfFactory, OrcFactory), que implementam a fábrica abstrata.

5. Use no Cliente: O cliente (RPGGame) recebe uma fábrica concreta e usa seus métodos para criar os objetos, sem conhecer os detalhes das implementações.