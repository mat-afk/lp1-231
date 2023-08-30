package semana20;

import java.util.List;

public class UnicaEscolha extends Questao {

    public UnicaEscolha(int numero, String enunciado, List<Alternativa> alternativas) {
        super(numero, enunciado, alternativas);
        verificarQuantasAlternativasCorretas();
    }

    public UnicaEscolha(int numero, String enunciado) {
        super(numero, enunciado);
    }

    public void addAlternativa(Alternativa alternativa) {
        super.addAlternativa(alternativa);
        verificarQuantasAlternativasCorretas();
    }

    public void addAlternativas(Alternativa[] alternativas) {
        super.addAlternativas(alternativas);
        verificarQuantasAlternativasCorretas();
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
    public void marcarAlternativa(String resposta) {
        for (Alternativa alternativa : alternativas) {
            if (resposta.equals(alternativa.getDescricao())) {
                alternativa.marcar();
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
        throw new IllegalArgumentException("Você não pode marcar múltiplas alternativas em questões de única escolha.");
    }

    private void verificarQuantasAlternativasCorretas() {

        int cont = 0;
        for(Alternativa alternativa : alternativas) {    
            if(alternativa.getCorreta() == true) {
                cont++;
            }
        }

        if(cont > 1) {
            throw new RuntimeException("Não é possível haver mais de uma alternativa correta");
        }
    }

    @Override
    public int compareTo(Questao outraQuestao) {
        return Integer.compare(this.getNumero(), outraQuestao.getNumero());
    }
}
