/* You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other
items. We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who
like an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
For 4 or more names, the number in and 2 others simply increases. */

import java.util.ArrayList;
import java.util.Collections;

public class Exercises_13 {
    public static void main(String[] args) {
        Exercises_13 exercises_13 = new Exercises_13();
        System.out.println(exercises_13.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    public String whoLikesIt(String... names) {
        //Do your magic here
        int buffer = 0;
        String s = "";
        ArrayList<String> namesWhoLike = new ArrayList<>();
        Collections.addAll(namesWhoLike, names);

        if (namesWhoLike.size() == 0){
            buffer = 0;
        }else if (namesWhoLike.size() == 1){
            buffer = 1;
        }else if (namesWhoLike.size() == 2){
            buffer = 2;
        }else if (namesWhoLike.size() == 3){
            buffer = 3;
        }else {
            buffer = 4;
        }

        switch (buffer){
            case 0:{
                s = "no one likes this";
                break;
            }
            case 1:{
                s = namesWhoLike.get(0) + " likes this";
                break;
            }
            case 2:{
                s = namesWhoLike.get(0) + " and " + namesWhoLike.get(1) + " like this";
                break;
            }
            case 3:{
                s = namesWhoLike.get(0) + ", " + namesWhoLike.get(1) +  " and " + namesWhoLike.get(2) + " like this";
                break;
            }
            case 4:{
                s = namesWhoLike.get(0) + ", " + namesWhoLike.get(1) + " and " + (namesWhoLike.size() - 2) + " others like this";
            }
        }

        return s;
    }

}
