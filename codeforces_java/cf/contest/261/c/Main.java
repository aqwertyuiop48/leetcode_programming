import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Long.valueOf(it.nextLong()) instanceof Long n && Long.valueOf(it.nextLong()) instanceof Long t
            && new long[64][64] instanceof long[][] c
            && IntStream.range(0, 64).allMatch(i -> (c[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (c[i][j] = c[i - 1][j - 1] + c[i - 1][j]) >= 0))
            && new int[]{0} instanceof int[] ones && Long.valueOf(n + 1) instanceof Long N && Integer.valueOf(Long.numberOfTrailingZeros(t) + 1) instanceof Integer k
            ? Long.bitCount(t) != 1 ? 0 : IntStream.iterate(50, i -> i >= 0, i -> i - 1).mapToLong(i -> (N >> i & 1) == 1 ? (Integer.valueOf(k - ones[0]++) instanceof Integer d && d >= 0 && d <= i ? c[i][d] : 0L) : 0L).sum() + (Long.bitCount(N) == k ? 1 : 0) - (t == 1 ? 1 : 0) : "");
    }
}
