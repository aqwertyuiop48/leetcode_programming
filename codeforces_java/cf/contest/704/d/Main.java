import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m && Long.valueOf(t[2]) instanceof Long rc && Long.valueOf(t[3]) instanceof Long bc
            && IntStream.range(0, n).map(i -> (int) t[4 + 2 * i]).sorted().distinct().toArray() instanceof int[] xs
            && IntStream.range(0, n).map(i -> (int) t[5 + 2 * i]).sorted().distinct().toArray() instanceof int[] ys
            && Integer.valueOf(xs.length) instanceof Integer nx && Integer.valueOf(ys.length) instanceof Integer ny
            && IntStream.range(0, n).map(i -> Arrays.binarySearch(xs, (int) t[4 + 2 * i])).toArray() instanceof int[] xi
            && IntStream.range(0, n).map(i -> Arrays.binarySearch(ys, (int) t[5 + 2 * i])).toArray() instanceof int[] yi
            && new int[nx] instanceof int[] dgx && new int[ny] instanceof int[] dgy
            && IntStream.range(0, n).filter(i -> ++dgx[xi[i]] + ++dgy[yi[i]] < 0).count() == 0
            && Arrays.copyOf(dgx, nx) instanceof int[] ddx && Arrays.copyOf(dgy, ny) instanceof int[] ddy
            && IntStream.range(0, m).filter(q -> Integer.valueOf(t[4 + 2 * n + 3 * q] == 1 ? Arrays.binarySearch(xs, (int) t[5 + 2 * n + 3 * q]) : Arrays.binarySearch(ys, (int) t[5 + 2 * n + 3 * q])) instanceof Integer id
                && id >= 0 && (t[4 + 2 * n + 3 * q] == 1 ? (ddx[id] = Math.min(ddx[id], (int) t[6 + 2 * n + 3 * q])) : (ddy[id] = Math.min(ddy[id], (int) t[6 + 2 * n + 3 * q]))) < -1).count() == 0
            && IntStream.range(0, nx).mapToLong(j -> (dgx[j] - ddx[j] + 1) / 2).toArray() instanceof long[] lox
            && IntStream.range(0, ny).mapToLong(j -> (dgy[j] - ddy[j] + 1) / 2).toArray() instanceof long[] loy
            && (IntStream.range(0, nx).allMatch(j -> lox[j] <= (dgx[j] + ddx[j]) / 2) && IntStream.range(0, ny).allMatch(j -> loy[j] <= (dgy[j] + ddy[j]) / 2))
            && Integer.valueOf(4 + nx + ny) instanceof Integer nn && Integer.valueOf(n + 2 * nx + 2 * ny + 3) instanceof Integer ne
            && new int[nn] instanceof int[] head && new int[2 * ne] instanceof int[] nxt && new int[2 * ne] instanceof int[] to && new int[2 * ne] instanceof int[] cap
            && IntStream.range(0, nn).filter(i -> (head[i] = -1) > 0).count() == 0
            && Long.valueOf(LongStream.of(lox).sum()) instanceof Long sumx && Long.valueOf(LongStream.of(loy).sum()) instanceof Long sumy
            && IntStream.range(0, ne).filter(k -> Integer.valueOf(k < n ? 4 + xi[k] : k < n + 2 * nx ? ((k - n) % 2 == 0 ? 0 : 2) : k < n + 2 * nx + 2 * ny ? 4 + nx + (k - n - 2 * nx) / 2 : k == ne - 3 ? 0 : k == ne - 2 ? 2 : 1) instanceof Integer u
                && Integer.valueOf(k < n ? 4 + nx + yi[k] : k < n + 2 * nx ? 4 + (k - n) / 2 : k < n + 2 * nx + 2 * ny ? ((k - n - 2 * nx) % 2 == 0 ? 1 : 3) : k == ne - 3 ? 3 : k == ne - 2 ? 1 : 0) instanceof Integer v
                && Integer.valueOf(k < n ? 1 : k < n + 2 * nx ? ((k - n) % 2 == 0 ? (dgx[(k - n) / 2] + ddx[(k - n) / 2]) / 2 - (int) lox[(k - n) / 2] : (int) lox[(k - n) / 2])
                    : k < n + 2 * nx + 2 * ny ? ((k - n - 2 * nx) % 2 == 0 ? (dgy[(k - n - 2 * nx) / 2] + ddy[(k - n - 2 * nx) / 2]) / 2 - (int) loy[(k - n - 2 * nx) / 2] : (int) loy[(k - n - 2 * nx) / 2])
                    : k == ne - 3 ? (int) (long) sumx : k == ne - 2 ? (int) (long) sumy : 1000000000) instanceof Integer c
                && (c == 0 || (nxt[2 * k] = head[u]) + (head[u] = 2 * k) + (to[2 * k] = v) + (cap[2 * k] = c) + (nxt[2 * k + 1] = head[v]) + (head[v] = 2 * k + 1) + (to[2 * k + 1] = u) < -999999999) && (to[2 * k] = v) + (cap[2 * k] = c) + (to[2 * k + 1] = u) < -999999999).count() == 0
            && new int[nn] instanceof int[] level && new int[nn] instanceof int[] it && new int[nn] instanceof int[] qu && new int[nn + 1] instanceof int[] stk
            && new int[]{0, 0, -1, 0} instanceof int[] bq && new int[]{0, 0, 0, 0} instanceof int[] df
            && ((BooleanSupplier) () -> bq[2] == -1
                ? level[df[2]] < 0 && bq[0] < bq[1] && (bq[3] = qu[bq[0]++]) >= 0 && (bq[2] = head[bq[3]]) >= -1
                : Integer.valueOf(bq[2]) instanceof Integer e && (bq[2] = nxt[e]) >= -1 && (!(cap[e] > 0 && level[to[e]] < 0) || (level[to[e]] = level[bq[3]] + 1) + (qu[bq[1]++] = to[e]) > -9)) instanceof BooleanSupplier bfs
            && ((BooleanSupplier) () -> Integer.valueOf(df[0] == 0 ? df[1] : to[stk[df[0] - 1]]) instanceof Integer u
                && (u == df[2]
                    ? Integer.valueOf(IntStream.range(0, df[0]).map(i -> cap[stk[i]]).min().getAsInt()) instanceof Integer bott
                        && IntStream.range(0, df[0]).filter(i -> (cap[stk[i]] -= bott) + (cap[stk[i] ^ 1] += bott) < -1).count() == 0
                        && (df[3] += bott) >= 0 && (df[0] = IntStream.range(0, df[0]).filter(i -> cap[stk[i]] == 0).findFirst().getAsInt()) >= 0
                    : it[u] == -1
                        ? (level[u] = -1) == -1 && df[0] > 0 && (df[0]-- > 0) && Integer.valueOf(df[0] == 0 ? df[1] : to[stk[df[0] - 1]]) instanceof Integer p && (it[p] = nxt[it[p]]) >= -1
                        : Integer.valueOf(it[u]) instanceof Integer e2
                            && (cap[e2] > 0 && level[to[e2]] == level[u] + 1 ? (stk[df[0]++] = e2) >= 0 : (it[u] = nxt[e2]) >= -1))) instanceof BooleanSupplier dfs
            && ((IntBinaryOperator) (src, snk) -> (df[3] = 0) == 0 && (df[1] = src) == src && (df[2] = snk) == snk
                && Stream.generate(() -> IntStream.range(0, nn).filter(i -> (level[i] = -1) > 0).count() == 0 && (level[src] = 0) == 0 && (qu[0] = src) == src
                    && (bq[0] = 0) == 0 && (bq[1] = 1) == 1 && (bq[2] = -1) == -1
                    && (IntStream.range(0, Integer.MAX_VALUE).allMatch(i -> bfs.getAsBoolean()) || true)
                    && level[snk] >= 0
                    && IntStream.range(0, nn).filter(i -> (it[i] = head[i]) < -1).count() == 0 && (df[0] = 0) == 0
                    && (IntStream.range(0, Integer.MAX_VALUE).allMatch(i -> dfs.getAsBoolean()) || true)).takeWhile(x -> x).count() >= 0 ? df[3] : -1) instanceof IntBinaryOperator flow
            && flow.applyAsInt(2, 3) == sumx + sumy
            && Integer.valueOf(cap[2 * (ne - 1) + 1]) instanceof Integer f0
            && (cap[2 * (ne - 1)] = 0) == 0 && (cap[2 * (ne - 1) + 1] = 0) == 0
            && Integer.valueOf(f0 + flow.applyAsInt(0, 1)) instanceof Integer big
            ? (rc <= bc ? big * rc + (n - big) * bc : big * bc + (n - big) * rc) + "\n"
                + IntStream.range(0, n).mapToObj(k -> cap[2 * k] == 0 ? (rc <= bc ? "r" : "b") : (rc <= bc ? "b" : "r")).collect(Collectors.joining())
            : "-1");
    }
}
