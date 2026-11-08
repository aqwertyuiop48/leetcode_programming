import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] v && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Long.valueOf(v[1]) instanceof Long A && Long.valueOf(v[2]) instanceof Long cf && Long.valueOf(v[3]) instanceof Long cm && Long.valueOf(v[4]) instanceof Long m
            && IntStream.range(0, n).mapToLong(i -> v[5 + i] << 17 | i).sorted().toArray() instanceof long[] key
            && new long[n + 1] instanceof long[] pre && new long[]{-1, 0, 0} instanceof long[] bs && new int[]{n} instanceof int[] ip
            && IntStream.range(0, n).allMatch(j -> (pre[j + 1] = pre[j] + (key[j] >> 17)) >= 0)
            && IntStream.rangeClosed(0, n).allMatch(k -> Long.valueOf(m - (k * A - (pre[n] - pre[n - k]))) instanceof Long rem
                && (rem < 0 || (k == n
                    ? n * cf + A * cm > bs[0] && (bs[0] = n * cf + A * cm) > 0 && (bs[1] = k) >= 0 && (bs[2] = A) > 0 || true
                    : Integer.valueOf(IntStream.iterate(Math.min(ip[0], n - k), j -> j - 1).filter(j -> j == 0 || (key[j - 1] >> 17) * j - pre[j] <= rem).findFirst().getAsInt()) instanceof Integer idx
                    && Long.valueOf(Math.min(A, (key[idx - 1] >> 17) + (rem - ((key[idx - 1] >> 17) * idx - pre[idx])) / idx)) instanceof Long level
                    && ((ip[0] = idx) < 0 || k * cf + level * cm <= bs[0] || (bs[0] = k * cf + level * cm) >= 0 && (bs[1] = k) >= 0 && (bs[2] = level) >= 0))))
            && new long[n] instanceof long[] res
            && IntStream.range(0, n).allMatch(r -> (res[(int) (key[r] & 131071)] = r >= n - bs[1] ? A : Math.max(key[r] >> 17, bs[2])) >= 0)
            ? bs[0] + "\n" + Arrays.stream(res).mapToObj(Long::toString).collect(Collectors.joining(" ")) : "");
    }
}
