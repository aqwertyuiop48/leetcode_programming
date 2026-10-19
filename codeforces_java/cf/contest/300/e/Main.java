import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(t -> !t.isEmpty()).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(Arrays.stream(a).max().getAsInt()) instanceof Integer mx && Long.valueOf(Arrays.stream(a).asLongStream().sum()) instanceof Long S
            && new long[mx + 2] instanceof long[] need && new int[mx + 2] instanceof int[] spf
            && Arrays.stream(a).allMatch(x -> ++need[x] > 0)
            && IntStream.iterate(mx - 1, m -> m >= 1, m -> m - 1).allMatch(m -> (need[m] += need[m + 1]) >= 0)
            && IntStream.rangeClosed(2, mx).allMatch(i -> spf[i] != 0 || (spf[i] = i) > 0 && ((long) i * i > mx || IntStream.iterate(i * i, j -> j <= mx, j -> j + i).allMatch(j -> spf[j] != 0 || (spf[j] = i) > 0)))
            && IntStream.iterate(mx, m -> m >= 2, m -> m - 1).allMatch(m -> spf[m] == m || (need[spf[m]] += need[m]) >= 0 && (need[m / spf[m]] += need[m]) >= 0)
            && IntStream.rangeClosed(2, mx).filter(p -> spf[p] == p && need[p] > 0).toArray() instanceof int[] primes
            && new long[]{1, S} instanceof long[] lh
            && (IntStream.iterate(0, z -> lh[0] < lh[1], z -> z + 1).allMatch(z -> Long.valueOf((lh[0] + lh[1]) / 2) instanceof Long mid
                && (Arrays.stream(primes).allMatch(p -> LongStream.iterate(mid / p, t -> t > 0, t -> t / p).sum() >= need[p]) ? (lh[1] = mid) >= 0 : (lh[0] = mid + 1) >= 0)) || true)
            ? lh[0] : "");
    }
}
