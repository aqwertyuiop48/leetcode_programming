import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> it.nextInt() == 1).count()) instanceof Integer k
            && new long[]{1, 1} instanceof long[] st
            && IntStream.rangeClosed(2, k).allMatch(i -> Long.valueOf((st[1] + (i - 1L) * st[0]) % P) instanceof Long nw && (st[0] = st[1]) >= 0 && (st[1] = nw) >= 0)
            ? String.valueOf(LongStream.rangeClosed(k + 1, n).reduce(st[1], (x, y) -> x * y % P)) : "");
    }
}
