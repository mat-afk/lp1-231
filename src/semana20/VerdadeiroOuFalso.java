package semana20;


public class VerdadeiroOuFalso extends UnicaEscolha {

    public VerdadeiroOuFalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado, null);
    } 

    @Override
    public void addAlternativa(Alternativa alternativa) {
        throw new UnsupportedOperationException("Unimplemented method 'addAlternativa'");
    }
}
