# Exercício 8 - AtividadeExcecoes1

## 1. O que é uma exceção? Explique

```java
// Exceções são erros que ocorrem durante a execução de um programa. Elas podem ser geradas por erros de sintaxe, erros de lógica ou erros de execução. Exceções são tratadas para evitar que o programa seja encerrado abruptamente.
```

## 2. Explique detalhadamente a diferença entre as exceções verificadas e não verificadas

```java
// Exceções verificadas são erros que podem ser previstos e evitados. Exceções não verificadas são erros que não podem ser previstos ou evitados.
```

## 3. Qual a hierarquia de classes do mecanismo de tratamento de exceções da linguagem Java?

```java
// A hierarquia de classes do mecanismo de tratamento de exceções da linguagem Java é a seguinte: - java.lang.Throwable, - java.lang.Error, - java.lang.Exception, - java.lang.RuntimeException
```

## 4. Explique conceitualmente as diretivas a seguir, bem como crie um código-fonte simplificado demonstrando o seu uso (pode ser um código-fonte único demonstrando todas as diretivas):

a. try... catch
b. throws
c. throw

```java
// a. A diretiva try...catch é usada para tratar exceções. Ela tem a seguinte sintaxe:

try {
   // código que pode gerar uma exceção
} catch (ExceçãoType nomeDaExceção) {
   // código para tratar a exceção
}

//b. A diretiva throws é usada para indicar que um método pode gerar uma exceção. Ela tem a seguinte sintaxe:

public void nomeDoMétodo() throws ExceçãoType {
   // código que pode gerar uma exceção
}

//c. A diretiva throw é usada para gerar uma exceção. Ela tem a seguinte sintaxe:

throw new ExceçãoType("Mensagem de erro");
```

## 5. Crie a classe Cadastro que contém um método main e solicita do usuário o fornecimento das
informações a seguir: nomeCompleto e telefone (composto por ddd e numero). Você pode
utilizar as classes Scanner ou JOptionPane para realizar esta tarefa. Após receber as
informações, verifique se nomeCompleto é diferente de vazio. Adicionalmente, faça a leitura do
telefone em duas etapas. A primeira deve solicitar o ddd e a segunda o numero. O ddd deve
possuir dois dígitos inteiros e o numero oito ou nove dígitos inteiros. Se o usuário fornecer
corretamente estas informações, você deve emitir uma mensagem informando que o cadastro foi
realizado e imprimir os valores recebidos. Caso alguma das verificações falhe, você deve notificar o
usuário através do lançamento e tratamento de uma exceção. Em seguida, deve reiniciar o
processo desde o início, repetindo esta operação até que todas as informações sejam preenchidas.

```java
public class Cadastro {
   public static void main(String[] args) {
      String nomeCompleto = "";
      String ddd = "";
      String numero = "";
      try {
         nomeCompleto = JOptionPane.showInputDialog("Nome Completo:");
         ddd = JOptionPane.showInputDialog("DDD:");
         numero = JOptionPane.showInputDialog("Número:");
         if (nomeCompleto.equals("")) {
            throw new Exception("Nome Completo Inválido");
         }
         if (ddd.length() != 2) {
            throw new Exception("DDD Inválido");
         }
         if (numero.length() != 8 && numero.length() != 9) {
            throw new Exception("Número Inválido");
         }
         JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
         JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto + "\nTelefone: (" + ddd + ")" + numero);
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
         main(null);
      }
   }
}
```
