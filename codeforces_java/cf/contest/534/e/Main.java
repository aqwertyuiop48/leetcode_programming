import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] b
            && (Integer) (2 * (n - 1)) instanceof Integer period
            && new Random(88172645463325252L) instanceof Random rnd && LongStream.generate(rnd::nextLong).limit(n + 1).toArray() instanceof long[] w
            && ((java.util.function.IntUnaryOperator) x -> x % period < n ? x % period + 1 : 2 * n - 1 - x % period) instanceof java.util.function.IntUnaryOperator stop
            && new long[period + 1] instanceof long[] part && IntStream.range(0, period).allMatch(r -> (part[r + 1] = part[r] + Math.abs(a[stop.applyAsInt(r + 1) - 1] - a[stop.applyAsInt(r) - 1])) >= 0)
            && (Long) IntStream.of(b).mapToLong(x -> w[x]).sum() instanceof Long hb
            && new long[]{IntStream.range(0, m).mapToLong(x -> w[stop.applyAsInt(x)]).sum()} instanceof long[] h
            ? IntStream.range(0, period).mapToObj(j -> (Long) (h[0] == hb ? ((long) (j + m - 1) / period * part[period] + part[(j + m - 1) % period]) - ((long) j / period * part[period] + part[j % period]) : -1L) instanceof Long len
                && (h[0] += w[stop.applyAsInt(j + m)] - w[stop.applyAsInt(j)]) != 12345 ? len : -1L).filter(l -> l >= 0).distinct().toList() instanceof List<Long> ls
                ? ls.size() == 1 ? String.valueOf(ls.get(0)) : "-1" : "-1" : "");
    }
}
