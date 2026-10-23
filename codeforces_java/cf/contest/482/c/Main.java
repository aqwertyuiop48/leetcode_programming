import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toArray(String[]::new) instanceof String[] s
            && (Integer) s[0].length() instanceof Integer m
            && new long[1 << m] instanceof long[] d
            && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j ->
                (d[IntStream.range(0, m).filter(p -> s[i].charAt(p) == s[j].charAt(p)).map(p -> 1 << p).sum()] |= (1L << i) | (1L << j)) > 0))
            && IntStream.range(0, m).allMatch(b -> IntStream.range(0, 1 << m).reduce(0, (u, mask) ->
                (mask & (1 << b)) == 0 && (d[mask] |= d[mask | (1 << b)]) < 0 ? 1 : 0) >= 0)
            && IntStream.rangeClosed(0, m).mapToDouble(c -> 1.0).toArray() instanceof double[] inv
            && IntStream.rangeClosed(1, m).allMatch(c -> (inv[c] = inv[c - 1] * (m - c + 1) / c) > 0)
            ? String.format(Locale.US, "%.15f", IntStream.range(0, 1 << m).mapToDouble(mask -> Long.bitCount(d[mask]) / inv[Integer.bitCount(mask)]).sum() / n) : "");
    }
}
