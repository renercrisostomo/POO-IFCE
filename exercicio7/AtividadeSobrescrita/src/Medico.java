public class Medico extends Pessoa {

    String crm;
    int salario;
    String especializacao;

    Medico(String nome, String endereco, int idade, String cpf, String sexo, String crm, int salario, String especializacao){
        super(nome, endereco, idade, cpf, sexo);
        this.crm = crm;
        this.salario = salario;
        this.especializacao = especializacao;
    }
    
    void darPlantão(){

    }

    void imprimirValores(){
        super.imprimirValores();
        System.out.println("crm: " + crm + "\nsalario: " + salario + "\nEspecializacao: " + especializacao);
    }

    public static void main(String[] args) throws Exception {
        Medico m1 = new Medico("Joao", "Rua 1", 20, "123456789", "Masculino", "123456", 1000, "Neurologista");
        m1.imprimirValores();
    }
}
