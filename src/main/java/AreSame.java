import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether
the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements
in b are the elements in a squared, regardless of the order.
https://www.codewars.com/kata/are-they-the-same/train/java
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null || a.length!= b.length){
            return false;
        }
        List<Integer> squaredList = IntStream.of(a).map(x -> x * x).boxed().sorted().collect(Collectors.toList());
        List<Integer> compList = IntStream.of(b).boxed().sorted().collect(Collectors.toList());
        return compList.equals(squaredList);
    }
}

/* Better Solution
public static boolean comp(final int[] a, final int[] b) {
    return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
}
*/