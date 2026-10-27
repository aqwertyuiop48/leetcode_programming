import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par && new int[n + 1] instanceof int[] deg && new int[n + 1] instanceof int[] odd
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = v -> par[v] == v ? v : (par[v] = fh[0].applyAsInt(par[v]))) != null
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b
                && ++deg[a] > 0 && ++deg[b] > 0 && (par[fh[0].applyAsInt(a)] = fh[0].applyAsInt(b)) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(v -> deg[v] % 2 == 0 || ++odd[fh[0].applyAsInt(v)] > 0)
            && IntStream.rangeClosed(1, n).filter(v -> deg[v] > 0 || v == 1).map(v -> fh[0].applyAsInt(v)).distinct().toArray() instanceof int[] roots
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(v -> deg[v] % 2 == 1).count()) instanceof Long o
            && Long.valueOf(Arrays.stream(roots).filter(r -> odd[r] == 0).count()) instanceof Long ke
            ? roots.length == 1 ? o / 2 : (o + 2 * ke) / 2 : ""), "", 1 << 28).start();
    }
}

