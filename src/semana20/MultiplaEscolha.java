package semana20;

import java.util.ArrayList;
import java.util.List;

public class MultiplaEscolha extends Questao {

    public final char IDENTIFICADOR = '#';
    public List<Alternativa> respostas;

    public MultiplaEscolha(int numero, String enunciado, List<Alternativa> alternativas) {
        super(numero, enunciado, alternativas);

        this.respostas = new ArrayList<>();
        for(Alternativa alternativa : alternativas) {
            if(alternativa.getCorreta() == true) {
                respostas.add(alternativa);
            }
        }
    }

    @Override
    public boolean verificarResposta() {
        int cont = 0;
        for(int i = 0; i < alternativas.size(); i++) {

            if(alternativas.get(i).acertada() == true) {
                cont++;
            }

            if(cont >= respostas.size()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void responderQuestao(String res) {
        alternativas.forEach(alternativa -> {
            for(String escolha : res.split(", ")) {
                if(escolha.equals(alternativa.getDescricao())) {
                    alternativa.marcarAlternativa();
                }
            }
        });
    }

    @Override
    public int compareTo(Questao outraQuestao) {
        return Integer.compare(this.getNumero(), outraQuestao.getNumero());
    }
}
