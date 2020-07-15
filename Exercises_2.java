import java.util.Scanner;

/* In a string consisting of digits and other non-digit characters, the digits form an embedded series of positive integers.
 For instance, the string “123abc45def” contains the embedded integers 123 and 45, which sum to 168.

Your task is to write a program that takes a string and writes the sum of the integers embedded in the string. When you
are finished, you are welcome to read or run a suggested solution, or to post your own solution or discuss the exercise
in the comments below. */
public class Exercises_2 {
    public static void main(String[] args) {
        class Input{
            public String inputString(){
                Scanner scanner = new Scanner(System.in);
                return scanner.nextLine();
            }
            public int string_in_int_out(String s){
                int sum = 0;
                char [] inputValue = s.toCharArray();
                char [] numbers = new char [inputValue.length + 1];
                for (int i = 0; i < inputValue.length; i++) {
                    if (Character.isDigit(inputValue[i])){
                        numbers[i] = inputValue[i];
                    }else {
                        continue;
                    }
                }
                String buffer = "";
                for (int i = 0; i < numbers.length; i++) {
                    if (!Character.isDigit(numbers[i])){
                        continue;
                    }else if(Character.isDigit(numbers[i])){
                        buffer += numbers[i];
                        if (!Character.isDigit(numbers[i + 1])){
                           sum += Integer.parseInt(buffer);
                           buffer = "";
                        }
                    }
                }
                return sum;
            }
        }
        Input input = new Input();
        System.out.println(input.string_in_int_out(input.inputString()));
    }
}
