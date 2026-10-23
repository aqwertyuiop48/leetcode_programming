import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer l
            && Integer.valueOf(g0[2]) instanceof Integer x
            && Integer.valueOf(g0[3]) instanceof Integer y
            && Arrays.copyOfRange(g0, 4, 4 + n) instanceof int[] a
            && ((IntPredicate) (d -> Arrays.stream(a).anyMatch(v -> Arrays.binarySearch(a, v + d) >= 0))) instanceof IntPredicate hs
            ? hs.test(x) && hs.test(y) ? "0"
                : hs.test(x) ? "1\n" + y
                : hs.test(y) ? "1\n" + x
                : IntStream.range(0, 2 * n).map(j -> j % 2 == 0 ? a[j / 2] + x : a[j / 2] - x)
                    .filter(p -> p >= 0 && p <= l && (p + y <= l && Arrays.binarySearch(a, p + y) >= 0 || p - y >= 0 && Arrays.binarySearch(a, p - y) >= 0))
                    .findFirst() instanceof OptionalInt o && o.isPresent() ? "1\n" + o.getAsInt() : "2\n" + x + " " + y
            : "");
    }
}
