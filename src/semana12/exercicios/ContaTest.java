package semana12.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ContaTest {
    
    @Test
    public void testaInstanciarConta() {
        Conta conta = new Conta(1, "Domingos Latorre");

        assertEquals(1, conta.codigo);
        assertEquals("Domingos Latorre", conta.correntista);
        assertEquals(0.0, conta.saldo);
    }

    @Test
    public void testaInstanciarContaComCodigoInvalido() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Conta(-1, "Domingos Latorre");
        });
    }

    @Test
    public void testaInstanciarContaComCorrentistaInvalido() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Conta(1, " ");
        });
    }

    @Test
    public void testaSacar() {
        Conta conta = new Conta(1, "Domingos Latorre");

        conta.depositar(3000.0);
        double saldoAposSaque = conta.sacar(150.0);

        assertEquals(2850.0, saldoAposSaque);
    }

    @Test
    public void testaSacarValorMaiorDoQueSaldo() {
        Conta conta = new Conta(1, "Domingos Latorre");

        conta.depositar(3000.0);
 
        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(3050.0);
        });
    }

    @Test
    public void testaDepositar() {
        Conta conta = new Conta(1, "Domingos Latorre");

        double saldoAposDeposito = conta.depositar(150.0);

        assertEquals(150.0, saldoAposDeposito);
    }

    @Test
    public void testaTransferir() {
        Conta contaCorrente = new Conta(1, "Domingos Latorre");
        Conta contaPoupanca = new Conta(2, "Domingos Latorre");

        contaCorrente.depositar(3000.0);

        double saldoContaRemetente = contaCorrente.transferir(contaPoupanca, 1000.0);
        double saldoContaDestino = contaPoupanca.saldo;

        assertEquals(2000.0, saldoContaRemetente);
        assertEquals(1000.0, saldoContaDestino);
    }

    @Test
    public void testaTransferirValorMaiorDoQueSaldo() {
        Conta contaCorrente = new Conta(1, "Domingos Latorre");
        Conta contaPoupanca = new Conta(2, "Domingos Latorre");

        contaCorrente.depositar(3000.0);

        assertThrows(IllegalArgumentException.class, () -> {
            contaCorrente.transferir(contaPoupanca, 3010.0);
        });
    }
}
