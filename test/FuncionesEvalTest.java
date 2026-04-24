import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Nested
class FuncionesEvalTest {

    @Test
    void contarApariciones() {
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }

    @Test
    void testEncontrarMayor() {
        int[] array1 = {1, 3, 2, 5, 4};
        assertEquals(5, FuncionesEval.encontrarMayor(array1));

        int[] array2 = {-1, -2, -3, -4};
        assertEquals(-1, FuncionesEval.encontrarMayor(array2));

        int[] array3 = {10};
        assertEquals(10, FuncionesEval.encontrarMayor(array3));

        int[] array4 = {};
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

        int[] array5 = null;
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
    }

    @Test
    void getTipoClima() {
        // Casos normales
        assertEquals("FRIO", FuncionesEval.getTipoClima(3));
        assertEquals("FRIO", FuncionesEval.getTipoClima(0));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(15));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(25));
        assertEquals("TROPICAL", FuncionesEval.getTipoClima(35));

        // Casos límite: fronteras exactas
        assertEquals("FRIO", FuncionesEval.getTipoClima(10));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(11));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(20));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(21));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(30));
        assertEquals("TROPICAL", FuncionesEval.getTipoClima(31));

        // Caso límite: temperatura negativa
        assertEquals("FRIO", FuncionesEval.getTipoClima(-5));
    }

    @Test
    void invertirArray() {
        // Caso normal
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, FuncionesEval.invertirArray(new int[]{1, 2, 3, 4, 5}));

        // Caso normal: números negativos
        assertArrayEquals(new int[]{-3, -2, -1}, FuncionesEval.invertirArray(new int[]{-1, -2, -3}));

        // Caso límite: dos elementos
        assertArrayEquals(new int[]{2, 1}, FuncionesEval.invertirArray(new int[]{1, 2}));

        // Caso límite: un solo elemento
        assertArrayEquals(new int[]{42}, FuncionesEval.invertirArray(new int[]{42}));

        // Caso límite: array vacío
        assertArrayEquals(new int[]{}, FuncionesEval.invertirArray(new int[]{}));

        // Caso límite: null lanza IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.invertirArray(null));
    }

    @Test
    void esPerfecto() {
        // Casos normales: números perfectos conocidos
        assertTrue(FuncionesEval.esPerfecto(6));
        assertTrue(FuncionesEval.esPerfecto(28));
        assertTrue(FuncionesEval.esPerfecto(8128));

        // Casos normales: números no perfectos
        assertFalse(FuncionesEval.esPerfecto(2));
        assertFalse(FuncionesEval.esPerfecto(10));
        assertFalse(FuncionesEval.esPerfecto(12));

        // Caso límite: 1 no es perfecto
        assertFalse(FuncionesEval.esPerfecto(1));

        // Caso límite: 0 lanza ArithmeticException
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(0));

        // Caso límite: negativo lanza ArithmeticException
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(-6));
    }
}

