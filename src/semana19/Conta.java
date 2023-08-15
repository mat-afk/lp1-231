package semana19;

import java.time.LocalDate;

public abstract class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.tarifa = tarifa;
        this.correntista = correntista;
        this.saldo = 0.0;
        this.dataAbertura = LocalDate.now();
    }

    public abstract double calcularTarifa();

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
