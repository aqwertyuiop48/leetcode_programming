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
            && ((BinaryOperator<int[]>) (x, y) -> (x.length <= y.length ? new int[][]{x, y} : new int[][]{y, x}) instanceof int[][] sl && new int[x.length + y.length - 3] instanceof int[] r
                && Stream.of(0).peek(z -> Arrays.fill(r, -100000000)).peek(z -> IntStream.range(0, sl[0].length / 3).filter(i -> sl[0][3 * i] >= 0 || sl[0][3 * i + 1] >= 0 || sl[0][3 * i + 2] >= 0)
                    .forEach(i -> IntStream.range(0, sl[1].length / 3).forEach(j -> Math.max(Math.max(r[3 * (i + j)] = Math.max(r[3 * (i + j)], sl[0][3 * i] + sl[1][3 * j]),
                        r[3 * (i + j) + 1] = Math.max(r[3 * (i + j) + 1], sl[0][3 * i + 1] + sl[1][3 * j + 1])), r[3 * (i + j) + 2] = Math.max(r[3 * (i + j) + 2], sl[0][3 * i + 2] + sl[1][3 * j + 2]))))).findFirst().isPresent() ? r : null) instanceof BinaryOperator<int[]> conv
            && ((UnaryOperator<int[]>) A -> new int[A.length] instanceof int[] o
                && Stream.of(0).peek(z -> IntStream.range(0, A.length / 3).forEach(j -> Math.max(Math.max(o[3 * j] = Math.max(Math.max(A[3 * j], A[3 * j + 1]), A[3 * j + 2]),
                    o[3 * j + 1] = Math.max(A[3 * j], A[3 * j + 1])), o[3 * j + 2] = Math.max(A[3 * j], A[3 * j + 2])))).findFirst().isPresent() ? o : null) instanceof UnaryOperator<int[]> hi
            && ((BiFunction<int[], Integer, int[]>) (A, tt) -> new int[A.length] instanceof int[] o
                && Stream.of(0).peek(z -> IntStream.range(0, A.length / 3).forEach(i -> Math.max(Math.max(o[3 * i] = A[3 * i + tt], o[3 * i + 1] = A[3 * i + tt]), o[3 * i + 2] = A[3 * i + tt]))).findFirst().isPresent() ? o : null) instanceof BiFunction<int[], Integer, int[]> gx
            && ((BiFunction<int[][], Integer, int[]>) (F, tt) -> new int[F[0].length] instanceof int[] o
                && Stream.of(0).peek(z -> IntStream.range(0, F[0].length / 3).forEach(j -> Math.max(Math.max(
                    o[3 * j] = Math.max(Math.max(F[0][3 * j], tt == 2 ? -100000000 : F[1][3 * j]), tt == 1 ? -100000000 : F[2][3 * j]),
                    o[3 * j + 1] = Math.max(Math.max(F[0][3 * j + 1], tt == 2 ? -100000000 : F[1][3 * j + 1]), tt == 1 ? -100000000 : F[2][3 * j + 1])),
                    o[3 * j + 2] = Math.max(Math.max(F[0][3 * j + 2], tt == 2 ? -100000000 : F[1][3 * j + 2]), tt == 1 ? -100000000 : F[2][3 * j + 2])))).findFirst().isPresent() ? o : null) instanceof BiFunction<int[][], Integer, int[]> mq
            && ((Function<int[][], int[]>) F -> new int[F[0].length] instanceof int[] o
                && Stream.of(0).peek(z -> IntStream.range(0, F[0].length / 3).forEach(a -> Math.max(Math.max(
                    o[3 * a] = Math.max(Math.max(F[0][3 * a], F[1][3 * a]), F[2][3 * a]), o[3 * a + 1] = Math.max(F[0][3 * a + 1], F[1][3 * a + 1])),
                    o[3 * a + 2] = Math.max(F[0][3 * a + 2], F[2][3 * a + 2])))).findFirst().isPresent() ? o : null) instanceof Function<int[][], int[]> fin
            && new int[n][] instanceof int[][] g
            && ((IntFunction<int[]>) y -> fin.apply(Arrays.stream(path[y]).boxed().reduce(IntStream.range(0, 3).mapToObj(q -> new int[]{q == 0 ? 0 : -100000000, q == 1 ? 0 : -100000000, q == 2 ? 0 : -100000000}).toArray(int[][]::new),
                    (F, c) -> IntStream.range(0, 3).mapToObj(tt -> conv.apply(gx.apply(g[c], tt), mq.apply(F, tt))).toArray(int[][]::new), (p, q) -> p))) instanceof IntFunction<int[]> cyc
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && Arrays.stream(adj[v]).filter(c -> par[c] == v && !inCyc[c]).toArray() instanceof int[] ch
                && IntStream.range(0, ctr[2]).filter(y -> tp[y] == v).toArray() instanceof int[] cy
                && (g[v] = Stream.concat(Arrays.stream(ch).mapToObj(c -> hi.apply(g[c])), Arrays.stream(cy).mapToObj(cyc)).reduce(new int[]{0, -100000000, 1, -100000000, 0, -100000000}, conv)) != null)
            && IntStream.range(0, n).filter(r -> par[r] < 0).mapToObj(r -> hi.apply(g[r])).reduce(new int[]{0, 0, 0}, conv) instanceof int[] fr
            && IntStream.range(0, fr.length / 3).map(a -> fr[3 * a]).toArray() instanceof int[] res
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

