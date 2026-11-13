import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 64 ? (v[(int) st[3]++] = raw[k]) : raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : raw[k] == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> v[1 + i] + v[1 + n + i]).sum()) instanceof Long tot
            && tot % (2L * n) == 0
            && Long.valueOf(tot / (2L * n)) instanceof Long sum
            && new long[n] instanceof long[] a
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(v[1 + i] + v[1 + n + i] - sum) instanceof Long t && t >= 0 && t % n == 0 && t / n <= 1000000000L && (a[i] = t / n) >= 0)
            && IntStream.range(0, 30).mapToLong(bit -> Arrays.stream(a).filter(x -> (x >> bit & 1) == 1).count()).toArray() instanceof long[] cnt
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, 30).mapToLong(bit -> (a[i] >> bit & 1) == 1 ? cnt[bit] << bit : 0).sum() == v[1 + i]
                && IntStream.range(0, 30).mapToLong(bit -> ((a[i] >> bit & 1) == 1 ? (long) n : cnt[bit]) << bit).sum() == v[1 + n + i])
            ? Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" ")) : -1);
    }
}
