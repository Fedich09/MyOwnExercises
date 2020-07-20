/* For building the encrypted string:
Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
Do this n times!

Examples:

"This is a test!", 1 -> "hsi  etTi sats!"
"This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
Write two methods:

String encrypt(final String text, final int n)
String decrypt(final String encryptedText, final int n)
For both methods:
If the input-string is null or empty return exactly this value!
If n is <= 0 then return the input text. */


import java.util.ArrayList;

public class Exercises_18 {
    public static void main(String[] args) {
        System.out.println(encrypt("This is a test!", -1));
        System.out.println();

        System.out.println(decrypt("This is a test!", -1));
        System.out.println(15 / 2);
    }

    public static String encrypt(final String text, final int n) {

        ArrayList<Character> characters = new ArrayList<>();
        String evenString = "";
        String oddString = "";
        String s = text;

        try {
            for (int j = 0; j < n; j++) {

                for (char c :s.toCharArray()) {
                    characters.add(c);
                }
                for (int i = 0; i < characters.size(); i++) {
                    if (i % 2 != 0){
                        oddString = oddString + characters.get(i);
                    } else{
                        evenString = evenString + characters.get(i);
                    }
                }
                s = oddString + evenString;
                oddString = "";
                evenString = "";
                characters.clear();
            }
        }catch (Exception e){

        }

        return s;
    }

    public static String decrypt(final String encryptedText, final int n) {

        char [] chars;
        String s = encryptedText;
        int buffer = 0;
        int buffer2 = 1;
        try {
            for (int j = 0; j < n; j++) {

                if (j < 1){
                    chars = s.toCharArray();
                }else{
                    chars = s.toCharArray();
                }
                char [] charsUpdate = new char[chars.length];

                for (int i = chars.length / 2; i < chars.length; i++) {
                    if (buffer % 2 == 0 && buffer <= charsUpdate.length){
                        charsUpdate[buffer] = chars[i];
                    }
                    buffer += 2;
                }
                for (int i = 0; i < chars.length / 2 ; i++) {
                    if (buffer2 % 2 != 0 && buffer2 < charsUpdate.length){
                        charsUpdate[buffer2] = chars[i];
                    }
                    buffer2 += 2;
                }
                s = "";
                for (int i = 0; i < charsUpdate.length; i++) {
                    s = s + charsUpdate[i];
                }
                buffer = 0;
                buffer2 = 1;
            }
        }catch (Exception e){

        }

        return s;
    }
}
