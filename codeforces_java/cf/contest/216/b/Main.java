import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par && new int[n + 1] instanceof int[] vs && new int[n + 1] instanceof int[] es
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = v -> par[v] == v ? v : (par[v] = fh[0].applyAsInt(par[v]))) != null
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> edges
            && edges.stream().allMatch(e -> (par[fh[0].applyAsInt(e[0])] = fh[0].applyAsInt(e[1])) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(v -> ++vs[fh[0].applyAsInt(v)] > 0)
            && edges.stream().allMatch(e -> ++es[fh[0].applyAsInt(e[0])] > 0)
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(v -> fh[0].applyAsInt(v) == v && vs[v] == es[v] && vs[v] % 2 == 1).count()) instanceof Long c
            ? (n - c) % 2 == 0 ? c : c + 1 : "");
    }
}

