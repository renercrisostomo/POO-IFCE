# **Exercício 2**

## Parte 1

### Questão 1.1

Sobre tipos primitivos na linguagem Java, responda o que se pede:

1. O que são tipos primitivos?
2. Qual a diferença entre tipos primitivos e objetos?
3. Pesquise e explique a diferença entre o tipo primitivo int e a classe Integer
4. Porque os tipos primitivos são mantidos na linguagem Java, uma vez que existem objetos que podem realizar este papel?

### Questão 1.2

Sobre tipos de variáveis na linguagem Java, faça o que se pede:

1. Quais os tipos de variáveis da linguagem Java?
2. Quais as diferenças entre estes tipos?
3. Crie um código-fonte simplificado demonstrando a diferença entre as variáveis de classe e de objeto (instância)

### Questão 1.3

Sobre constantes na linguagem Java, faça o que se pede:

1. Qual palavra-chave é usada para definir uma constante na linguagem Java?
2. Explique por que as constantes normalmente possuem o modificador static.

## Parte 2

### Questão 2.1

O que é o curto circuito em operadores lógicos? Explique.

### Questão 2.2

Qual o impacto do uso dos operadores de incremento (`++`) e decremento (`--`) antes ou depois de
uma variável? Explique. Exemplo: `System.out.println(++a)` ou `System.out.println(a++)`.

### Questão 2.3

Usando o operador ternário, escreva um programa em Java que, dada uma variável `x` (com valor
80, por exemplo), temos y de acordo com a seguinte regra:

1. se `x` é par, `y = x / 2`
2. se `x` é impar, `y = 3 * x + 1`
3. imprime `y`

### Questão 2.4

"Uma String é imutável". Explique o significado desta afirmação e as razões que levaram a este
comportamento.

## Parte 3

### Questão 3.1

(Continuação de exercício anterior, com inclusão de estruturas de repetição) Escreva um programa
em Java que, dada uma variável `x` (com valor 80, por exemplo), temos `y` de acordo com a seguinte
regra:

1. se `x` é par, `y = x / 2`
2. se `x` é impar, `y = 3 * x + 1`
3. imprime `y`

O programa deve então armazenar o valor de `y` em `x` e continuar até que `y` tenha o valor final
de 1. Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1.

### Questão 3.2

Imprima a tabela a seguir utilizando o encadeamento da estrutura for:

```bash
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
```

### Questão 3.3

Crie um programa capaz de imprimir os fatoriais de 1 a 10 na saída padrão. O fatorial de um
número n é dado por: `n * n-1 * n-2` ... até `n = 1`.

### Questão 3.4

Crie um programa em Java capaz de imprimir os números da série de Fibonacci que são inferiores
ao valor informado pelo usuário via console ou caixa de diálogo. A série de Fibonacci é a seguinte:
0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento é zero e o segundo vale um, daí
por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 1
= 1 + 0). Para receber o valor informado pelo usuário, você pode utilizar a classe Scanner (java.util)
ou a classe JOptionPane (javax.swing). Pesquise o funcionamento destas classes.

## Observações

### Assunto

Operadores e sintaxe.

### Orientações

A atividade deve ser executada individualmente e entregue através do ambiente Google Classroom.

### Regras de criação dos programas

Crie 3 novos projetos Java denominados AtividadeOperadoresESintaxeParte1, AtividadeOperadoresESintaxeParte2 e AtividadeOperadoresESintaxeParte3.
As classes devem possuir os nomes informados nas questões. Ao final, cada projeto deve ser exportado para um arquivo em formato
ZIP.
