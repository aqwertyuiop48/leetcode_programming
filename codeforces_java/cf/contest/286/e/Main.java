import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).sorted().toArray() instanceof int[] a
            && Long.valueOf(998244353L) instanceof Long MOD
            && Integer.valueOf(Integer.highestOneBit(2 * m) * 2) instanceof Integer N && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer LOG
            && new long[N] instanceof long[] f && Arrays.stream(a).allMatch(x -> (f[x] = 1) == 1)
            && new int[N] instanceof int[] rev && IntStream.range(1, N).allMatch(i -> (rev[i] = (rev[i >> 1] >> 1) | ((i & 1) << (LOG - 1))) >= 0)
            && new long[N] instanceof long[] rt
            && IntStream.iterate(1, h -> h < N, h -> h * 2).allMatch(h -> (rt[h] = 1) == 1 && Long.valueOf(java.math.BigInteger.valueOf(3).modPow(java.math.BigInteger.valueOf((MOD - 1) / (2L * h)), java.math.BigInteger.valueOf(MOD)).longValue()) instanceof Long base
                && IntStream.range(1, h).allMatch(j -> (rt[h + j] = rt[h + j - 1] * base % MOD) > 0))
            && new long[1] instanceof long[] tmp
            && ((Predicate<long[]>) arr -> IntStream.range(0, N).allMatch(i -> rev[i] <= i || (tmp[0] = arr[i]) >= 0 && (arr[i] = arr[rev[i]]) >= 0 && (arr[rev[i]] = tmp[0]) >= 0)
                && IntStream.iterate(1, h -> h < N, h -> h * 2).allMatch(h -> IntStream.range(0, N / 2).allMatch(b -> (tmp[0] = arr[(b / h) * 2 * h + b % h + h] * rt[h + b % h] % MOD) >= 0
                    && (arr[(b / h) * 2 * h + b % h + h] = (arr[(b / h) * 2 * h + b % h] - tmp[0] + MOD) % MOD) >= 0 && (arr[(b / h) * 2 * h + b % h] = (arr[(b / h) * 2 * h + b % h] + tmp[0]) % MOD) >= 0))) instanceof Predicate<long[]> ntt
            && ntt.test(f) && IntStream.range(0, N).allMatch(i -> (f[i] = f[i] * f[i] % MOD) >= 0) && ntt.test(f)
            && new boolean[m + 1] instanceof boolean[] inA && Arrays.stream(a).allMatch(x -> inA[x] = true)
            && IntStream.rangeClosed(1, m).allMatch(x -> f[(N - x) % N] == 0 || inA[x])
            ? Arrays.stream(a).filter(x -> f[(N - x) % N] == 0).boxed().toList() instanceof List<Integer> b ? "YES\n" + b.size() + "\n" + b.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "" : "NO");
    }
}

