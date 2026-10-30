import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer k
            && st.nextToken() instanceof String s && (Integer) Integer.highestOneBit(Math.max(n, 2) * 2 - 1) instanceof Integer N
            && new long[2 * N] instanceof long[] hs && new int[2 * N] instanceof int[] lz && new long[N + 1] instanceof long[] pw && new long[N + 1] instanceof long[] G && new int[2 * N] instanceof int[] LO && new int[2 * N] instanceof int[] LEN
            && new int[3] instanceof int[] g && new long[1] instanceof long[] acc && new IntUnaryOperator[3] instanceof IntUnaryOperator[] F
            && ((LongBinaryOperator) (a, b) -> ((a * b & 2305843009213693951L) + ((a * b >>> 61) | (Math.multiplyHigh(a, b) << 3))) % 2305843009213693951L) instanceof LongBinaryOperator mul
            && ((LongBinaryOperator) (a, b) -> a + b >= 2305843009213693951L ? a + b - 2305843009213693951L : a + b) instanceof LongBinaryOperator add
            && (Long) ThreadLocalRandom.current().nextLong(1000003L, 2305843009213693950L) instanceof Long B
            && IntStream.rangeClosed(0, N).filter(i -> (pw[i] = i == 0 ? 1 : mul.applyAsLong(pw[i - 1], B)) >= 0
                && (G[i] = i == 0 ? 0 : add.applyAsLong(mul.applyAsLong(G[i - 1], B), 1)) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (hs[N + i] = s.charAt(i) - '0' + 1) > 0).count() >= 0
            && IntStream.range(0, 2 * N).filter(i -> (lz[i] = -1) < 0 && (i == 0 || (LEN[i] = N / Integer.highestOneBit(i)) > 0 && (LO[i] = (i ^ Integer.highestOneBit(i)) * LEN[i]) >= 0)).count() >= 0
            && IntStream.range(1, N).filter(i -> (hs[N - i] = add.applyAsLong(mul.applyAsLong(hs[2 * (N - i)], pw[N / Integer.highestOneBit(N - i) / 2]), hs[2 * (N - i) + 1])) >= 0).count() >= 0
            && ((IntBinaryOperator) (nd, c) -> ((hs[nd] = mul.applyAsLong(c + 1, G[N / Integer.highestOneBit(nd)])) >= 0 && (lz[nd] = c) >= 0) ? 0 : 1) instanceof IntBinaryOperator ap
            && (F[0] = nd -> (lz[nd] >= 0 && ap.applyAsInt(2 * nd, lz[nd]) >= 0 && ap.applyAsInt(2 * nd + 1, lz[nd]) >= 0 && (lz[nd] = -1) < 0) ? 0 : 0) != null
            && (F[1] = nd -> (LEN[nd] > 0)
                ? ((LO[nd] + LEN[nd] - 1 < g[0] || LO[nd] > g[1]) ? 0 : (g[0] <= LO[nd] && LO[nd] + LEN[nd] - 1 <= g[1]) ? ap.applyAsInt(nd, g[2])
                    : (F[0].applyAsInt(nd) >= 0 && F[1].applyAsInt(2 * nd) >= 0 && F[1].applyAsInt(2 * nd + 1) >= 0
                        && (hs[nd] = add.applyAsLong(mul.applyAsLong(hs[2 * nd], pw[LEN[nd] / 2]), hs[2 * nd + 1])) >= 0) ? 0 : 0) : 0) != null
            && (F[2] = nd -> (LEN[nd] > 0)
                ? ((LO[nd] + LEN[nd] - 1 < g[0] || LO[nd] > g[1]) ? 0 : (g[0] <= LO[nd] && LO[nd] + LEN[nd] - 1 <= g[1]) ? ((acc[0] = add.applyAsLong(mul.applyAsLong(acc[0], pw[LEN[nd]]), hs[nd])) >= 0 ? 0 : 0)
                    : (F[0].applyAsInt(nd) >= 0 && F[2].applyAsInt(2 * nd) >= 0 && F[2].applyAsInt(2 * nd + 1) >= 0) ? 0 : 0) : 0) != null
            && ((LongBinaryOperator) (lq, rq) -> ((g[0] = (int) lq) >= 0 && (g[1] = (int) rq) >= 0 && (acc[0] = 0) == 0 && F[2].applyAsInt(1) >= 0) ? acc[0] : -1) instanceof LongBinaryOperator qh
            ? IntStream.range(0, m + k).mapToObj(i -> ((Integer) Integer.parseInt(st.nextToken()) instanceof Integer t && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer l
                    && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer r && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer x)
                ? (t == 1 ? ((g[0] = l - 1) >= 0 && (g[1] = r - 1) >= 0 && (g[2] = x) >= 0 && F[1].applyAsInt(1) >= 0 ? "" : "")
                    : (x >= r - l + 1 || qh.applyAsLong(l - 1, r - 1 - x) == qh.applyAsLong(l - 1 + x, r - 1) ? "YES" : "NO")) : "")
                .filter(z -> !z.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
