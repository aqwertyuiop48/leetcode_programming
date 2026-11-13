import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nm && new long[]{0, 0, 0, 1} instanceof long[] st
            && IntStream.range(0, raw.length + 1).allMatch(k -> (k < raw.length && raw[k] > 44 ? raw[k] == 45 ? (st[3] = -1) : (st[1] = st[1] * 10 + raw[k] - 48) + (st[2] = 1) : st[2] == 1 ? (nm[(int) st[0]++] = st[1] * st[3]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 1) : 0) != Long.MIN_VALUE)
            && Integer.valueOf((int) nm[0]) instanceof Integer n && Integer.valueOf((int) nm[1]) instanceof Integer k
            && Long.valueOf(nm[2]) instanceof Long s && Long.valueOf(nm[3]) instanceof Long t
            && LongStream.concat(LongStream.of(0, s), Arrays.stream(nm, 4 + 2 * n, 4 + 2 * n + k)).sorted().toArray() instanceof long[] ps
            && IntStream.range(1, ps.length).mapToLong(i -> ps[i] - ps[i - 1]).toArray() instanceof long[] d
            && ((LongPredicate) v -> Arrays.stream(d).allMatch(x -> x <= v) && Arrays.stream(d).map(x -> 2 * x - Math.min(x, v - x)).sum() <= t) instanceof LongPredicate ok
            && new long[]{1, 2 * s} instanceof long[] lh
            && IntStream.range(0, 33).allMatch(z -> lh[0] >= lh[1] || (Long.valueOf((lh[0] + lh[1]) / 2) instanceof Long mid ? (ok.test(mid) ? (lh[1] = mid) : (lh[0] = mid + 1)) : 0) >= 0)
            ? ok.test(2 * s) ? IntStream.range(0, n).filter(i -> nm[5 + 2 * i] >= lh[0]).mapToLong(i -> nm[4 + 2 * i]).min().orElse(-1) : -1 : "");
    }
}
