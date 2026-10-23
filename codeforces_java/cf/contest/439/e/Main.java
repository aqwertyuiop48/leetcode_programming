import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new long[100002] instanceof long[] f && new long[100002] instanceof long[] iv && (f[0] = 1) == 1 && IntStream.rangeClosed(1, 100001).allMatch(i -> (f[i] = f[i - 1] * i % 1000000007L) > 0)
            && (iv[100001] = java.math.BigInteger.valueOf(f[100001]).modInverse(java.math.BigInteger.valueOf(1000000007L)).longValue()) > 0
            && IntStream.rangeClosed(1, 100001).map(i -> 100002 - i).allMatch(i -> (iv[i - 1] = iv[i] * i % 1000000007L) > 0)
            && new int[100001] instanceof int[] mu && (mu[1] = 1) == 1
            && IntStream.rangeClosed(1, 100000).allMatch(d -> IntStream.iterate(2 * d, m -> m <= 100000, m -> m + d).allMatch(m -> (mu[m] -= mu[d]) > Integer.MIN_VALUE))
            && IntStream.rangeClosed(1, 100000).map(d -> mu[d] != 0 ? 100000 / d : 0).toArray() instanceof int[] dummy
            && new int[100001] instanceof int[] dc && IntStream.rangeClosed(1, 100000).filter(d -> mu[d] != 0).allMatch(d -> IntStream.iterate(d, m -> m <= 100000, m -> m + d).allMatch(m -> ++dc[m] > 0))
            && new int[100001][] instanceof int[][] dv && IntStream.rangeClosed(1, 100000).allMatch(m -> (dv[m] = new int[dc[m]]) != null) && new int[100001] instanceof int[] fill
            && IntStream.rangeClosed(1, 100000).filter(d -> mu[d] != 0).allMatch(d -> IntStream.iterate(d, m -> m <= 100000, m -> m + d).allMatch(m -> (dv[m][fill[m]++] = d) > 0))
            ? IntStream.range(0, q).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer fb
                ? String.valueOf((IntStream.of(dv[n]).filter(d -> n / d - 1 >= fb - 1).mapToLong(d -> mu[d] * (f[n / d - 1] * iv[fb - 1] % 1000000007L * iv[n / d - fb] % 1000000007L)).sum() % 1000000007L + 1000000007L) % 1000000007L) : "").collect(Collectors.joining("\n")) : "");
    }
}
