import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new long[n + 2] instanceof long[] cap && new long[n + 2] instanceof long[] cur && new int[n + 2] instanceof int[] par
            && IntStream.rangeClosed(1, n).allMatch(i -> (cap[i] = it.next()) > 0) && IntStream.rangeClosed(0, n + 1).allMatch(i -> (par[i] = i) >= 0)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, v -> par[v] = par[par[v]]).filter(v -> par[v] == v).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && new long[]{0, 0} instanceof long[] st
            && Integer.valueOf(it.next()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer t && t == 1
                    ? Integer.valueOf(it.next()) instanceof Integer p && Integer.valueOf(it.next()) instanceof Integer x && (st[0] = find.applyAsInt(p)) >= 0 && (st[1] = x) >= 0
                        && IntStream.iterate(0, z -> st[1] > 0 && st[0] <= n, z -> z + 1).allMatch(z -> Long.valueOf(Math.min(st[1], cap[(int) st[0]] - cur[(int) st[0]])) instanceof Long fl
                            && (cur[(int) st[0]] += fl) >= 0 && (st[1] -= fl) >= 0
                            && (cur[(int) st[0]] < cap[(int) st[0]] || (par[(int) st[0]] = (int) st[0] + 1) > 0 && (st[0] = find.applyAsInt((int) st[0] + 1)) > 0)) ? null : null
                    : String.valueOf(cur[it.next()]))
                .filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
