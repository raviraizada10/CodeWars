/*
Write a function that takes an integer as input, and returns the number of bits that are equal to one
in the binary representation of that number. You can guarantee that input is non-negative.
https://www.codewars.com/kata/bit-counting/train/java
*/
public class BitCounting {
    public static int countBits(int n){
        int count = (int) Integer.toBinaryString(n).chars().filter(ch -> ch == '1').count();
        return count;
    }
}
