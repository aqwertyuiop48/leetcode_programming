import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] tk
            && (Integer) tk[0] instanceof Integer n
            && IntStream.rangeClosed(0, n + 2).map(i -> i >= 1 && i <= n ? tk[i] : 0).toArray() instanceof int[] a
            && (Integer) IntStream.rangeClosed(1, n).filter(i -> a[i] > 0).max().getAsInt() instanceof Integer top
            && ((IntFunction<int[]>) q -> IntStream.rangeClosed(0, top + 2).map(i -> i == 0 || i > top ? 0 : i <= q ? a[i] : Math.max(a[i], 1)).toArray()) instanceof IntFunction<int[]> mk
            && ((IntUnaryOperator) q -> mk.apply(q) instanceof int[] w
                ? 3 * IntStream.of(w).sum() + 2 * IntStream.rangeClosed(1, top).map(j -> Math.max(0, w[j] - w[j + 1])).sum() + 2 * q
                : 0) instanceof IntUnaryOperator price
            && (Integer) (int) (IntStream.rangeClosed(0, top).mapToLong(q -> (long) price.applyAsInt(q) * 2048 + q).min().getAsLong() % 2048) instanceof Integer e
            && mk.apply(e) instanceof int[] c
            && IntStream.rangeClosed(0, top + 1).map(j -> Math.max(c[j], c[j + 1])).toArray() instanceof int[] d
            && (Integer) (2 * IntStream.of(d).sum() + e) instanceof Integer steps
            && new int[top + 3] instanceof int[] rem
            && new int[top + 3] instanceof int[] cnt
            && new int[4] instanceof int[] st
            && new byte[2 * steps + 4] instanceof byte[] buf
            && (rem[0] = d[0]) >= 0
            && IntStream.range(0, steps).allMatch(k ->
                (Integer) st[0] instanceof Integer x
                && (Integer) (rem[x] > 0 ? 1 : x == st[1] && x < e ? 2 : 0) instanceof Integer kind
                && (kind == 0
                    ? (st[3] != 1 || --st[2] >= 0) && (buf[st[2]++] = 'L') > 0 && (st[3] = 2) > 0 && --st[0] >= 0
                    : (kind == 2
                        ? st[1]++ >= 0 && (rem[x + 1] = c[x + 1] == 0 ? d[x + 1] : 0) >= 0
                        : rem[x]-- >= 0 && (Integer) cnt[x]++ instanceof Integer idx
                            && (rem[x + 1] = idx < c[x + 1] ? 1 + (idx == 0 ? d[x + 1] - c[x + 1] : 0) : 0) >= 0)
                    && (st[3] != 2 || (buf[st[2] - 1] = 'A') > 0)
                    && (buf[st[2]++] = 'A') > 0 && (buf[st[2]++] = 'R') > 0 && (st[3] = 1) > 0 && ++st[0] > 0))
            && (buf[st[2] - 1] = 'A') > 0
            ? new String(buf, 0, st[2])
            : "");
    }
}

