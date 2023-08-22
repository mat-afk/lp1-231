package semana20;

public class Alternativa {
    
    private String descricao;
    public boolean marcada;
    private boolean correta;

    public Alternativa(String descricao, boolean correta) {
        this.descricao = descricao;
        this.marcada = false;
        this.correta = correta;
    }

    public boolean acertada() {
        return false;
    }
}
