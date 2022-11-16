# Exercício 8

## 1. Explique conceitualmente a diferença entre passagem de parâmetros por valor e por referência

Quando um parâmetro é passado por valor, uma cópia do valor é criada e enviada para o método. Qualquer alteração que for feita no parâmetro no método não afeta o valor original fora do método. Em contrapartida, ao passar um parâmetro por referência, uma referência para o objeto é enviada para o método. Qualquer alteração que for feita no objeto dentro do método será visível fora do método.

## 2. Qual tipo de passagem de parâmetros a linguagem Java suporta?

A linguagem Java suporta apenas passagem de parâmetros por valor.

## 3. Na linguagem Java, é possível que a alteração de um parâmetro de entrada em um método seja refletida fora deste método? Explique e demonstre, se esta alteração for possível, criando um código-fonte

Não, pois a linguagem Java apenas suporta passagem de parâmetros por valor.

Código fonte:

```java
public class Questao3 {
   public static void main(String[] args) {
      int x = 10;
      System.out.println("x antes de ser passado para o método: " + x);
      alteraValor(x);
      System.out.println("x depois de ser passado para o método: " + x);
   }
   
   public static void alteraValor(int x) {
      x = x + 10;
      System.out.println("x dentro do método: " + x);
   }
}
```

## 4. É possível criar métodos na linguagem Java que são capazes de receber listas variáveis de argumentos? Se sim, qual a sintaxe? Crie um código-fonte de exemplo

Sim, é possível. A sintaxe é a seguinte:

```java
public static void methodName(Object... args) {
   // código
}
```

Exemplo:

```java
public class Questao4 {
   public static void main(String[] args) {
      printMax(3, 5, 7, 2, 4);
   }
 
   public static void printMax(double... numbers) {
      if (numbers.length == 0) {
         System.out.println("Nenhum argumento foi passado.");
         return;
      }
 
      double result = numbers[0];
 
      for (int i = 1; i <  numbers.length; i++) {
         if (numbers[i] > result) {
            result = numbers[i];
         }
      }
      System.out.println("Maior valor: " + result);
   }
}
```
