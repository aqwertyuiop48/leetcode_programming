import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).toArray() instanceof long[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long m && Integer.valueOf((int) t[2]) instanceof Integer k
            && new long[]{0, 1} instanceof long[] st
            && IntStream.range(0, k).allMatch(l -> Long.valueOf(BigInteger.valueOf(st[1]).gcd(BigInteger.valueOf(t[3 + l])).longValue()) instanceof Long g
                && Long.valueOf(Math.floorMod(-l - st[0], t[3 + l])) instanceof Long diff && diff % g == 0
                && Long.valueOf(BigInteger.valueOf(st[1] / g).modInverse(BigInteger.valueOf(t[3 + l] / g)).multiply(BigInteger.valueOf(diff / g)).mod(BigInteger.valueOf(t[3 + l] / g)).longValue()) instanceof Long u
                && Long.valueOf(BigInteger.valueOf(st[1] / g).multiply(BigInteger.valueOf(t[3 + l])).min(BigInteger.valueOf(n + 1)).longValue()) instanceof Long nm && nm <= n
                && (st[0] = st[0] + st[1] * u) >= 0 && (st[1] = nm) > 0)
            && Long.valueOf(st[0] == 0 ? st[1] : st[0]) instanceof Long j
            ? j + k - 1 <= m && IntStream.range(0, k).allMatch(l -> BigInteger.valueOf(st[1]).gcd(BigInteger.valueOf(j + l)).longValue() == t[3 + l]) ? "YES" : "NO" : "NO");
    }
}
