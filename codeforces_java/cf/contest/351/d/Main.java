import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(n + 1) instanceof Integer N
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && Integer.valueOf(it.next()) instanceof Integer q
            && new int[q] instanceof int[] ql && new int[q] instanceof int[] qr
            && IntStream.range(0, q).allMatch(i -> (ql[i] = it.next()) > 0 && (qr[i] = it.next()) > 0)
            && ((Function<int[], IntBinaryOperator>) t -> (i, d) -> IntStream.iterate(i, j -> j <= N, j -> j + (j & -j)).map(j -> t[j] += d).sum()) instanceof Function<int[], IntBinaryOperator> add
            && ((Function<int[], IntUnaryOperator>) t -> i -> IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).map(j -> t[j]).sum()) instanceof Function<int[], IntUnaryOperator> sum
            && new int[N + 1] instanceof int[] t1 && new int[N + 1] instanceof int[] t2 && add.apply(t1) instanceof IntBinaryOperator a1 && add.apply(t2) instanceof IntBinaryOperator a2 && sum.apply(t1) instanceof IntUnaryOperator s1 && sum.apply(t2) instanceof IntUnaryOperator s2
            && new int[100001] instanceof int[] last && new int[100001] instanceof int[] last2 && new int[100001] instanceof int[] bad
            && IntStream.range(0, q).boxed().collect(Collectors.groupingBy(i -> qr[i])) instanceof Map<Integer, List<Integer>> byR
            && new int[q] instanceof int[] ans
            && IntStream.rangeClosed(1, n).allMatch(r -> Integer.valueOf(a[r - 1]) instanceof Integer v && Integer.valueOf(last[v]) instanceof Integer prev
                && Integer.valueOf(prev > 0 && last2[v] > 0 && prev - last2[v] != r - prev ? last2[v] : bad[v]) instanceof Integer nb
                && (prev == 0 || a1.applyAsInt(prev, -1) * 0 + a2.applyAsInt(bad[v] + 1, -1) * 0 + a2.applyAsInt(prev + 1, 1) * 0 == 0)
                && (last2[v] = prev) >= 0 && (last[v] = r) > 0 && (bad[v] = nb) >= 0
                && a1.applyAsInt(r, 1) * 0 + a2.applyAsInt(nb + 1, 1) * 0 + a2.applyAsInt(r + 1, -1) * 0 == 0
                && byR.getOrDefault(r, List.of()).stream().allMatch(k -> (ans[k] = s1.applyAsInt(r) - s1.applyAsInt(ql[k] - 1) + (s2.applyAsInt(ql[k]) == 0 ? 1 : 0)) > 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
