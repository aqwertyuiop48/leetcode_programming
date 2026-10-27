import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && (Long) s.nextLong() instanceof Long k
            && (Integer) (n + m - 1) instanceof Integer L
            && new int[L] instanceof int[] pri
            && IntStream.range(0, n * m).allMatch(c ->
                (Integer) s.nextInt() instanceof Integer v
                && (pri[c / m + c % m] = pri[c / m + c % m] == 0 ? v : Math.min(pri[c / m + c % m], v)) > 0)
            && new char[L] instanceof char[] fx
            && new long[]{k} instanceof long[] kk
            && ((ToLongFunction<char[]>) f ->
                Arrays.stream(IntStream.range(0, L).boxed().reduce(
                    LongStream.range(0, L + 2).map(b -> b == 0 ? 1 : 0).toArray(),
                    (dp, d) -> LongStream.range(0, L + 2).map(b ->
                        Math.min(2_000_000_000_000_000_000L,
                            (f[d] != ')' && b > 0 ? dp[(int) b - 1] : 0L) + (f[d] != '(' && b + 1 < L + 2 ? dp[(int) b + 1] : 0L))).toArray(),
                    (x, y) -> x)).limit(1).sum()) instanceof ToLongFunction<char[]> count
            && IntStream.range(0, L).boxed().sorted(Comparator.comparingInt(d -> pri[d])).allMatch(d ->
                (fx[d] = '(') == '('
                && (Long) count.applyAsLong(fx) instanceof Long c
                && (c >= kk[0] || ((kk[0] -= c) >= 0 && (fx[d] = ')') == ')')))
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> String.valueOf(fx[i + j])).collect(Collectors.joining()))
                .collect(Collectors.joining("\n"))
            : "");
    }
}

