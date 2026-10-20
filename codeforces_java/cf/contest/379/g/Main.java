import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n] instanceof int[] deg && IntStream.range(0, 2 * m).allMatch(i -> ++deg[t[2 + i] - 1] > 0)
            && IntStream.range(0, n).mapToObj(v -> new int[deg[v]]).toArray(int[][]::new) instanceof int[][] adj && new int[n] instanceof int[] pos
            && IntStream.range(0, m).allMatch(i -> (adj[t[2 + 2 * i] - 1][pos[t[2 + 2 * i] - 1]++] = t[3 + 2 * i] - 1) >= 0 && (adj[t[3 + 2 * i] - 1][pos[t[3 + 2 * i] - 1]++] = t[2 + 2 * i] - 1) >= 0)
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] par
            && new boolean[n] instanceof boolean[] vis && new int[n] instanceof int[] dep && new int[n] instanceof int[] ord && new int[n] instanceof int[] stk && new int[n] instanceof int[] ptr
            && new int[]{0, 0, 0} instanceof int[] ctr && new int[m + 1] instanceof int[] btm && new int[m + 1] instanceof int[] tp
            && IntStream.range(0, n).filter(r -> !vis[r]).allMatch(r -> (vis[r] = true) && new int[]{ord[ctr[0]++] = r, stk[ctr[1]++] = r}.length > 0
                && IntStream.iterate(0, i -> ctr[1] > 0, i -> i + 1).map(i -> Integer.valueOf(stk[ctr[1] - 1]) instanceof Integer v
                    ? (ptr[v] < deg[v]
                        ? (Integer.valueOf(adj[v][ptr[v]++]) instanceof Integer w
                            ? (!vis[w] ? ((vis[w] = true) ? new int[]{par[w] = v, dep[w] = dep[v] + 1, ord[ctr[0]++] = w, stk[ctr[1]++] = w}.length : 0)
                                : w != par[v] && dep[w] < dep[v] ? new int[]{btm[ctr[2]] = v, tp[ctr[2]++] = w}.length : 0) : 0)
                        : ctr[1]--) : 0).sum() >= 0)
            && IntStream.range(0, ctr[2]).mapToObj(y -> IntStream.iterate(btm[y], x -> x != tp[y], x -> par[x]).toArray() instanceof int[] up
                ? IntStream.range(0, up.length).map(j -> up[up.length - 1 - j]).toArray() : null).toArray(int[][]::new) instanceof int[][] path
            && new boolean[n] instanceof boolean[] inCyc && Arrays.stream(path).allMatch(pa -> Arrays.stream(pa).allMatch(x -> inCyc[x] = true))
            && ((BinaryOperator<int[]>) (x, y) -> (x.length <= y.length ? new int[][]{x, y} : new int[][]{y, x}) instanceof int[][] sl && IntStream.generate(() -> -1).limit(x.length + y.length - 1).toArray() instanceof int[] r
                && IntStream.range(0, sl[0].length).filter(i -> sl[0][i] >= 0).allMatch(i -> IntStream.range(0, sl[1].length).allMatch(j -> sl[1][j] < 0 || (r[i + j] = Math.max(r[i + j], sl[0][i] + sl[1][j])) >= 0)) ? r : null) instanceof BinaryOperator<int[]> conv
            && ((BinaryOperator<int[]>) (x, y) -> IntStream.range(0, x.length).map(i -> Math.max(x[i], y[i])).toArray()) instanceof BinaryOperator<int[]> emax
            && new int[n][][] instanceof int[][][] g
            && ((BiFunction<Integer, Integer, int[]>) (y, s) -> Arrays.stream(path[y]).boxed().reduce(IntStream.range(0, 3).mapToObj(z -> new int[]{z == s ? 0 : -1}).toArray(int[][]::new),
                    (F, c) -> IntStream.range(0, 3).mapToObj(tt -> conv.apply(IntStream.range(0, 3).filter(q -> q * tt != 2).mapToObj(q -> F[q]).reduce(emax).get(), g[c][tt])).toArray(int[][]::new), (p, q) -> p) instanceof int[][] fin
                ? IntStream.range(0, 3).filter(tt -> tt * s != 2).mapToObj(tt -> fin[tt]).reduce(emax).get() : null) instanceof BiFunction<Integer, Integer, int[]> cyc
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && (g[v] = IntStream.range(0, 3).mapToObj(s -> Stream.concat(
                    IntStream.range(0, n).filter(c -> par[c] == v && !inCyc[c]).mapToObj(c -> IntStream.range(0, 3).filter(tt -> tt * s != 2).mapToObj(tt -> g[c][tt]).reduce(emax).get()),
                    IntStream.range(0, ctr[2]).filter(y -> tp[y] == v).mapToObj(y -> cyc.apply(y, s))).reduce(new int[][]{{0, -1}, {-1, 0}, {1, -1}}[s], conv)).toArray(int[][]::new)) != null)
            && IntStream.range(0, n).filter(r -> par[r] < 0).mapToObj(r -> IntStream.range(0, 3).mapToObj(s -> g[r][s]).reduce(emax).get()).reduce(new int[]{0}, conv) instanceof int[] res
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
