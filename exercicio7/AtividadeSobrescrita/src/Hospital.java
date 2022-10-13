public class Hospital {

    String nome;
    String endereco;

    Hospital(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    void imprimirValores(){
        System.out.println("Nome: " + nome + "\nEndereco: " + endereco);
    }

    public static void main(String[] args) throws Exception {
        Hospital h1 = new Hospital("Hospital 1", "Rua 1");
        h1.imprimirValores();
    }
}
