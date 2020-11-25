/* This time no story, no theory. The examples below show you how to write function accum:

Examples:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt" */

import java.util.ArrayList;

public class Exercises_9 {
    public static void main(String[] args) {
        Exercises_9 exercises_9 = new Exercises_9();
        System.out.println(exercises_9.accum("RqaEzty"));
    }

    public String accum(String s) {
        int buffer = 1;
        String input = s;
        String output = "";
        ArrayList<String> finalArray = new ArrayList<>();
        char[] incomeString = input.toCharArray();

        for (int i = 0; i < incomeString.length; i++) {

            for (int j = 0; j < buffer; j++) {
                if (j == 0) {
                    incomeString[i] = Character.toUpperCase(incomeString[i]);
                    finalArray.add(Character.toString(incomeString[i]));
                } else {
                    incomeString[i] = Character.toLowerCase(incomeString[i]);
                    finalArray.add(Character.toString(incomeString[i]));
                }
            }
            if (i == incomeString.length - 1) {
                continue;
            } else {
                finalArray.add("-");
            }

            buffer++;
        }
        for (int i = 0; i < finalArray.size(); i++) {
            output = output + finalArray.get(i);
        }
        return output;
    }

}
