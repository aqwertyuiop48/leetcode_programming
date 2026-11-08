import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n && Long.valueOf(sc.nextLong()) instanceof Long k
            && Integer.valueOf((int) (k + 2)) instanceof Integer m
            && ((BiFunction<Long, Long, Long>) ((b, e) -> new long[]{1} instanceof long[] r
                && IntStream.range(0, 30).filter(bit -> (r[0] = r[0] * r[0] % 1000000007L * ((e >> (29 - bit) & 1) == 1 ? b : 1L) % 1000000007L) < 0).count() >= 0
                ? r[0] : 0L)) instanceof BiFunction<Long, Long, Long> pow
            && new long[m] instanceof long[] f && new int[m] instanceof int[] spf
            && IntStream.range(2, (int) Math.sqrt(m) + 2).filter(p -> p < m && spf[p] == 0
                && IntStream.iterate(p * p, j -> j < m, j -> j + p).filter(j -> spf[j] == 0 && (spf[j] = p) < 0).count() < 0).count() >= 0
            && (m > 1 ? (f[1] = 1) : 1) == 1
            && IntStream.range(2, m).filter(i -> (f[i] = spf[i] == 0 ? pow.apply((long) i, k) : f[spf[i]] * f[i / spf[i]] % 1000000007L) < 0).count() >= 0
            && IntStream.range(1, m).filter(i -> (f[i] = (f[i] + f[i - 1]) % 1000000007L) < 0).count() >= 0
            ? n < m ? f[(int) (long) n]
            : new long[m + 1] instanceof long[] pre && new long[m + 1] instanceof long[] suf
                && new long[m] instanceof long[] fa && new long[m] instanceof long[] ifa
                && (pre[0] = suf[m - 1] = fa[0] = 1) == 1
                && IntStream.range(0, m - 1).filter(i -> (pre[i + 1] = pre[i] * ((n - i) % 1000000007L) % 1000000007L) < 0).count() >= 0
                && IntStream.range(1, m).filter(t -> (suf[m - 1 - t] = suf[m - t] * ((n - (m - t)) % 1000000007L) % 1000000007L) < 0).count() >= 0
                && IntStream.range(1, m).filter(i -> (fa[i] = fa[i - 1] * i % 1000000007L) < 0).count() >= 0
                && (ifa[m - 1] = pow.apply(fa[m - 1], 1000000005L)) > 0
                && IntStream.range(1, m).filter(t -> (ifa[m - 1 - t] = ifa[m - t] * (m - t) % 1000000007L) < 0).count() >= 0
                ? (Object) IntStream.range(0, m).mapToLong(i -> Long.valueOf(f[i] * pre[i] % 1000000007L * suf[i] % 1000000007L * ifa[i] % 1000000007L * ifa[m - 1 - i] % 1000000007L) instanceof Long t
                    ? (m - 1 - i) % 2 == 1 ? (1000000007L - t) % 1000000007L : t : 0).reduce(0, (x, y) -> (x + y) % 1000000007L) : ""
            : "");
    }
}
