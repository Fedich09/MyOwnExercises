import java.util.ArrayList;

/* Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
within the output should be capitalized only if the original word was capitalized (known as Upper Camel

toCamelCase("the-stealth-warrior"); // returns "TheStealthWarrior"

toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
*/
public class Exercises_6 {
    public static void main(String[] args) {
        Exercises_6 exercises_6 = new Exercises_6();
        System.out.println(exercises_6.toCamelCase("the_Stealth_Warrior"));
    }

    public String toCamelCase(String s){
        String output = "";
        char [] chars = s.toCharArray();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                    strings.add(Character.toString(chars[i]));
            }else if(!Character.isLetter(chars[i])){
                strings.add(Character.toString(Character.toUpperCase((chars[i + 1]))));
                i++;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            output = output + strings.get(i);
        }
        return output;
    }
}
