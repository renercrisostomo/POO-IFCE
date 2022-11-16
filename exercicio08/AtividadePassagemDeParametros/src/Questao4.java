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