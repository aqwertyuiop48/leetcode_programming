import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it
            && ((LongSupplier) () -> Long.parseLong(it.next())) instanceof LongSupplier nl
            && Long.valueOf(nl.getAsLong()) instanceof Long h
            && Integer.valueOf((int) nl.getAsLong()) instanceof Integer n && Integer.valueOf((int) nl.getAsLong()) instanceof Integer m && Integer.valueOf((int) nl.getAsLong()) instanceof Integer k
            && new long[n] instanceof long[] th && new long[n] instanceof long[] val
            && IntStream.range(0, n).allMatch(i -> (th[i] = nl.getAsLong()) > 0 && (val[i] = nl.getAsLong()) > Long.MIN_VALUE)
            && new long[k] instanceof long[] d && IntStream.range(0, k).allMatch(r -> (d[r] = Long.MAX_VALUE) > 0) && (d[1 % k] = 1) == 1
            && new int[m + 1] instanceof int[] J && new int[1] instanceof int[] jc
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
            && new TreeSet<Long>() instanceof TreeSet<Long> set && new boolean[n] instanceof boolean[] added
            && ((BiPredicate<Integer, Long>) (r, dist) -> d[r] <= dist || dist > h || ((d[r] = dist) > 0 && pq.add(dist << 14 | r))) instanceof BiPredicate<Integer, Long> relax
            && ((IntPredicate) z -> IntStream.generate(() -> 0).anyMatch(w -> pq.isEmpty()
                || (pq.poll() instanceof Long top && (top >> 14) == d[(int) (top & 16383)] && Integer.valueOf((int) (top & 16383)) instanceof Integer u
                    && IntStream.range(0, jc[0]).allMatch(j -> relax.test((int) ((u + J[j]) % k), (top >> 14) + J[j]) | true) && false))) instanceof IntPredicate dij
            && ((IntPredicate) x -> (J[jc[0]++] = x) > 0 && IntStream.range(0, k).allMatch(r -> d[r] == Long.MAX_VALUE || relax.test((r + x) % k, d[r] + x) || true) && dij.test(0)) instanceof IntPredicate addj
            && ((IntPredicate) z -> IntStream.range(0, n).filter(i -> !added[i] && d[(int) (th[i] % k)] <= th[i]).allMatch(i -> (added[i] = true) && set.add(val[i] << 20 | i))) instanceof IntPredicate scan
            && scan.test(0)
            ? IntStream.range(0, m).mapToObj(e -> Long.valueOf(nl.getAsLong()) instanceof Long t
                ? t == 1 ? addj.test((int) nl.getAsLong()) && scan.test(0) ? (String) null : (String) null
                : t == 2 ? Integer.valueOf((int) nl.getAsLong() - 1) instanceof Integer i && Long.valueOf(nl.getAsLong()) instanceof Long y
                    && (set.remove(val[i] << 20 | i) ? (val[i] -= y) > Long.MIN_VALUE && set.add(val[i] << 20 | i) : (val[i] -= y) > Long.MIN_VALUE) ? (String) null : (String) null
                : set.isEmpty() ? "0" : set.pollLast() instanceof Long top ? String.valueOf(top >> 20) : ""
                : "").filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
