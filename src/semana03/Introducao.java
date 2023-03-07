package semana03;

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

    }
}
