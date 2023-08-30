package semana20;

import java.util.List;

public class VerdadeiroOuFalso extends Questao {

    public VerdadeiroOuFalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado, List.of(
            new Alternativa("Verdadeiro", resposta),
            new Alternativa("Falso", !resposta)
        ));
    } 

    public VerdadeiroOuFalso(int numero, String enunciado) {
        super(numero, enunciado);
    }

    public void addAlternativa(Alternativa alternativa) {
        throw new IllegalArgumentException("Você não pode adicionar alternativas em questões de verdadeiro ou falso.");
    }

    public void addAlternativas(Alternativa[] alternativa) {
        throw new IllegalArgumentException("Você não pode adicionar alternativas em questões de verdadeiro ou falso.");
    }

    @Override
    public boolean verificarResposta() {
        for(Alternativa alternativa : alternativas) {
            if(alternativa.acertada()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void marcarAlternativa(String resposta) {
        for (Alternativa alternativa : alternativas) {
            if (resposta.equals(alternativa.getDescricao())) {
                alternativa.marcar();
            } 
        }
    }   

    @Override
    public void marcarAlternativa(Alternativa resposta) {
        throw new IllegalArgumentException("Você não pode marcar alternativas em questões de verdadeiro ou falso.");
    }

    @Override
    public void marcarAlternativa(Alternativa[] respostas) {
        throw new IllegalArgumentException("Você não pode marcar múltiplas alternativas em questões de verdadeiro ou falso.");
    }

    @Override
    public int compareTo(Questao outraQuestao) {
        return Integer.compare(this.getNumero(), outraQuestao.getNumero());
    }
}
