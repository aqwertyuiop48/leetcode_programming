import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && sc.next() instanceof String t
            && new long[t.length() + 2] instanceof long[] cnt
            && new int[]{0} instanceof int[] ones
            ? IntStream.rangeClosed(0, t.length()).mapToLong(j -> Integer.valueOf(j > 0 && t.charAt(j - 1) == '1' ? ++ones[0] : ones[0]) instanceof Integer o
                ? (o >= k ? cnt[o - k] : 0L) + cnt[o]++ * 0 : 0).sum()
            : 0);
    }
}
