import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] q && new int[]{1} instanceof int[] tl && (q[0] = 1) == 1
            && IntStream.range(0, n).allMatch(h -> IntStream.iterate(head[q[h]], e -> e >= 0, e -> nxt[e]).allMatch(e -> to[e] == par[q[h]] || ((par[to[e]] = q[h]) > 0 && (pe[to[e]] = e / 2 + 1) > 0 && (q[tl[0]++] = to[e]) > 0)))
            && IntStream.rangeClosed(1, n).mapToObj(v -> IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[v]).map(e -> to[e]).toArray()).toArray(int[][]::new) instanceof int[][] chl
            && new int[n + 1] instanceof int[] size && new int[n + 1][] instanceof int[][] dp && new int[n + 1][][] instanceof int[][][] xs
            && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> (Integer) q[i] instanceof Integer v && (size[v] = 1 + IntStream.of(chl[v - 1]).map(c -> size[c]).sum()) > 0
                && (dp[v] = IntStream.range(0, size[v] + 1).map(j -> j == 1 ? chl[v - 1].length : 1 << 20).toArray()) != null
                && (xs[v] = new int[chl[v - 1].length][]) != null
                && new int[]{1} instanceof int[] cs
                && IntStream.range(0, chl[v - 1].length).allMatch(ci -> (Integer) chl[v - 1][ci] instanceof Integer c
                    && (xs[v][ci] = new int[size[v] + 1]) != null
                    && new int[size[v] + 1] instanceof int[] nt && IntStream.range(0, size[v] + 1).allMatch(j -> (nt[j] = 1 << 20) > 0)
                    && IntStream.rangeClosed(1, cs[0]).allMatch(j -> dp[v][j] >= 1 << 20 || ((dp[v][j] >= nt[j] || ((nt[j] = dp[v][j]) >= 0 && (xs[v][ci][j] = 0) == 0)) && IntStream.rangeClosed(1, size[c]).allMatch(x -> dp[v][j] - 1 + dp[c][x] >= nt[j + x] || ((nt[j + x] = dp[v][j] - 1 + dp[c][x]) >= 0 && (xs[v][ci][j + x] = x) > 0))))
                    && IntStream.range(0, size[v] + 1).allMatch(j -> (dp[v][j] = nt[j]) >= 0) && (cs[0] += size[c]) > 0))
            && IntStream.rangeClosed(1, n).boxed().min(Comparator.comparingInt((Integer v) -> (k <= size[v] ? dp[v][k] : 1 << 20) + (v == 1 ? 0 : 1))).get() instanceof Integer bv
            && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt && new Object[1] instanceof Object[] ref
            && (ref[0] = (IntBinaryOperator) (v, j0) -> new int[]{j0} instanceof int[] jj && IntStream.range(0, chl[v - 1].length).map(ci -> chl[v - 1].length - 1 - ci).allMatch(ci -> (Integer) xs[v][ci][jj[0]] instanceof Integer x
                && (x == 0 ? sb.append(pe[chl[v - 1][ci]]).append(' ') != null && ++cnt[0] > 0 : ((IntBinaryOperator) ref[0]).applyAsInt(chl[v - 1][ci], x) >= 0 && (jj[0] -= x) >= 0)) ? 0 : 0) != null
            && ((IntBinaryOperator) ref[0]).applyAsInt(bv, k) >= 0 && (bv == 1 || sb.append(pe[bv]).append(' ') != null && ++cnt[0] > 0)
            ? cnt[0] + "\n" + sb.toString().trim() : "");
    }
}
