import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer k && Long.valueOf(s.nextLong()) instanceof Long x && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && "ACB".toCharArray() instanceof char[] F
            && ((BiFunction<Integer, int[], String>) (len, p) -> len == 1 ? (p[0] == p[1] && p[2] == 0 ? String.valueOf(F[p[0]]) : null)
                : Integer.valueOf(p[0] == 0 ? 0 : 1) instanceof Integer off && (p[2] == 0 || off + 2 * p[2] - 1 <= len - 1 && (off + 2 * p[2] - 1 < len - 1 || p[1] == 1))
                    && IntStream.range(0, len).mapToObj(i -> String.valueOf(i == 0 ? F[p[0]] : i == len - 1 ? F[p[1]] : i >= off && (i - off) / 2 < p[2] ? ((i - off) % 2 == 0 ? 'A' : 'C') : 'B')).collect(Collectors.joining()) instanceof String str
                    && IntStream.range(0, len - 1).filter(i -> str.charAt(i) == 'A' && str.charAt(i + 1) == 'C').count() == p[2] ? str : null) instanceof BiFunction<Integer, int[], String> build
            && ((IntFunction<List<int[]>>) len -> IntStream.range(0, 3).boxed().flatMap(f -> IntStream.range(0, 3).boxed().flatMap(l -> IntStream.rangeClosed(0, len / 2).mapToObj(c -> new int[]{f, l, c}))).filter(p -> build.apply(len, p) != null).toList()) instanceof IntFunction<List<int[]>> opts
            && opts.apply(n) instanceof List<int[]> o1s && opts.apply(m) instanceof List<int[]> o2s
            && o1s.stream().flatMap(o1 -> o2s.stream().filter(o2 -> Stream.iterate(new long[]{o1[0], o1[1], o1[2], o2[0], o2[1], o2[2]}, t -> new long[]{t[3], t[4], t[5], t[0], t[4], t[2] + t[5] + (t[1] == 0 && t[3] == 1 ? 1 : 0)}).skip(Math.max(0, k - 2)).findFirst().get() instanceof long[] t && (k == 1 ? t[2] : t[5]) == x)
                .map(o2 -> build.apply(n, o1) + "\n" + build.apply(m, o2))).findFirst() instanceof Optional<String> res
            ? res.orElse("Happy new year!") : "");
    }
}
