import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Long.valueOf(it.nextLong()) instanceof Long x
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).sum()) instanceof Long s
            && Arrays.stream(a).map(v -> s - v).sorted().toArray() instanceof long[] e
            && new long[]{e[0], 0, 0} instanceof long[] st
            && IntStream.iterate(0, z -> st[2] < n && e[(int) st[2]] == st[0], z -> z + 1).allMatch(z -> (st[1] += st[2]++ >= 0 ? 1 : 0) > 0)
            && IntStream.iterate(0, z -> st[1] % x == 0, z -> z + 1).allMatch(z -> (st[1] /= x) > 0 && ++st[0] > 0
                && (IntStream.iterate(0, y -> st[2] < n && e[(int) st[2]] == st[0], y -> y + 1).allMatch(y -> (st[1] += st[2]++ >= 0 ? 1 : 0) > 0) | true))
            ? java.math.BigInteger.valueOf(x).modPow(java.math.BigInteger.valueOf(Math.min(st[0], s)), java.math.BigInteger.valueOf(1000000007L)) : "");
    }
}
