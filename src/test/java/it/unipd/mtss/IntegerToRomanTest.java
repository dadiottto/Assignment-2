////////////////////////////////////////////////////////////////////
// Davide Diotto 2042334
// Nicola Preto 2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvertReturnsIFor1() {
        String expected = "I";
        String actual = IntegerToRoman.convert(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsIVFor4() {
        String expected = "IV";
        String actual = IntegerToRoman.convert(4);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsIIIIFor4() {
        String expected = "IIII";
        String actual = IntegerToRoman.convert(4);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsVFor5() {
        String expected = "V";
        String actual = IntegerToRoman.convert(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsIXFor9() {
        String expected = "IX";
        String actual = IntegerToRoman.convert(9);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsVIIIIFor9() {
        String expected = "VIIII";
        String actual = IntegerToRoman.convert(9);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsXFor10() {
        String expected = "X";
        String actual = IntegerToRoman.convert(10);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsVVFor10() {
        String expected = "VV";
        String actual = IntegerToRoman.convert(10);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsXVFor15() {
        String expected = "XV";
        String actual = IntegerToRoman.convert(15);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsLLFor100() {
        String expected = "LL";
        String actual = IntegerToRoman.convert(100);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsDDFor1000() {
        String expected = "DD";
        String actual = IntegerToRoman.convert(1000);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsLXVIIIFor68() {
        String expected = "LXVIII";
        String actual = IntegerToRoman.convert(68);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidFor1337() {
        String expected = "Numero non valido";
        String actual = IntegerToRoman.convert(1337);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidFor0() {
        String expected = "Numero non valido";
        String actual = IntegerToRoman.convert(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidForNegative1() {
        String expected = "Numero non valido";
        String actual = IntegerToRoman.convert(-1);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidForNegative1000() {
        String expected = "Numero non valido";
        String actual = IntegerToRoman.convert(-1000);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsMFor1000() {
        String expected = "M";
        String actual = IntegerToRoman.convert(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsLXVIIIFor999() {
        String expected = "CMXCIX";
        String actual = IntegerToRoman.convert(999);
        assertEquals(expected, actual);
    }
/*
    @Test
    public void testNonIntegerInput() {
        assertThrows(NumberFormatException.class, () -> {
            IntegerToRoman.convert(Integer.parseInt("abc"));
        });
    }

    @Test
    public void testCharInput() {
        assertThrows(NumberFormatException.class, () -> {
            IntegerToRoman.convert('A');
        });
    }

 */
/*
    @Test
    public void testNonInteri() {
        assertEquals("Numero non valido", IntegerToRoman.convert(3.14));
        assertEquals("Numero non valido", IntegerToRoman.convert(10.0));
        assertEquals("Numero non valido", IntegerToRoman.convert(100.5));
}

*/
}