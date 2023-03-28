package semana05.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o seu peso, em quilos: ");
        double peso = scan.nextDouble();

        System.out.println("Entre com a sua altura, em metros: ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("\nClassificação: Baixo Peso");

        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("\nClassificação: Peso Normal");

        } else if(imc >= 25 && imc < 30) {
            System.out.println("\nClassificação: Excesso de peso");

        } else if(imc >= 30 && imc < 35) {
            System.out.println("\nClassificação: Obesidade classe 1");

        } else if(imc >= 35 && imc < 40) {
            System.out.println("\nClassificação: Obesidade classe 2");

        } else if(imc >= 40.0){
            System.out.println("\nClassificação: Obesidade classe 3");    
        }

        System.out.printf("IMC: " + imc);

        double pesoNormal = peso - (24.9 * altura * altura);

        if(pesoNormal < 0) {
            System.out.printf("\n\nVocê precisa ganhar %.1fkg para chegar ao peso ideal\n", Math.abs(pesoNormal));

        } else if(pesoNormal >= 0) {
            System.out.printf("\n\nVocê precisa perder %.1fkg para chegar ao peso ideal\n", Math.abs(pesoNormal));
        }

        scan.close();
    }
}
