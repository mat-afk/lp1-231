package semana04.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        double numeros[] = new double[3];
        double media = 0.0;

        System.out.printf("Insira %d números: \n", numeros.length);
       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextDouble();
        } 

        for (double n : numeros) {
            media = media + n;
        }

        System.out.println("Média aritmética: " + (media/numeros.length));

        scan.close();
    }
}
