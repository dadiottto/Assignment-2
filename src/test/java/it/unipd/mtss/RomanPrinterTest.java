////////////////////////////////////////////////////////////////////
// Davide Diotto 2042334
// Nicola Preto 2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint1(){
        assertEquals

                ("  _____   \n" +
                         " |_   _|  \n" +
                         "   | |    \n" +
                         "   | |    \n" +
                         "  _| |_   \n" +
                         " |_____|  \n", RomanPrinter.print(1));
    }

    @Test
    public void testPrint5(){
        assertEquals
                ("__      __\n" +
                        "\\ \\    / /\n" +
                        " \\ \\  / / \n" +
                        "  \\ \\/ /  \n" +
                        "   \\  /   \n" +
                        "    \\/    \n", RomanPrinter.print(5));
    }

    @Test
    public void testPrint10(){
        assertEquals(
                " __   __  \n" +
                "  \\ \\ / / \n" +
                "   \\ V /  \n" +
                "   > <    \n" +
                "  / . \\   \n" +
                " // \\\\  \n", RomanPrinter.print(10));
    }

    @Test
    public void testPrint50(){
        assertEquals(
                "  _       \n"+
                " | |      \n"+
                " | |      \n"+
                " | |      \n"+
                " | |____  \n"+
                " |______| \n", RomanPrinter.print(50));

    }

    @Test
    public void testPrint100(){
        assertEquals(
                "   _____  \n"+
                "  / ____| \n"+
                " | |      \n"+
                " | |      \n"+
                " | |____  \n" +
                "  \\_____| \n", RomanPrinter.print(100));
    }

    @Test
    public void testPrint500(){
        assertEquals(
                "  _____   \n"+
                " |  __ \\  \n"+
                " | |  | | \n"+
                " | |  | | \n"+
                " | |__| | \n"+
                " |_____/  \n", RomanPrinter.print(500));
    }

    @Test
    public void testPrint1000(){
        assertEquals(
                "  __  __  \n"+
                " |  \\/  | \n"+
                " | \\  / | \n"+
                " | |\\/| | \n"+
                " | |  | | \n"+
                " |_|  |_| \n", RomanPrinter.print(1000));
    }

    @Test
    public void testPrintNull(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(0));
    }

    @Test
    public void testPrintNegative1(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-1));
    }

    @Test
    public void testPrintNegative5(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-5));
    }

    @Test
    public void testPrintNegative10(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-10));
    }

    @Test
    public void testPrintNegative50(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-50));
    }

    @Test
    public void testPrintNegative100(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-100));
    }

    @Test
    public void testPrintNegative500(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-500));
    }

    @Test
    public void testPrintNegative1000(){
        assertEquals("numero non rappresentabile\n", RomanPrinter.print(-1000));
    }

    @Test
    public void testPrintAsciiArtWithII() {
        String expected =
                        "  _____     _____   \n" +
                        " |_   _|   |_   _|  \n" +
                        "   | |       | |    \n" +
                        "   | |       | |    \n" +
                        "  _| |_     _| |_   \n" +
                        " |_____|   |_____|  \n";
        String result = RomanPrinter.print(2);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithVV() {
        String wrong = "__      ____      __\n"+
                "\\ \\    / /\\ \\    / /\n"+
                " \\ \\  / /  \\ \\  / / \n"+
                "  \\ \\/ /    \\ \\/ /  \n"+
                "   \\  /      \\  /   \n"+
                "    \\/        \\/    \n";
        String result = RomanPrinter.print(10);
        assertNotEquals(wrong, result);
    }

    @Test
    public void testPrintAsciiArtWithXX() {
        String expected =" __   __   __   __  \n"+
                "  \\ \\ / /   \\ \\ / / \n"+
                "   \\ V /     \\ V /  \n"+
                "   > <       > <    \n"+
                "  / . \\     / . \\   \n"+
                " // \\\\   // \\\\  \n";
        String result = RomanPrinter.print(20);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithLL() {
        String wrong ="  _         _       \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |____   | |____  \n"+
                " |______|  |______| \n";
        String result = RomanPrinter.print(100);
        assertNotEquals(wrong, result);
    }

    @Test
    public void testPrintAsciiArtWithCC() {
        String expected =
                "   _____     _____  \n"+
                "  / ____|   / ____| \n"+
                " | |       | |      \n"+
                " | |       | |      \n"+
                " | |____   | |____  \n"+
                "  \\_____|   \\_____| \n";
        String result = RomanPrinter.print(200);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintAsciiArtWithDD() {
        String wrong =
                "  _____     _____   \n"+
                " |  __ \\   |  __ \\  \n"+
                " | |  | |  | |  | | \n"+
                " | |  | |  | |  | | \n"+
                " | |__| |  | |__| | \n"+
                " |_____/   |_____/  \n";
        String result = RomanPrinter.print(1000);
        assertNotEquals(wrong, result);
}

    public static class IntegerToRomanTest {
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
}
