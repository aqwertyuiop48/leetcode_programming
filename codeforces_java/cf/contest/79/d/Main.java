import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer k
            && Integer.valueOf(t[2]) instanceof Integer l
            && new int[n + 2] instanceof int[] b
            && IntStream.range(0, k).allMatch(i -> (b[t[3 + i]] = 1) > 0)
            && IntStream.rangeClosed(1, n + 1).filter(i -> b[i] != b[i - 1]).toArray() instanceof int[] pts
            && Integer.valueOf(pts.length) instanceof Integer m
            && Arrays.stream(t, 3 + k, 3 + k + l).distinct().flatMap(x -> IntStream.of(x, -x)).toArray() instanceof int[] xx
            && Integer.valueOf(xx.length) instanceof Integer xl
            && Integer.valueOf(n + 2) instanceof Integer off
            && new int[m][m] instanceof int[][] dd
            && new int[3 * n + 6] instanceof int[] D
            && new boolean[3 * n + 6] instanceof boolean[] isT
            && new int[3 * n + 6] instanceof int[] qq
            && new int[2] instanceof int[] qn
            && IntStream.range(0, m).allMatch(s ->
                IntStream.range(0, 3 * n + 6).filter(i -> (D[i] = i > off && i <= off + n + 1 ? -1 : 0) > 0).count() >= 0
                && (qq[0] = pts[s] + off) > 0
                && (qn[0] = 1) > 0
                && (qn[1] = 0) == 0
                && IntStream.range(0, m).filter(q -> (isT[pts[q] + off] = q > s) && false).count() >= 0
                && (D[pts[s] + off] = 0) == 0
                && IntStream.range(0, n + 2).filter(i -> i < qn[0] && qn[1] < m - 1 - s
                    && Integer.valueOf(qq[i]) instanceof Integer cu
                    && Integer.valueOf(D[cu] + 1) instanceof Integer nd
                    && IntStream.range(0, xl).filter(j ->
                        D[cu + xx[j]] < 0
                        && (D[cu + xx[j]] = nd) > 0 && (qq[qn[0]++] = cu + xx[j]) > 0 && isT[cu + xx[j]] && qn[1]++ < 0).count() >= 0
                    && false).count() >= 0
                && IntStream.range(0, m).filter(q -> (dd[s][q] = D[pts[q] + off] < 0 ? 1000000 : D[pts[q] + off]) < 0).count() >= 0)
            && new int[m + 1][] instanceof int[][] lay
            && IntStream.rangeClosed(0, m).filter(i -> (lay[i] = new int[1 << (m - i)]) == null).count() >= 0
            && IntStream.range(1, 1 << m).filter(x -> (lay[0][x] = 1000000000) < 0).count() >= 0
            && IntStream.range(0, m).filter(i ->
                lay[i] instanceof int[] cur
                && lay[i + 1] instanceof int[] nxt
                && IntStream.range(0, 1 << (m - i - 1)).filter(u -> (nxt[u] = cur[2 * u + 1]) < 0).count() >= 0
                && IntStream.range(i + 1, m).filter(j ->
                    Integer.valueOf(j - i - 1) instanceof Integer sh
                    && Integer.valueOf(dd[i][j]) instanceof Integer w
                    && IntStream.range(0, 1 << (m - i - 1)).filter(u -> (u >> sh & 1) == 0
                        && (nxt[u | 1 << sh] = Math.min(nxt[u | 1 << sh], cur[2 * u] + w)) < 0).count() < 0).count() < 0).count() >= 0
            ? (lay[m][0] >= 1000000 ? -1 : lay[m][0]) : 0);
    }
}
