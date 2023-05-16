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
        //Arrange
        String expected = "I";
        //Act
        String actual = IntegerToRoman.convert(1);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsIVFor4() {
        //Arrange
        String expected = "IV";
        //Act
        String actual = IntegerToRoman.convert(4);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsIIIIFor4() {
        //Arrange
        String expected = "IIII";
        //Act
        String actual = IntegerToRoman.convert(4);
        //Assert
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsVFor5() {
        //Arrange
        String expected = "V";
        //Act
        String actual = IntegerToRoman.convert(5);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsIXFor9() {
        //Arrange
        String expected = "IX";
        //Act
        String actual = IntegerToRoman.convert(9);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsVIIIIFor9() {
        //Arrange
        String expected = "VIIII";
        //Act
        String actual = IntegerToRoman.convert(9);
        //Assert
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsXFor10() {
        //Arrange
        String expected = "X";
        //Act
        String actual = IntegerToRoman.convert(10);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsVVFor10() {
        //Arrange
        String expected = "VV";
        //Act
        String actual = IntegerToRoman.convert(10);
        //Assert
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsXVFor15() {
        //Arrange
        String expected = "XV";
        //Act
        String actual = IntegerToRoman.convert(15);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsLLFor100() {
        //Arrange
        String expected = "LL";
        //Act
        String actual = IntegerToRoman.convert(100);
        //Assert
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertNotReturnsDDFor1000() {
        //Arrange
        String expected = "DD";
        //Act
        String actual = IntegerToRoman.convert(1000);
        //Assert
        assertNotEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsLXVIIIFor68() {
        //Arrange
        String expected = "LXVIII";
        //Act
        String actual = IntegerToRoman.convert(68);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidFor1337() {
        //Arrange
        String expected = "Numero non valido";
        //Act
        String actual = IntegerToRoman.convert(1337);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidFor0() {
        //Arrange
        String expected = "Numero non valido";
        //Act
        String actual = IntegerToRoman.convert(0);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidForNegative1() {
        //Arrange
        String expected = "Numero non valido";
        //Act
        String actual = IntegerToRoman.convert(-1);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsNotValidForNegative1000() {
        //Arrange
        String expected = "Numero non valido";
        //Act
        String actual = IntegerToRoman.convert(-1000);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsMFor1000() {
        //Arrange
        String expected = "M";
        //Act
        String actual = IntegerToRoman.convert(1000);
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertReturnsLXVIIIFor999() {
        //Arrange
        String expected = "CMXCIX";
        //Act
        String actual = IntegerToRoman.convert(999);
        //Assert
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