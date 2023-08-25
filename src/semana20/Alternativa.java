package semana20;

public class Alternativa {
    
    private String descricao;
    public boolean marcada;
    private boolean correta;

    public Alternativa(String descricao) {
        this.descricao = descricao;
        this.marcada = false;
        this.correta = false;
    }

    public void marcarAlternativa() {
        marcada = true;
    }

    public void setResposta() {
        correta = true;
    }

    public boolean acertada() {
        return marcada && correta == true;
    }

    public String getDescricao() {
        return descricao;
    }
}
