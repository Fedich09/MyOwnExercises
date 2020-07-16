/* Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that
occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and
lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice */

import java.util.ArrayList;

public class Exercises_14 {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
    }

    public static int duplicateCount(String text) {

        int buffer = 0;
        String s = text.toLowerCase();
        ArrayList<Character> characters = new ArrayList<>();
        char [] textIn = s.toCharArray();

        for (int i = 0; i < textIn.length; i++) {

            for (int j = buffer; j < textIn.length; j++) {
                if (textIn[i] == textIn[j] && i != j ){

                    if (!characters.contains(textIn[i])){
                        characters.add(textIn[i]);
                    }
                }
            }
            buffer++;
        }

       return characters.size();
    }

}
