package semana12.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class PessoaTest {
    
    @Test
    public void testaInstanciarPessoa() {

        Pessoa p1 = new Pessoa(172, 70.3);

        assertEquals(172, p1.altura);
        assertEquals(70.3, p1.peso);
    }

    @Test
    public void testaInstanciarPessoaPesoZero() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Pessoa(172, 0.0);
        });
    }

    @Test
    public void testaInstanciarPessoaComAlturaZero() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Pessoa(0, 70.3);
        });
    }

    @Test
    public void testaCalcularIMC() {

        Pessoa p1 = new Pessoa(172, 70.3);

        double imc = p1.calcularIMC();

        assertEquals(23.76, imc, 0.01);
    }


    @Test
    public void testaGetFaixa1() {

        Pessoa p1 = new Pessoa(172, 54.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Baixo Peso", faixa);
    }

    @Test
    public void testaGetFaixa2() {

        Pessoa p1 = new Pessoa(172, 70.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Peso Normal", faixa);
    }

    @Test
    public void testaGetFaixa3() {

        Pessoa p1 = new Pessoa(172, 80.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Excesso de peso", faixa);
    }

    @Test
    public void testaGetFaixa4() {

        Pessoa p1 = new Pessoa(172, 90.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Obesidade classe 1", faixa);
    }

    @Test
    public void testaGetFaixa5() {

        Pessoa p1 = new Pessoa(172, 110.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Obesidade classe 2", faixa);
    }

    @Test
    public void testaGetFaixa6() {

        Pessoa p1 = new Pessoa(172, 120.3);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Obesidade classe 3", faixa);
    }

    @Test
    public void testaGetSituacao1() {

        Pessoa p1 = new Pessoa(172, 50.3);

        String situacao = p1.getSituacao();

        assertEquals("GANHAR", situacao);
    }

    @Test
    public void testaGetSituacao2() {

        Pessoa p1 = new Pessoa(172, 100.3);

        String situacao = p1.getSituacao();

        assertEquals("PERDER", situacao);
    }

    @Test
    public void testaGetSituacao3() {

        Pessoa p1 = new Pessoa(172, 73.8);

        String situacao = p1.getSituacao();

        assertEquals("NORMAL", situacao);
    }
}
