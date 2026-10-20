import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).map(i -> Integer.parseInt(it.next())).toArray() instanceof int[] a && Long.valueOf(1000000007) instanceof Long M
            && new long[n + 2] instanceof long[] f && (f[0] = 1) == 1 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (f[i] = f[i - 1] * i % M) > 0)
            && Integer.valueOf((int) Arrays.stream(a).filter(v -> v < 0).count()) instanceof Integer m
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> a[i] < 0 && Arrays.stream(a).noneMatch(v -> v == i + 1)).count()) instanceof Integer k
            && ((LongUnaryOperator) x -> java.math.BigInteger.valueOf(f[(int) x]).modInverse(java.math.BigInteger.valueOf(M)).longValue()) instanceof LongUnaryOperator inv
            ? Math.floorMod(LongStream.rangeClosed(0, k).map(i -> (i % 2 == 0 ? 1 : -1) * (f[k] * inv.applyAsLong(i) % M * inv.applyAsLong(k - i) % M * f[m - (int) i] % M)).sum(), M) : "");
    }
}
