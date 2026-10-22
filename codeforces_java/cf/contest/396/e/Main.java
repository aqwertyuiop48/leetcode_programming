import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(1000000) instanceof Integer N && Integer.valueOf((int) (long) it.next()) instanceof Integer n
            && new long[N + 1] instanceof long[] a && IntStream.range(0, n).allMatch(i -> Integer.valueOf((int) (long) it.next()) instanceof Integer p && (a[p] = it.next()) > 0)
            && Long.valueOf(it.next()) instanceof Long k
            && new int[N + 1] instanceof int[] spf
            && IntStream.rangeClosed(2, N).filter(i -> spf[i] == 0).allMatch(i -> IntStream.iterate(i, j -> j <= N, j -> j + i).filter(j -> spf[j] == 0).allMatch(j -> (spf[j] = i) > 0))
            && new HashMap<Integer, List<long[]>>() instanceof HashMap<Integer, List<long[]>> ev && new TreeMap<Integer, BigInteger>() instanceof TreeMap<Integer, BigInteger> res
            && IntStream.rangeClosed(2, N).map(i -> N + 2 - i).filter(q -> spf[q] == q && (a[q] > 0 || ev.containsKey(q))).allMatch(q ->
                new BigInteger[]{BigInteger.valueOf(a[q])} instanceof BigInteger[] eb && new long[2] instanceof long[] s && new ArrayList<long[]>() instanceof ArrayList<long[]> pres
                && ((BiPredicate<Long, Long>) (s0, e0) -> !pres.isEmpty() && pres.get(pres.size() - 1)[1] == s0 ? (pres.get(pres.size() - 1)[1] = e0) > 0 : pres.add(new long[]{s0, e0})) instanceof BiPredicate<Long, Long> addP
                && ((LongPredicate) len -> (s[1] == 0
                    ? eb[0].signum() <= 0 || (Long.valueOf(eb[0].min(BigInteger.valueOf(len)).longValueExact()) instanceof Long m && addP.test(s[0], s[0] + m) && (eb[0] = eb[0].subtract(BigInteger.valueOf(m))) != null)
                    : eb[0].signum() > 0
                        ? addP.test(s[0], s[0] + len) && (eb[0] = eb[0].add(BigInteger.valueOf(s[1] - 1).multiply(BigInteger.valueOf(len)))) != null
                        : (len < 2 || addP.test(s[0] + 1, s[0] + len)) && (eb[0] = BigInteger.valueOf(s[1] - 1).multiply(BigInteger.valueOf(len)).add(BigInteger.ONE)) != null)
                    && (s[0] += len) >= 0) instanceof LongPredicate adv
                && ev.getOrDefault(q, new ArrayList<>()).stream().sorted(Comparator.comparingLong(x -> x[0])).allMatch(x -> x[0] >= k || ((x[0] <= s[0] || adv.test(x[0] - s[0])) && (s[1] += x[1]) > Long.MIN_VALUE))
                && (s[0] >= k || adv.test(k - s[0]))
                && (eb[0].signum() <= 0 || res.put(q, eb[0]) == null)
                && pres.stream().allMatch(iv -> IntStream.iterate(q - 1, m -> m > 1, m -> m / spf[m]).map(m -> spf[m]).allMatch(f ->
                    ev.computeIfAbsent(f, z -> new ArrayList<>()).add(new long[]{iv[0], 1}) && ev.get(f).add(new long[]{iv[1], -1}))))
            ? res.size() + res.entrySet().stream().map(e -> "\n" + e.getKey() + " " + e.getValue()).collect(Collectors.joining()) : "");
    }
}
