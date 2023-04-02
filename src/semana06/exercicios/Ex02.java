package semana06.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o seu peso, em quilos: ");
        double peso = scan.nextDouble();

        System.out.println("Entre com a sua altura, em metros: ");
        double altura = scan.nextDouble();

        System.out.printf("\nIMC: %.1f\n", calcularIMC(peso, altura));
        System.out.println("\n" + classificarIMC(calcularIMC(peso, altura)) + "\n");
        System.out.println("\n" + classificarPesoIdeal(peso, altura) + "\n");

        scan.close();
    }

    public static double calcularIMC(double peso, double altura) {
        if(altura == 0) {
            throw new RuntimeException("Denominador não pode ser 0!");
        }
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if(imc < 18.5) {
            return "Classificação: Baixo Peso";

        } else if(imc >= 18.5 && imc < 25) {
            return "Classificação: Peso Normal";

        } else if(imc >= 25 && imc < 30) {
            return "Classificação: Excesso de peso";

        } else if(imc >= 30 && imc < 35) {
            return "Classificação: Obesidade classe 1";

        } else if(imc >= 35 && imc < 40) {
            return "Classificação: Obesidade classe 2";

        } else {
            return "Classificação: Obesidade classe 3";    
        }
    }

    public static String classificarPesoIdeal(double peso, double altura) {
        double pesoAPerder = peso - (24.9 * altura * altura);

        if(pesoAPerder < 0) {
            return "Você precisa ganhar " + Math.round(Math.abs(pesoAPerder)) + "kg para chegar ao peso ideal." ;

        } else {
            return "Você precisa perder " + Math.round(Math.abs(pesoAPerder)) + "kg para chegar ao peso ideal." ;
        }
    }
}
