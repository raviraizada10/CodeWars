/*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
You have function with one side of the DNA (string, except for Haskell);
you need to get the other complementary side. DNA strand is never empty or
there is no DNA at all (again, except for Haskell).
https://www.codewars.com/kata/complementary-dna/train/java
*/
public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            sb.append(complement(dna.charAt(i)));
        }
        return sb.toString();
    }

    public static char complement(char ch) {
        if (ch == 'A') {
            return 'T';
        }
        if (ch == 'T') {
            return 'A';
        }
        if (ch == 'C') {
            return 'G';
        }
        if (ch == 'G') {
            return 'C';
        } else
            return ch;
    }
}