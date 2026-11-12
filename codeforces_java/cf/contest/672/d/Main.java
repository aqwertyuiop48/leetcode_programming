import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n && Long.valueOf(a[1]) instanceof Long k
            && Arrays.stream(a, 2, n + 2).asLongStream().map(x -> 2 * x).sorted().toArray() instanceof long[] t
            && new long[n + 1] instanceof long[] P
            && IntStream.range(0, n).filter(i -> (P[i + 1] = P[i] + t[i] / 2) >= 0).count() >= 0
            && new long[]{t[0] / 2, P[n] / n, 0, (P[n] + n - 1) / n, t[n - 1] / 2, 0} instanceof long[] st
            && IntStream.range(0, 33).filter(z -> (st[2] = (st[0] + st[1] + 1) / 2) >= 0
                && Integer.valueOf(-Arrays.binarySearch(t, 2 * st[2] - 1) - 1) instanceof Integer c1
                && (st[2] * c1 - P[c1] <= k ? (st[0] = st[2]) : (st[1] = st[2] - 1)) >= 0
                && (st[5] = (st[3] + st[4]) / 2) >= 0
                && Integer.valueOf(-Arrays.binarySearch(t, 2 * st[5] + 1) - 1) instanceof Integer c2
                && (P[n] - P[c2] - st[5] * (n - c2) <= k ? (st[4] = st[5]) : (st[3] = st[5] + 1)) >= 0).count() >= 0
            ? st[3] - st[0] : "");
    }
}
