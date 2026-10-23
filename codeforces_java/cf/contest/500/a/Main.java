import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer t
            && IntStream.range(0, n).map(i -> i < n - 1 ? sc.nextInt() : 0).toArray() instanceof int[] a
            && Integer.valueOf(IntStream.iterate(1, i -> i < t, i -> i + a[i - 1]).reduce(1, (x, y) -> y)) instanceof Integer last
            ? last + a[last - 1] == t ? "YES" : "NO"
            : "");
    }
}
