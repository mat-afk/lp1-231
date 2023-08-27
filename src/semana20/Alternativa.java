package semana20;

public class Alternativa {
    
    private String descricao;
    public boolean marcada;
    private boolean correta;

    public Alternativa(String descricao) {
        this.descricao = descricao;
        this.marcada = false;
    }

    public Alternativa(String descricao, boolean correta) {
        this(descricao);
        this.correta = correta;
    }

    public void marcarAlternativa() {
        marcada = true;
    }

    public boolean getCorreta() {
        return correta;
    }

    public void setCorreta() {
        correta = true;
    }

    public boolean acertada() {
        return marcada && correta == true;
    }

    public String getDescricao() {
        return descricao;
    }
}
