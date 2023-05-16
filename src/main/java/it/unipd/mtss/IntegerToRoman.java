////////////////////////////////////////////////////////////////////
// Davide Diotto 2042334
// Nicola Preto 2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private static final String[] ROMANI = {
            "M",
            "CM",
            "D",
            "CD",
            "C",
            "XC",
            "L",
            "XL",
            "X",
            "IX",
            "V",
            "IV",
            "I"};
    private static final int[] ARABI = {
            1000,
            900,
            500,
            400,
            100,
            90,
            50,
            40,
            10,
            9,
            5,
            4,
            1};

    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            return "Numero non valido";
        }

        StringBuilder numeroRomano = new StringBuilder();
        int indice = 0;

        while (number > 0) {
            if (number >= ARABI[indice]) {
                numeroRomano.append(ROMANI[indice]);
                number -= ARABI[indice];
            } else {
                indice++;
            }
        }

        return numeroRomano.toString();
    }

}