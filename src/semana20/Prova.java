package semana20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prova {

    private List<Questao> questoes;
    private byte pontuacao;
    private Scanner scan = new Scanner(System.in);

    public Prova(List<Questao> questoes) {
        this.questoes = new ArrayList<>(questoes);
        this.pontuacao = 0;
    }

    public void addQuestao(Questao questao) {
        questoes.add(questao);
    }

    public void calcularPontuacao() {
        for(Questao questao : questoes) {
            if(questao.verificarResposta() == true) {
                pontuacao++;
            }
        }
    }

    public byte getPontuacao() {
        return pontuacao;
    }

    public void aplicar() {

        Collections.sort(questoes);

        for(Questao questao : questoes) {
            System.out.println(questao.getNumero() + ". " + questao.getEnunciado() + "\n");
            questao.alternativas.forEach(alternativa -> System.out.println("+ " + alternativa.getDescricao()));
            String res = scan.nextLine();
            questao.responderQuestao(res.trim());
            System.out.println("\n");
        }

        calcularPontuacao();
        System.out.println("Pontuação: " + getPontuacao());

        scan.close();
    }
}
