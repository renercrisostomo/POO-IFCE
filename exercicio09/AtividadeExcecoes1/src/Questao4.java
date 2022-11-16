// a. A diretiva try...catch é usada para tratar exceções. Ela tem a seguinte sintaxe:

try {
   // código que pode gerar uma exceção
} catch (ExceçãoType nomeDaExceção) {
   // código para tratar a exceção
}

//b. A diretiva throws é usada para indicar que um método pode gerar uma exceção. Ela tem a seguinte sintaxe:

public void nomeDoMétodo() throws ExceçãoType {
   // código que pode gerar uma exceção
}

//c. A diretiva throw é usada para gerar uma exceção. Ela tem a seguinte sintaxe:

throw new ExceçãoType("Mensagem de erro");