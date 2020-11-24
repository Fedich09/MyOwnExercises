/* Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
development and functioning of living organisms.

If you want to know more http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of
the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there
is no DNA at all (again, except for Haskell).

More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

DnaStrand.makeComplement("ATTGC") // return "TAACG"

DnaStrand.makeComplement("GTAT") // return "CATA"

*/

public class Exercises_7 {
    public static void main(String[] args) {

        Exercises_7 exercises_7 = new Exercises_7();
        System.out.println(exercises_7.correctValueReturn("ATTGC"));

    }
    public String correctValueReturn(String s){
        String output = "";
        char [] inputFirstForm = s.toCharArray();
        char [] inputSecondForm = new char[inputFirstForm.length];

        for (int i = 0; i < inputFirstForm.length; i++) {
            switch (inputFirstForm[i]){
                case 'A':
                    inputSecondForm[i] = 'T';
                    break;
                case 'T':
                    inputSecondForm[i] = 'A';
                    break;
                case 'G':
                    inputSecondForm[i] = 'C';
                    break;
                case 'C':
                    inputSecondForm[i] = 'G';
                    break;
            }
        }

        for (int i = 0; i < inputSecondForm.length; i++) {
            output = output + inputSecondForm[i];
        }
        return output;
    }
}
