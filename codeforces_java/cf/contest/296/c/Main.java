import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(t -> !t.isEmpty()).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Integer.valueOf((int) it.nextLong()) instanceof Integer k
            && LongStream.range(0, n).map(i -> it.nextLong()).toArray() instanceof long[] a
            && LongStream.range(0, m).mapToObj(i -> new long[]{it.nextLong() - 1, it.nextLong() - 1, it.nextLong()}).toList() instanceof List<long[]> ops
            && new long[m + 2] instanceof long[] c && IntStream.range(0, k).allMatch(i -> Integer.valueOf((int) it.nextLong() - 1) instanceof Integer x && Integer.valueOf((int) it.nextLong() - 1) instanceof Integer y && ++c[x] > 0 && --c[y + 1] < 100000000)
            && new long[n + 2] instanceof long[] d && new long[]{0} instanceof long[] run
            && IntStream.range(0, m).allMatch(i -> (run[0] += c[i]) >= 0 && (d[(int) ops.get(i)[0]] += run[0] * ops.get(i)[2]) > Long.MIN_VALUE && (d[(int) ops.get(i)[1] + 1] -= run[0] * ops.get(i)[2]) < Long.MAX_VALUE)
            && new long[]{0} instanceof long[] acc
            ? IntStream.range(0, n).mapToObj(i -> "" + (a[i] + (acc[0] += d[i]))).collect(Collectors.joining(" ")) : "");
    }
}

