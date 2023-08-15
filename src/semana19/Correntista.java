package semana19;

import java.util.ArrayList;

public class Correntista {
    private int codigo;
    private String nome;
    private ArrayList<Conta> contas;
    
    public Correntista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public double calcularTarifas() {
        double totalTarifas = 0.0;
        for (Conta conta : contas) {
            totalTarifas += conta.calcularTarifa();
        }
        return totalTarifas;
    }
}
