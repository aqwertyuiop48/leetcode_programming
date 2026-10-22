import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k
            && new int[k + 2] instanceof int[] st && IntStream.rangeClosed(1, k).allMatch(t -> (st[t + 1] = st[t] + it.next()) >= 0)
            && new int[n + 1] instanceof int[] typ && IntStream.rangeClosed(1, k).allMatch(t -> IntStream.range(st[t] + 1, st[t + 1] + 1).allMatch(b -> (typ[b] = t) > 0))
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.next(), it.next(), it.next()}).toArray(int[][]::new) instanceof int[][] es
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(0, n).allMatch(i -> (sz[i] = 1) > 0)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y] != y, y -> par[y]).map(y -> par[y]).reduce((a, b) -> b).orElse(x)) instanceof IntUnaryOperator find
            && Arrays.stream(es).filter(e -> e[2] == 0).allMatch(e -> Integer.valueOf(find.applyAsInt(e[0])) instanceof Integer ra && Integer.valueOf(find.applyAsInt(e[1])) instanceof Integer rb
                && (ra.equals(rb) || (sz[ra] >= sz[rb] ? (par[rb] = ra) > 0 && (sz[ra] += sz[rb]) > 0 : (par[ra] = rb) > 0 && (sz[rb] += sz[ra]) > 0)))
            ? IntStream.rangeClosed(1, k).allMatch(t -> IntStream.range(st[t] + 1, st[t + 1] + 1).allMatch(b -> find.applyAsInt(b) == find.applyAsInt(st[t] + 1)))
                ? new long[k][k] instanceof long[][] d && Long.valueOf(1000000000000000L) instanceof Long INF
                    && IntStream.range(0, k).allMatch(i -> IntStream.range(0, k).allMatch(j -> (d[i][j] = i == j ? 0 : INF) >= 0))
                    && Arrays.stream(es).allMatch(e -> typ[e[0]] == typ[e[1]] || ((d[typ[e[0]] - 1][typ[e[1]] - 1] = Math.min(d[typ[e[0]] - 1][typ[e[1]] - 1], e[2])) >= 0 && (d[typ[e[1]] - 1][typ[e[0]] - 1] = Math.min(d[typ[e[1]] - 1][typ[e[0]] - 1], e[2])) >= 0))
                    && IntStream.range(0, k).allMatch(mm -> IntStream.range(0, k).allMatch(i -> d[i][mm] >= INF || IntStream.range(0, k).allMatch(j -> (d[i][j] = Math.min(d[i][j], d[i][mm] + d[mm][j])) >= 0)))
                    ? "Yes\n" + Arrays.stream(d).map(r -> Arrays.stream(r).mapToObj(v -> v >= INF ? "-1" : "" + v).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : ""
                : "No" : "");
    }
}
