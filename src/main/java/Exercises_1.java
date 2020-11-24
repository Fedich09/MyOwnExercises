/* Counting Fingers
June 16, 2020
A little girl counts on her fingers in a curious way. She counts 1 on her thumb, 2 on her index finger, 3 on her middle
finger, 4 on her ring finger, and 5 on her pinkie finger, then works back, counting 6 on her ring finger, 7 on her middle
finger, 8 on her index finger, and 9 on her thumb, when she again turns around and counts 10 on her index finger, 11 on
her middle finger, and so on.

Your task is to write a program that determines which finger the little girl will be on when she reaches a thousand. When
you are finished, you are welcome to read or run a suggested solution, or to post your own solution or discuss the exercise
in the comments below. */

public class Exercises_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        while (solution.getCounter_fingers() < 1000){
            solution.setCounter_fingers(solution.getCounter_fingers() + 4);
            solution.setCounter_iterations(solution.getCounter_iterations() + 1);
        }
        System.out.println(solution.getCounter_iterations());
        solution.setCounter_fingers(solution.getCounter_fingers() - 1);
        if(solution.getCounter_iterations() % 2 == 0){
            System.out.println("Girl stop count on index finger");
        }else {
            System.out.println("Girl stop count on ring finger");
        }
    }

    public static class Solution {
        private int counter_fingers = 5;
        private int counter_iterations = 1;
        public int getCounter_fingers() {
            return counter_fingers;
        }
        public void setCounter_fingers(int counter_fingers){
            this.counter_fingers = counter_fingers;
        }
        public int getCounter_iterations() {
            return counter_iterations;
        }
        public void setCounter_iterations(int counter_iterations) {
            this.counter_iterations = counter_iterations;
        }
    }
}
