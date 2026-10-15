import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().skip(1).filter(l -> !l.isBlank()).map(l -> l.trim().split(" ")).toList() instanceof List<String[]> ops
            && ops.stream().mapToInt(r -> Integer.parseInt(r[1])).distinct().sorted().toArray() instanceof int[] xs
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, xs.length - 1)) * 2) instanceof Integer N
            && IntStream.range(0, xs.length).mapToObj(i -> new TreeSet<Integer>()).toList() instanceof List<TreeSet<Integer>> sets
            && IntStream.generate(() -> -1).limit(2 * N).toArray() instanceof int[] tr
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> first
            && first.getAndSet(q -> q[2] < q[3] || tr[q[0]] <= q[4] ? -1
                : q[0] >= N ? q[0] - N
                : first.get().apply(new int[]{2 * q[0], q[1], q[2] - (q[2] - q[1] + 1) / 2, q[3], q[4]}) instanceof Integer r && r >= 0 ? r
                : first.get().apply(new int[]{2 * q[0] + 1, q[2] - (q[2] - q[1] + 1) / 2 + 1, q[2], q[3], q[4]})) == null
            ? ops.stream().map(r -> (Integer) Arrays.binarySearch(xs, Integer.parseInt(r[1])) instanceof Integer xi
                    && (Integer) Integer.parseInt(r[2]) instanceof Integer y
                ? r[0].equals("find")
                    ? first.get().apply(new int[]{1, 0, N - 1, xi + 1, y}) instanceof Integer idx && idx >= 0 && idx < xs.length
                        ? xs[idx] + " " + sets.get(idx).higher(y)
                        : "-1"
                    : (r[0].equals("add") ? sets.get(xi).add(y) : sets.get(xi).remove(y)) | true
                        && (tr[xi + N] = sets.get(xi).isEmpty() ? -1 : sets.get(xi).last()) >= -1
                        && IntStream.iterate((xi + N) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (tr[i] = Math.max(tr[2 * i], tr[2 * i + 1])) >= -1)
                        ? ""
                        : ""
                : "").filter(o -> !o.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}
