# **Exercício 7**

## Questão 1

Explique conceitualmente o significado de sobrescrita e suas regras.

- A sobrescrita é um recurso da linguagem de programação Java que permite que um determinado método seja reescrito em uma subclasse, de forma a alterar o seu comportamento original. 

## Questão 2

Quais as diferenças entre sobrescrita e sobrecarga?

- A sobrescrita é quando uma subclasse redefine o método de uma superclasse.
- A sobrecarga é quando uma classe tem dois métodos com o mesmo nome, mas com assinaturas diferentes.

## Questão 3

Utilizando sua IDE de preferência, implemente o estudo de caso a seguir:

### **Sistema hospitalar**

Crie um sistema hospitalar simplificado para realizar o cadastro de pacientes e equipe médica. 
Este sistema deve conter as classes a seguir: Pessoa, Paciente, Medico e Hospital. Observe o uso de
composição e herança.
Informações e comportamentos que devem estar contidas em cada classe:

Pessoa:

- nome
- endereço
- idade
- cpf
- sexo
- Uma pessoa pode andar

Paciente (é uma Pessoa):

- doença;
- medicação
- Um paciente pode sentir dor
- Um paciente pode ter alta

Médico (é uma Pessoa):

- crm
- salário
- especialização
- Um médico pode dar plantão

Hospital:

- nome
- endereço

Adicionalmente, cada classe deve conter um método chamado void imprimirValores(), que é responsável
por imprimir os atributos da classe. Este método deve ser declarado em Pessoa e sobrescrito nas
subclasses.

## Observações

### Assunto

Sobrescrita ou redefinição.

### Orientações

A atividade deve ser executada individualmente e entregue através do ambiente Google Classroom.

### Regras de criação dos programas

Crie um novo projeto Java denominado **AtividadeSobrescrita**. As classes devem possuir os nomes
informados no texto. Ao final, o projeto deve ser exportado para um arquivo em formato ZIP.
