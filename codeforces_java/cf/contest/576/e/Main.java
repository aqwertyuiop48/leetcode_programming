import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new byte[][] {System.in.readAllBytes()} instanceof byte[][] rh && (Integer) rh[0].length instanceof Integer len
            && (Integer) (int) IntStream.range(0, len).filter(i -> rh[0][i] >= 48 && (i == 0 || rh[0][i - 1] < 48)).count() instanceof Integer tc
            && new int[tc] instanceof int[] v && new int[] {-1, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, len).filter(i -> (i < len ? rh[0][i] : 0) >= 48 ? (ps[0] = Math.max(ps[0], 0) * 10 + rh[0][i] - 48) >= 0 : ps[0] < 0 || ((v[ps[1]++] = ps[0]) >= 0 && (ps[0] = -1) < 0)).count() >= 0
            && (rh[0] = null) == null
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m && (Integer) v[2] instanceof Integer k && (Integer) v[3] instanceof Integer q
            && (Integer) (4 + 2 * m) instanceof Integer bs && (Integer) Integer.highestOneBit(Math.max(q, 2) * 2 - 1) instanceof Integer N
            && new int[q] instanceof int[] nxt && new int[m] instanceof int[] last
            && IntStream.range(0, m).filter(i -> (last[i] = q) > 0).count() >= 0
            && IntStream.range(0, q).filter(x -> (nxt[q - 1 - x] = last[v[bs + 2 * (q - 1 - x)] - 1]) >= 0 && (last[v[bs + 2 * (q - 1 - x)] - 1] = q - 1 - x) >= 0).count() >= 0
            && new int[2 * N + 2] instanceof int[] st && new int[1] instanceof int[] md && new int[3][] instanceof int[][] H
            && ((IntBinaryOperator) (nd, qi) -> md[0] == 0 ? ++st[nd + 1] : (H[0][H[1][nd]++] = qi)) instanceof IntBinaryOperator use
            && ((IntUnaryOperator) i -> IntStream.range(0, 21).filter(kk -> ((i + N + (1 << kk)) >> kk) < ((nxt[i] + N) >> kk)
                && ((((i + N + (1 << kk)) >> kk) & 1) == 0 || use.applyAsInt((i + N + (1 << kk)) >> kk, i) >= 0)
                && ((((nxt[i] + N) >> kk) & 1) == 0 || use.applyAsInt(((nxt[i] + N) >> kk) - 1, i) >= 0)).count() >= 0 ? 0 : 0) instanceof IntUnaryOperator deco
            && IntStream.range(0, q).filter(i -> deco.applyAsInt(i) >= 0).count() >= 0
            && IntStream.range(0, 2 * N + 1).filter(x -> (st[x + 1] += st[x]) >= 0).count() >= 0
            && new int[st[2 * N]] instanceof int[] ent && st.clone() instanceof int[] pos && (H[0] = ent) != null && (H[1] = pos) != null && (md[0] = 1) == 1
            && IntStream.range(0, q).filter(i -> deco.applyAsInt(i) >= 0).count() >= 0
            && new int[k * n] instanceof int[] D && IntStream.range(0, k * n).filter(i -> (D[i] = i) >= 0).count() >= 0
            && new byte[q] instanceof byte[] col && new byte[m] instanceof byte[] prev && new byte[q] instanceof byte[] ans
            && new int[m + 2] instanceof int[] SX && new int[m + 2] instanceof int[] SY && new int[1] instanceof int[] sp && new int[4] instanceof int[] r
            && new IntUnaryOperator[3] instanceof IntUnaryOperator[] F
            && (F[1] = g -> (D[g] & 33554431) == g ? g << 1 : (F[1].applyAsInt(D[g] & 33554431) ^ (D[g] >>> 25 & 1))) != null
            && ((IntBinaryOperator) (ga, gb) -> ((r[0] = F[1].applyAsInt(ga)) >= 0 && (r[1] = F[1].applyAsInt(gb)) >= 0 && (r[0] >> 1) != (r[1] >> 1))
                ? (((r[2] = (D[r[0] >> 1] >>> 26) <= (D[r[1] >> 1] >>> 26) ? r[0] : r[1]) >= 0
                    && (r[3] = r[2] == r[0] ? r[1] : r[0]) >= 0
                    && (SX[sp[0]] = ((r[2] >> 1) << 1) | ((D[r[2] >> 1] >>> 26) == (D[r[3] >> 1] >>> 26) ? 1 : 0)) >= 0
                    && (SY[sp[0]++] = r[3] >> 1) >= 0
                    && (D[r[2] >> 1] = (r[3] >> 1) | (((r[0] ^ r[1] ^ 1) & 1) << 25) | (D[r[2] >> 1] & (31 << 26))) >= 0
                    && ((SX[sp[0] - 1] & 1) == 0 || (D[r[3] >> 1] += 1 << 26) >= 0)) ? 0 : 0) : 0) instanceof IntBinaryOperator unite
            && (F[2] = i -> ((Integer) (v[bs + 2 * i] - 1) instanceof Integer e && (Integer) ((v[bs + 2 * i + 1] - 1) * n) instanceof Integer off)
                ? ((r[0] = F[1].applyAsInt(v[4 + 2 * e] - 1 + off)) >= 0 && (r[1] = F[1].applyAsInt(v[5 + 2 * e] - 1 + off)) >= 0
                    && (ans[i] = (byte) ((r[0] >> 1) != (r[1] >> 1) || ((r[0] ^ r[1]) & 1) != 0 ? 1 : 0)) >= 0
                    && (col[i] = ans[i] == 1 ? (byte) v[bs + 2 * i + 1] : prev[e]) >= 0 && (prev[e] = col[i]) >= 0 ? 0 : 0) : 0) != null
            && (F[0] = node -> ((Integer) ((node ^ Integer.highestOneBit(node)) * (N / Integer.highestOneBit(node))) instanceof Integer lo && lo < q && (Integer) sp[0] instanceof Integer sz0)
                ? ((IntStream.range(st[node], st[node + 1]).filter(t -> col[ent[t]] != 0
                        && unite.applyAsInt(v[4 + 2 * (v[bs + 2 * ent[t]] - 1)] - 1 + (col[ent[t]] - 1) * n, v[5 + 2 * (v[bs + 2 * ent[t]] - 1)] - 1 + (col[ent[t]] - 1) * n) >= 0).count() >= 0
                    && (node >= N ? F[2].applyAsInt(node - N) >= 0 : F[0].applyAsInt(2 * node) >= 0 && F[0].applyAsInt(2 * node + 1) >= 0)
                    && IntStream.range(sz0, sp[0]).filter(t -> (D[SX[t] >> 1] = (SX[t] >> 1) | (D[SX[t] >> 1] & (31 << 26))) >= 0 && ((SX[t] & 1) == 0 || (D[SY[t]] -= 1 << 26) >= 0)).count() >= 0
                    && (sp[0] = sz0) >= 0) ? 0 : 0) : 0) != null
            && F[0].applyAsInt(1) >= 0
            ? IntStream.range(0, q).mapToObj(i -> ans[i] == 1 ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
