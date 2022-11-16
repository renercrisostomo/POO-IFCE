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