import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] d
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] h
            && new long[2 * n] instanceof long[] p && IntStream.range(1, 2 * n).allMatch(i -> (p[i] = p[i - 1] + d[(i - 1) % n]) >= 0)
            && (Integer) (Integer.highestOneBit(Math.max(1, 2 * n - 1)) * 2) instanceof Integer sz
            && new long[3][2 * sz] instanceof long[][] t && (Long) (-1000000000000000000L) instanceof Long neg
            && IntStream.range(0, 2 * sz).allMatch(i -> (t[0][i] = i >= sz && i - sz < 2 * n ? 2 * h[(i - sz) % n] + p[i - sz] : neg) <= 0 || true)
            && IntStream.range(0, 2 * sz).allMatch(i -> (t[1][i] = i >= sz && i - sz < 2 * n ? 2 * h[(i - sz) % n] - p[i - sz] : neg) <= 0 || true)
            && IntStream.range(0, 2 * sz).allMatch(i -> (t[2][i] = neg) <= 0)
            && ((BinaryOperator<long[]>) (x, y) -> new long[]{Math.max(x[0], y[0]), Math.max(x[1], y[1]), Math.max(Math.max(x[2], y[2]), x[1] + y[0])}) instanceof BinaryOperator<long[]> comb
            && IntStream.iterate(sz - 1, i -> i >= 1, i -> i - 1).allMatch(i -> comb.apply(new long[]{t[0][2 * i], t[1][2 * i], t[2][2 * i]}, new long[]{t[0][2 * i + 1], t[1][2 * i + 1], t[2][2 * i + 1]}) instanceof long[] c
                && (t[0][i] = c[0]) <= 0 | true && (t[1][i] = c[1]) <= 0 | true && (t[2][i] = c[2]) <= 0 | true)
            ? IntStream.range(0, m).mapToObj(q -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer a && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer b
                && (Integer) (a <= b ? b + 1 : b + 1) instanceof Integer lo && (Integer) (a <= b ? a + n - 1 : a - 1) instanceof Integer hi
                && new long[][]{{neg, neg, neg}, {neg, neg, neg}} instanceof long[][] acc && new int[]{lo + sz, hi + sz + 1} instanceof int[] lr
                && Stream.generate(() -> 0).takeWhile(z -> lr[0] < lr[1]).allMatch(z ->
                    ((lr[0] & 1) == 0 || (acc[0] = comb.apply(acc[0], new long[]{t[0][lr[0]], t[1][lr[0]], t[2][lr[0]]})) != null && ++lr[0] > 0)
                    && ((lr[1] & 1) == 0 || --lr[1] >= 0 && (acc[1] = comb.apply(new long[]{t[0][lr[1]], t[1][lr[1]], t[2][lr[1]]}, acc[1])) != null)
                    && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                ? String.valueOf(comb.apply(acc[0], acc[1])[2]) : "").collect(Collectors.joining("\n")) : "");
    }
}
