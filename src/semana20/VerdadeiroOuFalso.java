package semana20;

import java.util.List;

public class VerdadeiroOuFalso extends Questao {

    public final char IDENTIFICADOR = '*';
    public boolean resposta;

    public VerdadeiroOuFalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado, List.of(
            new Alternativa("Verdadeiro", resposta),
            new Alternativa("Falso", !resposta)
        ));

        this.resposta = resposta;
    } 

    public void addAlternativa(Alternativa alternativa) { }

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
    public void responderQuestao(String res) {

        alternativas.forEach(alternativa -> { 
            if(res.equals(alternativa.getDescricao())) {
                alternativa.marcarAlternativa();
            } 
        });
    }

    @Override
    public int compareTo(Questao outraQuestao) {
        return Integer.compare(this.getNumero(), outraQuestao.getNumero());
    }
}
