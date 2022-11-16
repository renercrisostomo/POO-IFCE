public class Paciente extends Pessoa {

    String doença;
    String medicação;

    Paciente(String nome, String endereco, int idade, String cpf, String sexo, String doença, String medicação){
        super(nome, endereco, idade, cpf, sexo);
        this.doença = doença;
        this.medicação = medicação;
    }

    void sentirDor(){

    }

    void terAlta(){

    }

    void imprimirValores(){
        super.imprimirValores();
        System.out.println("doença: " + doença + "\nmedicação: " + medicação);
    }

    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente("Joao", "Rua 1", 20, "123456789", "Masculino", "Dor de cabeça", "Paracetamol");
        p1.imprimirValores();
    }
}
