package semana20;

import java.util.List;

public class UnicaEscolha extends Questao {

    public final char IDENTIFICADOR = '+';
    public Alternativa resposta;

    public UnicaEscolha(int numero, String enunciado, List<Alternativa> alternativas) {
        super(numero, enunciado, alternativas);

        for(Alternativa alternativa : alternativas) {    
            if(alternativa.getCorreta() == true) {
                resposta = alternativa;
            }
        }
    }

    @Override
    public boolean verificarResposta() {
        for (Alternativa alternativa : alternativas) {
            if(alternativa.acertada()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void responderQuestao(String res) {
        alternativas.forEach(alternativa -> { 
            if(res.equals(resposta.getDescricao())) {
                alternativa.marcarAlternativa();
            } 
        });
    }

    @Override
    public int compareTo(Questao outraQuestao) {
        return Integer.compare(this.getNumero(), outraQuestao.getNumero());
    }
}
