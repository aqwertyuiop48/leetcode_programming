import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(n + 2) instanceof Integer W && new long[4 * W * W] instanceof long[] T
            && ((Predicate<long[]>) u -> IntStream.iterate((int) u[0], i -> i <= n, i -> i + (i & -i)).allMatch(i -> IntStream.iterate((int) u[1], j -> j <= n, j -> j + (j & -j)).allMatch(j -> (T[(((int) u[0] & 1) * 2 + ((int) u[1] & 1)) * W * W + i * W + j] ^= u[2]) >= 0))) instanceof Predicate<long[]> upd
            && ((ToLongBiFunction<Integer, Integer>) (x, y) -> IntStream.iterate(x, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> IntStream.iterate(y, j -> j > 0, j -> j - (j & -j)).mapToLong(j -> T[((x & 1) * 2 + (y & 1)) * W * W + i * W + j]).reduce(0, (p, q) -> p ^ q)).reduce(0, (p, q) -> p ^ q)) instanceof ToLongBiFunction<Integer, Integer> qry
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf(it.next()) instanceof Integer t && Integer.valueOf(it.next()) instanceof Integer x0 && Integer.valueOf(it.next()) instanceof Integer y0 && Integer.valueOf(it.next()) instanceof Integer x1 && Integer.valueOf(it.next()) instanceof Integer y1
                ? (t == 1 ? String.valueOf(qry.applyAsLong(x1, y1) ^ qry.applyAsLong(x0 - 1, y1) ^ qry.applyAsLong(x1, y0 - 1) ^ qry.applyAsLong(x0 - 1, y0 - 1))
                    : Long.valueOf(it.next()) instanceof Long v && upd.test(new long[]{x0, y0, v}) && upd.test(new long[]{x0, y1 + 1, v}) && upd.test(new long[]{x1 + 1, y0, v}) && upd.test(new long[]{x1 + 1, y1 + 1, v}) ? "" : "") : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
