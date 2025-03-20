public class TiposVariaveis {
    public static void main(String[] args) {
        // variaveis numericas geralmente são int para inteiros e double para numeros com ponto flutuante
        
        //Acontece que quase todos os tipos basicos de numeros como short e byte o java por padrao ja tenta converter para int

        //usa-se double pois os calculos sao mais precisos que float

        // para declarar uma variavel se usa tipo nome = valor exemplo abaixo.
        

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, long também tem que terminar com L
		float pi = 3.14F;//Float tem que terminar com F no final
		double salario = 1275.33;

        //Quando um tipo menor quer tentar comportar um tipo maior tem que fazer um casting para aceitar, mesmo o valor estando dentro dos limites

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Quando um numero nao tem variacao é chamado de contante, é um valor que nao pode ser modificado depois de ser definido. 
        // Por convencao constantes sao em caixa alta
        // Seguinte padrao final tipo NOMEVARIAVEL = valor;

        final double VALOR_PI = 3,14;

        //Para colocar um texto se usa string.
        // tipo nomeVariavel = "Valor;"

        String nome = "Wallace";

    }
}
