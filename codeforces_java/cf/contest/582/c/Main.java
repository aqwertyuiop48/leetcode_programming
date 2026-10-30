import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && Arrays.copyOfRange(t, 1, n + 1) instanceof int[] a && new int[n] instanceof int[] g && IntStream.range(1, n).filter(d -> n % d == 0).map(d -> IntStream.iterate(d, x -> x < n, x -> x + d).map(x -> g[x] = d).max().getAsInt()).max().orElse(0) >= 0 ? IntStream.range(1, n).filter(d -> n % d == 0).mapToLong(d -> (Integer) (n / d) instanceof Integer m && new int[d] instanceof int[] mx && new int[1] instanceof int[] rr && IntStream.range(0, n).map(i -> (mx[rr[0]] = Math.max(mx[rr[0]], a[i])) * 0 + (rr[0] = rr[0] + 1 == d ? 0 : rr[0] + 1)).max().getAsInt() >= 0 && new int[m + 1] instanceof int[] cu && IntStream.range(1, m).map(u -> cu[u] = cu[u - 1] + (g[d * u] == d ? 1 : 0)).max().getAsInt() >= 0 && new long[m + 1] instanceof long[] P && IntStream.range(1, m + 1).mapToLong(j -> P[j] = P[j - 1] + cu[j - 1]).max().getAsLong() >= 0 && ((IntToLongFunction) L -> (Integer) (L / d) instanceof Integer q ? (long) d * P[q] + (long) (L - q * d + 1) * cu[q] : 0L) instanceof IntToLongFunction sf && new long[4] instanceof long[] st && new int[1] instanceof int[] r2 && IntStream.range(0, n).mapToLong(i -> (a[i] == mx[r2[0]] ? st[0]++ : (st[2] == 0 ? (st[1] = st[0]) + (st[2] = 1) : (st[3] += sf.applyAsLong((int) st[0]))) + (st[0] = 0)) * 0 + (r2[0] = r2[0] + 1 == d ? 0 : r2[0] + 1)).max().getAsLong() >= 0 ? (st[2] == 0 ? (long) n * cu[m - 1] : st[3] + sf.applyAsLong((int) (st[0] + st[1]))) : 0L).sum() : 0L);
    }
}
