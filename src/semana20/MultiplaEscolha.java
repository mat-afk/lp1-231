package semana20;

import java.util.List;

public class MultiplaEscolha extends Questao {

    public MultiplaEscolha(int numero, String enunciado, List<Alternativa> alternativas) {
        super(numero, enunciado, alternativas);
    }

    @Override
    public void addAlternativa(Alternativa alternativa) {
        throw new UnsupportedOperationException("Unimplemented method 'addAlternativa'");
    }
    
}