import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreSameTest {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void falseTest() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736};

        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void test10() {
        int[] a = new int[]{2, 2, 3};
        int[] b = new int[]{4, 9, 9};

        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void testEmpty() {
        int[] a = new int[]{};
        int[] b = new int[]{};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void testNull() {
        int[] a = null;
        int[] b = null;
        assertEquals(false, AreSame.comp(a, b));
    }
}