package semana20;

import java.util.List;

public abstract class Questao {

    private int numero;
    private String enunciado;
    private List<Alternativa> alternativas;

    public Questao(int numero, String enunciado, List<Alternativa> alternativas) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.alternativas = alternativas;
    }

    public abstract void addAlternativa(Alternativa alternativa);

    public boolean isCorreta() {
        return false;
    }
}
