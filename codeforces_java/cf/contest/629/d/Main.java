import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length ? raw[i] : 32) >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((t[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (long) t[1 + 2 * i] * t[1 + 2 * i] * t[2 + 2 * i]).toArray() instanceof long[] v
            && LongStream.of(v).sorted().distinct().toArray() instanceof long[] u
            && new long[u.length + 1] instanceof long[] bit
            && new long[]{0} instanceof long[] best
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(Arrays.binarySearch(u, v[i]) + 1) instanceof Integer r
                && Long.valueOf(v[i] + IntStream.iterate(r - 1, x -> x > 0, x -> x - (x & -x)).mapToLong(x -> bit[x]).max().orElse(0)) instanceof Long val
                && (best[0] = Math.max(best[0], val)) >= 0
                && IntStream.iterate(r, x -> x <= u.length, x -> x + (x & -x)).allMatch(x -> (bit[x] = Math.max(bit[x], val)) >= 0))
            ? String.format(Locale.US, "%.9f", best[0] * Math.PI) : "");
    }
}
