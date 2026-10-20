import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && Arrays.stream(L.get(0).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm && Integer.valueOf(nm[0]) instanceof Integer n && Integer.valueOf(nm[1]) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> L.get(i + 1).trim().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && new int[n * m] instanceof int[] dep && new int[n * m] instanceof int[] last && new int[n * m] instanceof int[] q && new int[1] instanceof int[] qn
            && IntStream.range(0, n * m).filter(u -> g[u / m][u % m] == '#').allMatch(u -> (q[qn[0]++] = u) >= 0)
            && ((IntBinaryOperator) (v, u) -> new int[]{dep[v] = dep[u] + 1, last[v] = dep[u] == 0 ? v : last[u], q[qn[0]++] = v}.length) instanceof IntBinaryOperator push
            && IntStream.iterate(0, i -> i < qn[0], i -> i + 1).map(i -> Integer.valueOf(q[i]) instanceof Integer u && Integer.valueOf(u / m) instanceof Integer r && Integer.valueOf(u % m) instanceof Integer c
                ? (r + 1 < n && g[r + 1][c] == '^' ? push.applyAsInt(u + m, u) : 0) + (r > 0 && g[r - 1][c] == 'v' ? push.applyAsInt(u - m, u) : 0)
                    + (c + 1 < m && g[r][c + 1] == '<' ? push.applyAsInt(u + 1, u) : 0) + (c > 0 && g[r][c - 1] == '>' ? push.applyAsInt(u - 1, u) : 0) : 0).sum() >= 0
            && new int[n * m] instanceof int[] best && IntStream.range(0, n * m).filter(v -> dep[v] > 0).allMatch(v -> (best[last[v]] = Math.max(best[last[v]], dep[v])) > 0)
            && Integer.valueOf(Arrays.stream(best).max().getAsInt()) instanceof Integer m1
            ? (qn[0] < n * m ? -1 : m1 == 0 ? 0 : m1 + Math.max(Arrays.stream(best).filter(x -> x == m1).count() >= 2 ? m1 : Arrays.stream(best).filter(x -> x < m1).max().orElse(0), m1 - 1)) : "");
    }
}
