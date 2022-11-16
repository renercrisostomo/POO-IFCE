# Exercício 9 - AtividadeExcecoes2

## 1. Quando deve-se criar uma exceção personalizada? Explique.

```java
// Uma exceção personalizada deve ser criada quando o programador precisar de um tipo específico de erro que não esteja disponível nas exceções pré-definidas do Java. Por exemplo, um programador pode criar uma exceção personalizada para gerenciar erros de entrada de dados do usuário.
```

## 2. Explique as consequências que o uso de exceções têm em construtores e métodos sobrescritos
em uma hierarquia de herança.

```java
// O uso de exceções pode ter várias consequências em construtores e métodos sobrescritos em uma hierarquia de herança. Se uma subclasse sobrescrever um método que pode lançar uma exceção, a subclasse deve especificar qualquer exceção que o método pode lançar. Além disso, se um construtor pode lançar uma exceção, todas as subclasses devem especificar qualquer exceção que o construtor pode lançar. Se uma subclasse não especificar uma exceção que um método ou construtor pode lançar, a subclasse herdará a exceção e o programa não compilará.
```

## 3. Crie a classe Data que contém um construtor com três parâmetros inteiros: dia, mes e ano.
Escreva uma classe de exceção chamada de DataException, derivada de Exception, que
tenha como atributo interno a data inválida que o usuário tentou criar. Modifique o construtor da
classe Data para que lance e propague uma exceção quando a data for inválida. Verifique se o
parâmetro dia está situado na faixa 0 a 28, 0 a 30 ou 0 a 31, dependendo do mês em questão. O
campo mês deve estar situado na faixa 1 a 12 e o campo ano deve ser maior ou igual a 1. Por fim,
crie a classe Execucao que irá criar várias instâncias da classe Data, com valores válidos e
inválidos, testando todas as possibilidades de exceção.

```java
public class Data {
    
   private int dia;
   private int mes;
   private int ano;

   public Data(int dia, int mes, int ano) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }

   public int getDia() {
      return dia;
   }

   public int getMes() {
      return mes;
   }

   public int getAno() {
      return ano;
   }

   public static void main(String[] args) {

      try {
        Data data = new Data(30, 2, 2020);
      }
      catch (DataException e) {
         System.out.println(e.getMessage());
      }
   }
}

public class DataException extends Exception {
    
   private Data data;

   public DataException(Data data) {
      super();
      this.data = data;
   }

   public Data getData() {
      return data;
   }
}
```
