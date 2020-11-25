/* Today’s exercise comes to us from Leetcode via Reddit:

Given an array consisting of 2n elements in the form
[x1,x2,…,xn,y1,y2,…,yn], return the array in the form [x1,y1,x2,y2,…,xn,yn].

The Reddit poster claims to be new to Scheme and functional programming, and was thinking of a solution using length and
 list-ref, but couldn’t solve the problem.
 Your task is to show the student how to solve the problem.
 */

import java.util.Random;

public class Exercises_5 {
    public static void main(String[] args) {
        Exercises_5 exercises_5 = new Exercises_5();
        for (int x : exercises_5.returnArrayInCorrectForm(10)
        ) {
            System.out.print(x + " ");
        }
    }

    public int[] returnArrayInCorrectForm(int inputArraySize) {
        Random random = new Random();
        int firstCounter = 0;
        int secondCounter = 0;
        int finallyBuffer = 0;
        int[] mainArray = new int[inputArraySize];
        int[] firstBufferArray = new int[inputArraySize / 2];
        int[] secondBufferArray = new int[inputArraySize / 2];
        int[] finalArrayOutPut = new int[inputArraySize];

        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = random.nextInt(100);
            System.out.print(mainArray[i] + " ");
        }

        for (int i = 0; i < mainArray.length; i++) {
            if (i < mainArray.length / 2) {
                firstBufferArray[firstCounter] = mainArray[i];
                firstCounter++;
            } else {
                secondBufferArray[secondCounter] = mainArray[i];
                secondCounter++;
            }
        }
        // Test
        System.out.println();
        for (int i = 0; i < firstBufferArray.length; i++) {
            System.out.print(firstBufferArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < secondBufferArray.length; i++) {
            System.out.print(secondBufferArray[i] + " ");
        }
        // Test

        for (int i = 0; i < mainArray.length; i++) {
            try {
                finalArrayOutPut[i] = firstBufferArray[finallyBuffer];
                finalArrayOutPut[i + 1] = secondBufferArray[finallyBuffer];
                i++;
                finallyBuffer++;
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println();
        return finalArrayOutPut;
    }

}
