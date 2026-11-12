import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && IntStream.rangeClosed(1, n).map(i -> (int) t[i]).sorted().toArray() instanceof int[] s
            && IntStream.range(0, n).filter(i -> i == 0 || s[i] != s[i - 1]).toArray() instanceof int[] starts
            && Integer.valueOf(starts.length) instanceof Integer d
            && IntStream.range(0, d).map(k -> s[starts[k]]).toArray() instanceof int[] vals
            && IntStream.range(0, d).map(k -> (k + 1 < d ? starts[k + 1] : n) - starts[k]).toArray() instanceof int[] cnt
            ? IntStream.range(0, d).mapToLong(k -> IntStream.rangeClosed(1, 31).mapToLong(p -> (1L << p) - vals[k])
                .filter(w -> w >= vals[k] && w <= vals[d - 1])
                .map(w -> w == vals[k] ? (long) cnt[k] * (cnt[k] - 1) / 2 : Integer.valueOf(Arrays.binarySearch(vals, (int) w)) instanceof Integer q && q >= 0 ? (long) cnt[k] * cnt[q] : 0).sum()).sum() : "");
    }
}
