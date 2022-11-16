# Exercício 9 - AtividadeClassesAbstratas

## 1. Quais as diferenças entre classes abstratas e classes concretas? Explique.

```java
// As classes abstratas são modelos para as classes concretas. Uma classe abstrata pode conter atributos e métodos concretos, mas também pode conter métodos abstratos. Os métodos abstratos não têm corpo, ou seja, não possuem implementação. Por isso, as classes que herdam de uma classe abstrata precisam implementar os métodos abstratos. 
```

## 2. Classes abstratas podem ter métodos concretos? Explique.

```java
// Sim, as classes abstratas podem ter métodos concretos. Esses métodos podem ser chamados pelas classes que herdam de uma classe abstrata, sem a necessidade de reimplementá-los. 
```

## 3. Em quais situações as classes abstratas devem ser utilizadas?

```java
// As classes abstratas devem ser utilizadas quando queremos criar uma hierarquia de classes. Por exemplo, uma classe abstrata chamada FiguraGeometrica, com os métodos abstratos calcularArea() e calcularPerimetro(). A partir dessa classe, podemos criar as classes concretas Quadrado, Retangulo, Triangulo, etc. 
```

## 4. Se uma classe abstrata não pode ser instanciada, explique porque o código-fonte a seguir
funciona:

```java
Poligono[] p = new Poligono[10];
```

```java
// O código funciona, porque uma classe abstrata não pode ser instanciada diretamente, mas pode ser referenciada por uma variável. No exemplo acima, a variável p é do tipo Poligono, que é uma classe abstrata. Como a variável é do tipo Poligono, ela pode referenciar qualquer objeto que seja uma subclasse de Poligono, por exemplo, um objeto do tipo Quadrado, Retangulo ou Triangulo. 
```

## 5. Demonstre, através de um código-fonte simplificado, o uso de classes abstratas e concretas em
uma hierarquia de herança. Devem ser inseridos ao menos 2 métodos abstratos e um construtor na
classe abstrata.

```java
// O código a seguir cria uma classe abstrata chamada Pessoa, com um método abstrato chamado andar(). A partir dessa classe, é criada a classe Aluno, que herda de Pessoa, e implementa o método andar(). 

public abstract class Pessoa {

   public abstract void andar();
}

public class Aluno extends Pessoa {

   public void andar() {
      System.out.println("O aluno está andando.");
   }
}
```
