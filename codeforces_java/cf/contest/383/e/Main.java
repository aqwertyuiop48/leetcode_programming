import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList() instanceof List<String> L && Integer.valueOf(L.get(0).trim()) instanceof Integer n
            && new int[1 << 24] instanceof int[] g && IntStream.rangeClosed(1, n).allMatch(i -> Integer.valueOf(L.get(i).trim().chars().map(c -> 1 << (c - 'a')).reduce(0, (x, y) -> x | y)) instanceof Integer mask && ++g[mask] > 0)
            && IntStream.range(0, 24).allMatch(b -> IntStream.range(0, 1 << 23).allMatch(i -> (g[(i >> b << b + 1) | (1 << b) | (i & ((1 << b) - 1))] += g[(i >> b << b + 1) | (i & ((1 << b) - 1))]) >= 0))
            ? IntStream.range(0, 1 << 24).map(u -> (n - g[u]) * (n - g[u])).reduce(0, (x, y) -> x ^ y) : "");
    }
}
