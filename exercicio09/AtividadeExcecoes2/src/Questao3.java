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