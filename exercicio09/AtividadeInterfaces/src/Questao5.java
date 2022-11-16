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