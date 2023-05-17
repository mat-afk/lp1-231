package semana12.exercicios;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;

    public Conta(int codigo, String correntista) {
        if(codigo <= 0) 
            throw new IllegalArgumentException("Código não permitido");

        if(correntista == " " || correntista == "") 
            throw new IllegalArgumentException("Por favor, insira o nome do titular da conta");

        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double sacar(double valor) {
        if(valor > saldo)
            throw new IllegalArgumentException("O valor a ser sacado é maior do que o seu saldo!");

        return saldo -= valor;
    }

    public double depositar(double valor) {
        return saldo += valor;
    }

    public double transferir(Conta contaDestino, double valor) {
        if(valor > saldo)
            throw new IllegalArgumentException("O valor a ser tranferido é maior do que o seu saldo!");

        sacar(valor);
        contaDestino.depositar(valor);
        return saldo;
    }
}
