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