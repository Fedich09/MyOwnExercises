/* You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to
 an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a
 Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings
 representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter
 (direction) and you know it takes you one minute to traverse one city block, so create a function that will
 return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or
 late!) and will, of course, return you to your starting point. Return false otherwise.

Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w'
only). It will never give you an empty array (that's not a walk, that's standing still!). */

public class Exercises_15 {
    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here

        boolean trueOrFalse;
        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;

        for (char c: walk) {
            switch (c){
                case 'n':{
                    n++;
                    break;
                }
                case 's':
                    s++;
                    break;
                case 'w':{
                    w++;
                    break;
                }
                case 'e':{
                    e++;
                    break;
                }
            }

        }

        if (n - s == 0 && w - e == 0 &&  n + s + w + e == 10 ){
            trueOrFalse = true;
        }else {
            trueOrFalse = false;
        }

        return trueOrFalse;
    }

}
