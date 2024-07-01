# Programa de Aluguel de Quartos

## Descrição

Este programa é uma aplicação simples em C para gerenciar o aluguel de quartos. Ele utiliza vetores para armazenar informações sobre os quartos e os inquilinos.

## Funcionalidades

- Adicionar um novo inquilino a um quarto.
- Liberar um quarto.
- Exibir o estado atual dos quartos.
- Procurar um inquilino pelo nome.

## Estrutura do Código

### Arquivos

- `main.c`: Contém a função principal e a lógica de interação com o usuário.
- `quartos.h`: Define as estruturas e funções relacionadas ao gerenciamento de quartos.
- `quartos.c`: Implementa as funções definidas em `quartos.h`.

### Estruturas de Dados

- `Quarto`: Estrutura que representa um quarto, contendo o nome do inquilino e o número do quarto.

```c
typedef struct {
    char nomeInquilino[50];
    int numero;
    int ocupado;
} Quarto;
