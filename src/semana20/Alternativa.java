package semana20;

public class Alternativa {
    
    private String descricao;
    private boolean marcada;
    private boolean correta;

    public Alternativa(String descricao) {
        this.descricao = descricao;
        this.marcada = false;
        this.correta = false;
    }

    public Alternativa(String descricao, boolean correta) {
        this(descricao);
        this.marcada = false;
        this.correta = correta;
    }

    public void marcar() {
        marcada = true;
    }

    public boolean acertada() {
        return marcada && correta == true;
    }

    public boolean getCorreta() {
        return correta;
    }

    public String getDescricao() {
        return descricao;
    }
}
