package semana20;

import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Prova prova = new Prova(List.of(

            new UnicaEscolha(1, "Qual é a capital da frança?", 
                List.of(
                    new Alternativa("Berlim", false),
                    new Alternativa("Paris", true),
                    new Alternativa("Washington", false),
                    new Alternativa("Jakarta", false)
                )
            ),

            new VerdadeiroOuFalso(4, "HTML é uma linguagem de programação?", false),

            new MultiplaEscolha(3, "Quais destes são acentos?", 
                List.of(
                    new Alternativa("Agudo", true),
                    new Alternativa("Circunflexo", true),
                    new Alternativa("Til", false),
                    new Alternativa("Trema", false)
                )
            )
        ));

        UnicaEscolha ip = 
        new UnicaEscolha(2, "192.168.1.0 /28, um IP válido para uso como host seria:", 
            List.of(
                new Alternativa("192.1681.230", false),
                new Alternativa("192.168.1.96", false),
                new Alternativa("192.168.1.239", true)
            )
        );

        prova.addQuestao(ip);

        ip.addAlternativa(new Alternativa("192.168.1.208", false));

        System.out.println("Prepare-se para o teste!\n  Obs: Se houver mais de uma resposta, separe por vírgula");
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextLine();
        }
        prova.aplicar();
    }
}
