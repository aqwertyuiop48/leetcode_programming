import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 32 ? (ps[0] = ps[0] * 10 + raw[i] - 48) < 0 | (ps[1] = 1) < 0
                : ps[1] == 1 && (tk[(int) ps[2]++] = ps[0]) >= 0 && (ps[0] = 0) == 0 && (ps[1] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Long.valueOf(tk[1]) instanceof Long s
            && new long[]{0} instanceof long[] mx
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> tk[3 + 2 * i]).thenComparingLong(i -> -tk[2 + 2 * i]))
                .filter(i -> tk[2 + 2 * i] > mx[0] && (mx[0] = tk[2 + 2 * i]) > 0).mapToInt(i -> i).toArray() instanceof int[] key
            && Integer.valueOf(key.length) instanceof Integer k
            && Arrays.stream(key).mapToLong(i -> tk[2 + 2 * i]).toArray() instanceof long[] V
            && Arrays.stream(key).mapToLong(i -> tk[3 + 2 * i]).toArray() instanceof long[] C
            && new long[k] instanceof long[] K && new long[]{0} instanceof long[] tp && new int[k] instanceof int[] hd && new int[]{1, 0} instanceof int[] st
            && ((LongBinaryOperator) (a, b) -> -Math.floorDiv(-a, b)) instanceof LongBinaryOperator cdiv
            && ((Function<long[], Integer>) w -> Long.compare(Math.multiplyHigh(w[0], w[1]), Math.multiplyHigh(w[2], w[3])) != 0
                ? Long.compare(Math.multiplyHigh(w[0], w[1]), Math.multiplyHigh(w[2], w[3]))
                : Long.compareUnsigned(w[0] * w[1], w[2] * w[3])) instanceof Function<long[], Integer> cmp
            && IntStream.range(1, k).allMatch(j ->
                (V[hd[st[1]]] * tp[0] - K[hd[st[1]]] >= C[j]
                    || ((st[1] = IntStream.iterate(st[1], q -> q + 1).filter(q -> !(q + 1 < st[0]
                            && cdiv.applyAsLong(C[j] + K[hd[q + 1]], V[hd[q + 1]]) < cdiv.applyAsLong(C[j] + K[hd[q]], V[hd[q]]))).findFirst().getAsInt()) >= 0
                        && (tp[0] = Math.max(tp[0], cdiv.applyAsLong(C[j] + K[hd[st[1]]], V[hd[st[1]]]))) >= 0))
                && (st[1] = IntStream.iterate(st[1], q -> q + 1).filter(q -> !(q + 1 < st[0]
                        && V[hd[q + 1]] * tp[0] - K[hd[q + 1]] >= V[hd[q]] * tp[0] - K[hd[q]])).findFirst().getAsInt()) >= 0
                && (K[j] = V[j] * tp[0] - (V[hd[st[1]]] * tp[0] - K[hd[st[1]]] - C[j])) > Long.MIN_VALUE
                && (st[0] = IntStream.iterate(st[0], q -> q - 1).filter(q -> !(q >= 2 && st[1] <= q - 2
                        && cmp.apply(new long[]{K[j] - K[hd[q - 2]], V[hd[q - 1]] - V[hd[q - 2]], K[hd[q - 1]] - K[hd[q - 2]], V[j] - V[hd[q - 2]]}) <= 0)).findFirst().getAsInt()) >= 0
                && (hd[st[0]] = j) >= 0
                && (st[0] += 1) > 0)
            ? IntStream.range(0, k).mapToLong(j -> cdiv.applyAsLong(s + K[j], V[j])).min().getAsLong() : "");
    }
}
