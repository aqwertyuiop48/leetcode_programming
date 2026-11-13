import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Long.valueOf(sc.nextLong()) instanceof Long m
            && Long.valueOf(sc.nextLong()) instanceof Long a && Long.valueOf(sc.nextLong()) instanceof Long b && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? m > 2L * k ? "1"
                : Integer.valueOf((int) (long) m) instanceof Integer mi && new long[k + 1] instanceof long[] fact && new long[k + 1] instanceof long[] invf
                    && new long[k + 1] instanceof long[] pw && new long[k + 1] instanceof long[] qw && new long[k + 1] instanceof long[] L && new long[k + 1] instanceof long[] CL
                    && Long.valueOf(a % 1000000007L * BigInteger.valueOf(b).modPow(BigInteger.valueOf(1000000005L), BigInteger.valueOf(1000000007L)).longValue() % 1000000007L) instanceof Long p
                    && Long.valueOf((1000000008L - p) % 1000000007L) instanceof Long q
                    && Long.valueOf(fact[0] = 1) != null && IntStream.rangeClosed(1, k).filter(i -> (fact[i] = fact[i - 1] * i % 1000000007L) < 0).count() >= 0
                    && Long.valueOf(invf[k] = BigInteger.valueOf(fact[k]).modPow(BigInteger.valueOf(1000000005L), BigInteger.valueOf(1000000007L)).longValue()) != null
                    && IntStream.range(0, k).filter(i -> (invf[k - 1 - i] = invf[k - i] * (k - i) % 1000000007L) < 0).count() >= 0
                    && Long.valueOf(pw[0] = 1) != null && Long.valueOf(qw[0] = 1) != null
                    && IntStream.rangeClosed(1, k).filter(i -> (pw[i] = pw[i - 1] * p % 1000000007L) + (qw[i] = qw[i - 1] * q % 1000000007L) < 0).count() >= 0
                    && IntStream.rangeClosed(0, k).filter(x -> (L[x] = fact[k] * invf[x] % 1000000007L * invf[k - x] % 1000000007L * pw[x] % 1000000007L * qw[k - x] % 1000000007L) < 0).count() >= 0
                    && IntStream.rangeClosed(0, k).filter(x -> (CL[x] = ((x == 0 ? 0 : CL[x - 1]) + L[x]) % 1000000007L) < 0).count() >= 0
                    && new long[2][mi + 2] instanceof long[][] pre && new long[3] instanceof long[] st && Long.valueOf(st[2] = 1) != null && Integer.valueOf(Math.max(1, mi - k)) instanceof Integer lo
                    && IntStream.range(0, n).filter(i -> Integer.valueOf(i & 1) instanceof Integer cur && Long.valueOf(st[0] = 0) != null && Long.valueOf(st[1] = 0) != null
                        && IntStream.rangeClosed(lo, mi).filter(r -> (pre[cur ^ 1][r] = st[1] = (st[1] + (L[mi - r]
                            * (((st[2] - pre[cur][mi - r] + 1000000007L) % 1000000007L * CL[Math.min(r - 1, k)] % 1000000007L - (st[0] = (st[0] + (r - 1 <= k ? L[r - 1] * pre[cur][r - 1] % 1000000007L : 0)) % 1000000007L) + 1000000007L) % 1000000007L)) % 1000000007L) % 1000000007L) < 0).count() >= 0
                        && Long.valueOf(st[2] = st[1]) != null).count() >= 0
                    ? st[2] : ""
            : "");
    }
}
