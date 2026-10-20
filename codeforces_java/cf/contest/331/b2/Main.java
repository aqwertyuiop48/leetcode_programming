import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && new int[n + 2] instanceof int[] a && new int[n + 2] instanceof int[] pos
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = t[i]) > 0 && (pos[t[i]] = i) > 0)
            && new int[n + 2] instanceof int[] bit && new int[n + 2] instanceof int[] bad
            && ((IntBinaryOperator) (k, d) -> IntStream.iterate(k, i -> i <= n, i -> i + (i & -i)).map(i -> bit[i] += d).sum() * 0) instanceof IntBinaryOperator upd
            && ((IntUnaryOperator) k -> IntStream.iterate(k, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) instanceof IntUnaryOperator qry
            && ((IntPredicate) k -> k < 1 || k >= n || Integer.valueOf(pos[k] > pos[k + 1] ? 1 : 0) instanceof Integer nb && (nb == bad[k] || (upd.applyAsInt(k, nb - bad[k]) >= 0 && (bad[k] = nb) >= 0))) instanceof IntPredicate fix
            && IntStream.range(1, n).allMatch(fix::test)
            && Integer.valueOf(t[n + 1]) instanceof Integer q && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(i -> Integer.valueOf(t[n + 2 + 3 * i]) instanceof Integer ty && Integer.valueOf(t[n + 3 + 3 * i]) instanceof Integer x && Integer.valueOf(t[n + 4 + 3 * i]) instanceof Integer y
                && (ty == 1 ? sb.append(1 + qry.applyAsInt(y - 1) - qry.applyAsInt(x - 1)).append('\n') != null
                    : Integer.valueOf(a[x]) instanceof Integer u && Integer.valueOf(a[y]) instanceof Integer v
                    && (a[x] = v) > 0 && (a[y] = u) > 0 && (pos[u] = y) > 0 && (pos[v] = x) > 0
                    && fix.test(u - 1) && fix.test(u) && fix.test(v - 1) && fix.test(v)))
            ? sb.toString().trim() : "");
    }
}
