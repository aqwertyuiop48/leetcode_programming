import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList() instanceof List<String> L && Integer.valueOf(L.get(0).trim()) instanceof Integer n
            && new int[1 << 24] instanceof int[] g && IntStream.rangeClosed(1, n).allMatch(i -> Integer.valueOf(L.get(i).trim().chars().map(c -> 1 << (c - 'a')).reduce(0, (x, y) -> x | y)) instanceof Integer mask && ++g[mask] > 0)
            && IntStream.range(0, 8).allMatch(k -> Integer.valueOf(3 * k) instanceof Integer sh && Integer.valueOf(1 << sh) instanceof Integer s
                && IntStream.range(0, 1 << 21).allMatch(i -> Integer.valueOf(((i >> sh) << (sh + 3)) | (i & (s - 1))) instanceof Integer b
                    && (g[b + s] += g[b]) >= 0 && (g[b + 3 * s] += g[b + 2 * s]) >= 0 && (g[b + 5 * s] += g[b + 4 * s]) >= 0 && (g[b + 7 * s] += g[b + 6 * s]) >= 0
                    && (g[b + 2 * s] += g[b]) >= 0 && (g[b + 3 * s] += g[b + s]) >= 0 && (g[b + 6 * s] += g[b + 4 * s]) >= 0 && (g[b + 7 * s] += g[b + 5 * s]) >= 0
                    && (g[b + 4 * s] += g[b]) >= 0 && (g[b + 5 * s] += g[b + s]) >= 0 && (g[b + 6 * s] += g[b + 2 * s]) >= 0 && (g[b + 7 * s] += g[b + 3 * s]) >= 0))
            ? IntStream.range(0, 1 << 24).map(u -> (n - g[u]) * (n - g[u])).reduce(0, (x, y) -> x ^ y) : "");
    }
}

