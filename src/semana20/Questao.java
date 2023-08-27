package semana20;

import java.util.ArrayList;
import java.util.List;

public abstract class Questao implements Comparable<Questao> {

    private int numero;
    private String enunciado;
    public List<Alternativa> alternativas;

    public Questao(int numero, String enunciado, List<Alternativa> alternativas) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.alternativas = new ArrayList<>(alternativas);
    }

    public void addAlternativa(Alternativa alternativa) {
        alternativas.add(alternativa);
    }

    public abstract boolean verificarResposta();

    public abstract void responderQuestao(String res);

    public int getNumero() {
        return numero;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
}
