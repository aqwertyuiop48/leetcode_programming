import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer z && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(z.nextToken())).toArray() instanceof int[] a && Integer.valueOf(Arrays.stream(a).max().getAsInt()) instanceof Integer mx
            && new int[mx + 1] instanceof int[] cp && new boolean[mx + 1] instanceof boolean[] pres
            && IntStream.range(0, n).filter(i -> ++cp[a[i]] > 0 & (pres[a[i]] = true)).count() >= 0
            && IntStream.rangeClosed(1, mx).filter(v -> (cp[v] += cp[v - 1]) >= 0).count() >= 0
            ? IntStream.rangeClosed(1, mx).filter(x -> pres[x]).mapToLong(x -> IntStream.iterate(x, k -> k <= mx, k -> k + x).mapToLong(k -> (long) k * (cp[Math.min(k + x - 1, mx)] - cp[k - 1])).sum()).max().getAsLong() : 0L);
    }
}
