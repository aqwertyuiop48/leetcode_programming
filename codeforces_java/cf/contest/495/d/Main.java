import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).split("\n") instanceof String[] ln
            && ln[0].trim() instanceof String s
            && ln[1].trim() instanceof String t
            && Integer.valueOf(s.length()) instanceof Integer n
            && Integer.valueOf(t.length()) instanceof Integer m
            && Long.valueOf((1L << 61) - 1) instanceof Long M
            && Long.valueOf(1000003L + (System.nanoTime() & 0xFFFFFF) * 7919L) instanceof Long B
            && (LongBinaryOperator) ((a, b) ->
                (Long) (Math.multiplyHigh(a, b) * 8 + ((a * b) >>> 61) + ((a * b) & M)) instanceof Long x
                    ? ((x & M) + (x >>> 61)) % M
                    : 0L) instanceof LongBinaryOperator mul
            && Long.valueOf(IntStream.range(0, m).mapToLong(i -> 0L).reduce(1L, (x, y) -> mul.applyAsLong(x, B))) instanceof Long pwm
            && Long.valueOf(t.chars().asLongStream().reduce(0L, (h, c) -> (mul.applyAsLong(h, B) + c) % M)) instanceof Long ht
            && new long[n + 1] instanceof long[] H
            && IntStream.range(0, n).allMatch(i -> (H[i + 1] = (mul.applyAsLong(H[i], B) + s.charAt(i)) % M) >= 0)
            && new long[n + 1] instanceof long[] S
            && new long[n + 1] instanceof long[] T
            && new int[1] instanceof int[] ls
            && IntStream.rangeClosed(1, n).allMatch(e ->
                (T[e] = (T[e - 1] + 1 + S[e - 1]) % 1000000007L) >= 0
                && (e < m
                    || (((H[e] - mul.applyAsLong(H[e - m], pwm) + M) % M != ht) || (ls[0] = e - m + 1) > 0))
                && (S[e] = (S[e - 1] + T[ls[0]]) % 1000000007L) >= 0)
            ? S[n]
            : -1);
    }
}
