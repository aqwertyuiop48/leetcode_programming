import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Long.valueOf(it.next()) instanceof Long k
            && LongStream.range(0, n).map(i -> it.next()).toArray() instanceof long[] a
            && Arrays.stream(a).sorted().distinct().toArray() instanceof long[] vs
            && Arrays.stream(a).mapToInt(x -> Arrays.binarySearch(vs, x) + 1).toArray() instanceof int[] rk
            && Integer.valueOf(vs.length) instanceof Integer V
            && new int[V + 2] instanceof int[] pre && new int[V + 2] instanceof int[] suf
            && ((Function<int[], IntBinaryOperator>) bit -> (x, d) -> IntStream.iterate(x, j -> j <= V, j -> j + (j & -j)).allMatch(j -> (bit[j] += d) > Integer.MIN_VALUE) ? 0 : 1) instanceof Function<int[], IntBinaryOperator> mkAdd
            && ((Function<int[], IntUnaryOperator>) bit -> x -> IntStream.iterate(x, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()) instanceof Function<int[], IntUnaryOperator> mkQ
            && mkAdd.apply(pre) instanceof IntBinaryOperator addP && mkAdd.apply(suf) instanceof IntBinaryOperator addS
            && mkQ.apply(pre) instanceof IntUnaryOperator qP && mkQ.apply(suf) instanceof IntUnaryOperator qS
            && new long[4] instanceof long[] st
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (st[0] += qS.applyAsInt(rk[i] - 1)) >= 0 && addS.applyAsInt(rk[i], 1) == 0)
            && ((IntSupplier) () -> Integer.valueOf((int) st[1]) instanceof Integer r && addS.applyAsInt(rk[r], -1) == 0
                && (st[0] -= (st[2] - qP.applyAsInt(rk[r])) + qS.applyAsInt(rk[r] - 1)) > Long.MIN_VALUE && ++st[1] > 0 ? 1 : 0) instanceof IntSupplier rem
            ? IntStream.range(0, n - 1).allMatch(l -> (st[1] > l || rem.getAsInt() >= 0)
                && (st[0] += (st[2] - qP.applyAsInt(rk[l])) + qS.applyAsInt(rk[l] - 1)) > Long.MIN_VALUE && addP.applyAsInt(rk[l], 1) == 0 && ++st[2] > 0
                && IntStream.iterate(0, x -> st[0] > k && st[1] < n, x -> x + 1).allMatch(x -> rem.getAsInt() >= 0)
                && (st[3] += n - st[1]) >= 0) ? st[3] : ""
            : "");
    }
}
