import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 64 ? (v[(int) st[3]++] = raw[k]) : raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : raw[k] == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Long.valueOf(v[0]) instanceof Long n && Integer.valueOf((int) v[1]) instanceof Integer m && Integer.valueOf((int) v[2]) instanceof Integer k
            && Long.valueOf(v[3]) instanceof Long x && Long.valueOf(v[4]) instanceof Long s
            ? IntStream.rangeClosed(-1, m - 1).filter(i -> i < 0 || v[5 + m + i] <= s).mapToLong(i -> Long.valueOf(s - (i < 0 ? 0 : v[5 + m + i])) instanceof Long rem
                && new int[1] instanceof int[] ps
                && IntStream.iterate(17, j -> j - 1).limit(18).allMatch(j -> ps[0] + (1 << j) <= k && v[5 + 2 * m + k + ps[0] + (1 << j) - 1] <= rem ? (ps[0] += 1 << j) > 0 : true)
                ? Math.max(0, n - (ps[0] == 0 ? 0 : v[5 + 2 * m + ps[0] - 1])) * (i < 0 ? x : v[5 + i]) : Long.MAX_VALUE).min().getAsLong() : "");
    }
}
