package semana20;

public class UnicaEscolha extends Questao {

    public UnicaEscolha(int numero, String enunciado, Alternativa resposta) {
        super(numero, enunciado, resposta);
    }

    @Override
    public void addAlternativa(Alternativa alternativa) {
        throw new UnsupportedOperationException("Unimplemented method 'addAlternativa'");
    }
}
