// O código a seguir cria uma classe abstrata chamada Pessoa, com um método abstrato chamado andar(). A partir dessa classe, é criada a classe Aluno, que herda de Pessoa, e implementa o método andar(). 

public abstract class Pessoa {

   public abstract void andar();
}

public class Aluno extends Pessoa {

   public void andar() {
      System.out.println("O aluno está andando.");
   }
}