package semana19;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Correntista cor1 = new Correntista(1, "João Silva");
        Empresa em1 = new Empresa("111.1111.111.1", "G.A.D.U Restaurantes");

        ContaCorrente cc1 = new ContaCorrente(1, 20.0, 2000.0, cor1);
        cor1.addConta(cc1);
        ContaPoupanca cp1 = new ContaPoupanca(2, 20.0, LocalDate.now(), cor1);
        cor1.addConta(cp1);
        ContaSalario cs1 = new ContaSalario(3, em1, cor1);
        cor1.addConta(cs1);

        System.out.println(cor1.calcularTarifas());
    }
}
