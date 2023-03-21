package semana04.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Insira um número inteiro: ");
        num = scan.nextInt();

        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));

        scan.close();
    }
}