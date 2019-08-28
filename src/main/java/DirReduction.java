/*
Once upon a time, on a way through the old wild west, a man was given directions to go from one point to another.
The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
Going to one direction and coming back the opposite direction is a needless effort. Since this is the wild west,
with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!
How I crossed the desert the smart way.
https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
*/
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0, j=0, k=1; k < arr.length;) {
            if(!wordReduction(arr[j], arr[k])){
                j++;
                k++;
            }
            else {
                
            }

        }
        return new String[] {};
    }

    public static boolean wordReduction(String word1, String word2){
        if(word1.equals("NORTH") && word2.equals("SOUTH") ||
          word1.equals("SOUTH") && word2.equals("NORTH") ||
          word1.equals("EAST") && word2.equals("WEST") ||
          word1.equals("WEST") && word2.equals("EAST")){
            return true;
        }
        return false;
    }

}
