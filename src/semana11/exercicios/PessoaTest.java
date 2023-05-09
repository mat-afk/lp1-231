package semana11.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class PessoaTest {
    
    @Test
    public void testaCalcularIMC() {

        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        double imc = p1.calcularIMC();

        assertEquals(null, null);
        
    }
}
