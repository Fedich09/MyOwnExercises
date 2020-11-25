/* For encrypting strings this region of chars is given (in this order!):

all letters (ascending, first all UpperCase, then all LowerCase)
all digits (ascending)
the following chars: ".,:;-?! '()$%&" and the '"'-char
These are 77 chars! (This region is zero-based.)

Write two methods:

string Encrypt(string text)
string Decrypt(string encryptedText)
Prechecks:

If the input-string has chars, that are not in the region, throw an Exception(C#, Python) or Error(JavaScript).
If the input-string is null or empty return exactly this value!
For building the encrypted string:

For every second char do a switch of the case.
For every char take the index from the region. Take the difference from the region-index of the char before (from the
input text! Not from the fresh encrypted char before!). (Char2 = Char1-Char2)
Replace the original char by the char of the difference-value from the region. In this step the first letter of the text
 is unchanged.
Replace the first char by the mirror in the given region. ('A' -> '"', 'B' -> '&', ...)
Simple example:

Input: "Business"
Step 1: "BUsInEsS"
Step 2: "B61kujla"
B -> U
B (1) - U (20) = -19
-19 + 77 = 58
Region[58] = "6"
U -> s
U (20) - s (44) = -24
-24 + 77 = 53
Region[53] = "1"
Step 3: "&61kujla" */

import java.util.ArrayList;

interface step1 {
    String someMethod1(String s1);

}

interface helper {
    String someMethod2(char[] c, String s);
}

interface helperHelp {
    char someMethod3(char[] chars, char c, char c1);
}

interface helperWithMirror {
    String someMethod2(char[] c, char[] c1, String s);
}

public class Exercises_19 {
    public static void main(String[] args) {
        System.out.println(Encrypt("Business"));
    }

    public static String Encrypt(String text) {

        String incomeText = text;
        ArrayList<Character> region = new ArrayList<>();
        char[] regionOfChars = new char[77];
        char[] mirror = new char[77];
        char[] buffer = new char[incomeText.length()];

        // add all uppercase letter
        for (int i = 65; i <= 90; i++) {
            region.add((char) (i));
        }
        // add all lowercase letter
        for (int i = 97; i <= 122; i++) {
            region.add((char) (i));
        }
        // add all digits
        for (int i = 48; i <= 57; i++) {
            region.add((char) (i));
        }
        region.add('.');
        region.add(',');
        region.add(':');
        region.add(';');
        region.add('-');
        region.add('?');
        region.add('!');
        region.add(' ');
        region.add('\'');
        region.add('(');
        region.add(')');
        region.add('$');
        region.add('%');
        region.add('&');
        region.add((char) (0));
        // add all chars to array
        for (int i = 0; i < region.size(); i++) {
            regionOfChars[i] = region.get(i);
        }
        // add mirror array
        int counter = 0;
        for (int i = mirror.length - 1; i >= 0; i--) {
            mirror[i] = regionOfChars[counter];
            counter++;
        }
        // change each 2-nd element to uppercase
        step1 step1 = (String s1) -> {
            String m = "";
            char[] chars = s1.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 != 0) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
                m = m + chars[i];
            }
            return m;
        };
        // return element with some logic
        helperHelp helperHelp = (char[] chars, char first, char second) -> {
            char returnValue = ' ';
            int charFirst = 0;
            int charSecond = 0;
            int indexReturnElement;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == first) {
                    charFirst = i;
                } else if (chars[i] == second) {
                    charSecond = i;
                }
            }
            charSecond = charFirst - charSecond;
            if (charSecond < 0) {
                indexReturnElement = 77 + charSecond;
            } else {
                indexReturnElement = charSecond;
            }
            returnValue = chars[indexReturnElement];
            return returnValue;
        };
        // change each element to another element with some logic
        helper helpToStep2 = (char[] c, String s) -> {
            String returnValue = "";
            char[] chars1 = s.toCharArray();
            char[] newChars = new char[chars1.length];
            newChars[0] = chars1[0];
            for (int i = 1; i < chars1.length; i++) {
                newChars[i] = helperHelp.someMethod3(c, chars1[i - 1], chars1[i]);
            }
            for (int i = 0; i < newChars.length; i++) {
                returnValue = returnValue + newChars[i];
            }
            return returnValue;
        };
        //
        helperWithMirror changeFirstElement = (char[] c, char[] mirrorArray, String s) -> {

            char[] chars1 = s.toCharArray();
            char firstElement = chars1[0];
            String returnValue = "";
            int indexElement = 0;


            for (int i = 0; i < c.length; i++) {
                if (firstElement == c[i]) {
                    indexElement = i;
                }
            }
            chars1[0] = mirrorArray[indexElement];
            for (int i = 0; i < chars1.length; i++) {
                returnValue = returnValue + chars1[i];
            }
            return returnValue;
        };

        incomeText = step1.someMethod1(incomeText);
        incomeText = helpToStep2.someMethod2(regionOfChars, incomeText);
        incomeText = changeFirstElement.someMethod2(regionOfChars, mirror, incomeText);


        return incomeText;
    }

}