
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Arrays.copyOf(raw, raw.length + 1) instanceof byte[] b && new int[2] instanceof int[] ps && new int[b.length / 2 + 2] instanceof int[] in
            && IntStream.range(0, b.length).filter(i -> b[i] > 47 ? (ps[0] = ps[0] * 10 + b[i] - 48) < 0 : i > 0 && b[i - 1] > 47 && ((in[ps[1]++] = ps[0]) + (ps[0] = 0)) < -1).count() == 0
            && (Integer) in[0] instanceof Integer n && (Integer) (n - 1) instanceof Integer m
            && new int[2][n + 1] instanceof int[][] par && new int[2][n + 1] instanceof int[][] head && new int[2][n + 1] instanceof int[][] nxt
            && new int[2][n + 1] instanceof int[][] que && new int[2][n + 1] instanceof int[][] sz && new int[2][n + 1] instanceof int[][] tin
            && IntStream.range(0, 2).allMatch(c -> IntStream.rangeClosed(2, n).allMatch(v -> (par[c][v] = in[c * (n - 1) + v - 1]) > 0)
                && IntStream.rangeClosed(2, n).allMatch(v -> (nxt[c][v] = head[c][par[c][v]]) >= 0 && (head[c][par[c][v]] = v) > 0)
                && (que[c][0] = 1) == 1 && new int[]{1} instanceof int[] tail
                && IntStream.range(0, n).allMatch(i -> (head[c][que[c][i]] == 0 || (que[c][tail[0]++] = head[c][que[c][i]]) > 0) && (nxt[c][que[c][i]] == 0 || (que[c][tail[0]++] = nxt[c][que[c][i]]) > 0))
                && IntStream.rangeClosed(1, n).allMatch(v -> (sz[c][v] = 1) > 0)
                && IntStream.range(1, n).map(i -> n - i).allMatch(i -> (sz[c][par[c][que[c][i]]] += sz[c][que[c][i]]) > 0)
                && IntStream.range(0, n).allMatch(i -> (head[c][que[c][i]] == 0 || (tin[c][head[c][que[c][i]]] = tin[c][que[c][i]] + 1) > 0) && (nxt[c][que[c][i]] == 0 || (tin[c][nxt[c][que[c][i]]] = tin[c][que[c][i]] + sz[c][que[c][i]]) > 0)))
            && new int[2][n] instanceof int[][] lo && new int[2][n] instanceof int[][] hi
            && IntStream.range(0, 2).allMatch(c -> IntStream.rangeClosed(1, m).allMatch(j ->
                (lo[c][j] = Math.min(tin[1 - c][j + 1], tin[1 - c][par[c][j + 1]])) >= 0 && (hi[c][j] = Math.max(tin[1 - c][j + 1], tin[1 - c][par[c][j + 1]])) >= 0))
            && (Integer) Integer.highestOneBit(Math.max(1, m) * 2 - 1) instanceof Integer SZ
            && IntStream.range(0, 4).mapToObj(s -> LongStream.rangeClosed(1, m).map(j -> (long) (s % 2 == 0 ? hi[s / 2][(int) j] : lo[s / 2][(int) j]) << 18 | j).sorted().toArray()).toArray(long[][]::new) instanceof long[][] srt
            && new int[4][n + 1] instanceof int[][] ord && new int[4][n + 1] instanceof int[][] pos && new int[4][n + 2] instanceof int[][] cnt
            && IntStream.range(0, 4).allMatch(s -> IntStream.range(0, m).allMatch(p -> (ord[s][p] = (int) (srt[s][p] & 262143)) > 0 && (pos[s][ord[s][p]] = p) >= 0 && ++cnt[s][(int) (srt[s][p] >> 18) + 1] > 0)
                && IntStream.rangeClosed(1, n + 1).allMatch(x -> (cnt[s][x] += cnt[s][x - 1]) >= 0))
            && new int[4][2 * SZ] instanceof int[][] mn
            && IntStream.range(0, 4).allMatch(s -> IntStream.range(0, SZ).allMatch(p -> (mn[s][SZ + p] = p >= m ? Integer.MAX_VALUE : s % 2 == 0 ? lo[s / 2][ord[s][p]] : -hi[s / 2][ord[s][p]]) > Integer.MIN_VALUE)
                && IntStream.range(1, SZ).map(i -> SZ - i).allMatch(i -> (mn[s][i] = Math.min(mn[s][2 * i], mn[s][2 * i + 1])) > Integer.MIN_VALUE))
            && ((IntBinaryOperator) (t, j) -> (mn[t][SZ + pos[t][j]] = Integer.MAX_VALUE) > 0 ? 0 : 0) instanceof IntBinaryOperator kill
            && new int[6] instanceof int[] st && new int[]{0} instanceof int[] tot && new long[2 * n + 2] instanceof long[] keys && new int[2][n] instanceof int[][] buf && new int[]{1, 0} instanceof int[] len
            && new Object[1] instanceof Object[] ref
            && (ref[0] = (IntUnaryOperator) x -> (x + 1) * ((SZ >> (31 - Integer.numberOfLeadingZeros(x)))) - SZ - 1 < st[0] || x * ((SZ >> (31 - Integer.numberOfLeadingZeros(x)))) - SZ > st[1] || mn[st[3]][x] >= st[2]
                || (x >= SZ
                    ? (buf[st[4]][len[st[4]]++] = ord[st[3]][x - SZ]) > 0 && (keys[tot[0]++] = (long) st[5] << 19 | ord[st[3]][x - SZ]) > 0 && (mn[st[3]][x] = Integer.MAX_VALUE) > 0 && kill.applyAsInt(st[3] ^ 1, ord[st[3]][x - SZ]) >= 0
                    : ((IntUnaryOperator) ref[0]).applyAsInt(2 * x) + ((IntUnaryOperator) ref[0]).applyAsInt(2 * x + 1) >= 0 && (mn[st[3]][x] = Math.min(mn[st[3]][2 * x], mn[st[3]][2 * x + 1])) > Integer.MIN_VALUE) ? 0 : 0) != null
            && (buf[0][0] = in[2 * n - 1]) > 0 && (keys[tot[0]++] = in[2 * n - 1]) > 0 && kill.applyAsInt(0, in[2 * n - 1]) == 0 && kill.applyAsInt(1, in[2 * n - 1]) == 0
            && (IntStream.range(0, 2 * n).allMatch(k -> len[k & 1] > 0 && (len[(k + 1) & 1] = 0) == 0 && (st[4] = (k + 1) & 1) >= 0 && (st[5] = k + 1) > 0
                && IntStream.range(0, 2 * len[k & 1]).allMatch(w -> (Integer) (buf[k & 1][w >> 1] + 1) instanceof Integer q
                    && (st[3] = (1 - (k & 1)) * 2 + (w & 1)) >= 0 && (st[0] = cnt[st[3]][tin[k & 1][q]]) >= 0 && (st[1] = cnt[st[3]][tin[k & 1][q] + sz[k & 1][q]] - 1) > -2
                    && (st[2] = (w & 1) == 0 ? tin[k & 1][q] : -(tin[k & 1][q] + sz[k & 1][q] - 1)) > Integer.MIN_VALUE
                    && (st[0] > st[1] || ((IntUnaryOperator) ref[0]).applyAsInt(1) == 0))) || true)
            && Arrays.stream(keys, 0, tot[0]).sorted().toArray() instanceof long[] sk
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, tot[0]).filter(i -> ((i == 0 || sk[i] >> 19 != sk[i - 1] >> 19) ? sb.append(i == 0 ? "" : "\n").append((sk[i] >> 19) % 2 == 0 ? "Blue\n" : "Red\n") : sb.append(' ')).append(sk[i] & 524287).length() < 0).count() == 0
            ? sb.toString() : "");
    }
}



