 # Contagem de Maneiras de Atravessar um Rio

 Este projeto apresenta uma solução para o problema de contar as diferentes maneiras de atravessar um rio pulando sobre pedras. A travessia é baseada em uma representação de um caminho de pedras, onde algumas pedras podem estar ausentes. O projeto é implementado em Java e oferece três abordagens diferentes para resolver o problema:

    Recursão Simples
    Recursão com Memorização
    Solução Não Recursiva

### Descrição do Problema

Você está explorando um país distante e, ao chegar à beira de um rio cheio de jacarés, percebe que não há nenhuma ponte. As pedras que formam o caminho estão dispostas a 1 metro de distância umas das outras, mas algumas podem estar afundadas ou ausentes. Você pode pular 1, 2 ou 3 metros, mas após um salto de 3 metros, não pode pular novamente essa mesma distância.

A entrada do programa é uma string quase binária, que representa as pedras (1) e os buracos (0) entre duas margens, marcadas com a letra 'm'. O objetivo é contar quantas maneiras diferentes existem para atravessar o rio sem cair em um buraco.
#### Exemplo de Entrada:
    m10101100111m
#### Exemplo de Saída

    Recursão simples: existem 4 maneiras
    Recursão memorizada: existem 4 maneiras  
    Sem recursão: existem 4 maneiras



## Estrutura do Código

    Salto.java: Classe principal que contém a implementação das três abordagens.
    Contador.java: Classe responsável pela lógica de contagem das maneiras de atravessar o rio.

## Contribuições

Sinta-se à vontade para contribuir com o projeto! Qualquer sugestão ou melhoria é bem-vinda.
