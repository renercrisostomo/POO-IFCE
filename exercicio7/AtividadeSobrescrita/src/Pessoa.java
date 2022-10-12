public class Pessoa {

    String nome;
    String endereco;
    int idade;
    String cpf;
    String sexo;

    void andar(){

    }

    void imprimirValores(){
        System.out.println("Nome: " + nome + "\nEndereco: " + endereco + "\nIdade: " + idade + "\ncpf: " + cpf + "\nSexo: " + sexo);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
