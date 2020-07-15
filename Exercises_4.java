/* We have a simple task today:

A number n may have squares hidden among its digits. For instance, in the number 1625649, the consecutive digits
1, 4, 9, 16, 25, 49, 64, 256 and 625 are all squares.

Your task is to write a program that takes a positive integer n and finds all of its hidden squares. When you are finished,
 you are welcome to read or run a suggested solution, or to post your own solution or discuss the exercise in the comments below. */

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises_4 {
    public static void main(String[] args) {
        Exercises_4 exercises_4 = new Exercises_4();
        int input = exercises_4.startProgramInputDigit();
        String s = exercises_4.intInStringOut(input);
        for (int x: exercises_4.digitComeHiddenSquaresOut(s)) {
            System.out.println( "Array output " + x);
        }


    }
    // input digit value
    public int startProgramInputDigit(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    // translation int to digits array
    public String intInStringOut(int inputInt){
        return (inputInt + "");
    }

    public boolean checkSquare(double inputDigit){
        double square = Math.sqrt(inputDigit);
        return ((square - Math.floor(square)) == 0);
    }

    public int stringComeIntReturn(String input){
        return Integer.parseInt(input);
    }

    public int [] digitComeHiddenSquaresOut(String input){
        ArrayList<Integer> hiddenSquaresArray = new ArrayList<>();
        String inputString = input;
        String buffer = "" + (inputString.charAt(0));
        int bufferVariable = 0;
        int counter = inputString.length() - 1;
        while (counter > 0) {

            if (bufferVariable > inputString.length() - 1){
                bufferVariable = inputString.length() - counter;
                buffer = "" + inputString.charAt(bufferVariable);
                counter--;
            }

            if((checkSquare(stringComeIntReturn(buffer)))){
                hiddenSquaresArray.add(stringComeIntReturn(buffer));
            }
            if (counter != 0){
                bufferVariable++;
                if (bufferVariable > inputString.length() -1){
                    continue;
                } else {
                    buffer = buffer.concat(Character.toString(inputString.charAt(bufferVariable)));
                }
            }
        }
        int [] arrayOutput = new int [hiddenSquaresArray.size()];
        for (int i = 0; i < arrayOutput.length; i++) {
            arrayOutput[i] = hiddenSquaresArray.get(i);
        }
        return arrayOutput;
    }
}
