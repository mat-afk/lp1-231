package semana05.exercicios;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o comprimento, a altura e a largura do aquário, em cm: ");
        double comprimento = scan.nextDouble();
        double altura = scan.nextDouble();
        double largura = scan.nextDouble();

        System.out.println("\nAgora, entre com a temperatura desejada da água e a temperatura ambiente: ");
        double tempDesejada = scan.nextDouble();
        double tempAmbiente = scan.nextDouble();

        double volume = (comprimento * altura * largura) / 1000;
        double potencia = volume * 0.05 * (tempDesejada - tempAmbiente);

        System.out.printf("\nO volume do aquário é de %.1fL", volume);
        System.out.printf("\nA potência do termostato necessária é de %.1fW", potencia);
        System.out.printf("\nA quantidade de filtragem deve ser, no mínimo, %.1fL a %.1fL por hora\n", volume*2, volume*3);

        scan.close();
    }
}
