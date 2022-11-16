# Exercício 9 - AtividadeInterfaces

## 1. Quais as diferenças entre classes abstratas e interfaces? Explique.

```java
// As diferenças entre classes abstratas e interfaces são: - Classes abstratas podem ter métodos concretos, diferentemente de interfaces., - Classes abstratas podem ter atributos, diferentemente de interfaces., - Classes abstratas podem ter métodos privados, diferentemente de interfaces.
```

## 2. Interfaces podem ter métodos concretos? Explique.

```java
// Interfaces não podem ter métodos concretos, somente métodos abstratos.
```

## 3. Demonstre como o uso de default methods pode evitar a repetição de código.

```java
// Default methods podem ser usados para evitar a repetição de código. Por exemplo, se uma interface tem um método que é implementado de maneira semelhante em todas as classes que a implementam, é possível usar um método default para evitar a repetição de código.
```

## 4. Em uma situação em que classes abstratas e interfaces são opções viáveis, qual deve ser utilizada
prioritariamente?

```java
// Em uma situação em que classes abstratas e interfaces são opções viáveis, deve-se utilizar a classe abstrata.
```

## 5. Considere o diagrama UML a seguir e faça o que se pede:

image.png

O que se pede:
- Crie uma interface de nome Motorizado em que são declarados os métodos void ligarMotor()
e void abastecer(int numLitros).
- Implemente a interface Motorizado nas classes Aviao e Carro.
- Escreva um programa de teste capaz de verificar a implementação anterior.
- Crie uma interface de nome Conduzivel onde é declarado o método void curvar(float angulo).
- Implemente a interface Conduzivel nas classes Aviao, Carro e Bicicleta.
- Complete o programa de teste criado anteriormente por forma a testar estas últimas
implementações.

```java
public class Teste {
   public static void main(String[] args) {
      Aviao aviao = new Aviao();
      Carro carro = new Carro();
      Bicicleta bicicleta = new Bicicleta();
      
      aviao.ligarMotor();
      carro.ligarMotor();
      bicicleta.curvar(30);
   }
}
```
