import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> i == 0 ? new int[0] : IntStream.range(0, Integer.parseInt(tk.nextToken())).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] ch
            && (Integer) (2 * n + 1) instanceof Integer N && new int[N] instanceof int[] lc && new int[N] instanceof int[] rc && new int[N] instanceof int[] par && new int[N] instanceof int[] sz && new int[N] instanceof int[] sum
            && new int[N] instanceof int[] mn && new int[N] instanceof int[] mx && new Random(5).ints(N).toArray() instanceof int[] pri
            && IntStream.range(0, N).map(i -> i == 0 ? 0 : i <= n ? 1 : -1).toArray() instanceof int[] val && new int[2] instanceof int[] res && new Object[10] instanceof Object[] rf && new int[]{0} instanceof int[] rt
            && (rf[0] = (IntUnaryOperator) x -> (sz[x] = sz[lc[x]] + 1 + sz[rc[x]]) > 0 && (sum[x] = sum[lc[x]] + val[x] + sum[rc[x]]) > Integer.MIN_VALUE
                && (mn[x] = Math.min(Math.min(lc[x] == 0 ? 1 << 29 : mn[lc[x]], sum[lc[x]] + val[x]), rc[x] == 0 ? 1 << 29 : sum[lc[x]] + val[x] + mn[rc[x]])) > Integer.MIN_VALUE
                && (mx[x] = Math.max(Math.max(lc[x] == 0 ? -(1 << 29) : mx[lc[x]], sum[lc[x]] + val[x]), rc[x] == 0 ? -(1 << 29) : sum[lc[x]] + val[x] + mx[rc[x]])) > Integer.MIN_VALUE
                && (lc[x] == 0 || (par[lc[x]] = x) >= 0) && (rc[x] == 0 || (par[rc[x]] = x) >= 0) ? x : x) != null
            && (rf[1] = (IntBinaryOperator) (t, k) -> t == 0 ? (res[0] = 0) == 0 && (res[1] = 0) == 0 ? 0 : 0
                : sz[lc[t]] >= k ? ((IntBinaryOperator) rf[1]).applyAsInt(lc[t], k) == 0 && (lc[t] = res[1]) >= 0 && ((IntUnaryOperator) rf[0]).applyAsInt(t) >= 0 && (res[1] = t) >= 0 ? 0 : 0
                : ((IntBinaryOperator) rf[1]).applyAsInt(rc[t], k - sz[lc[t]] - 1) == 0 && (rc[t] = res[0]) >= 0 && ((IntUnaryOperator) rf[0]).applyAsInt(t) >= 0 && (res[0] = t) >= 0 ? 0 : 0) != null
            && (rf[2] = (IntBinaryOperator) (a, b) -> a == 0 ? b : b == 0 ? a : pri[a] > pri[b]
                ? (rc[a] = ((IntBinaryOperator) rf[2]).applyAsInt(rc[a], b)) >= 0 && ((IntUnaryOperator) rf[0]).applyAsInt(a) >= 0 ? a : a
                : (lc[b] = ((IntBinaryOperator) rf[2]).applyAsInt(a, lc[b])) >= 0 && ((IntUnaryOperator) rf[0]).applyAsInt(b) >= 0 ? b : b) != null
            && (rf[3] = (IntBinaryOperator) (y, acc) -> par[y] == 0 ? acc : ((IntBinaryOperator) rf[3]).applyAsInt(par[y], acc + (rc[par[y]] == y ? sz[lc[par[y]]] + 1 : 0))) != null
            && (rf[4] = (IntBinaryOperator) (y, acc) -> par[y] == 0 ? acc : ((IntBinaryOperator) rf[4]).applyAsInt(par[y], acc + (rc[par[y]] == y ? sum[lc[par[y]]] + val[par[y]] : 0))) != null
            && (rf[5] = (IntBinaryOperator) (t, k) -> k <= sz[lc[t]] ? ((IntBinaryOperator) rf[5]).applyAsInt(lc[t], k) : k == sz[lc[t]] + 1 ? t : ((IntBinaryOperator) rf[5]).applyAsInt(rc[t], k - sz[lc[t]] - 1)) != null
            && (rf[6] = (IntBinaryOperator) (t, thr) -> t == 0 ? 0 : rc[t] != 0 && sum[lc[t]] + val[t] + mn[rc[t]] <= thr ? ((IntBinaryOperator) rf[6]).applyAsInt(rc[t], thr - sum[lc[t]] - val[t])
                : sum[lc[t]] + val[t] <= thr ? t : ((IntBinaryOperator) rf[6]).applyAsInt(lc[t], thr)) != null
            && (rf[7] = (IntBinaryOperator) (t, k) -> t == 0 ? 0 : rc[t] != 0 && sum[lc[t]] + val[t] + mn[rc[t]] <= k && k <= sum[lc[t]] + val[t] + mx[rc[t]] ? ((IntBinaryOperator) rf[7]).applyAsInt(rc[t], k - sum[lc[t]] - val[t])
                : sum[lc[t]] + val[t] == k ? t : ((IntBinaryOperator) rf[7]).applyAsInt(lc[t], k)) != null
            && ((IntUnaryOperator) x -> ((IntBinaryOperator) rf[3]).applyAsInt(x, sz[lc[x]] + 1)) instanceof IntUnaryOperator rank
            && ((IntUnaryOperator) x -> ((IntBinaryOperator) rf[4]).applyAsInt(x, sum[lc[x]] + val[x])) instanceof IntUnaryOperator prefix
            && ((IntBinaryOperator) (pos, d) -> ((IntBinaryOperator) rf[1]).applyAsInt(rt[0], pos - 1) == 0 && new int[]{res[0], res[1], 0} instanceof int[] f3 && (f3[0] == 0 || (par[f3[0]] = 0) == 0)
                && (f3[2] = ((IntBinaryOperator) rf[6]).applyAsInt(f3[0], d - 1)) >= 0 && (f3[2] = f3[2] == 0 ? 1 : ((IntBinaryOperator) rf[5]).applyAsInt(f3[0], rank.applyAsInt(f3[2]) + 1)) > 0
                && (rt[0] = ((IntBinaryOperator) rf[2]).applyAsInt(f3[0], f3[1])) > 0 && (par[rt[0]] = 0) == 0 ? f3[2] : 0) instanceof IntBinaryOperator anc
            && IntStream.range(0, N).allMatch(i -> i == 0 || ((sz[i] = 1) == 1 && (sum[i] = val[i]) == val[i] && (mn[i] = val[i]) == val[i] && (mx[i] = val[i]) == val[i]))
            && new int[2 * n] instanceof int[] seq && new int[n + 1] instanceof int[] st && new int[n + 1] instanceof int[] it && new int[]{1, 1} instanceof int[] sc && (seq[0] = 1) == 1 && (st[0] = 1) == 1
            && IntStream.range(0, 2 * n - 1).allMatch(i -> it[st[sc[0] - 1]] < ch[st[sc[0] - 1]].length ? (seq[sc[1]++] = ch[st[sc[0] - 1]][it[st[sc[0] - 1]]++]) > 0 && (st[sc[0]++] = seq[sc[1] - 1]) > 0 : (seq[sc[1]++] = st[--sc[0]] + n) > 0)
            && IntStream.range(0, 2 * n).allMatch(i -> (rt[0] = ((IntBinaryOperator) rf[2]).applyAsInt(rt[0], seq[i])) > 0 && (par[rt[0]] = 0) == 0)
            ? IntStream.range(0, m).mapToObj(qi -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer ty
                ? ty == 1 ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer v && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer u
                        && new int[]{Math.min(rank.applyAsInt(v), rank.applyAsInt(u)), Math.max(rank.applyAsInt(v), rank.applyAsInt(u)), prefix.applyAsInt(v) + prefix.applyAsInt(u), 0, 0, 0, 0} instanceof int[] f
                        && ((IntBinaryOperator) rf[1]).applyAsInt(rt[0], f[0] - 1) == 0 && (f[3] = res[0]) >= 0 && (f[4] = res[1]) >= 0 && ((IntBinaryOperator) rf[1]).applyAsInt(f[4], f[1] - f[0] + 1) == 0 && (f[5] = res[0]) > 0 && (f[6] = res[1]) >= 0
                        && (f[2] = f[2] - 2 * ((f[3] == 0 ? 0 : sum[f[3]]) + mn[f[5]])) > Integer.MIN_VALUE && (rt[0] = ((IntBinaryOperator) rf[2]).applyAsInt(f[3], ((IntBinaryOperator) rf[2]).applyAsInt(f[5], f[6]))) > 0 && (par[rt[0]] = 0) == 0 ? String.valueOf(f[2]) : ""
                    : ty == 2 ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer v && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h
                        && (Integer) anc.applyAsInt(rank.applyAsInt(v), prefix.applyAsInt(v) - h) instanceof Integer a && new int[]{rank.applyAsInt(v), rank.applyAsInt(v + n), 0, 0, 0, 0, 0} instanceof int[] f
                        && ((IntBinaryOperator) rf[1]).applyAsInt(rt[0], f[0] - 1) == 0 && (f[2] = res[0]) >= 0 && (f[3] = res[1]) >= 0 && ((IntBinaryOperator) rf[1]).applyAsInt(f[3], f[1] - f[0] + 1) == 0 && (f[4] = res[0]) > 0 && (f[5] = res[1]) >= 0
                        && (rt[0] = ((IntBinaryOperator) rf[2]).applyAsInt(f[2], f[5])) >= 0 && (rt[0] == 0 || (par[rt[0]] = 0) == 0) && (par[f[4]] = 0) == 0
                        && ((IntBinaryOperator) rf[1]).applyAsInt(rt[0], rank.applyAsInt(a + n) - 1) == 0 && (f[2] = res[0]) >= 0 && (f[3] = res[1]) >= 0
                        && (rt[0] = ((IntBinaryOperator) rf[2]).applyAsInt(((IntBinaryOperator) rf[2]).applyAsInt(f[2], f[4]), f[3])) > 0 && (par[rt[0]] = 0) == 0 ? "" : ""
                    : (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) ((IntBinaryOperator) rf[7]).applyAsInt(rt[0], k + 1) instanceof Integer z
                        ? String.valueOf(z <= n ? z : anc.applyAsInt(rank.applyAsInt(z - n), k + 1)) : "" : "").filter(z -> !z.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
