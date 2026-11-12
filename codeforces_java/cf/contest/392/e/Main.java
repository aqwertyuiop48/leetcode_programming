
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer n
            && Integer.valueOf((n + 2 + 7) / 8 * 8) instanceof Integer W
            && LongStream.generate(() -> Long.parseLong(st.nextToken())).limit(n).toArray() instanceof long[] v
            && LongStream.concat(LongStream.generate(() -> Long.parseLong(st.nextToken())).limit(n), LongStream.generate(() -> Long.MAX_VALUE / 4).limit(W - n)).toArray() instanceof long[] w
            && new long[n + 1] instanceof long[] V
            && (V[0] = -1125899906842624L) < 0
            && IntStream.rangeClosed(1, n).allMatch(L -> (V[L] = Math.max(v[L - 1],
                IntStream.range(1, L).mapToLong(a -> V[a] + V[L - a]).max().orElse(-1125899906842624L))) > -1125899906842624L)
            && new long[n + 2][W] instanceof long[][] A && new long[n + 2][W] instanceof long[][] D
            && new long[n + 2][W] instanceof long[][] G && new long[n + 2][W] instanceof long[][] F
            && Stream.of(A, D, G, F).flatMap(Arrays::stream).peek(row -> Arrays.fill(row, -1125899906842624L)).count() > 0
            && IntStream.rangeClosed(0, n).allMatch(i -> (F[i][i] = 0) == 0)
            && IntStream.range(0, n).allMatch(i -> (A[i][i] = 0) + (D[i][i] = 0) == 0)
            && IntStream.iterate(n - 1, l -> l >= 0, l -> l - 1).allMatch(l -> A[l] instanceof long[] Al && D[l] instanceof long[] Dl && G[l] instanceof long[] Gl && F[l] instanceof long[] Fl
                && IntStream.range(l, n).allMatch(p -> F[p + 1] instanceof long[] Fp && D[p] instanceof long[] Dq && F[p + 1] instanceof long[] Fm && new long[]{A[l][p], D[l][p], w[p], w[l]} instanceof long[] pq
                    && (pq[0] <= -562949953421312L || new long[]{pq[0], pq[2]} instanceof long[] pv && IntStream.range((p + 1) / 8, W / 8).allMatch(i -> (Al[(i * 8 + 0)] = w[(i * 8 + 0)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 0)], pv[0] + Fp[(i * 8 + 0)]) : Al[(i * 8 + 0)]) + (Al[(i * 8 + 1)] = w[(i * 8 + 1)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 1)], pv[0] + Fp[(i * 8 + 1)]) : Al[(i * 8 + 1)]) + (Al[(i * 8 + 2)] = w[(i * 8 + 2)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 2)], pv[0] + Fp[(i * 8 + 2)]) : Al[(i * 8 + 2)]) + (Al[(i * 8 + 3)] = w[(i * 8 + 3)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 3)], pv[0] + Fp[(i * 8 + 3)]) : Al[(i * 8 + 3)]) + (Al[(i * 8 + 4)] = w[(i * 8 + 4)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 4)], pv[0] + Fp[(i * 8 + 4)]) : Al[(i * 8 + 4)]) + (Al[(i * 8 + 5)] = w[(i * 8 + 5)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 5)], pv[0] + Fp[(i * 8 + 5)]) : Al[(i * 8 + 5)]) + (Al[(i * 8 + 6)] = w[(i * 8 + 6)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 6)], pv[0] + Fp[(i * 8 + 6)]) : Al[(i * 8 + 6)]) + (Al[(i * 8 + 7)] = w[(i * 8 + 7)] == pv[1] + 1 ? Math.max(Al[(i * 8 + 7)], pv[0] + Fp[(i * 8 + 7)]) : Al[(i * 8 + 7)]) > Long.MIN_VALUE))
                    && (pq[1] <= -562949953421312L || new long[]{pq[1], pq[2]} instanceof long[] pv && IntStream.range((p + 1) / 8, W / 8).allMatch(i -> (Dl[(i * 8 + 0)] = w[(i * 8 + 0)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 0)], pv[0] + Fp[(i * 8 + 0)]) : Dl[(i * 8 + 0)]) + (Dl[(i * 8 + 1)] = w[(i * 8 + 1)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 1)], pv[0] + Fp[(i * 8 + 1)]) : Dl[(i * 8 + 1)]) + (Dl[(i * 8 + 2)] = w[(i * 8 + 2)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 2)], pv[0] + Fp[(i * 8 + 2)]) : Dl[(i * 8 + 2)]) + (Dl[(i * 8 + 3)] = w[(i * 8 + 3)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 3)], pv[0] + Fp[(i * 8 + 3)]) : Dl[(i * 8 + 3)]) + (Dl[(i * 8 + 4)] = w[(i * 8 + 4)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 4)], pv[0] + Fp[(i * 8 + 4)]) : Dl[(i * 8 + 4)]) + (Dl[(i * 8 + 5)] = w[(i * 8 + 5)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 5)], pv[0] + Fp[(i * 8 + 5)]) : Dl[(i * 8 + 5)]) + (Dl[(i * 8 + 6)] = w[(i * 8 + 6)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 6)], pv[0] + Fp[(i * 8 + 6)]) : Dl[(i * 8 + 6)]) + (Dl[(i * 8 + 7)] = w[(i * 8 + 7)] == pv[1] - 1 ? Math.max(Dl[(i * 8 + 7)], pv[0] + Fp[(i * 8 + 7)]) : Dl[(i * 8 + 7)]) > Long.MIN_VALUE))
                    && (Gl[p] = pq[3] >= pq[2] ? Math.max(Gl[p], pq[1] + V[(int) Math.min(n, pq[3] - pq[2] + 1)]) : Gl[p]) > Long.MIN_VALUE
                    && (p == l || pq[0] <= -562949953421312L || new long[]{pq[0], pq[2], pq[3]} instanceof long[] qv && IntStream.range(p / 8, W / 8).allMatch(i -> (Gl[(i * 8 + 0)] = qv[1] >= w[(i * 8 + 0)] ? Math.max(Gl[(i * 8 + 0)], qv[0] + Dq[(i * 8 + 0)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 0)] + 1)]) : Gl[(i * 8 + 0)]) + (Gl[(i * 8 + 1)] = qv[1] >= w[(i * 8 + 1)] ? Math.max(Gl[(i * 8 + 1)], qv[0] + Dq[(i * 8 + 1)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 1)] + 1)]) : Gl[(i * 8 + 1)]) + (Gl[(i * 8 + 2)] = qv[1] >= w[(i * 8 + 2)] ? Math.max(Gl[(i * 8 + 2)], qv[0] + Dq[(i * 8 + 2)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 2)] + 1)]) : Gl[(i * 8 + 2)]) + (Gl[(i * 8 + 3)] = qv[1] >= w[(i * 8 + 3)] ? Math.max(Gl[(i * 8 + 3)], qv[0] + Dq[(i * 8 + 3)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 3)] + 1)]) : Gl[(i * 8 + 3)]) + (Gl[(i * 8 + 4)] = qv[1] >= w[(i * 8 + 4)] ? Math.max(Gl[(i * 8 + 4)], qv[0] + Dq[(i * 8 + 4)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 4)] + 1)]) : Gl[(i * 8 + 4)]) + (Gl[(i * 8 + 5)] = qv[1] >= w[(i * 8 + 5)] ? Math.max(Gl[(i * 8 + 5)], qv[0] + Dq[(i * 8 + 5)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 5)] + 1)]) : Gl[(i * 8 + 5)]) + (Gl[(i * 8 + 6)] = qv[1] >= w[(i * 8 + 6)] ? Math.max(Gl[(i * 8 + 6)], qv[0] + Dq[(i * 8 + 6)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 6)] + 1)]) : Gl[(i * 8 + 6)]) + (Gl[(i * 8 + 7)] = qv[1] >= w[(i * 8 + 7)] ? Math.max(Gl[(i * 8 + 7)], qv[0] + Dq[(i * 8 + 7)] + V[(int) Math.min(n, 2 * qv[1] - qv[2] - w[(i * 8 + 7)] + 1)]) : Gl[(i * 8 + 7)]) > Long.MIN_VALUE))
                    && (Gl[p] <= -562949953421312L || Fl[p + 1] >= Gl[p] || new long[]{Gl[p]} instanceof long[] g && IntStream.range((p + 1) / 8, W / 8).allMatch(i -> (Fl[(i * 8 + 0)] = Math.max(Fl[(i * 8 + 0)], g[0] + Fm[(i * 8 + 0)])) + (Fl[(i * 8 + 1)] = Math.max(Fl[(i * 8 + 1)], g[0] + Fm[(i * 8 + 1)])) + (Fl[(i * 8 + 2)] = Math.max(Fl[(i * 8 + 2)], g[0] + Fm[(i * 8 + 2)])) + (Fl[(i * 8 + 3)] = Math.max(Fl[(i * 8 + 3)], g[0] + Fm[(i * 8 + 3)])) + (Fl[(i * 8 + 4)] = Math.max(Fl[(i * 8 + 4)], g[0] + Fm[(i * 8 + 4)])) + (Fl[(i * 8 + 5)] = Math.max(Fl[(i * 8 + 5)], g[0] + Fm[(i * 8 + 5)])) + (Fl[(i * 8 + 6)] = Math.max(Fl[(i * 8 + 6)], g[0] + Fm[(i * 8 + 6)])) + (Fl[(i * 8 + 7)] = Math.max(Fl[(i * 8 + 7)], g[0] + Fm[(i * 8 + 7)])) > Long.MIN_VALUE))))
            && new long[n + 1] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(i -> (ans[i] = Math.max(ans[i - 1],
                IntStream.rangeClosed(1, i).mapToLong(j -> ans[j - 1] + F[j - 1][i]).max().getAsLong())) > Long.MIN_VALUE)
            ? ans[n] : "");
    }
}



