import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long k
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).sorted().toArray() instanceof long[] a
            && new long[]{0, 0, 0, 0} instanceof long[] st
            ? IntStream.range(0, n).allMatch(r -> (st[0] += a[r]) >= 0 && IntStream.iterate(0, x -> a[r] * (r - st[1] + 1) - st[0] > k, x -> x + 1).allMatch(x -> (st[0] -= a[(int) st[1]++]) >= 0)
                && (r - st[1] + 1 <= st[2] || (st[2] = r - st[1] + 1) > 0 && (st[3] = a[r]) >= 0)) ? st[2] + " " + st[3] : "" : "");
    }
}
