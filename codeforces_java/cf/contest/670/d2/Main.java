import java.util.*;
import java.util.function.*;
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
            && ((LongPredicate) x -> IntStream.range(0, n).mapToLong(i -> Math.min(k + 1, Math.max(0L, (long) a[2 + i] * x - a[2 + n + i]))).sum() <= k) instanceof LongPredicate ok
            && new long[]{0, 2_000_000_001L, 0} instanceof long[] st
            && IntStream.range(0, 33).filter(z -> (st[2] = (st[0] + st[1]) / 2) >= 0 && (ok.test(st[2]) ? (st[0] = st[2]) : (st[1] = st[2])) >= 0).count() >= 0
            ? st[0] : "");
    }
}
