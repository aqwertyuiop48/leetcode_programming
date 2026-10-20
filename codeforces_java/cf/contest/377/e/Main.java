import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long s
            && new long[]{0} instanceof long[] mx
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(t[2 + 2 * i])).toArray() instanceof long[] v0
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(t[3 + 2 * i])).toArray() instanceof long[] c0
            && IntStream.range(0, n).boxed().sorted(Comparator.<Integer>comparingLong(i -> c0[i]).thenComparing(i -> -v0[i])).filter(i -> v0[i] > mx[0] && (mx[0] = v0[i]) > 0).mapToInt(i -> i).toArray() instanceof int[] ix
            && Integer.valueOf(ix.length) instanceof Integer k
            && Arrays.stream(ix).mapToLong(i -> v0[i]).toArray() instanceof long[] V
            && Arrays.stream(ix).mapToLong(i -> c0[i]).toArray() instanceof long[] C
            && new long[k] instanceof long[] K && new long[k] instanceof long[] T && new int[k] instanceof int[] hd && new int[]{1, 0} instanceof int[] hh
            && ((LongFunction<BigInteger>) BigInteger::valueOf) instanceof LongFunction<BigInteger> B
            && ((LongBinaryOperator) (a, b) -> -Math.floorDiv(-a, b)) instanceof LongBinaryOperator cdiv
            && IntStream.range(0, k).allMatch(j -> j == 0 ? (hd[0] = 0) == 0
                : (hh[1] = IntStream.iterate(hh[1], q -> q + 1).filter(q -> !(q + 1 < hh[0] && Long.valueOf(Math.multiplyHigh(C[j] + K[hd[q + 1]], V[hd[q]])) instanceof Long h1 && Long.valueOf(Math.multiplyHigh(C[j] + K[hd[q]], V[hd[q + 1]])) instanceof Long h2 && (h1.longValue() != h2.longValue() ? h1 < h2 : Long.compareUnsigned((C[j] + K[hd[q + 1]]) * V[hd[q]], (C[j] + K[hd[q]]) * V[hd[q + 1]]) <= 0))).findFirst().getAsInt()) >= 0
                && Integer.valueOf(hd[hh[1]]) instanceof Integer p
                && (T[j] = Math.max(T[p], cdiv.applyAsLong(C[j] + K[p], V[p]))) >= 0
                && (K[j] = V[j] * T[j] - (V[p] * T[j] - K[p] - C[j])) > Long.MIN_VALUE
                && (hh[0] = IntStream.iterate(hh[0], q -> q - 1).filter(q -> !(q - hh[1] >= 2
                    && Integer.valueOf(hd[q - 2]) instanceof Integer a && Integer.valueOf(hd[q - 1]) instanceof Integer b
                    && Double.valueOf(((double) K[j] * V[a] - (double) K[a] * V[j]) * (V[b] - V[a]) - ((double) K[b] * V[a] - (double) K[a] * V[b]) * (V[j] - V[a])) instanceof Double dd
                    && Double.valueOf((Math.abs((double) K[j] * V[a]) + Math.abs((double) K[a] * V[j])) * (V[b] - V[a]) + (Math.abs((double) K[b] * V[a]) + Math.abs((double) K[a] * V[b])) * (V[j] - V[a])) instanceof Double sc
                    && (Math.abs(dd) > 1e-9 * sc ? dd < 0
                        : B.apply(K[j]).multiply(B.apply(V[a])).subtract(B.apply(K[a]).multiply(B.apply(V[j]))).multiply(B.apply(V[b] - V[a]))
                            .compareTo(B.apply(K[b]).multiply(B.apply(V[a])).subtract(B.apply(K[a]).multiply(B.apply(V[b]))).multiply(B.apply(V[j] - V[a]))) <= 0))).findFirst().getAsInt()) >= 0
                && (hd[hh[0]++] = j) >= 0)
            ? IntStream.range(0, k).mapToLong(j -> Math.max(T[j], cdiv.applyAsLong(s + K[j], V[j]))).min().getAsLong() : "");
    }
}
