import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new int[]{v[1], 0, 0, 0} instanceof int[] st
            && new boolean[v[0]] instanceof boolean[] used
            && new ArrayList<String>() instanceof ArrayList<String> log
            && IntStream.iterate(0, t -> st[2] == 0, t -> t + 1).allMatch(t ->
                IntStream.range(0, v[0]).filter(i -> !used[i] && st[0] * 100 <= v[3 + 2 * i] * v[1]).boxed().max(Comparator.comparingInt(i -> v[4 + 2 * i])) instanceof Optional<Integer> o
                && (o.isEmpty() || (used[o.get()] = true) && (st[1] += v[4 + 2 * o.get()]) >= 0 && log.add(t + " " + (o.get() + 1)))
                && ((st[0] - st[1] + v[2] <= 0 && (st[2] = 1) > 0 && (st[3] = t + 1) > 0)
                    || (o.isEmpty() && st[1] <= v[2] && (st[2] = 2) > 0)
                    || (st[0] = Math.min(v[1], st[0] - st[1] + v[2])) >= Integer.MIN_VALUE))
            ? (st[2] == 1 ? "YES\n" + st[3] + " " + log.size() + "\n" + String.join("\n", log) : "NO")
            : "");
    }
}




