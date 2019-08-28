/*
The goal of this exercise is to convert a string to a new string where each character in the new string is
"(" if that character appears only once in the original string, or ")" if that character appears more than once
in the original string. Ignore capitalization when determining if a character is a duplicate.
*/
public class DuplicateEncoder {
    static String encode(String word){
     StringBuilder sb = new StringBuilder();
     word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if(word.substring(0, i).contains(String.valueOf(word.charAt(i))) ||
                word.substring(i+1, word.length()).contains(String.valueOf(word.charAt(i)))){
                sb.append(")");
            }
            else{
                sb.append("(");
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
    }
}

/* Better Solution

    word = word.toLowerCase();
            String result = "";
            for (int i = 0; i < word.length(); ++i) {
        char c = word.charAt(i);
        result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;*/
