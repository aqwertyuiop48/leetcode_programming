import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n + 1] instanceof int[] a && IntStream.rangeClosed(2, n).allMatch(i -> (a[i] = it.next()) > 0)
            && new int[2 * n + 2] instanceof int[] state && new long[2 * n + 2] instanceof long[] val && new int[2 * n + 2] instanceof int[] path
            && ((IntUnaryOperator) s -> Integer.valueOf((s & 1) == 0 ? (s >> 1) + a[s >> 1] : (s >> 1) - a[s >> 1]) instanceof Integer nx
                ? nx < 1 || nx > n ? -1 : nx == 1 ? -2 : nx * 2 + 1 - (s & 1) : 0) instanceof IntUnaryOperator nxt
            && ((IntPredicate) s -> new int[]{s, 0} instanceof int[] w
                && IntStream.iterate(0, z -> w[0] >= 0 && state[w[0]] == 0, z -> z + 1).allMatch(z -> (state[w[0]] = 1) > 0 && (path[w[1]++] = w[0]) >= 0 && (w[0] = nxt.applyAsInt(w[0])) > -100)
                && new long[]{w[0] == -1 ? 0 : w[0] == -2 || state[w[0]] == 1 ? -1 : val[w[0]]} instanceof long[] base
                && IntStream.iterate(w[1] - 1, k -> k >= 0, k -> k - 1).allMatch(k -> (val[path[k]] = base[0] < 0 ? -1 : base[0] + a[path[k] >> 1]) > -2 && (base[0] = val[path[k]]) > -2 && (state[path[k]] = 2) > 0)) instanceof IntPredicate walk
            ? IntStream.range(1, n).mapToObj(i -> i + 1 > n ? (Object) i
                : walk.test((i + 1) * 2 + 1) && val[(i + 1) * 2 + 1] < 0 ? (Object) (-1) : (Object) (i + val[(i + 1) * 2 + 1])).map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

