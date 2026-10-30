import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Long) tk[1] instanceof Long m
            && Arrays.copyOfRange(tk, 2, 2 + n) instanceof long[] a
            && (LongPredicate) (T -> new long[]{0, 0} instanceof long[] st && IntStream.range(0, n).map(j -> n - 1 - j).allMatch(i -> a[i] == 0 || (T - i - 1 > 0
                && (a[i] <= st[1] ? (st[1] -= a[i]) >= 0 : (Long) ((a[i] - st[1] + T - i - 2) / (T - i - 1)) instanceof Long k && (st[0] += k) <= m && (st[1] = k * (T - i - 1) - (a[i] - st[1])) >= 0)))) instanceof LongPredicate ok
            && new long[1] instanceof long[] z
            && IntStream.iterate(47, b -> b - 1).limit(48).mapToLong(b -> z[0] += ok.test(z[0] + (1L << b)) ? 0 : 1L << b).max().isPresent()
            ? (ok.test(0) ? 0 : z[0] + 1) : 0);
    }
}
