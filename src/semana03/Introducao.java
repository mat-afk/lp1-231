package semana03;

import java.util.Scanner;

public class Introducao {
    
    public static void main(String[] args) {
        
        // Comentário de uma linha

        /*
         * Comentário
         * de
         * várias
         * linhas
         */


        // Tipos primitivos

        // Inteiros
            // byte, short, int, long
        byte n1 = 100;      // 1 byte - -128 a 127
        short n2 = 3000;    // 2 bytes - -32768 a 32767
        int n3 = 345366546;     // 4 bytes - 2 bilhoes
        long n4 = 435386845649L;     // 8 bytes

        // Ponto flutuante
        float nota1 = 10.8358f;     // 4 bytes
        double nota2 = 10.28598346984;     // 8 bytes

        // Char
        char letra = 'A'; 

        // Boolean
        boolean ligado = true;
        boolean desligado = false;

        // Tipos abstratos

        // String
        String nome = "Domingos Latorre";

        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        // Variáveis e constantes
        int idade = 20;

        int idade2;
        idade2 = 30;

        // Java 10 - inferência de tipo

        var idade3 = 3;
        var nome2 = "Latorre";

        // var ex = new IllegalArgumentException();

        // Constantes - keyword: final

        final double TESTE = 2.3;
        final double PI = 3.14;

        // Entrada e saída de dados

        // Entrada - Scanner
        // Saída - System.out

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu nome: ");
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade: ");
        int idadeInformada = sc.nextInt();

        System.out.println(nomeInformado + " " + idadeInformada);

        // System.out.printf("%s %d \n", nomeInformado, idadeInformada);
        
        sc.close();
    }
}
