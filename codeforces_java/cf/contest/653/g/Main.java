import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && Integer.valueOf(300000) instanceof Integer mx && new int[mx + 1] instanceof int[] freq
            && IntStream.range(0, n).filter(i -> ++freq[Integer.parseInt(tk.nextToken())] < 0).count() == 0
            && Long.valueOf(1000000007L) instanceof Long M
            && new long[n + 1] instanceof long[] fact && new long[n + 1] instanceof long[] invf && new long[n + 2] instanceof long[] pw
            && (fact[0] = 1) + (pw[0] = 1) > 0
            && IntStream.rangeClosed(1, n).filter(i -> (fact[i] = fact[i - 1] * i % M) + (pw[i] = pw[i - 1] * 2 % M) < 0).count() == 0
            && (invf[n] = BigInteger.valueOf(fact[n]).modInverse(BigInteger.valueOf(M)).longValue()) > 0
            && IntStream.range(0, n).filter(j -> (invf[n - 1 - j] = invf[n - j] * (n - j) % M) < 0).count() == 0
            && new long[n + 1] instanceof long[] p0 && new long[n + 1] instanceof long[] p1
            && IntStream.rangeClosed(0, n).filter(s -> Long.valueOf(fact[n] * invf[s] % M * invf[n - s] % M) instanceof Long cs
                && (p0[s] = ((s > 0 ? p0[s - 1] : 0) + cs) % M) + (p1[s] = ((s > 0 ? p1[s - 1] : 0) + cs * s) % M) < 0).count() == 0
            && Long.valueOf(pw[n]) instanceof Long t0 && Long.valueOf(n * pw[n - 1] % M) instanceof Long t1
            && new long[n + 1] instanceof long[] f
            && IntStream.rangeClosed(0, n).filter(c -> Integer.valueOf(n - c) instanceof Integer d
                && Long.valueOf(((t1 - p1[d]) - d * (t0 - p0[d] + M) % M + d * p0[d] % M - p1[d]) % M) instanceof Long g
                && (f[c] = ((t1 - (g + 3 * M) % M + M) % M) * 500000004L % M) < 0).count() == 0
            && new boolean[mx + 1] instanceof boolean[] comp
            ? IntStream.rangeClosed(2, mx).filter(p -> !comp[p] && IntStream.iterate((int) Math.min(mx + 1L, (long) p * p), q -> q <= mx, q -> q + p).filter(q -> (comp[q] = true) == false).count() == 0)
                .mapToLong(p -> LongStream.iterate(p, q -> q <= mx, q -> q * p).map(q -> f[IntStream.rangeClosed(1, (int) (mx / q)).map(i -> freq[(int) (i * q)]).sum()]).sum() % M).sum() % M : "");
    }
}
