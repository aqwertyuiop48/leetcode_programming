import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[buf.length / 2 + 3] instanceof int[] tk && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, buf.length).filter(i -> i < buf.length && buf[i] >= '0'
                ? (st[0] = st[0] * 10 + buf[i] - '0') >= 0 && (st[1] = 1) > 0
                : st[1] == 1 && (tk[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0).count() >= 0
            && new int[]{3} instanceof int[] ptr && ((IntSupplier) () -> tk[ptr[0]++]) instanceof IntSupplier nx
            && Integer.valueOf(tk[2]) instanceof Integer w
            && new int[4 * w] instanceof int[] rc && new int[4 * w] instanceof int[] cc
            && IntStream.range(0, w).allMatch(o -> (rc[4 * o] = tk[ptr[0] + 1] - 1) >= 0 && (rc[4 * o + 1] = tk[ptr[0] + 1]) >= 0
                && (rc[4 * o + 2] = tk[ptr[0] + 3]) >= 0 && (rc[4 * o + 3] = tk[ptr[0] + 3] + 1) >= 0
                && (cc[4 * o] = tk[ptr[0] + 2] - 1) >= 0 && (cc[4 * o + 1] = tk[ptr[0] + 2]) >= 0
                && (cc[4 * o + 2] = tk[ptr[0] + 4]) >= 0 && (cc[4 * o + 3] = tk[ptr[0] + 4] + 1) >= 0
                && (ptr[0] += tk[ptr[0]] == 0 ? 6 : 5) > 0)
            && (ptr[0] = 3) == 3
            && Stream.of(0).peek(z -> Arrays.sort(rc)).peek(z -> Arrays.sort(cc)).findFirst().isPresent()
            && new int[][]{new int[4 * w], new int[4 * w]} instanceof int[][] U && new int[2] instanceof int[] cnt
            && IntStream.range(0, 4 * w).filter(i -> i == 0 || rc[i] != rc[i - 1]).allMatch(i -> (U[0][cnt[0]++] = rc[i]) >= 0)
            && IntStream.range(0, 4 * w).filter(i -> i == 0 || cc[i] != cc[i - 1]).allMatch(i -> (U[1][cnt[1]++] = cc[i]) >= 0)
            && new long[][]{new long[2 * cnt[0] + 4], new long[2 * cnt[1] + 4]} instanceof long[][] T
            && new int[1] instanceof int[] cfg && new long[2] instanceof long[] d && new long[2] instanceof long[] total
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] up
            && (up[0] = j -> j > cnt[cfg[0]] ? 0 : ((T[cfg[0]][2 * j] += d[0]) * 0 == 0 && (T[cfg[0]][2 * j + 1] += d[1]) * 0 == 0 ? 0 : 1) + up[0].applyAsInt(j + (j & -j))) != null
            && ((LongBinaryOperator) (a, c) -> (d[0] = c) * 0 == 0 && (d[1] = c * (a - 1)) * 0 == 0
                ? up[0].applyAsInt(Arrays.binarySearch(U[cfg[0]], 0, cnt[cfg[0]], (int) a) + 1) : 1) instanceof LongBinaryOperator pt
            && new long[1] instanceof long[] qi && new LongUnaryOperator[1] instanceof LongUnaryOperator[] qs
            && (qs[0] = j -> j <= 0 ? 0 : qi[0] * T[cfg[0]][2 * (int) j] - T[cfg[0]][2 * (int) j + 1] + qs[0].applyAsLong(j - (j & -j))) != null
            && ((LongBinaryOperator) (base, i) -> (cfg[0] = (int) base) * 0 == 0 && (qi[0] = i) * 0 == 0
                ? qs[0].applyAsLong(Arrays.binarySearch(U[(int) base], 0, cnt[(int) base], (int) i) + 1) : 0) instanceof LongBinaryOperator pref
            ? IntStream.range(0, w).mapToObj(o -> Integer.valueOf(nx.getAsInt()) instanceof Integer ty
                && Integer.valueOf(nx.getAsInt()) instanceof Integer x0 && Integer.valueOf(nx.getAsInt()) instanceof Integer y0
                && Integer.valueOf(nx.getAsInt()) instanceof Integer x1 && Integer.valueOf(nx.getAsInt()) instanceof Integer y1
                ? ty == 0 ? Long.valueOf(nx.getAsInt()) instanceof Long v
                        && (cfg[0] = 0) == 0
                        && pt.applyAsLong(x0, v * (y1 - y0 + 1)) + pt.applyAsLong(x1 + 1, -v * (y1 - y0 + 1)) == 0
                        && (cfg[0] = 1) == 1
                        && pt.applyAsLong(y0, v * (x1 - x0 + 1)) + pt.applyAsLong(y1 + 1, -v * (x1 - x0 + 1)) == 0
                        && (total[0] += v * (x1 - x0 + 1) * (y1 - y0 + 1)) * 0 == 0 ? (String) null : null
                    : String.valueOf(pref.applyAsLong(0, x1) - pref.applyAsLong(0, x0 - 1) + pref.applyAsLong(1, y1) - pref.applyAsLong(1, y0 - 1) - total[0]) : null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
