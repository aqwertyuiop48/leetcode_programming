import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P
            && new long[40001] instanceof long[] f && IntStream.rangeClosed(0, 40000).allMatch(i -> (f[i] = i == 0 ? 1 : f[i - 1] * i % P) > 0)
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> map && new int[1] instanceof int[] rem
            && IntStream.range(0, n).allMatch(q -> (rem[0] = it.next()) > 0
                && IntStream.rangeClosed(2, 31623).takeWhile(d -> (long) d * d <= rem[0]).filter(d -> rem[0] % d == 0).allMatch(d -> map.merge(d, (int) IntStream.generate(() -> 0).takeWhile(z -> rem[0] % d == 0 && (rem[0] /= d) > 0).count(), Integer::sum) >= 0)
                && (rem[0] == 1 || map.merge(rem[0], 1, Integer::sum) > 0))
            ? map.values().stream().mapToLong(e -> f[e + n - 1] * BigInteger.valueOf(f[e]).modInverse(BigInteger.valueOf(P)).longValue() % P * BigInteger.valueOf(f[n - 1]).modInverse(BigInteger.valueOf(P)).longValue() % P).reduce(1L, (x, y) -> x * y % P) : "");
    }
}
