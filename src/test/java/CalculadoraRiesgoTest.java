import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraRiesgoTest {
    CalculadoraRiesgo calc = new CalculadoraRiesgo();

    @Test
    void testEdadNegativa() {
        assertEquals("Error", calc.evaluarEdad(-5));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(25));
    }
    
    // TODO: Añade tú un test para el caso "Senior" y otro para el límite de 18 años


    @Test
    void testSenior() {
        assertEquals("Senior", calc.evaluarEdad(70));
    }

    @Test
    void testLimite18() {
        assertEquals("Adulto", calc.evaluarEdad(18));
    }
}

