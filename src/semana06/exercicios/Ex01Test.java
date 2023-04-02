package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Ex01Test {
    
    @Test
    public void calculaVolumeTresNumerosPositivos() {
        double comprimento = 50;
        double altura = 40;
        double largura = 30;

        double volume = Ex01.calcularVolume(comprimento, altura, largura);

        assertEquals(60.0, volume);
    }

    @Test
    public void calculaVolumeDoisNumerosPositivosEZero() {
        double comprimento = 50;
        double altura = 40;
        double largura = 0;

        double volume = Ex01.calcularVolume(comprimento, altura, largura);

        assertEquals(0.0, volume);
    }

    @Test
    public void calculaPotenciaVolumePositivoTemperaturaDesejadaPositivaETemperaturaAmbientePositiva() {
        double volume = 60;
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 17;

        double potencia = Ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(39.0, potencia);
    }

    @Test
    public void calculaPotenciaVolumePositivoTemperaturaDesejadaNegativaETemperaturaAmbientePositiva() {
        double volume = 60;
        double temperaturaDesejada = -5;
        double temperaturaAmbiente = 20;

        double potencia = Ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(75.0, potencia);
    }

    @Test
    public void calculaPotenciaVolumePositivoTemperaturaDesejadaPositivaETemperaturaAmbienteNegativa() {
        double volume = 60;
        double temperaturaDesejada = 21;
        double temperaturaAmbiente = -10;

        double potencia = Ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(93.0, potencia);
    }

    @Test
    public void calculaPotenciaVolumeIgualAZeroTemperaturaDesejadaPositivaETemperaturaAmbientePositiva() {
        double volume = 0;
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 25;

        double potencia = Ex01.calcularPotencia(volume, temperaturaDesejada, temperaturaAmbiente);

        assertEquals(0.0, potencia);
    }

    @Test 
    public void calculaFiltragemVolumePositivo() {
        double volume = 45;
        double [] esperado = {90.0, 135.0};

        double [] filtragem = Ex01.calcularFiltragem(volume);

        assertArrayEquals(esperado, filtragem);
    }

    @Test 
    public void calculaFiltragemVolumeIgualAZero() {
        double volume = 0;
        double [] esperado = {0.0, 0.0};

        double [] filtragem = Ex01.calcularFiltragem(volume);

        assertArrayEquals(esperado, filtragem);
    }
}
