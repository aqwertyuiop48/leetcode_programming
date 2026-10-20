import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P && Integer.valueOf(1000001) instanceof Integer M
            && new long[M + 1] instanceof long[] bit && new long[M + 1] instanceof long[] f
            && ((IntToLongFunction) x -> IntStream.iterate(x, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bit[i]).sum() % P) instanceof IntToLongFunction query
            && IntStream.range(0, n).allMatch(z -> Integer.valueOf(it.nextInt()) instanceof Integer x && Long.valueOf(x * (1 + query.applyAsLong(x)) % P) instanceof Long v
                && IntStream.iterate(x, i -> i <= M, i -> i + (i & -i)).allMatch(i -> (bit[i] = ((bit[i] + v - f[x]) % P + P) % P) >= 0) && (f[x] = v) >= 0)
            ? String.valueOf(query.applyAsLong(M)) : "");
    }
}
