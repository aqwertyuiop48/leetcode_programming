import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (st[3] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : st[1] == 1 ? (nums[st[2]++] = st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 : 0) > 5).count() >= 0
            && new int[] {0} instanceof int[] ps && ((IntSupplier) () -> nums[ps[0]++]) instanceof IntSupplier ni
            && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer s && Integer.valueOf(ni.getAsInt()) instanceof Integer t
            && new int[m + 1] instanceof int[] ea && new int[m + 1] instanceof int[] eb && new long[m + 1] instanceof long[] w && new int[n + 3] instanceof int[] as
            && IntStream.rangeClosed(1, m).filter(i -> (ea[i] = ni.getAsInt()) > 0 && (eb[i] = ni.getAsInt()) > 0 && (w[i] = ni.getAsInt()) < 0).count() >= 0
            && new int[3][n + 1] instanceof int[][] pr && new int[3][n + 1] instanceof int[][] zz && new int[m + 1] instanceof int[] kp
            && IntStream.range(0, 3).filter(k -> IntStream.rangeClosed(0, n).filter(v -> (pr[k][v] = v) < 0 || (zz[k][v] = 1) < 0).count() >= 0).count() >= 0
            && ((IntBinaryOperator) (k, x) -> pr[k][IntStream.iterate(x, y -> pr[k][y] != y, y -> pr[k][y]).reduce(x, (a, b) -> b)]) instanceof IntBinaryOperator rt
            && IntStream.rangeClosed(1, m).filter(i -> IntStream.range(0, 3).anyMatch(k -> Integer.valueOf(rt.applyAsInt(k, ea[i])) instanceof Integer x && Integer.valueOf(rt.applyAsInt(k, eb[i])) instanceof Integer y && x.intValue() != y.intValue()
                && Integer.valueOf(zz[k][x] < zz[k][y] ? x : y) instanceof Integer lo && Integer.valueOf(zz[k][x] < zz[k][y] ? y : x) instanceof Integer hi && (pr[k][lo] = hi) > 0 && (zz[k][hi] += zz[k][lo]) > 0 && (kp[i] = 1) > 0)
                && as[ea[i] + 1]++ >= 0 && as[eb[i] + 1]++ < 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(v -> (as[v + 1] += as[v]) < 0).count() >= 0
            && new int[2 * m + 2] instanceof int[] to && new int[2 * m + 2] instanceof int[] eid && new int[n + 3] instanceof int[] fl
            && IntStream.rangeClosed(1, m).filter(i -> kp[i] == 1 && (to[as[ea[i]] + fl[ea[i]]] = eb[i]) > 0 && (eid[as[ea[i]] + fl[ea[i]]++] = i) > 0 && (to[as[eb[i]] + fl[eb[i]]] = ea[i]) > 0 && (eid[as[eb[i]] + fl[eb[i]]++] = i) < 0).count() >= 0
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] low && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] pv && new int[n + 1] instanceof int[] itp && new int[n + 1] instanceof int[] stk
            && new int[] {0, 0, 0} instanceof int[] sp && new int[2] instanceof int[] r
            && ((IntUnaryOperator) banned -> IntStream.rangeClosed(0, n).filter(i -> (tin[i] = 0) != 0 || (pe[i] = 0) != 0).count() >= 0 && (tin[s] = low[s] = 1) == 1 && (sp[1] = 1) == 1 && (itp[s] = as[s]) >= 0 && (stk[0] = s) == s && (sp[0] = 1) == 1
                && IntStream.iterate(0, z -> sp[0] > 0, z -> z + 1).filter(z -> (r[0] = stk[sp[0] - 1]) >= 0
                    && (itp[r[0]] < as[r[0] + 1] ? (r[1] = itp[r[0]]++) >= 0 && eid[r[1]] != banned && eid[r[1]] != pe[r[0]]
                        && (tin[to[r[1]]] != 0 ? (low[r[0]] = Math.min(low[r[0]], tin[to[r[1]]])) >= 0
                            : (pe[to[r[1]]] = eid[r[1]]) >= 0 && (pv[to[r[1]]] = r[0]) >= 0 && (tin[to[r[1]]] = low[to[r[1]]] = ++sp[1]) > 0 && (itp[to[r[1]]] = as[to[r[1]]]) >= 0 && (stk[sp[0]++] = to[r[1]]) >= 0)
                        : (--sp[0] > 0 ? (low[stk[sp[0] - 1]] = Math.min(low[stk[sp[0] - 1]], low[r[0]])) >= 0 : true))).count() >= 0 ? tin[t] : -1) instanceof IntUnaryOperator dfs
            && Integer.valueOf(dfs.applyAsInt(0)) instanceof Integer reach
            ? (reach == 0 ? "0\n0" : IntStream.iterate(t, x -> x != s, x -> pv[x]).map(x -> pe[x]).toArray() instanceof int[] path
                && new long[] {Long.MAX_VALUE, 0, 0} instanceof long[] best
                && Arrays.stream(path).filter(e -> dfs.applyAsInt(e) == 0 ? w[e] < best[0] && (best[0] = w[e]) > 0 && (best[1] = e) > 0 && (best[2] = 0) == 0
                    : IntStream.iterate(t, x -> x != s, x -> pv[x]).filter(x -> low[x] > tin[pv[x]] && w[e] + w[pe[x]] < best[0] && (best[0] = w[e] + w[pe[x]]) > 0 && (best[1] = e) > 0 && (best[2] = pe[x]) > 0).count() >= 0).count() >= 0
                ? (best[0] == Long.MAX_VALUE ? "-1" : best[0] + "\n" + (best[2] == 0 ? "1\n" + best[1] : "2\n" + best[1] + " " + best[2])) : "") : "");
    }
}
