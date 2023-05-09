package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

public class AquarioTest {
   
    @Test
    public void testaCalcularVolume() {

        Aquario aquario = new Aquario();
        aquario.comprimento = 30.0;
        aquario.altura = 40.0;
        aquario.largura = 50.0;

        double volume = aquario.calcularVolume();

        assertEquals(60.0, volume);
    }

    @Test
    public void testaCalcularPotenciaDoTermostato() {

        Aquario aquario = new Aquario();
        aquario.comprimento = 30.0;
        aquario.altura = 40.0;
        aquario.largura = 50.0;
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 17;

        double potencia = aquario.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        assertEquals(39.0, potencia);
    }

    @Test 
    public void testaCalcularQuantidadeLitrosFiltro() {

        Aquario aquario = new Aquario();
        aquario.comprimento = 30.0;
        aquario.altura = 40.0;
        aquario.largura = 50.0;
        double [] esperado = {120.0, 180.0};

        double [] filtragem = aquario.calcularQuantidadeLitrosFiltro();

        assertArrayEquals(esperado, filtragem);
    }
}
