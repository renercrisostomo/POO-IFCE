import java.util.Date;
import java.util.SimpleDateFormat;

public class App {

    public static class Funcionario {

        private String nome;
        private Date dataAdmissao;
        private float salario;
    
        public Funcionario(String nome, Date dataAdmissao, float salario) {
            this.nome = nome;
            this.dataAdmissao = dataAdmissao;
            this.salario = salario;
        }

        public void tirarFerias() {
            System.out.println("de férias por 30 dias");
        }

        public void tirarFerias(int dias) {
            System.out.println(String.format("de férias por %s dias", dias));
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public Date getDataAdmissao() {
            return dataAdmissao;
        }
    
        public void setDataAdmissao(Date dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }

        public float getSalario() {
            return salario;
        }
    
        public void setSalario(float salario) {
            this.salario = salario;
        }

    }

    public static class Relogio {

        public void inicializar(int hora, int minuto, int segundo) {
            System.out.println(String.format("%s:%s:%s", hora, minuto, segundo));   
        }
        public void inicializar(int hora, int minuto) {
            System.out.println(String.format("%s:%s:01", hora, minuto));   
        }
        public void inicializar(int hora) {
            System.out.println(String.format("%s:01:01", hora));   
        }

    }
    
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Funcionario funcionario = new Funcionario("João", sdf.parse("01/01/2019"), 1000);
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getDataAdmissao());
        System.out.println(funcionario.getSalario());   
        funcionario.tirarFerias();
        funcionario.tirarFerias(15);
        Relogio relogio = new Relogio();
        relogio.inicializar(10, 20, 30);
        relogio.inicializar(10, 20);
        relogio.inicializar(10);
    }
}

/*
# **Exercício 4**

## Questão 1

Utilizando os códigos criados na atividade sobre visibilidade e encapsulamento, altere a classe
Funcionario de acordo com as instruções a seguir:

1. Adicione o método `void tirarFerias()`, cujas instruções internas imprimem uma mensagem informando que o funcionário irá tirar férias de 30 dias
2. Adicione o método `void tirarFerias(int dias)`, cujas instruções internas imprimem uma mensagem informando que o funcionário irá tirar a quantidade de dias informada de férias
3. Organize estes dois métodos de forma que as instruções responsáveis por imprimir a mensagem estejam localizadas em apenas um dos métodos criados, fazendo com que um método chame o outro método
4. Crie uma classe para demonstrar o funcionamento dos métodos criados

Você percebeu como pode utilizar a sobrecarga para organizar o seu código?

## Questão 2

Crie uma classe denominada Relogio de acordo com as instruções a seguir:

1. Crie um método `void inicializar`, que recebe: hora, minuto e segundo
2. Crie outro método inicializar, que recebe somente a hora e o minuto, inicializando o segundo com 1
3. Crie outro método inicializar, que recebe somente a hora, inicializando o minuto e o segundo com 1
4. Crie uma classe para demonstrar o funcionamento dos métodos criados
*/