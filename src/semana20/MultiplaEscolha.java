package semana20;

import java.util.ArrayList;
import java.util.List;

public class MultiplaEscolha extends Questao {

    private List<Alternativa> respostas;

    public MultiplaEscolha(int numero, String enunciado, List<Alternativa> alternativas) {
        super(numero, enunciado, alternativas);

        this.respostas = new ArrayList<>();
        for(Alternativa alternativa : alternativas) {
            if(alternativa.getCorreta() == true) {
                respostas.add(alternativa);
            }
        }
    }

    public MultiplaEscolha(int numero, String enunciado) {
        super(numero, enunciado);
        this.respostas = new ArrayList<>();
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
    public void marcarAlternativa(String respostas) {
        for (String resposta : respostas.split(", ")) {
            for (Alternativa alternativa : alternativas) {
                if (resposta.equals(alternativa.getDescricao())) {
                    alternativa.marcar();
                } 
            }
        }
    }   

    @Override
    public void marcarAlternativa(Alternativa resposta) {
        for (Alternativa alternativa : alternativas) {
            if(resposta.equals(alternativa)) {
                alternativa.marcar();
            } 
        }
    }

    @Override
    public void marcarAlternativa(Alternativa[] respostas) {
        for (Alternativa resposta : respostas) {
            for (Alternativa alternativa : alternativas) {
                if(alternativa.equals(resposta)) {
                    alternativa.marcar();
                } 
            }
        }
    }

    @Override
    public int compareTo(Questao outraQuestao) {
        return Integer.compare(this.getNumero(), outraQuestao.getNumero());
    }
}
