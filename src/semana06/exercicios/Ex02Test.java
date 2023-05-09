package semana06.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Ex02Test {
    
    @Test
    
    public void calculaIMCPesoEAlturaPositivos() {
        double peso = 69.0;
        double altura = 1.80;

        double imc = Ex02.calcularIMC(peso, altura);

        assertEquals(21.296296296296294, imc);
    }

    @Test
    public void calculaIMCPesoIgualAZeroEAlturaPositiva() {
        double peso = 0.0;
        double altura = 1.80;

        double imc = Ex02.calcularIMC(peso, altura);

        assertEquals(0.0, imc);
    }

    @Test
    public void calculaIMCPesoPositivoEAlturaIgualAZero() {
        double peso = 69.0;
        double altura = 0.0;

        assertThrows(RuntimeException.class, () -> {
            Ex02.calcularIMC(peso, altura);
        });
    }

    @Test
    public void classificaIMCPositivo() {
        double imc = 27.9;

        String classificacao = Ex02.classificarIMC(imc);

        assertEquals("Classificação: Excesso de peso", classificacao);
    }

    @Test
    public void classificaIMCIgualAZero() {
        double imc = 0;

        String classificacao = Ex02.classificarIMC(imc);

        assertEquals("Classificação: Baixo Peso", classificacao);
    }

    @Test
    public void classificaPesoIdealPesoEAlturaPositivos() {
        double peso = 69.0;
        double altura = 1.80;

        String classificacao = Ex02.classificarPesoIdeal(peso, altura);

        assertEquals("Você precisa ganhar 12kg para chegar ao peso ideal.", classificacao);
    }

    @Test
    public void classificaPesoIdealPesoPositivoEAlturaIgualAZero() {
        double peso = 69.0;
        double altura = 0.0;

        String classificacao = Ex02.classificarPesoIdeal(peso, altura);

        assertEquals("Você precisa perder 69kg para chegar ao peso ideal.", classificacao);
    }
}
