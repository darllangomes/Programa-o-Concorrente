# Simulador de Controlador de Assentos de Voo

## Descrição do Projeto
O Simulador de Controlador de Assentos de Voo é um projeto que visa explorar o conceito de programação concorrente por meio da simulação de um sistema de reservas de assentos de voo. Neste projeto, cada passageiro do voo será representado como uma thread separada, permitindo que múltiplos passageiros interajam com o sistema simultaneamente.

## Funcionalidades Principais
- **Threads de Passageiros**: Cada passageiro do voo será modelado como uma thread independente no sistema.
- **Seleção de Assentos**: Os passageiros poderão selecionar até no máximo 3 assentos em um único voo.
- **Controle de Assentos**: O sistema terá um número máximo de assentos disponíveis para reserva.
- **Evitar Conflitos**: A implementação garantirá que um assento não seja selecionado por mais de um passageiro simultaneamente, evitando conflitos e garantindo que cada assento seja atribuído a apenas um passageiro.

## Objetivos
O principal objetivo deste projeto é explorar e demonstrar os conceitos de programação concorrente em um contexto prático. Isso inclui:
- Implementação de threads para representar múltiplos passageiros.
- Uso de semáforos ou outros mecanismos de sincronização para evitar conflitos na seleção de assentos.
- Controle eficaz de recursos compartilhados para garantir a exclusividade de cada assento.

## Requisitos
- Linguagem de programação: Java.
- Conhecimento em programação concorrente e threads.


## Implementação
A implementação do simulador de controlador de assentos de voo incluirá a criação de múltiplas threads de passageiros, a modelagem dos assentos disponíveis e a aplicação de mecanismos de sincronização para evitar conflitos.


## Licença
Este projeto é distribuído sob a licença [MIT](LICENSE).
