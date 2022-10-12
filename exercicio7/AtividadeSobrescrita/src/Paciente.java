public class Paciente extends Pessoa {

    String doença;
    String medicação;

    void sentirDor(){

    }

    void terAlta(){

    }

    void imprimirValores(){
        super.imprimirValores();
        System.out.println("doença: " + doença + "\nmedicação: " + medicação);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
