import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc -> Optional.of(new int[]{Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken())}).ifPresent(nm ->
            System.out.println(
                Integer.valueOf(nm[0]) instanceof Integer n
                && Integer.valueOf(nm[1]) instanceof Integer m
                && new int[n + 1] instanceof int[] head
                && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
                && new int[m] instanceof int[] ge
                && new int[m] instanceof int[] le
                && new int[2 * m] instanceof int[] nxt
                && new int[2 * m] instanceof int[] to
                && new int[2 * m] instanceof int[] id
                && IntStream.range(0, m).allMatch(e -> new int[]{Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken())} instanceof int[] r
                    && (ge[e] = r[2]) > 0 && (le[e] = r[3]) > 0
                    && (to[2 * e] = r[1]) > 0 && (id[2 * e] = e) >= 0 && (nxt[2 * e] = head[r[0]]) >= -1 && (head[r[0]] = 2 * e) >= 0
                    && (to[2 * e + 1] = r[0]) > 0 && (id[2 * e + 1] = e) >= 0 && (nxt[2 * e + 1] = head[r[1]]) >= -1 && (head[r[1]] = 2 * e + 1) >= 0)
                && new long[n + 1] instanceof long[] val
                && new boolean[n + 1] instanceof boolean[] seen
                && new boolean[]{true} instanceof boolean[] ok
                && new LongBinaryOperator[1] instanceof LongBinaryOperator[] gh
                && (gh[0] = (x, y) -> y == 0 ? x : gh[0].applyAsLong(y, x % y)) != null
                && ((Predicate<Integer>) s -> (seen[s] = true)
                    && Stream.iterate(List.of(s), f -> !f.isEmpty(),
                        f -> f.stream().flatMap(u -> Stream.iterate(head[u], x -> x >= 0, x -> nxt[x]).map(x -> to[x]).filter(w -> !seen[w] && (seen[w] = true))).toList())
                        .flatMap(List::stream).toList() instanceof List<Integer> comp
                    && IntStream.rangeClosed(1, (int) Math.sqrt(le[id[head[s]]])).filter(d -> le[id[head[s]]] % d == 0).flatMap(d -> IntStream.of(d, le[id[head[s]]] / d)).distinct()
                        .filter(d -> d % ge[id[head[s]]] == 0)
                        .anyMatch(cand -> comp.stream().allMatch(v -> (val[v] = 0) == 0)
                            && (val[s] = cand) > 0
                            && (ok[0] = true)
                            && Stream.iterate(List.of(s), f -> !f.isEmpty() && ok[0],
                                f -> f.stream().flatMap(u -> Stream.iterate(head[u], x -> x >= 0, x -> nxt[x]).map(x -> new int[]{to[x], id[x], u})
                                    .filter(t -> Boolean.valueOf(val[t[0]] == 0) instanceof Boolean nw
                                        && Long.valueOf((long) ge[t[1]] * le[t[1]]) instanceof Long gl
                                        && ((nw ? (gl % val[t[2]] == 0 && (val[t[0]] = gl / val[t[2]]) > 0)
                                                : (val[t[2]] * val[t[0]] == gl && gh[0].applyAsLong(val[t[2]], val[t[0]]) == ge[t[1]])) || !(ok[0] = false))
                                        && nw).map(t -> t[0])).toList())
                                .mapToInt(List::size).sum() > 0
                            && ok[0])) instanceof Predicate<Integer> solve
                ? (IntStream.rangeClosed(1, n).allMatch(s -> head[s] < 0 ? (val[s] = 1) > 0 : seen[s] || solve.test(s))
                    ? "YES\n" + IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(val[i])).collect(Collectors.joining(" "))
                    : "NO")
                : "")));
    }
}

