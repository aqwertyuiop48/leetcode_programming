import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> rd.getAsInt()).toArray() instanceof int[] a
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> pos
            && IntStream.range(0, m).allMatch(i -> pos.put(rd.getAsInt(), i) == null || true)
            && LongStream.concat(LongStream.of(0), IntStream.range(0, 2 * n - 1).mapToLong(i -> pos.containsKey(a[i % n]) && pos.containsKey(a[(i + 1) % n]) ? (pos.get(a[(i + 1) % n]) - pos.get(a[i % n]) + m) % m : m)).toArray() instanceof long[] pre
            && IntStream.range(1, 2 * n).allMatch(i -> (pre[i] += pre[i - 1]) >= 0)
            && new int[]{0} instanceof int[] rp
            ? IntStream.range(0, n).map(l -> pos.containsKey(a[l])
                    && Integer.valueOf(Math.min(l + n - 1, 2 * n - 1)) instanceof Integer hi
                    && Integer.valueOf(IntStream.iterate(Math.max(rp[0], l), x -> true, x -> x + 1).filter(x -> x + 1 > hi || pre[x + 1] - pre[l] > m - 1).findFirst().getAsInt()) instanceof Integer r
                    && (rp[0] = r) >= 0 ? r - l + 1 : 0).max().orElse(0)
            : 0);
    }
}
