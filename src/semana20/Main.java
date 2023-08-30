package semana20;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        Questao q1 = new UnicaEscolha(1, "Qual é a capital da França?");
        Alternativa a = new Alternativa("Berlim", false);
        Alternativa b = new Alternativa("Paris", true);
        Alternativa c = new Alternativa("Lyon", false);
        Alternativa d = new Alternativa("Jakarta", false);
        q1.addAlternativas(new Alternativa[] {a, b, c, d});
        Alternativa e = new Alternativa("Bruxelas", false);
        q1.addAlternativa(e);

        Questao q4 = new VerdadeiroOuFalso(4, "HTML é uma linguagem de programação?", false);

        Questao q3 = new MultiplaEscolha(3, "Quais destes são acentos?", 
            List.of(
                new Alternativa("Agudo", true),
                new Alternativa("Circunflexo", true),
                new Alternativa("Til", false),
                new Alternativa("Trema", false)
            )
        );

        Prova prova = new Prova(List.of(q1, q4, q3));

        Questao q2 = new MultiplaEscolha(2, "192.168.1.0 /28, um IP válido para uso como host seria:");

        Alternativa f = new Alternativa("192.1681.230", true);
        Alternativa g = new Alternativa("192.1681.97", false);
        Alternativa h = new Alternativa("192.1681.239", true);
        q2.addAlternativas(new Alternativa[] {f, g, h});

        prova.addQuestao(q2);

        prova.responder(q1, b);
        prova.responder(2, new Alternativa[] {f, g});
        prova.responder(3, "Agudo, Circunflexo");
        prova.responder(q4, "Falso");

        prova.mostrarCorrecao();

        System.out.println("Pontuação: " + prova.calcularPontuacao());
    }
}
