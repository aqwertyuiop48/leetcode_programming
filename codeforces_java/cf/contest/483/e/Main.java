import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Stream.generate(sc::next).limit(n).toArray(String[]::new) instanceof String[] s
            && Integer.valueOf(s[0].length()) instanceof Integer m
            && new double[m + 1] instanceof double[] c
            && (c[0] = 1) > 0
            && IntStream.rangeClosed(1, m).allMatch(k -> (c[k] = c[k - 1] * (m - k + 1) / k) > 0)
            && new long[1 << m] instanceof long[] d
            && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j ->
                (Integer) IntStream.range(0, m).filter(p -> s[i].charAt(p) == s[j].charAt(p)).map(p -> 1 << p).sum() instanceof Integer mk
                && (d[mk] |= 1L << i | 1L << j) >= 0))
            && IntStream.range(0, m).allMatch(b -> IntStream.range(0, 1 << m - 1).allMatch(x ->
                (d[x >> b << b + 1 | x & (1 << b) - 1] |= d[x >> b << b + 1 | x & (1 << b) - 1 | 1 << b]) >= 0))
            ? String.format(Locale.US, "%.15f", IntStream.range(0, 1 << m).mapToDouble(mask -> Long.bitCount(d[mask]) / c[Integer.bitCount(mask)]).sum() / n)
            : "");
    }
}
