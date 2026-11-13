import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long k && Integer.valueOf(sc.nextInt()) instanceof Integer t
            && new long[21][21] instanceof long[][] C
            && IntStream.range(0, 21).filter(i -> IntStream.rangeClosed(0, i).filter(j -> (C[i][j] = (j == 0 || j == i) ? 1 : C[i - 1][j - 1] + C[i - 1][j]) < 0).count() >= 0).count() >= 0
            && ((BiFunction<Integer, int[], Long>) (m, caps) -> Long.valueOf(IntStream.range(0, 16).boxed().reduce(IntStream.rangeClosed(0, m).mapToLong(j -> j == 0 ? 1 : 0).toArray(),
                    (cur, d) -> IntStream.rangeClosed(0, m).mapToLong(j -> IntStream.rangeClosed(0, Math.min(caps[d], j)).mapToLong(e -> cur[j - e] * C[j][e]).sum()).toArray(),
                    (x, y) -> x)[m])) instanceof BiFunction<Integer, int[], Long> cnt
            && new long[]{k} instanceof long[] st && new int[16] instanceof int[] caps && IntStream.range(0, 16).filter(i -> (caps[i] = t) < 0).count() >= 0
            && IntStream.rangeClosed(1, 30).filter(L -> Long.valueOf(IntStream.range(1, 16).mapToLong(f -> cnt.apply(L - 1, IntStream.range(0, 16).map(i -> caps[i] - (i == f ? 1 : 0)).toArray())).sum()) instanceof Long c
                && (c >= st[0] || (st[0] -= c) < 0)).boxed().findFirst().get() instanceof Integer len
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, len).filter(p -> IntStream.range(p == 0 ? 1 : 0, 16).filter(d -> caps[d] > 0 && cnt.apply(len - p - 1, IntStream.range(0, 16).map(i -> caps[i] - (i == d ? 1 : 0)).toArray()) instanceof Long c2
                    && (c2 >= st[0] || (st[0] -= c2) < 0)).boxed().findFirst().get() instanceof Integer d2 && --caps[d2] >= 0 && sb.append(Character.forDigit(d2, 16)) != null).count() >= 0
            ? sb : "");
    }
}
