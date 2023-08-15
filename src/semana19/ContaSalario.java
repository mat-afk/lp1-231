package semana19;

public class ContaSalario extends Conta {

    private Empresa empresa;

    public ContaSalario(int numero, Empresa empresa, Correntista correntista) {
        super(numero, 0.0, correntista);
        this.empresa = empresa;
    }

    @Override
    public double calcularTarifa() {
        return 0.0;
    }
}
