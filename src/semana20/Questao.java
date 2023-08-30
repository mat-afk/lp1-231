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

        verificarAoMenosUmaAlternativaCorreta();
    }

    public Questao(int numero, String enunciado) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.alternativas = new ArrayList<>();
    }

    public void addAlternativa(Alternativa alternativa) {
        alternativas.add(alternativa);
    }

    public void addAlternativas(Alternativa[] alternativas) {
        for (Alternativa alternativa : alternativas) {
            this.alternativas.add(alternativa);
        }
    }

    public abstract boolean verificarResposta();

    public abstract void marcarAlternativa(String resposta);

    public abstract void marcarAlternativa(Alternativa resposta);

    public abstract void marcarAlternativa(Alternativa[] resposta);

    private void verificarAoMenosUmaAlternativaCorreta() {
        int cont = 0;
        for(Alternativa alternativa : alternativas) {    
            if(alternativa.getCorreta()) {
                cont++;
            }
        }

        if(cont <= 0) {
            throw new RuntimeException("É necessário haver ao menos uma resposta correta.");
        }
    }

    public int getNumero() {
        return numero;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
}
