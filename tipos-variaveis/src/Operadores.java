public class Operadores {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 1;
        String nome1 = "Wallace";
        String nome2 = "Souza";
        boolean sera = true;

        // se a segunda parte for omitido o booleano vai verificar se e veradadeiro
        if (sera) {
            System.out.println("A variavel booleana Sera e verdadeira");
        }

        // Comparacao e usado  ==
        if(numero1 == numero3 ){
        System.out.println("Numeros sao iguais");
        }

        //Comparacao de maior se usa >
        if(numero2 > numero1 ){
            System.out.println("Numero 2 e maior que o numero 1");
        }
        
        //Comparacao de menor se usa <
        if(numero1 < numero2){
            System.out.println("Numero 1 e menor que numero 2");
        }

        //Comparacao de diferente e !=
        if(numero1 != numero2){
            System.out.println("Numero 1 e diferente de numero 2");
        }

        //Comparacao de menor igual <= ou maior igual >=
        if(numero1 <= numero2){
            System.out.println("Numero 1 e menor ou igual a numero 2");
        }
        if (numero1 >= numero3){
            System.out.println("Numero1 eh maior ou igual a numero 2");
        }

        //Comparacao de ou para true, notase que a segunda comapracao e falsa porem vai satisfazer o if
        if(numero1 >= numero3 || numero2 <= numero1){
            System.out.println("Uma ou mais afirmacoes sao verdadeiras");
        }

        //Comparacao com AND && - as duas tem que ser verdadeiras para satisfazer
        if (numero1 <= numero2 && numero1 >= numero3){
            System.out.println("As duas comparacoes sao verdadeiras");
        }
        
        //Comparacao entre Strings ou Classes (objetos) se usa equals
        //Foi usado o ! para negar a comparacao (como se fosse ao contrario)
        if (!nome1.equals(nome2)){
            System.out.println("Os nomes sao diferentes");
        }

    }
}
