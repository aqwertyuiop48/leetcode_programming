import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] b
            && (Integer) Math.max(Arrays.stream(a).max().getAsInt(), Arrays.stream(b).max().getAsInt()) instanceof Integer mx
            && new int[(mx >> 1) + 3] instanceof int[] spf
            && IntStream.rangeClosed(1, (int) Math.sqrt(mx) / 2).map(i -> 2 * i + 1).filter(p -> spf[p >> 1] == 0 && p * p <= mx)
                .allMatch(p -> IntStream.range(0, (mx / p - p) / 2 + 1).filter(j -> spf[p * (p + 2 * j) >> 1] == 0 && (spf[p * (p + 2 * j) >> 1] = p) > 0).count() >= 0)
            && ((IntUnaryOperator) x -> (x & 1) == 0 ? 2 : spf[x >> 1] == 0 ? x : spf[x >> 1]) instanceof IntUnaryOperator sp
            && new int[(mx >> 1) + 3] instanceof int[] ca && new int[(mx >> 1) + 3] instanceof int[] cb
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] g1 && new IntBinaryOperator[2] instanceof IntBinaryOperator[] g2
            && (g1[0] = x -> x <= 1 ? 0 : ++ca[sp.applyAsInt(x) + 1 >> 1] > 0 ? g1[0].applyAsInt(x / sp.applyAsInt(x)) : 0) != null
            && (g2[0] = (res, x) -> x <= 1 ? res : ca[sp.applyAsInt(x) + 1 >> 1] > 0 && --ca[sp.applyAsInt(x) + 1 >> 1] >= 0 && ++cb[sp.applyAsInt(x) + 1 >> 1] > 0
                ? g2[0].applyAsInt(res / sp.applyAsInt(x), x / sp.applyAsInt(x)) : g2[0].applyAsInt(res, x / sp.applyAsInt(x))) != null
            && (g2[1] = (res, x) -> x <= 1 ? res : cb[sp.applyAsInt(x) + 1 >> 1] > 0 && --cb[sp.applyAsInt(x) + 1 >> 1] >= 0
                ? g2[1].applyAsInt(res / sp.applyAsInt(x), x / sp.applyAsInt(x)) : g2[1].applyAsInt(res, x / sp.applyAsInt(x))) != null
            && Arrays.stream(a).allMatch(v -> g1[0].applyAsInt(v) >= 0)
            && Arrays.stream(b).map(v -> g2[0].applyAsInt(v, v)).toArray() instanceof int[] ob
            && Arrays.stream(a).map(v -> g2[1].applyAsInt(v, v)).toArray() instanceof int[] oa
            ? n + " " + m + "\n" + Arrays.stream(oa).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + Arrays.stream(ob).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
