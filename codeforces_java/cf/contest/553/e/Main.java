import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((tk[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m && Integer.valueOf(tk[2]) instanceof Integer t && Integer.valueOf(tk[3]) instanceof Integer x
            && Integer.valueOf(64) instanceof Integer B && Integer.valueOf(Integer.highestOneBit(t) * 2) instanceof Integer T2 && Integer.valueOf(Integer.numberOfTrailingZeros(T2)) instanceof Integer lgT
            && Integer.valueOf(m + (m & 1)) instanceof Integer mp && Integer.valueOf(n + (n & 1)) instanceof Integer nv
            && new int[mp] instanceof int[] from && new int[mp] instanceof int[] to && new int[mp] instanceof int[] cost && new double[mp][T2] instanceof double[][] pe
            && IntStream.range(mp - 1, mp).allMatch(e -> (from[e] = n - 1) >= 0)
            && IntStream.range(0, m).allMatch(e -> Integer.valueOf(4 + e * (3 + t)) instanceof Integer base && (from[e] = tk[base] - 1) >= 0 && (to[e] = tk[base + 1] - 1) >= 0 && (cost[e] = tk[base + 2]) >= 0
                && IntStream.rangeClosed(1, t).allMatch(k -> (pe[e][k] = tk[base + 2 + k] / 100000.0) >= 0))
            && new long[n] instanceof long[] D && IntStream.range(0, n).allMatch(v -> (D[v] = v == n - 1 ? 0 : 1000000000000L) >= 0)
            && IntStream.range(0, n).allMatch(it -> IntStream.range(0, m).allMatch(e -> (D[from[e]] = Math.min(D[from[e]], cost[e] + D[to[e]])) >= 0))
            && new double[mp][T2] instanceof double[][] g
            && IntStream.range(0, m).allMatch(e -> new double[]{0} instanceof double[] tail
                && IntStream.rangeClosed(0, t).allMatch(s -> (s == 0 || (tail[0] += pe[e][t - s + 1]) >= 0) && (g[e][s] = (D[to[e]] + x) * tail[0]) >= 0))
            && new double[nv][T2] instanceof double[][] F
            && new double[T2 / 2] instanceof double[] twc && new double[T2 / 2] instanceof double[] tws
            && IntStream.range(0, T2 / 2).allMatch(j -> (twc[j] = Math.cos(-2 * Math.PI * j / T2)) <= 1 && (tws[j] = Math.sin(-2 * Math.PI * j / T2)) <= 1)
            && new int[T2] instanceof int[] rv && IntStream.range(1, T2).allMatch(j -> (rv[j] = (rv[j >> 1] >> 1) | ((j & 1) << (lgT - 1))) >= 0)
            && new double[6][T2] instanceof double[][] W
            && new double[nv][T2] instanceof double[][] xr && new double[nv][T2] instanceof double[][] xi
            && new double[16][mp / 2][][] instanceof double[][][][] qc
            && new int[]{0} instanceof int[] cl
            && ((IntBinaryOperator) (sp, ap) -> Integer.valueOf(Integer.numberOfTrailingZeros(cl[0])) instanceof Integer lgC
                && IntStream.range(0, lgC).allMatch(sg -> Integer.valueOf((sg & 1) == 0 ? sp : ap) instanceof Integer sa && Integer.valueOf((sg & 1) == 0 ? ap : sp) instanceof Integer da
                    && Integer.valueOf((1 << sg) - 1) instanceof Integer mk && Integer.valueOf(lgT - 1 - sg) instanceof Integer sh2
                    && W[sa] instanceof double[] sr && W[sa + 1] instanceof double[] si && W[da] instanceof double[] dr && W[da + 1] instanceof double[] di
                    && IntStream.range(0, cl[0] / 2).allMatch(j ->
                        (dr[((j >> sg) << (sg + 1)) | (j & mk)] = sr[((j >> sg) << (sg + 1)) | (j & mk)] + (sr[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * twc[(j & mk) << sh2] - si[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * tws[(j & mk) << sh2]))
                        + (di[((j >> sg) << (sg + 1)) | (j & mk)] = si[((j >> sg) << (sg + 1)) | (j & mk)] + (sr[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * tws[(j & mk) << sh2] + si[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * twc[(j & mk) << sh2]))
                        + (dr[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] = sr[((j >> sg) << (sg + 1)) | (j & mk)] - (sr[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * twc[(j & mk) << sh2] - si[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * tws[(j & mk) << sh2]))
                        + (di[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] = si[((j >> sg) << (sg + 1)) | (j & mk)] - (sr[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * tws[(j & mk) << sh2] + si[((j >> sg) << (sg + 1)) | (j & mk) | (1 << sg)] * twc[(j & mk) << sh2])) > -1e300))
                ? ((lgC & 1) == 0 ? sp : ap) : -1) instanceof IntBinaryOperator fft
            && ((IntPredicate) lo -> Integer.valueOf(lo & -lo) instanceof Integer H && Integer.valueOf(2 * H) instanceof Integer L && (cl[0] = L) > 0
                && Integer.valueOf(Integer.numberOfTrailingZeros(L)) instanceof Integer lg && Integer.valueOf(lgT - lg) instanceof Integer sh
                && Integer.valueOf((lg & 1) == 0 ? 0 : 2) instanceof Integer R1 && Integer.valueOf((lg & 1) == 0 ? 4 : 0) instanceof Integer R2
                && IntStream.range(0, nv / 2).allMatch(vp -> Integer.valueOf(2 * vp) instanceof Integer w1
                    && IntStream.range(0, L).allMatch(q -> (W[0][q] = 0) == 0 && (W[1][q] = 0) == 0)
                    && IntStream.range(0, H).allMatch(q -> (W[0][rv[q] >> sh] = F[w1][lo + H - 1 - q]) > -1e300 && (W[1][rv[q] >> sh] = F[w1 + 1][lo + H - 1 - q]) > -1e300)
                    && fft.applyAsInt(0, 2) >= 0
                    && W[R1] instanceof double[] zr && W[R1 + 1] instanceof double[] zi
                    && IntStream.range(0, L).allMatch(q -> Integer.valueOf((L - q) & (L - 1)) instanceof Integer nk
                        && (xr[w1][q] = (zr[q] + zr[nk]) / 2) > -1e300 && (xi[w1][q] = (zi[q] - zi[nk]) / 2) > -1e300
                        && (xr[w1 + 1][q] = (zi[q] + zi[nk]) / 2) > -1e300 && (xi[w1 + 1][q] = (zr[nk] - zr[q]) / 2) > -1e300))
                && IntStream.range(0, mp / 2).allMatch(ep -> Integer.valueOf(2 * ep) instanceof Integer e1 && Integer.valueOf(to[e1]) instanceof Integer wa && Integer.valueOf(to[e1 + 1]) instanceof Integer wb
                    && (lg > 13
                        ? IntStream.range(0, L).allMatch(q -> (W[0][rv[q] >> sh] = pe[e1][q]) >= 0 && (W[1][rv[q] >> sh] = pe[e1 + 1][q]) >= 0) && fft.applyAsInt(0, 2) >= 0
                        : qc[lg][ep] != null || (IntStream.range(0, L).allMatch(q -> (W[0][rv[q] >> sh] = pe[e1][q]) >= 0 && (W[1][rv[q] >> sh] = pe[e1 + 1][q]) >= 0) && fft.applyAsInt(0, 2) >= 0
                            && (qc[lg][ep] = new double[][]{Arrays.copyOf(W[R1], L), Arrays.copyOf(W[R1 + 1], L)}) != null))
                    && (lg > 13 ? new double[][]{W[R1], W[R1 + 1]} : qc[lg][ep]) instanceof double[][] qz && qz[0] instanceof double[] zr && qz[1] instanceof double[] zi
                    && IntStream.range(0, L).allMatch(q -> Integer.valueOf((L - q) & (L - 1)) instanceof Integer nk
                        && (W[4][rv[q] >> sh] = (xr[wa][q] * ((zi[q] - zi[nk]) / 2) + xi[wa][q] * ((zr[q] + zr[nk]) / 2)) + (xr[wb][q] * ((zi[q] + zi[nk]) / 2) - xi[wb][q] * ((zr[nk] - zr[q]) / 2))) > -1e300
                        && (W[5][rv[q] >> sh] = (xr[wa][q] * ((zr[q] + zr[nk]) / 2) - xi[wa][q] * ((zi[q] - zi[nk]) / 2)) - (xr[wb][q] * ((zr[nk] - zr[q]) / 2) + xi[wb][q] * ((zi[q] + zi[nk]) / 2))) > -1e300)
                    && fft.applyAsInt(4, 0) >= 0
                    && IntStream.range(0, H).allMatch(j -> Integer.valueOf(lo - 1 - j) instanceof Integer s
                        && (g[e1][s] += W[R2 + 1][H + j] / L) > -1e300 && (g[e1 + 1][s] += W[R2][H + j] / L) > -1e300))) instanceof IntPredicate cross
            && Integer.valueOf(t / B) instanceof Integer topB
            && IntStream.rangeClosed(0, topB).map(j -> topB - j).allMatch(blk -> Integer.valueOf(blk * B) instanceof Integer lo0 && Integer.valueOf(Math.min(lo0 + B - 1, t)) instanceof Integer hi0
                && IntStream.rangeClosed(0, hi0 - lo0).map(j -> hi0 - j).allMatch(s -> Integer.valueOf(s - lo0) instanceof Integer c0 && IntStream.range(0, nv).allMatch(v -> (F[v][s] = v >= n - 1 ? 0 : 1e18) >= 0)
                    && IntStream.range(0, m).allMatch(e -> from[e] == n - 1 || (F[from[e]][s] = Math.min(F[from[e]][s], cost[e] + g[e][s])) > -1e300)
                    && IntStream.range(0, m * c0).allMatch(z -> (g[z / c0][lo0 + z % c0] += F[to[z / c0]][s] * pe[z / c0][c0 - z % c0]) > -1e300))
                && (lo0 == 0 || cross.test(lo0)))
            ? String.format(Locale.ROOT, "%.10f", F[0][0]) : "");
    }
}
