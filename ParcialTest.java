import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParcialTest {

    Parcial parcial = new Parcial();

    @Test
    void testPotenciaExponenteCero() {
        assertEquals(1, parcial.potencia(5, 0));
    }

    @Test
    void testPotenciaBaseCero() {
        assertEquals(0, parcial.potencia(0, 3));
    }

    @Test
    void testPotenciaNormal() {
        assertEquals(243, parcial.potencia(3, 5));
    }

    @Test
    void testExponenteNegativo() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> parcial.potencia(3, -1));
        assertEquals("El exponente no puede ser negativo.", e.getMessage());
    }

    @Test
    void testOverflow() {
        assertThrows(ArithmeticException.class, () -> parcial.potencia(2, 31));
    }
