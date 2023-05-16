////////////////////////////////////////////////////////////////////
// Davide Diotto 2042334
// Nicola Preto 2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        if(num<=0) {
            return "numero non rappresentabile\n";
        }
        else {
            return printAsciiArt(IntegerToRoman.convert(num));
        }
    }

    private static String printI(int a){
        String tmp="";
        switch (a){
            case 0: tmp += "  _____   ";
                break;
            case 1: tmp += " |_   _|  ";
                break;
            case 2: tmp += "   | |    ";
                break;
            case 3: tmp += "   | |    ";
                break;
            case 4: tmp += "  _| |_   ";
                break;
            case 5: tmp += " |_____|  ";
                break;
        }
        return tmp;
    }
    private static String printV(int a){
        String tmp="";
        switch (a){
            case 0: tmp += "__      __";
                break;
            case 1: tmp += "\\ \\    / /";
                break;
            case 2: tmp += " \\ \\  / / ";
                break;
            case 3: tmp += "  \\ \\/ /  ";
                break;
            case 4: tmp += "   \\  /   ";
                break;
            case 5: tmp += "    \\/    ";
                break;
        }
        return tmp;
    }
    private static String printX(int a){
        String tmp="";
        switch (a){
            case 0: tmp += " __   __  ";
                break;
            case 1: tmp += "  \\ \\ / / ";
                break;
            case 2: tmp += "   \\ V /  ";
                break;
            case 3: tmp += "   > <    ";
                break;
            case 4: tmp += "  / . \\   ";
                break;
            case 5: tmp += " // \\\\  ";
                break;
        }
        return tmp;
    }
    private static String printL(int a){
        String tmp="";
        switch (a){
            case 0: tmp += "  _       ";
                break;
            case 1: tmp += " | |      ";
                break;
            case 2: tmp += " | |      ";
                break;
            case 3: tmp += " | |      ";
                break;
            case 4: tmp += " | |____  ";
                break;
            case 5: tmp += " |______| ";
                break;
        }
        return tmp;
    }
    private static String printC(int a){
        String tmp="";
        switch (a){
            case 0: tmp += "   _____  ";
                break;
            case 1: tmp += "  / ____| ";
                break;
            case 2: tmp += " | |      ";
                break;
            case 3: tmp += " | |      ";
                break;
            case 4: tmp += " | |____  ";
                break;
            case 5: tmp += "  \\_____| ";
                break;
        }
        return tmp;
    }
    private static String printD(int a){
        String tmp="";
        switch (a){
            case 0: tmp += "  _____   ";
                break;
            case 1: tmp += " |  __ \\  ";
                break;
            case 2: tmp += " | |  | | ";
                break;
            case 3: tmp += " | |  | | ";
                break;
            case 4: tmp += " | |__| | ";
                break;
            case 5: tmp += " |_____/  ";
                break;
        }
        return tmp;
    }
    private static String printM(int a){
        String tmp="";
        switch (a){
            case 0: tmp += "  __  __  ";
                break;
            case 1: tmp += " |  \\/  | ";
                break;
            case 2: tmp += " | \\  / | ";
                break;
            case 3: tmp += " | |\\/| | ";
                break;
            case 4: tmp += " | |  | | ";
                break;
            case 5: tmp += " |_|  |_| ";
                break;
        }
        return tmp;
    }

    private static String printAsciiArt(String romanNumber){
        String tmp="";
        for(int i=0; i<6; ++i){
            for(int j=0; j<romanNumber.length(); ++j){
                switch (romanNumber.charAt(j)){
                    case 'I': tmp += printI(i);
                        break;
                    case 'V': tmp += printV(i);
                        break;
                    case 'X': tmp += printX(i);
                        break;
                    case 'L': tmp += printL(i);
                        break;
                    case 'C': tmp += printC(i);
                        break;
                    case 'D': tmp += printD(i);
                        break;
                    case 'M': tmp += printM(i);
                        break;
                }
            }
            tmp += "\n";
        }
        return tmp;
}
}