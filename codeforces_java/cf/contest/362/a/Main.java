import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(s -> !s.isBlank()).map(String::strip).toList() instanceof List<String> L
            && Integer.valueOf(L.get(0)) instanceof Integer t
            && ((Function<List<String>, String>) g -> IntStream.range(0, 64).filter(i -> g.get(i / 8).charAt(i % 8) == 'K').toArray() instanceof int[] ks
                && new boolean[4096] instanceof boolean[] seen && new int[4096] instanceof int[] qu && new int[]{0, 1} instanceof int[] ht
                && (qu[0] = ks[0] * 64 + ks[1]) >= 0 && (seen[qu[0]] = true)
                ? IntStream.iterate(0, z -> ht[0] < ht[1], z -> z + 1).anyMatch(z -> Integer.valueOf(qu[ht[0]++]) instanceof Integer s
                    && IntStream.range(0, 16).anyMatch(mv -> Integer.valueOf((s / 64 / 8) + ((mv & 1) == 0 ? 2 : -2)) instanceof Integer r1 && Integer.valueOf((s / 64 % 8) + ((mv & 2) == 0 ? 2 : -2)) instanceof Integer c1
                        && Integer.valueOf((s % 64 / 8) + ((mv & 4) == 0 ? 2 : -2)) instanceof Integer r2 && Integer.valueOf((s % 64 % 8) + ((mv & 8) == 0 ? 2 : -2)) instanceof Integer c2
                        && r1 >= 0 && r1 < 8 && c1 >= 0 && c1 < 8 && r2 >= 0 && r2 < 8 && c2 >= 0 && c2 < 8
                        && Integer.valueOf((r1 * 8 + c1) * 64 + r2 * 8 + c2) instanceof Integer ns
                        && ((r1 == r2 && c1 == c2 && g.get(r1).charAt(c1) != '#') || (!seen[ns] && (seen[ns] = true) && (qu[ht[1]++] = ns) < 0)))) ? "YES" : "NO" : "") instanceof Function<List<String>, String> solve
            ? IntStream.range(0, t).mapToObj(i -> solve.apply(L.subList(1 + 8 * i, 9 + 8 * i))).collect(Collectors.joining("\n")) : "");
    }
}
