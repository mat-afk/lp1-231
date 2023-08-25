package semana20;

import java.util.ArrayList;
import java.util.List;

public abstract class Questao {

    private int numero;
    private String enunciado;
    private List<Alternativa> alternativas;
    private List<Alternativa> resposta;

    public Questao(int numero, String enunciado, Alternativa resposta) {
        this(numero, enunciado, List.of(resposta));
    }

    public Questao(int numero, String enunciado, List<Alternativa> respostas) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.alternativas= new ArrayList<>();
        this.resposta = new ArrayList<>();
        for (Alternativa alternativa : respostas) {
            addAlternativa(alternativa);
            addResposta(alternativa);
        }
    }

    public void addAlternativa(Alternativa alternativa) {
        alternativas.add(alternativa);
    }

    private void addResposta(Alternativa alternativa) {
        alternativa.setResposta();
        resposta.add(alternativa);
    }

    public boolean isCorreta() {
        return false;
    }

    public int getNumero() {
        return numero;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
}
