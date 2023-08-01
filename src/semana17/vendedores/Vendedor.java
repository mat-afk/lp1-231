package semana17.vendedores;

public class Vendedor {

    private String nome;
    private double vendas;
    private double comissao;
    // private double salario;

    public Vendedor(String nome, double vendas, double comissao) {
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
        // this.salario = salario;
    }

    public double obterSalario() {
        return vendas * (comissao/100); // + salario
    }
}
