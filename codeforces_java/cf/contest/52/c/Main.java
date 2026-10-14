import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList()).ifPresent(L -> Optional.of(Integer.parseInt(L.get(0).trim())).ifPresent(n ->
            System.out.println(
                Arrays.stream(L.get(1).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] a
                && new long[4 * n] instanceof long[] mn
                && new long[4 * n] instanceof long[] ad
                && new AtomicReference<Function<int[], Long>>() instanceof AtomicReference<Function<int[], Long>> B
                && new AtomicReference<Function<int[], Long>>() instanceof AtomicReference<Function<int[], Long>> U
                && new AtomicReference<Function<int[], Long>>() instanceof AtomicReference<Function<int[], Long>> Q
                && B.getAndSet(x -> x[1] == x[2]
                    ? (mn[x[0]] = a[x[1]])
                    : (mn[x[0]] = Math.min(B.get().apply(new int[]{2 * x[0], x[1], (x[1] + x[2]) / 2}), B.get().apply(new int[]{2 * x[0] + 1, (x[1] + x[2]) / 2 + 1, x[2]})))) == null
                && U.getAndSet(x -> x[3] > x[2] || x[4] < x[1] ? 0L
                    : x[3] <= x[1] && x[2] <= x[4] ? (mn[x[0]] += x[5]) * 0 + (ad[x[0]] += x[5]) * 0
                    : U.get().apply(new int[]{2 * x[0], x[1], (x[1] + x[2]) / 2, x[3], x[4], x[5]})
                        + U.get().apply(new int[]{2 * x[0] + 1, (x[1] + x[2]) / 2 + 1, x[2], x[3], x[4], x[5]})
                        + (mn[x[0]] = Math.min(mn[2 * x[0]], mn[2 * x[0] + 1]) + ad[x[0]]) * 0) == null
                && Q.getAndSet(x -> x[3] > x[2] || x[4] < x[1] ? Long.MAX_VALUE / 4
                    : x[3] <= x[1] && x[2] <= x[4] ? mn[x[0]]
                    : Math.min(Q.get().apply(new int[]{2 * x[0], x[1], (x[1] + x[2]) / 2, x[3], x[4]}), Q.get().apply(new int[]{2 * x[0] + 1, (x[1] + x[2]) / 2 + 1, x[2], x[3], x[4]})) + ad[x[0]]) == null
                && B.get().apply(new int[]{1, 0, n - 1}) >= 0
                ? L.stream().skip(3).map(l -> l.trim().split("\\s+")).map(p ->
                    (Integer.parseInt(p[0]) <= Integer.parseInt(p[1])
                        ? new int[][]{{Integer.parseInt(p[0]), Integer.parseInt(p[1])}}
                        : new int[][]{{Integer.parseInt(p[0]), n - 1}, {0, Integer.parseInt(p[1])}}) instanceof int[][] rg
                    ? (p.length == 3
                        ? (Arrays.stream(rg).mapToLong(r -> U.get().apply(new int[]{1, 0, n - 1, r[0], r[1], Integer.parseInt(p[2])})).sum() == Long.MIN_VALUE ? "?" : "")
                        : String.valueOf(Arrays.stream(rg).mapToLong(r -> Q.get().apply(new int[]{1, 0, n - 1, r[0], r[1]})).min().getAsLong()))
                    : "").filter(r -> !r.isEmpty()).collect(Collectors.joining("\n"))
                : "")));
    }
}
