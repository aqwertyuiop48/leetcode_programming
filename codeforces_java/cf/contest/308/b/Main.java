import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> in
            && Arrays.stream(in.get(0).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer r && Integer.valueOf(h[2]) instanceof Integer c
            && in.get(1).trim().split("\\s+") instanceof String[] w
            && new long[n + 1] instanceof long[] q && IntStream.range(0, n).allMatch(i -> (q[i + 1] = q[i] + w[i].length() + 1) > 0)
            && IntStream.rangeClosed(0, n).map(i -> Integer.valueOf(Arrays.binarySearch(q, q[i] + c + 1)) instanceof Integer b ? (b >= 0 ? b : -b - 2) : 0).toArray() instanceof int[] nx
            && IntStream.range(0, 21).boxed().reduce(new int[][] {IntStream.rangeClosed(0, n).toArray(), nx},
                (st, b) -> new int[][] {(r >> b & 1) == 1 ? Arrays.stream(st[0]).map(i -> st[1][i]).toArray() : st[0], Arrays.stream(st[1]).map(i -> st[1][i]).toArray()}, (x, y) -> x) instanceof int[][] fin
            && IntStream.rangeClosed(0, n).boxed().max(Comparator.comparingInt((Integer i) -> fin[0][i] - i).thenComparing(Comparator.reverseOrder())).get() instanceof Integer best
            ? Stream.iterate(best, cur -> nx[cur]).takeWhile(cur -> nx[cur] > cur).limit(r).map(cur -> String.join(" ", Arrays.copyOfRange(w, cur, nx[cur]))).collect(Collectors.joining("\n")) : "");
    }
}
