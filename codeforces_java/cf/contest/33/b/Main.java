import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                sc.next() instanceof String a && sc.next() instanceof String b && (Integer) sc.nextInt() instanceof Integer n
                && new long[26][26] instanceof long[][] d
                && Arrays.stream(d).allMatch(row -> IntStream.range(0, 26).allMatch(j -> (row[j] = 1L << 40) > 0))
                && IntStream.range(0, 26).allMatch(i -> (d[i][i] = 0) == 0)
                && IntStream.range(0, n).allMatch(i -> (Integer) (sc.next().charAt(0) - 'a') instanceof Integer x
                    && (Integer) (sc.next().charAt(0) - 'a') instanceof Integer y
                    && (d[x][y] = Math.min(d[x][y], sc.nextLong())) >= 0)
                && IntStream.range(0, 26).allMatch(k -> IntStream.range(0, 26).allMatch(i -> IntStream.range(0, 26)
                    .allMatch(j -> (d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j])) >= 0)))
                ? a.length() != b.length() ? "-1"
                    : IntStream.range(0, a.length()).mapToObj(i -> IntStream.range(0, 26)
                        .mapToObj(c -> new long[]{d[a.charAt(i) - 'a'][c] + d[b.charAt(i) - 'a'][c], c})
                        .min(Comparator.comparingLong((long[] x) -> x[0]).thenComparingLong(x -> x[1])).get()).toList() instanceof List<long[]> best
                        && best.stream().allMatch(x -> x[0] < (1L << 39))
                    ? best.stream().mapToLong(x -> x[0]).sum() + "\n" + best.stream().map(x -> String.valueOf((char) ('a' + x[1]))).collect(Collectors.joining())
                    : "-1"
                : ""));
    }
}


