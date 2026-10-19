import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1}).toList() instanceof List<int[]> es
            && new int[m + 2][] instanceof int[][] pre && new int[m + 2][] instanceof int[][] suf
            && ((BiFunction<int[], int[], int[]>) (prev, e) -> Integer.valueOf(prev[e[0]]) instanceof Integer a && Integer.valueOf(prev[e[1]]) instanceof Integer b
                ? a.equals(b) ? prev : prev.clone() instanceof int[] c && IntStream.range(0, n).allMatch(v -> c[v] != b || (c[v] = a) >= 0) ? c : null : null) instanceof BiFunction<int[], int[], int[]> mg
            && (pre[0] = IntStream.range(0, n).toArray()) != null && (suf[m + 1] = pre[0]) != null
            && IntStream.rangeClosed(1, m).allMatch(i -> (pre[i] = mg.apply(pre[i - 1], es.get(i - 1))) != null)
            && IntStream.iterate(m, i -> i >= 1, i -> i - 1).allMatch(i -> (suf[i] = mg.apply(suf[i + 1], es.get(i - 1))) != null)
            && Integer.valueOf(s.nextInt()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(s.nextInt()) instanceof Integer l && Integer.valueOf(s.nextInt()) instanceof Integer r && pre[l - 1].clone() instanceof int[] p
                && ((IntUnaryOperator) v -> p[IntStream.iterate(v, x -> p[x] != x, x -> p[x]).reduce(v, (x, y) -> y)]) instanceof IntUnaryOperator find
                && IntStream.range(0, n).allMatch(v -> (p[find.applyAsInt(v)] = find.applyAsInt(suf[r + 1][v])) >= 0)
                ? "" + IntStream.range(0, n).filter(v -> p[v] == v).count() : "").collect(Collectors.joining("\n")) : "");
    }
}
