package semana04.exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        
        /* 
        Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
        Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
        Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
        Compras iguais ou superiores a R$ 500,00 - 15% de desconto
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor da compra: \nR$ ");
        double compra = scan.nextDouble();

        double desconto = 0.0;

        if(compra >= 10.00 && compra <= 99.99) {
            desconto = 0.05;

        } else if(compra >= 100.00 && compra <= 499.99) {
            desconto = 0.10;

        } else if(compra >= 500.00) {
            desconto = 0.15;
        }

        System.out.println("Valor total da compra: ");
        System.out.println("R$ " + (compra - (compra * desconto)));

        scan.close();
    }
}
