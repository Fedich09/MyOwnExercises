/* Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in
 descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321 */

public class Exercises_10 {
    public static void main(String[] args) {
        Exercises_10 exercises_10 = new Exercises_10();
        System.out.println(exercises_10.sortDesc(42145));
    }

    public int sortDesc(int num) {

        String s = "";
        int returnNum = 0;

        char [] incomeNum = (num + "").toCharArray();
        int [] intArray = new int [incomeNum.length];

        for (int i = 0; i < incomeNum.length; i++) {
            intArray[i] = Integer.parseInt("" + incomeNum[i]);
        }

            for (int k = 0; k < intArray.length - 1; k++) {
                for (int l = 0; l < intArray.length - k - 1; l++) {

                    if (intArray[l + 1] > intArray[l]){
                        int temp = intArray[l];
                        intArray[l] = intArray[l + 1];
                        intArray[l + 1] = temp;
                    }

                }
            }

        for (int i = 0; i < intArray.length; i++) {
            s = s + intArray[i];
        }
        returnNum = Integer.parseInt(s);
        return returnNum;
    }
}
