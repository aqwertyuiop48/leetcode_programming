import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Long.valueOf(it.next()) instanceof Long d
            && LongStream.concat(LongStream.of(0), LongStream.concat(LongStream.generate(it::next).limit(n - 2), LongStream.of(0))).toArray() instanceof long[] a
            && LongStream.generate(it::next).limit(2 * n).toArray() instanceof long[] c
            && IntStream.range(0, n).mapToObj(i -> LongStream.range(0, n).map(j -> i == j ? 0 : d * (Math.abs(c[2 * i] - c[2 * (int) j]) + Math.abs(c[2 * i + 1] - c[2 * (int) j + 1])) - a[(int) j]).toArray()).toArray(long[][]::new) instanceof long[][] w
            && IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (w[i][j] = Math.min(w[i][j], w[i][k] + w[k][j])) > Long.MIN_VALUE)))
            ? w[0][n - 1] : "");
    }
}
