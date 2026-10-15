import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> L
            && Arrays.asList("Anka", "Chapay", "Cleo", "Troll", "Dracul", "Snowy", "Hexadecimal") instanceof List<String> N
            && Arrays.stream(L.get(L.size() - 1).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] e
            && new int[]{1, 3, 9, 27, 81, 243, 729} instanceof int[] P
            && L.subList(1, L.size() - 1).stream().map(s -> s.trim().split(" ")).map(w -> new int[]{N.indexOf(w[0]), N.indexOf(w[2])}).toArray(int[][]::new) instanceof int[][] pr
            && ((java.util.function.IntBinaryOperator) (m, k) -> (int) IntStream.range(0, 7).filter(i -> m / P[i] % 3 == k).count()) instanceof java.util.function.IntBinaryOperator sz
            && ((java.util.function.IntBinaryOperator) (m, i) -> e[m / P[i] % 3] / sz.applyAsInt(m, m / P[i] % 3)) instanceof java.util.function.IntBinaryOperator ex
            && Long.valueOf(IntStream.range(0, 2187)
                .filter(m -> IntStream.range(0, 3).allMatch(k -> sz.applyAsInt(m, k) > 0))
                .mapToLong(m -> (long) (IntStream.range(0, 7).map(i -> ex.applyAsInt(m, i)).max().getAsInt() - IntStream.range(0, 7).map(i -> ex.applyAsInt(m, i)).min().getAsInt()) * 100 + 50
                    - Arrays.stream(pr).filter(q -> m / P[q[0]] % 3 == m / P[q[1]] % 3).count())
                .min().getAsLong()) instanceof Long key
            ? key / 100 + " " + (50 - key % 100) : "");
    }
}


