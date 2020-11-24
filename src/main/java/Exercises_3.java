import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* Given an array A consisting of N integers, return the maximum sum of two numbers whose digits add up to an equal sum.
 If there are not two numbers whose digits have an equal sum, the function should return -1. For example, A = [51, 71, 17, 42]
  would output 93 because there are two sets of numbers with the same digit-sum, (51, 42) with a digit-sum of 6 and (17, 71)
  with a digit-sum of 8, and the first pair has the maximum sum of two numbers of 93.

Your task is to write a program to calculated the requested maximum sum. When you are finished, you are welcome to read or
 run a suggested solution, or to post your own solution or discuss the exercise in the comments below. */

public class Exercises_3 {
    public static void main(String[] args) {
        Exercises_3 exercises_3 = new Exercises_3();
        int [] firstArray = exercises_3.inputArray();
        int [] secondArray = exercises_3.sumOfTwoNumbers(firstArray);
        int x1 = exercises_3.matchAndOutputSum(firstArray, secondArray);

        System.out.println(x1);
    }

    public int inputDigit(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public  int [] inputArray(){
        System.out.println("Приветствую! Введите размер масива :)");
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [scanner.nextInt()];
        System.out.println("Заполните масив двузначными цифрами!");
        for (int i = 0; i < array.length; i++) {
            array[i] = inputDigit();
        }
        return array;
    }
    public int [] sumOfTwoNumbers(int [] array){
        int i = 0;
        int sumOfNumber [] = new int [array.length];
        for (int y: array
             ) {
            char [] buffer = String.valueOf(y).toCharArray();
            sumOfNumber[i] = Integer.parseInt(String.valueOf(buffer[0])) + Integer.parseInt(String.valueOf(buffer[1]));
            i++;
        }
        return sumOfNumber;
    }
    public int matchAndOutputSum(int [] firstArrayWithInputDigit, int [] secondArrayWithSumOfNumber){
        int buffer = 0;
        int sum = 0;
        TreeMap<Integer, Integer> inputDigitSumDigit = new TreeMap<>();
        for (int i = 0; i < firstArrayWithInputDigit.length; i++) {
            inputDigitSumDigit.put(firstArrayWithInputDigit[i], secondArrayWithSumOfNumber[i]);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = inputDigitSumDigit.entrySet().iterator();
        Iterator<Map.Entry<Integer, Integer>> iterator1 = inputDigitSumDigit.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            for (int i = 0; i < secondArrayWithSumOfNumber.length; i++) {
                if (entry.getValue().equals(secondArrayWithSumOfNumber[i])){
                    buffer = secondArrayWithSumOfNumber[i];
                }
            }
        }
        while (iterator1.hasNext()) {
            Map.Entry<Integer, Integer> x = iterator1.next();
            if (x.getValue().equals(buffer)){
                sum += x.getKey();
            }
        }
        return sum;
    }

}
