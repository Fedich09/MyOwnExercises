/* Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number
 of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"} */

public class Exercises_11 {
    public static void main(String[] args) {
        Exercises_11 exercises_11 = new Exercises_11();
        for (String s: exercises_11.solution("abcdef")) {
            System.out.println(s);
        }
    }

    public String[] solution(String s) {
        int buffer = 0;
        int arrayLength;
        if (s.length() % 2 != 0 ){
            arrayLength = Math.round(s.length() / 2) + 1;
        }else {
            arrayLength = s.length() / 2;
        }
        String [] strings = new String[arrayLength];

        char []  chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (i % 2 != 0){
                strings[buffer] = chars[i - 1] + "" +  chars[i];
                buffer++;
            }else if ( i % 2 == 0 && i == chars.length -1){
                strings[buffer] = chars[i] + "";
            }
        }
            if (s.length() % 2 != 0){
                strings[arrayLength - 1] = strings[arrayLength - 1] + "_";
            }

       return strings;
    }
}
