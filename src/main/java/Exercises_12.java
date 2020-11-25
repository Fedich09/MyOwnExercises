/* Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral
representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008
is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

conversion.solution(1000); //should return "M"
Help:

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row. */

public class Exercises_12 {
    public static void main(String[] args) {
        Exercises_12 exercises_12 = new Exercises_12();
        System.out.println(exercises_12.solution(1666));
        System.out.println((2658 / 1000));
    }

    public String solution(int n) {
        Exercises_12 exercises_12 = new Exercises_12();
        String s = exercises_12.Thousand(n) + exercises_12.ToThousand(n) + exercises_12.ToHundred(n) + exercises_12.ToTen(n);
        return s;
    }

    public  String Thousand(int n){
        int buffer = n / 1000;
        String s = "";
        if (buffer > 0){
            switch (buffer){
                case 1:
                    s = "M";
                    break;
                case 2:
                    s = "MM";
                    break;
                case 3:
                    s = "MMM";
                    break;
            }
        }
        return s;
    }

    public String ToThousand(int n){
        int buffer = n - (n / 1000) * 1000;
        int finalBuffer = buffer / 100;
        String s = "";
        if (finalBuffer > 0){
            switch (finalBuffer){
                case 1:
                    s = "C";
                    break;
                case 2:
                    s = "CC";
                    break;
                case 3:
                    s = "CCC";
                    break;
                case 4:
                    s = "CD";
                    break;
                case 5:
                    s = "D";
                    break;
                case 6:
                    s = "DC";
                    break;
                case 7:
                    s = "DCC";
                    break;
                case 8:
                    s = "DCCC";
                    break;
                case 9:
                    s = "CM";
                    break;
            }
        }
        return s;
    }

    public String ToHundred(int n) {
        int buffer = n - (n / 1000) * 1000;
        int finalBuffer1 = buffer - (buffer / 100) * 100;
        int finalBuffer = finalBuffer1 / 10;
        String s = "";
        if (finalBuffer > 0) {
            switch (finalBuffer) {
                case 1:
                    s = "X";
                    break;
                case 2:
                    s = "XX";
                    break;
                case 3:
                    s = "XXX";
                    break;
                case 4:
                    s = "XL";
                    break;
                case 5:
                    s = "L";
                    break;
                case 6:
                    s = "LX";
                    break;
                case 7:
                    s = "LXX";
                    break;
                case 8:
                    s = "LXXX";
                    break;
                case 9:
                    s = "XC";
                    break;
            }
        }
        return s;
    }

    public String ToTen(int n) {
        int buffer = n - (n / 1000) * 1000;
        int buffer2 = buffer - (buffer / 100) * 100;
        int finalBuffer = buffer2 - (buffer2 / 10) * 10;
        String s = "";
        if (finalBuffer > 0) {
            switch (finalBuffer) {
                case 1:
                    s = "I";
                    break;
                case 2:
                    s = "II";
                    break;
                case 3:
                    s = "III";
                    break;
                case 4:
                    s = "IV";
                    break;
                case 5:
                    s = "V";
                    break;
                case 6:
                    s = "VI";
                    break;
                case 7:
                    s = "VII";
                    break;
                case 8:
                    s = "VIII";
                    break;
                case 9:
                    s = "IX";
                    break;
            }
        }
        return s;
    }
}
