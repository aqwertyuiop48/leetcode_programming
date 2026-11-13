import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1] - 1) instanceof Integer s && Integer.valueOf((int) t[2] - 1) instanceof Integer e
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long inf
            && new long[n + 3] instanceof long[] bufA && new long[n + 3] instanceof long[] bufB
            && IntStream.range(0, n + 3).filter(j -> (bufA[j] = j == 0 ? 0 : inf) + (bufB[j] = inf) < -1).count() == 0
            && new long[][]{bufA, bufB} instanceof long[][] buf
            && IntStream.range(0, n).filter(k -> buf[0] instanceof long[] src && buf[1] instanceof long[] dst
                && Integer.valueOf(Math.min(k, n - k + 1)) instanceof Integer bp
                && Long.valueOf(t[3 + k]) instanceof Long x && Long.valueOf(t[3 + n + k]) instanceof Long a && Long.valueOf(t[3 + 2 * n + k]) instanceof Long b
                && Long.valueOf(t[3 + 3 * n + k]) instanceof Long c && Long.valueOf(t[3 + 4 * n + k]) instanceof Long d
                && Integer.valueOf(s < k ? 1 : 0) instanceof Integer sI && Integer.valueOf(e < k ? 1 : 0) instanceof Integer eI
                && IntStream.rangeClosed(0, Math.min(Math.min(k + 1, n - k) + 1, n + 1)).parallel().filter(j ->
                    (dst[j] = j > k + 1 || j > n - k ? inf
                        : Math.min(Math.min(
                            k == s ? (j >= 1 && j - 1 <= bp ? src[j - 1] + (-x + d) : inf)
                                : k == e ? (j >= 1 && j - 1 <= bp ? src[j - 1] + (-x + b) : inf)
                                : (j - sI - eI >= 1 && j - 1 <= bp ? src[j - 1] + (-2 * x + b + d) : inf),
                            j <= bp ? (k == s ? (j >= 1 ? src[j] + (x + c) : inf)
                                : k == e ? (j >= 1 ? src[j] + (x + a) : inf)
                                : Math.min(j - eI >= 1 ? src[j] + a + d : inf, j - sI >= 1 ? src[j] + b + c : inf)) : inf),
                            k != s && k != e && j >= 1 && j + 1 <= bp ? src[j + 1] + 2 * x + a + c : inf)) < -1).count() >= 0
                && (buf[0] = dst) == dst && (buf[1] = src) == src && false).count() == 0
            ? buf[0][1] : "");
    }
}
