import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.range(0, m).map(i -> Integer.parseInt(t[2 + i])).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] tree && new int[n + 1] instanceof int[] val && new int[]{0, 0} instanceof int[] st
            && ((java.util.function.IntBinaryOperator) (pos, d) -> (int) IntStream.iterate(pos, p -> p <= n, p -> p + (p & -p)).map(p -> tree[p] += d).count()) instanceof java.util.function.IntBinaryOperator add
            && ((java.util.function.IntUnaryOperator) r -> new int[]{0, r} instanceof int[] s
                && IntStream.iterate(1 << 20, p -> p > 0, p -> p >> 1).map(p -> s[0] + p <= n && tree[s[0] + p] < s[1] ? (s[1] -= tree[s[0] += p]) : 0).sum() >= 0 ? s[0] + 1 : 0) instanceof java.util.function.IntUnaryOperator kth
            && IntStream.range(0, n).allMatch(i -> t[2 + m + i] instanceof String x
                && (x.equals("-1")
                    ? IntStream.range(0, m).takeWhile(j -> a[j] - j <= st[1]).map(j -> Integer.valueOf(kth.applyAsInt(a[j] - j)) instanceof Integer pos && add.applyAsInt(pos, -1) > 0 && (val[pos] = -1) < 0 && st[1]-- > 0 ? 1 : 0).sum() >= 0
                    : Integer.valueOf(++st[0]) instanceof Integer pos && add.applyAsInt(pos, 1) > 0 && (val[pos] = Integer.parseInt(x) + 1) > 0 && ++st[1] > 0))
            ? IntStream.rangeClosed(1, st[0]).filter(p -> val[p] > 0).mapToObj(p -> String.valueOf(val[p] - 1)).collect(Collectors.joining()) instanceof String r && !r.isEmpty() ? r : "Poor stack!" : "");
    }
}
