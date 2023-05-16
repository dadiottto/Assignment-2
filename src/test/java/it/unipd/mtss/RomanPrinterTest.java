////////////////////////////////////////////////////////////////////
// Davide Diotto 2042334
// Nicola Preto 2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }


    @Test
    public void testPrint1(){
        //Arrange
        int number = 1;
        //Act
        String ascii_art_for_I = printer.print(number);
        //Assert
        assertEquals(new String(
                "  _____   \n" +
                        " |_   _|  \n" +
                        "   | |    \n" +
                        "   | |    \n" +
                        "  _| |_   \n" +
                        " |_____|  \n"
        ), ascii_art_for_I);

    }

    @Test
    public void testPrint5(){
        //Arrange
        int number = 5;
        //Act
        String ascii_art_for_V = printer.print(number);
        //Assert
        assertEquals(new String(
                "__      __\n" +
                        "\\ \\    / /\n" +
                        " \\ \\  / / \n" +
                        "  \\ \\/ /  \n" +
                        "   \\  /   \n" +
                        "    \\/    \n"
        ), ascii_art_for_V);
    }

    @Test
    public void testPrint10(){
        //Arrange
        int number = 10;
        //Act
        String ascii_art_for_X = printer.print(number);
        //Assert
        assertEquals(new String(
                " __   __  \n" +
                        "  \\ \\ / / \n" +
                        "   \\ V /  \n" +
                        "   > <    \n" +
                        "  / . \\   \n" +
                        " // \\\\  \n"
        ), ascii_art_for_X);
    }

    @Test
    public void testPrint50(){
        //Arrange
        int number = 50;
        //Act
        String ascii_art_for_L = printer.print(number);
        //Assert
        assertEquals(new String(
                "  _       \n"+
                        " | |      \n"+
                        " | |      \n"+
                        " | |      \n"+
                        " | |____  \n"+
                        " |______| \n"
        ), ascii_art_for_L);
    }

    @Test
    public void testPrint100(){
        //Arrange
        int number = 100;
        //Act
        String ascii_art_for_C = printer.print(number);
        //Assert
        assertEquals(new String(
                "   _____  \n"+
                        "  / ____| \n"+
                        " | |      \n"+
                        " | |      \n"+
                        " | |____  \n" +
                        "  \\_____| \n"
        ), ascii_art_for_C);
    }

    @Test
    public void testPrint500(){
        //Arrange
        int number = 500;
        //Act
        String ascii_art_for_D = printer.print(number);
        //Assert
        assertEquals(new String(
                "  _____   \n"+
                        " |  __ \\  \n"+
                        " | |  | | \n"+
                        " | |  | | \n"+
                        " | |__| | \n"+
                        " |_____/  \n"
        ), ascii_art_for_D);
    }

    @Test
    public void testPrint1000(){
        //Arrange
        int number = 1000;
        //Act
        String ascii_art_for_M = printer.print(number);
        //Assert
        assertEquals(new String(
                "  __  __  \n"+
                        " |  \\/  | \n"+
                        " | \\  / | \n"+
                        " | |\\/| | \n"+
                        " | |  | | \n"+
                        " |_|  |_| \n"
        ), ascii_art_for_M);
    }

    @Test
    public void testPrintNull(){
        //Arrange
        int numero = 0;
        //Act
        String ascii_art_for_0 = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_0);
    }

    @Test
    public void testPrintNegative1(){
        //Arrange
        int numero = -1;
        //Act
        String ascii_art_for_negative_one = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_one);
    }

    @Test
    public void testPrintNegative5(){
        //Arrange
        int numero = -5;
        //Act
        String ascii_art_for_negative_five = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_five);
    }

    @Test
    public void testPrintNegative10(){
        //Arrange
        int numero = -10;
        //Act
        String ascii_art_for_negative_ten = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_ten);
    }

    @Test
    public void testPrintNegative50(){
        //Arrange
        int numero = -50;
        //Act
        String ascii_art_for_negative_50 = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_50);
    }

    @Test
    public void testPrintNegative100(){
        //Arrange
        int numero = -100;
        //Act
        String ascii_art_for_negative_100 = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_100);
    }

    @Test
    public void testPrintNegative500(){
        //Arrange
        int numero = -500;
        //Act
        String ascii_art_for_negative_500 = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_500);
    }

    @Test
    public void testPrintNegative1000(){
        //Arrange
        int numero = -1000;
        //Act
        String ascii_art_for_negative_1000 = printer.print(numero);
        //Assert
        assertEquals("numero non rappresentabile\n", ascii_art_for_negative_1000);
    }

    @Test
    public void testPrintAsciiArtWithII() {
        //Arrange
        String expected =
                        "  _____     _____   \n" +
                        " |_   _|   |_   _|  \n" +
                        "   | |       | |    \n" +
                        "   | |       | |    \n" +
                        "  _| |_     _| |_   \n" +
                        " |_____|   |_____|  \n";
        //Act
        String result = RomanPrinter.print(2);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithVV() {
        //Arrange
        String wrong = "__      ____      __\n"+
                "\\ \\    / /\\ \\    / /\n"+
                " \\ \\  / /  \\ \\  / / \n"+
                "  \\ \\/ /    \\ \\/ /  \n"+
                "   \\  /      \\  /   \n"+
                "    \\/        \\/    \n";
        //Act
        String result = RomanPrinter.print(10);
        //Assert
        assertNotEquals(wrong, result);
    }

    @Test
    public void testPrintAsciiArtWithXX() {
        //Arrange
        String expected =" __   __   __   __  \n"+
                "  \\ \\ / /   \\ \\ / / \n"+
                "   \\ V /     \\ V /  \n"+
                "   > <       > <    \n"+
                "  / . \\     / . \\   \n"+
                " // \\\\   // \\\\  \n";
        //Act
        String result = RomanPrinter.print(20);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithLL() {
        //Arrange
        String wrong ="  _         _       \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |____   | |____  \n"+
                " |______|  |______| \n";
        //Act
        String result = RomanPrinter.print(100);
        //Assert
        assertNotEquals(wrong, result);
    }

    @Test
    public void testPrintAsciiArtWithCC() {
        //Arrange
        String expected =
                "   _____     _____  \n"+
                "  / ____|   / ____| \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |____   | |____  \n"+
                "  \\_____|   \\_____| \n";
        //Act
        String result = RomanPrinter.print(200);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithDD() {
        //Arrange
        String wrong =
                "  _____     _____   \n"+
                " |  __ \\   |  __ \\  \n"+
                " | |  | |  | |  | | \n"+
                " | |  | |  | |  | | \n"+
                " | |__| |  | |__| | \n"+
                " |_____/   |_____/  \n";
        //Act
        String result = RomanPrinter.print(1000);
        //Assert
        assertNotEquals(wrong, result);
}

    public static class IntegerToRomanTest {
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
}
