/* ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6
digits.
If the function is passed a valid PIN string, return true, else return false.
eg:

Solution.validatePin("1234") === true
Solution.validatePin("12345") === false
Solution.validatePin("a234") === false
 */

public class Exercises_8 {
    public static void main(String[] args) {

        Exercises_8 exercises_8 = new Exercises_8();
        System.out.println(exercises_8.validatePin(""));
        System.out.println(Character.isDigit('j'));
    }
    public boolean validatePin(String pin) {
        int counter = 0;
        boolean check = false;
        char [] inputPin = pin.toCharArray();

        for (int i = 0; i < inputPin.length; i++) {
            if (Character.isDigit(inputPin[i]) && (inputPin.length == 4 || inputPin.length == 6)){
                continue;
            }else {
                counter++;
            }
        }
        if (counter > 0){
            check = false;
        }else {
            check = true;
        }
        if (pin.isEmpty()){
            check = false;
        }

        return check;
    }
}
