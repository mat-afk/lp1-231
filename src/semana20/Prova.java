package semana20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prova {

    private List<Questao> questoes;
    private byte pontuacao;

    public Prova(List<Questao> questoes) {
        this.questoes = new ArrayList<>(questoes);
        this.pontuacao = 0;
    }

    public void addQuestao(Questao questao) {
        questoes.add(questao);
    }

    public Questao getQuestaobyNumero(int numero) {
        for (Questao questao : questoes) {
            if(questao.getNumero() == numero) return questao;
        }
        return null;
    }

    public int calcularPontuacao() {
        for(Questao questao : questoes) {
            if(questao.verificarResposta() == true) {
                pontuacao++;
            }
        }
        return pontuacao;
    }

    public void responder(Questao questao, String resposta) {
        questao.marcarAlternativa(resposta);
    }

    public void responder(Questao questao, Alternativa resposta) {
        questao.marcarAlternativa(resposta);
    }

    public void responder(Questao questao, Alternativa[] respostas) {
        questao.marcarAlternativa(respostas);
    }

    public void responder(int numero, String resposta) {
        getQuestaobyNumero(numero).marcarAlternativa(resposta);
    }

    public void responder(int numero, Alternativa resposta) {
        getQuestaobyNumero(numero).marcarAlternativa(resposta);
    }

    public void responder(int numero, Alternativa[] respostas) {
        getQuestaobyNumero(numero).marcarAlternativa(respostas);
    }

    public void mostrarCorrecao() {
        
        Collections.sort(questoes);

        for(Questao questao : questoes) {
            System.out.println(questao.getNumero() + ". " + questao.getEnunciado());

            for (Alternativa alternativa : questao.alternativas) {
                System.out.println("+ " + alternativa.getDescricao());
            }

            if(questao.verificarResposta()) System.out.println("Pontos: +1\n");
            else System.out.println("Pontos: 0\n");
        }
    }
}
