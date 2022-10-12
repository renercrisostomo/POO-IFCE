public class Medico extends Pessoa {

    String crm;
    int salario;
    String especializacao;
    
    void darPlantão(){

    }

    void imprimirValores(){
        super.imprimirValores();
        System.out.println("crm: " + crm + "\nsalario: " + salario + "\nEspecializacao: " + especializacao);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
