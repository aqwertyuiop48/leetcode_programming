import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new boolean[v[0] * v[1]] instanceof boolean[] vis
            && Stream.iterate(
                IntStream.range(0, v[2]).map(i -> (v[3 + 2 * i] - 1) * v[1] + v[4 + 2 * i] - 1).filter(c -> !vis[c] && (vis[c] = true)).boxed().toList(),
                f -> !f.isEmpty(),
                f -> f.stream().flatMap(c -> Stream.of(c >= v[1] ? c - v[1] : -1, c + v[1] < v[0] * v[1] ? c + v[1] : -1, c % v[1] > 0 ? c - 1 : -1, c % v[1] < v[1] - 1 ? c + 1 : -1))
                    .filter(q -> q >= 0 && !vis[q] && (vis[q] = true)).toList())
                .reduce((a, b) -> b).get() instanceof List<Integer> last
            && last.stream().sorted().min(Comparator.comparingInt(c -> Math.abs(c / v[1] - c % v[1]))).get() instanceof Integer c
            ? (c / v[1] + 1) + " " + (c % v[1] + 1)
            : "");
    }
}



