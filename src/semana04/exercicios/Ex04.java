package semana04.exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o seu código de identificação: ");
        String codigo = scan.nextLine();

        if(codigo.length() != 7) {
            System.out.println("Código Inválido");
            scan.close();
            System.exit(0);
        }

        int numeros = Integer.parseInt(codigo.substring(2, 5));
        
        if((!codigo.startsWith("BR") || !codigo.endsWith("X") || (!(numeros >= 1) && !(numeros <= 9999)))) {

            System.out.println("Código Inválido");

        } else {
            
            System.out.println("Código Válido");
        }

        scan.close();
    }
}
