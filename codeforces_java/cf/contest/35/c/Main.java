import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && (Integer) (v[0] * v[1]) instanceof Integer nm
            && new int[nm] instanceof int[] vis
            && new int[nm] instanceof int[] queue
            && new int[]{0} instanceof int[] tail
            && IntStream.range(0, v[2]).map(i -> (v[3 + 2 * i] - 1) * v[1] + v[4 + 2 * i] - 1)
                .filter(c -> vis[c] == 0 && (vis[c] = 1) > 0 && (queue[tail[0]++] = c) >= 0).count() >= 0
            && IntStream.range(0, nm).filter(qi ->
                qi < tail[0]
                && (Integer) queue[qi] instanceof Integer id
                && (Integer) (id % v[1]) instanceof Integer col
                && ((id >= v[1] && vis[id - v[1]] == 0 && (vis[id - v[1]] = vis[id] + 1) > 0 && (queue[tail[0]++] = id - v[1]) >= 0)
                    | (id + v[1] < nm && vis[id + v[1]] == 0 && (vis[id + v[1]] = vis[id] + 1) > 0 && (queue[tail[0]++] = id + v[1]) >= 0)
                    | (col > 0 && vis[id - 1] == 0 && (vis[id - 1] = vis[id] + 1) > 0 && (queue[tail[0]++] = id - 1) >= 0)
                    | (col < v[1] - 1 && vis[id + 1] == 0 && (vis[id + 1] = vis[id] + 1) > 0 && (queue[tail[0]++] = id + 1) >= 0)) && false).count() >= 0
            && IntStream.range(0, nm).filter(i -> vis[i] == vis[queue[tail[0] - 1]]).boxed().min(Comparator.comparingInt(i -> Math.abs(i / v[1] - i % v[1]))).get() instanceof Integer r
            ? (r / v[1] + 1) + " " + (r % v[1] + 1)
            : "");
    }
}


