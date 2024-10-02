# DIO - Trilha Java Básico

[www.dio.me](https://www.dio.me)

## Autor

- Gleyson Sampaio

## Desafio: Sintaxe

Neste desafio, vamos exercitar o conteúdo apresentado no módulo de Sintaxe, codificando o seguinte cenário.

### Projeto: `ContaBanco`

O projeto será um programa que receberá dados via terminal, representando as características de uma conta bancária, conforme os atributos listados abaixo:

### Atributos da Conta Bancária

| Atributo      | Tipo     | Exemplo        |
|---------------|----------|----------------|
| Número        | Inteiro  | 1021           |
| Agência       | Texto    | 067-8          |
| Nome Cliente  | Texto    | MARIO ANDRADE  |
| Saldo         | Decimal  | 237.48         |

### Instruções

1. Crie o projeto **ContaBanco**.
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar a codificação do programa.
3. Revise os conceitos de:
   - Regras de declaração de variáveis.
   - Uso de terminal, `main` e argumentos (`args`).
   - Leitura de dados via terminal com a classe `Scanner`.
   - Concatenação de strings com o método `concat`.

### Funcionamento do Programa

O programa solicitará as informações ao usuário de forma interativa.

**Exemplo de interação no terminal:**
```bash
Programa: Por favor, digite o número da Agência!
Usuário: 1021
Programa: Por favor, digite o nome do Cliente!
Usuário: MARIO ANDRADE
...
Depois que todas as informações forem inseridas, o sistema exibirá a seguinte mensagem:
Olá [Nome Cliente], obrigado por criar uma conta em nosso banco. Sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque.
Os campos entre colchetes ([ ]) devem ser substituídos pelas informações inseridas pelo usuário.
