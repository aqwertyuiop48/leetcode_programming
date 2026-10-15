import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> ms
            && new int[]{0} instanceof int[] cur
            && IntStream.range(0, v[0]).boxed().flatMap(i -> Stream.of(new int[]{v[2 + 3 * i], v[1 + 3 * i], 1}, new int[]{v[3 + 3 * i], v[1 + 3 * i], -1}))
                .collect(Collectors.groupingBy(e -> e[0], TreeMap::new, Collectors.toList())).entrySet().stream()
                .flatMap(en -> en.getValue().stream().allMatch(e -> ms.merge(e[1], e[2], (a, b) -> a + b == 0 ? null : a + b) == null || true)
                    && Integer.valueOf(ms.isEmpty() ? 0 : ms.lastKey()) instanceof Integer q
                    && Integer.valueOf(cur[0]) instanceof Integer p
                    && (cur[0] = q) >= 0
                    ? (p.equals(q) ? Stream.<String>empty() : Stream.of(en.getKey() + " " + p, en.getKey() + " " + q))
                    : Stream.<String>empty())
                .toList() instanceof List<String> pts
            ? pts.size() + "\n" + String.join("\n", pts)
            : "");
    }
}


