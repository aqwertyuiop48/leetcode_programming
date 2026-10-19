import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new long[n + 1][2] instanceof long[][] p
            && IntStream.range(0, n).allMatch(i -> s.next() instanceof String d && Long.valueOf(s.nextLong()) instanceof Long l
                && (p[i + 1][0] = p[i][0] + (d.equals("R") ? l : d.equals("L") ? -l : 0)) > Long.MIN_VALUE && (p[i + 1][1] = p[i][1] + (d.equals("U") ? l : d.equals("D") ? -l : 0)) > Long.MIN_VALUE)
            && Arrays.stream(p).flatMapToLong(q -> LongStream.of(q[0], q[0] + 1)).boxed().collect(Collectors.toCollection(TreeSet::new)) instanceof TreeSet<Long> xt
            && Arrays.stream(p).flatMapToLong(q -> LongStream.of(q[1], q[1] + 1)).boxed().collect(Collectors.toCollection(TreeSet::new)) instanceof TreeSet<Long> yt
            && xt.add(xt.first() - 1) && xt.add(xt.last() + 1) && yt.add(yt.first() - 1) && yt.add(yt.last() + 1)
            && xt.stream().mapToLong(Long::longValue).toArray() instanceof long[] xs && yt.stream().mapToLong(Long::longValue).toArray() instanceof long[] ys
            && Integer.valueOf(xs.length - 1) instanceof Integer W && Integer.valueOf(ys.length - 1) instanceof Integer H
            && new boolean[W * H] instanceof boolean[] wall
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(Math.min(p[i][0], p[i + 1][0])) instanceof Long xa && Long.valueOf(Math.max(p[i][0], p[i + 1][0]) + 1) instanceof Long xb
                && Long.valueOf(Math.min(p[i][1], p[i + 1][1])) instanceof Long ya && Long.valueOf(Math.max(p[i][1], p[i + 1][1]) + 1) instanceof Long yb
                && IntStream.range(Arrays.binarySearch(xs, xa), Arrays.binarySearch(xs, xb)).allMatch(cx -> IntStream.range(Arrays.binarySearch(ys, ya), Arrays.binarySearch(ys, yb)).allMatch(cy -> (wall[cy * W + cx] = true))))
            && new boolean[W * H] instanceof boolean[] seen && new int[W * H] instanceof int[] q && new int[]{0, 1} instanceof int[] ht && (q[0] = 0) == 0 && (seen[0] = true)
            && IntStream.iterate(0, x -> ht[0] < ht[1], x -> x + 1).allMatch(x -> Integer.valueOf(q[ht[0]++]) instanceof Integer v
                && IntStream.range(0, 4).allMatch(d -> Integer.valueOf(v % W + (d == 0 ? 1 : d == 1 ? -1 : 0)) instanceof Integer cx && Integer.valueOf(v / W + (d == 2 ? 1 : d == 3 ? -1 : 0)) instanceof Integer cy
                    ? cx < 0 || cx >= W || cy < 0 || cy >= H || wall[cy * W + cx] || seen[cy * W + cx] || ((seen[cy * W + cx] = true) && (q[ht[1]++] = cy * W + cx) >= 0) : true))
            ? (xs[W] - xs[0]) * (ys[H] - ys[0]) - IntStream.range(0, W * H).filter(v -> seen[v]).mapToLong(v -> (xs[v % W + 1] - xs[v % W]) * (ys[v / W + 1] - ys[v / W])).sum() : "");
    }
}
