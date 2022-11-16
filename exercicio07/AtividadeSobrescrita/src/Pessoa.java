public class Pessoa {

    String nome;
    String endereco;
    int idade;
    String cpf;
    String sexo;

    Pessoa(String nome, String endereco, int idade, String cpf, String sexo){
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    void andar(){

    }

    void imprimirValores(){
        System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nIdade: " + idade + "\ncpf: " + cpf + "\nSexo: " + sexo);
    }
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new pessoa("Joao", "Rua 1", 20, "123456789", "Masculino");
        p1.imprimirValores();
    }
}
