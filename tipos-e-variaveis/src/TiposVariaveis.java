public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome = "Alyson"; /* String não é um tipo de dado primitivo, mas uma classe em Java. É usada para armazenar uma sequência de caracteres (texto). Em termos simples, pode-se dizer que uma String é um array de caracteres.*/
        byte numeroByte = 100; /*byte armazena números inteiros em 8 bits, com um intervalo de valores de -128 a 127.*/
        short  numeroShort=numeroByte; /*é um tipo de dado inteiro que usa 16 bits (2 bytes), com um intervalo de -32.768 a 32.767. É maior que o byte, mas menor que o int*/
        numeroByte = (byte) numeroShort; /* Aqui convertemos o valor da variavel numero2 para o tipo byte para que essa atribuição possa acontecer.*/
        int numeroInt = 1; /* int é usado para armazenar números inteiros (sem casas decimais) com 32 bits de armazenamento. Vai de -2.147.483.648 a 2.147.483.647.*/
        double numeroDouble = 23.2; /* double é usado para armazenar números com casas decimais (ponto flutuante) com 64 bits de armazenamento. Ele oferece maior precisão do que o tipo float, podendo armazenar valores com mais dígitos após o ponto decimal.*/
        long numeroLong = 10000000L; /* O tipo long é usado para armazenar números inteiros maiores que o int, utilizando 64 bits de armazenamento. A faixa de valores vai de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.*/
        float numeroFloat = 10.5f; /*O tipo float é utilizado para armazenar números de ponto flutuante, ou seja, números que contêm casas decimais. */
        boolean senteca = true; /* O boolean é usado para representar valores lógicos. Ele só pode armazenar dois estados: verdadeiro (true) ou falso (false). É utilizado em estruturas de controle de fluxo, como condicionais (if, while) e em expressões lógicas.*/
        char nomeOutro = 'O'; /*O tipo char é utilizado para armazenar um único caractere, incluindo letras, números e símbolos, representados por seu valor Unicode.*/
        
        // Exibindo os valores
        System.out.println("Este é uma String: " + meuNome);
        System.out.println("Este é um byte: " + numeroByte);
        System.out.println("Este é um short: " + numeroShort);
        System.out.println("Este é um int: " + numeroInt);
        System.out.println("Este é um double: " + numeroDouble);
        System.out.println("Este é um long: " + numeroLong);
        System.out.println("Este é um float: " + numeroFloat);
        System.out.println("Este é um boolean: " + senteca);
        System.out.println("Este é um char: " + nomeOutro);
    }
}
