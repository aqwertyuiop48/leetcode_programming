import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Long) Long.parseLong(tk.nextToken()) instanceof Long k
            && new long[n + 1] instanceof long[] p && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + Long.parseLong(tk.nextToken())) > Long.MIN_VALUE)
            && (Long) (LongStream.of(p).max().getAsLong() - LongStream.of(p).min().getAsLong()) instanceof Long span
            && IntStream.rangeClosed(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> p[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[n + 3] instanceof int[] bit && new IntUnaryOperator[2] instanceof IntUnaryOperator[] fn
            && (fn[0] = i -> i > n + 1 ? 0 : (++bit[i] > 0 ? 0 : 0) + fn[0].applyAsInt(i + (i & -i))) != null
            && (fn[1] = i -> i <= 0 ? 0 : bit[i] + fn[1].applyAsInt(i - (i & -i))) != null
            && new long[3] instanceof long[] st
            && ((LongUnaryOperator) x -> Stream.of(0).peek(z -> Arrays.setAll(bit, i -> 0)).findFirst().isPresent() && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0
                && IntStream.range(0, 2 * n + 4).anyMatch(z -> st[0] > n || !((st[1] <= n && p[ord[(int) st[1]]] <= p[ord[(int) st[0]]] - x
                    ? fn[0].applyAsInt(ord[(int) st[1]++] + 1) >= 0
                    : (st[2] += fn[1].applyAsInt(ord[(int) st[0]++])) >= 0))) ? st[2] : 0) instanceof LongUnaryOperator count
            && new long[]{-span - 1, span + 1} instanceof long[] r
            && IntStream.range(0, 70).allMatch(z -> r[0] >= r[1] || (count.applyAsLong(r[0] + (r[1] - r[0] + 1) / 2) >= k ? (r[0] = r[0] + (r[1] - r[0] + 1) / 2) > Long.MIN_VALUE : (r[1] = r[0] + (r[1] - r[0] + 1) / 2 - 1) > Long.MIN_VALUE))
            ? r[0]
            : 0);
    }
}

