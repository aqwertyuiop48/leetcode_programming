import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer n
            && Integer.valueOf(w[1]) instanceof Integer m
            && new int[4096] instanceof int[] c
            && IntStream.range(0, n * m).allMatch(x -> (c[(x / m + x % m) * 64 + x / m - x % m + m - 1] = w[2 + x / m].charAt(x % m)) > 0)
            && new byte[1 << 24] instanceof byte[] memo
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] f
            && ((IntBinaryOperator) (q, u) -> (q & ~(63 << 6)) | (u << 6)) instanceof IntBinaryOperator uA
            && ((IntBinaryOperator) (q, u) -> (q & ~63) | (u + 4)) instanceof IntBinaryOperator uB
            && ((IntBinaryOperator) (q, v) -> (q & ~(63 << 18)) | (v << 18)) instanceof IntBinaryOperator vA
            && ((IntBinaryOperator) (q, v) -> (q & ~(63 << 12)) | ((v + 4) << 12)) instanceof IntBinaryOperator vB
            && (f[0] = k -> (k & 63) > (k >> 6 & 63) || (k >> 12 & 63) > (k >> 18 & 63) ? 0
                : memo[k] != 0 ? memo[k] - 1
                : (memo[k] = (byte) (1 + Long.numberOfTrailingZeros(~IntStream.range(0, (((k >> 6 & 63) - (k & 63)) / 2 + 1) * (((k >> 18 & 63) - (k >> 12 & 63)) / 2 + 1))
                    .map(i -> ((k & 63) - 2 + 2 * (i / (((k >> 18 & 63) - (k >> 12 & 63)) / 2 + 1))) * 64 + (k >> 12 & 63) - 2 + 2 * (i % (((k >> 18 & 63) - (k >> 12 & 63)) / 2 + 1)))
                    .filter(z -> c[z] != 0)
                    .mapToLong(z -> 1L << (c[z] == 'L'
                        ? f[0].applyAsInt(uA.applyAsInt(k, z >> 6)) ^ f[0].applyAsInt(uB.applyAsInt(k, z >> 6))
                        : c[z] == 'R'
                            ? f[0].applyAsInt(vA.applyAsInt(k, z & 63)) ^ f[0].applyAsInt(vB.applyAsInt(k, z & 63))
                            : f[0].applyAsInt(vA.applyAsInt(uA.applyAsInt(k, z >> 6), z & 63)) ^ f[0].applyAsInt(vB.applyAsInt(uA.applyAsInt(k, z >> 6), z & 63))
                                ^ f[0].applyAsInt(vA.applyAsInt(uB.applyAsInt(k, z >> 6), z & 63)) ^ f[0].applyAsInt(vB.applyAsInt(uB.applyAsInt(k, z >> 6), z & 63))))
                    .reduce(0L, (x, y) -> x | y)))) - 1) != null
            && ((IntUnaryOperator) p -> f[0].applyAsInt((p + 2) | (n + m - ((n + m - 2 - p) & 1)) << 6
                | (((p + m - 1 & 1) + 2) << 12) | (n + m - ((n + m - 2 - (p + m - 1 & 1)) & 1)) << 18)) instanceof IntUnaryOperator top
            ? (top.applyAsInt(0) ^ top.applyAsInt(1)) != 0 ? "WIN" : "LOSE"
            : "");
    }


}

