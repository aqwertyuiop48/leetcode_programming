import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && tk.nextToken() instanceof String s && tk.nextToken() instanceof String t
            && ((LongBinaryOperator) (x, y) -> (Long) Math.multiplyHigh(x, y) instanceof Long hi && (Long) (x * y) instanceof Long lo ? ((lo & 2305843009213693951L) + ((lo >>> 61) | (hi << 3))) % 2305843009213693951L : 0L) instanceof LongBinaryOperator mul
            && new long[n + 1] instanceof long[] pw && (pw[0] = 1) > 0 && IntStream.rangeClosed(1, n).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], 1000003L)) > 0)
            && new long[26][n + 1] instanceof long[][] hs && new long[26][m + 1] instanceof long[][] ht
            && IntStream.range(0, 26).allMatch(c -> IntStream.range(0, n).allMatch(i -> (hs[c][i + 1] = (hs[c][i] + (s.charAt(i) - 'a' == c ? pw[i] : 0)) % 2305843009213693951L) >= 0)
                && IntStream.range(0, m).allMatch(i -> (ht[c][i + 1] = (ht[c][i] + (t.charAt(i) - 'a' == c ? pw[i] : 0)) % 2305843009213693951L) >= 0))
            && new int[26][n + 2] instanceof int[][] nx
            && IntStream.range(0, 26).allMatch(c -> (nx[c][n] = n) >= 0 && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (nx[c][i] = s.charAt(i) - 'a' == c ? i : nx[c][i + 1]) >= 0))
            ? IntStream.rangeClosed(0, n - m).filter(i -> IntStream.range(0, 26).allMatch(x -> nx[x][i] >= i + m
                || (Integer) (t.charAt(nx[x][i] - i) - 'a') instanceof Integer y
                && ((hs[x][i + m] - hs[x][i] + 2305843009213693951L) % 2305843009213693951L == mul.applyAsLong(pw[i], ht[y][m]))
                && (x == y || ((hs[y][i + m] - hs[y][i] + 2305843009213693951L) % 2305843009213693951L == mul.applyAsLong(pw[i], ht[x][m]))))).boxed().toList() instanceof List<Integer> r
                ? r.size() + "\n" + r.stream().map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "" : "");
    }
}
