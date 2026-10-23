import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a && IntStream.range(0, m).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] b
            && ((java.util.function.LongUnaryOperator) x -> LongStream.of(a).filter(v -> v < x).map(v -> x - v).sum() + LongStream.of(b).filter(v -> v > x).map(v -> v - x).sum()) instanceof java.util.function.LongUnaryOperator f
            && new long[]{1, 1000000000L} instanceof long[] st
            && IntStream.range(0, 32).allMatch(i -> (Long) ((st[0] + st[1]) / 2) instanceof Long mid && (f.applyAsLong(mid) <= f.applyAsLong(mid + 1) ? (st[1] = mid) > 0 : (st[0] = mid + 1) > 0))
            ? f.applyAsLong(st[0]) : 0);
    }
}
