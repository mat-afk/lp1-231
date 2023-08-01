package semana17.vendedores;

public class VendedorFixo extends Vendedor {

    private double salario;

    public VendedorFixo(String nome, double vendas, double comissao, double salario) {
        super(nome, vendas, comissao);
        this.salario = salario;
    }  
    
    @Override
    public double obterSalario() {
        return super.obterSalario() + salario;
    }
}
