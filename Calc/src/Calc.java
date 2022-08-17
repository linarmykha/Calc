import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception{
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Input:");
                String line = input.nextLine();
                String[] operator = line.split(" ");
                if (operator.length != 3)
//                    throw new Exception("Количество символов не соответствует условию");
                    throw new Exception();
                if (Arabic(operator[0]) && Arabic(operator[2])) {
                    int a = Integer.parseInt(operator[0]);
                    int b = Integer.parseInt(operator[2]);
                    if (a < 0 || a > 10 || b < 0 || b > 10)
//                        throw new Exception("Переменные выходят за пределы условия");
                        throw new Exception();
                    switch (operator[1]) {
                        case "+": {
                            System.out.println("Output:");
                            System.out.println(a + b);
                            break;
                        }
                        case "-": {
                            System.out.println("Output:");
                            System.out.println(a - b);
                            break;
                        }
                        case "/": {
                            System.out.println("Output:");
                            System.out.println(a / b);
                            break;
                        }
                        case "*": {
                            System.out.println("Output:");
                            System.out.println(a * b);
                            break;
                        }
                        default: {
//                            System.out.println("Output:");
//                            System.out.println("Неверный символ операции, разрешено: +,-,/,*");
                            throw new Exception();
                        }
                    }
                } else if (Roman(operator[0]) && Roman(operator[2])) {
                    int a = RomanToArabic(operator[0]);
                    int b = RomanToArabic(operator[2]);
                    int x;
                    if (a < 0 || a > 10 || b < 0 || b > 10)
 //                       throw new Exception("Переменные выходят за пределы условия");
                        throw new Exception();
                    switch (operator[1]) {
                        case "+": {
                            System.out.println("Output:");
                            x = a + b;
                            System.out.println(ArabicToRoman(x));
                            break;
                        }
                        case "-": {
                            System.out.println("Output:");
                            x = a - b;
                            System.out.println(ArabicToRoman(x));
                            break;
                        }
                        case "/": {
                            System.out.println("Output:");
                            x = a / b;
                            System.out.println(ArabicToRoman(x));
                            break;
                        }
                        case "*": {
                            System.out.println("Output:");
                            x = a * b;
                            System.out.println(ArabicToRoman(x));
                            break;
                        }
                    }
                }
                else {
//                    throw new Exception("Переменные не соответствуют требованиям условия");
                    throw new Exception();
                }
            } catch (Exception e) {
          //      System.out.println("Output:");
           //     System.out.println(a.getMessage());
          //      break;
                throw new Exception(e);
            }
        }

    }

    public static boolean Arabic(String num) {
        String[] arabic = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < arabic.length; i++) {
            if (num.equals(arabic[i]))
                return true;
        }
        return false;
    }

    public static boolean Roman(String num) {
        String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < roman.length; i++) {
            if (num.equals(roman[i]))
                return true;
        }
        return false;
    }

    public static int RomanToArabic(String num) {
        String[] arabic = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < roman.length; i++) {
            if (num.equals(roman[i]))
                return Integer.parseInt(arabic[i]);
        }
        return -1;
    }

    public static String ArabicToRoman(int num) throws Exception{
        String[] arabic = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
        String[] roman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        String x = Integer.toString(num);
        for (int i = 0; i < roman.length; i++) {
            if (x.equals(arabic[i]))
                return roman[i];
        }
        return " ";
    }
}

