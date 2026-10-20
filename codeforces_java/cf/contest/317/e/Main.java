import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && new long[]{it.nextLong(), it.nextLong(), it.nextLong(), it.nextLong()} instanceof long[] st && Integer.valueOf((int) it.nextLong()) instanceof Integer m
            && new long[m] instanceof long[] tx && new long[m] instanceof long[] ty && new HashSet<Long>() instanceof HashSet<Long> tr
            && ((LongBinaryOperator) (x, y) -> (x << 32) + y) instanceof LongBinaryOperator key
            && IntStream.range(0, m).allMatch(i -> (tx[i] = it.nextLong()) > Long.MIN_VALUE && (ty[i] = it.nextLong()) > Long.MIN_VALUE && tr.add(key.applyAsLong(tx[i], ty[i])))
            && new int[]{-1, 1, 0, 0} instanceof int[] DX && new int[]{0, 0, 1, -1} instanceof int[] DY && new StringBuilder() instanceof StringBuilder sb && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> q
            && ((IntPredicate) dir -> (st[0] += DX[dir]) > Long.MIN_VALUE && (st[1] += DY[dir]) > Long.MIN_VALUE && sb.append("LRUD".charAt(dir)) != null
                && (tr.contains(key.applyAsLong(st[2] + DX[dir], st[3] + DY[dir])) || ((st[2] += DX[dir]) > Long.MIN_VALUE && (st[3] += DY[dir]) > Long.MIN_VALUE && q.add(dir)))) instanceof IntPredicate step
            && ((Function<long[], int[]>) a -> Integer.valueOf((int) (a[2] * a[3])) instanceof Integer N && new int[N] instanceof int[] prev && IntStream.range(0, N).allMatch(i -> (prev[i] = -2) < 0)
                && new int[N] instanceof int[] qq && new int[]{0, 1} instanceof int[] qp && (prev[(int) ((a[5] - a[1]) * a[2] + a[4] - a[0])] = -1) == -1 && (qq[0] = (int) ((a[5] - a[1]) * a[2] + a[4] - a[0])) >= 0
                && IntStream.generate(() -> 0).anyMatch(z -> qp[0] >= qp[1] || (Integer.valueOf(qq[qp[0]++]) instanceof Integer u
                    && IntStream.range(0, 4).allMatch(d -> Long.valueOf(a[0] + u % a[2] + DX[d]) instanceof Long nx && Long.valueOf(a[1] + u / a[2] + DY[d]) instanceof Long ny
                        && (nx < a[0] || nx >= a[0] + a[2] || ny < a[1] || ny >= a[1] + a[3] || prev[(int) ((ny - a[1]) * a[2] + nx - a[0])] != -2 || tr.contains(key.applyAsLong(nx, ny))
                            || (a[8] == 1 && tr.contains(key.applyAsLong(nx - a[6], ny - a[7]))) || ((prev[(int) ((ny - a[1]) * a[2] + nx - a[0])] = d) >= 0 && (qq[qp[1]++] = (int) ((ny - a[1]) * a[2] + nx - a[0])) >= 0))) && false))
                ? prev : null) instanceof Function<long[], int[]> bfs
            && ((BiFunction<int[], long[], List<Integer>>) (prev, a) -> new ArrayList<Integer>() instanceof ArrayList<Integer> lst && new int[]{(int) ((a[5] - a[1]) * a[2] + a[4] - a[0])} instanceof int[] cur
                && IntStream.generate(() -> 0).anyMatch(z -> prev[cur[0]] == -1 || (lst.add(prev[cur[0]]) && (cur[0] -= DX[prev[cur[0]]] + DY[prev[cur[0]]] * (int) a[2]) > Integer.MIN_VALUE && false))
                ? lst : null) instanceof BiFunction<int[], long[], List<Integer>> trace
            && Integer.valueOf(205) instanceof Integer W && bfs.apply(new long[]{-102, -102, W, W, st[0], st[1], 0, 0, 0}) instanceof int[] prev0
            && Integer.valueOf((int) ((st[3] + 102) * W + st[2] + 102)) instanceof Integer sIdx
            ? prev0[sIdx] == -2 || m == 0 ? "-1"
                : new long[]{0} instanceof long[] stat && Boolean.valueOf(IntStream.range(0, W).anyMatch(i -> prev0[i] != -2 || prev0[(W - 1) * W + i] != -2 || prev0[i * W] != -2 || prev0[i * W + W - 1] != -2)) instanceof Boolean unb
                    && trace.apply(prev0, new long[]{-102, -102, W, W, st[2], st[3], 0, 0, 0}) instanceof List<Integer> back
                    && IntStream.range(0, back.size()).allMatch(i -> q.add(back.get(back.size() - 1 - i)))
                    && IntStream.generate(() -> 0).anyMatch(z -> st[0] == st[2] && st[1] == st[3] ? (stat[0] = 1) > 0 : sb.length() > 1000000 ? (stat[0] = 3) > 0
                        : unb && Math.max(Math.abs(st[0]), Math.abs(st[1])) > 100 && Math.max(Math.abs(st[2]), Math.abs(st[3])) > 100 ? (stat[0] = 2) > 0 : step.test(q.poll()) && false)
                    && stat[0] != 3
                    && (stat[0] == 1 || IntStream.range(0, 2).allMatch(axis -> Long.valueOf(axis == 0 ? st[2] - st[0] : st[3] - st[1]) instanceof Long d
                        && (d == 0 || (IntStream.range(0, m).boxed().sorted(Comparator.comparingLong(i -> (d > 0 ? 1 : -1) * (axis == 0 ? tx[i] : ty[i]))).findFirst().get() instanceof Integer ti
                            && Long.valueOf(axis == 0 ? tx[ti] + (d > 0 ? -1 : 1) : tx[ti]) instanceof Long gx && Long.valueOf(axis == 0 ? ty[ti] : ty[ti] + (d > 0 ? -1 : 1)) instanceof Long gy
                            && Long.valueOf(st[2] - st[0]) instanceof Long ox && Long.valueOf(st[3] - st[1]) instanceof Long oy
                            && Long.valueOf(LongStream.concat(LongStream.concat(Arrays.stream(tx), Arrays.stream(tx).map(v -> v + ox)), LongStream.of(st[2], gx)).min().getAsLong() - 2) instanceof Long lx
                            && Long.valueOf(LongStream.concat(LongStream.concat(Arrays.stream(tx), Arrays.stream(tx).map(v -> v + ox)), LongStream.of(st[2], gx)).max().getAsLong() + 2) instanceof Long hx
                            && Long.valueOf(LongStream.concat(LongStream.concat(Arrays.stream(ty), Arrays.stream(ty).map(v -> v + oy)), LongStream.of(st[3], gy)).min().getAsLong() - 2) instanceof Long ly
                            && Long.valueOf(LongStream.concat(LongStream.concat(Arrays.stream(ty), Arrays.stream(ty).map(v -> v + oy)), LongStream.of(st[3], gy)).max().getAsLong() + 2) instanceof Long hy
                            && bfs.apply(new long[]{lx, ly, hx - lx + 1, hy - ly + 1, st[2], st[3], ox, oy, 1}) instanceof int[] pv && pv[(int) ((gy - ly) * (hx - lx + 1) + gx - lx)] != -2
                            && trace.apply(pv, new long[]{lx, ly, hx - lx + 1, hy - ly + 1, gx, gy, ox, oy, 1, 0, 0, 0}) instanceof List<Integer> mv
                            && IntStream.range(0, mv.size()).allMatch(i -> step.test(mv.get(mv.size() - 1 - i)))
                            && LongStream.range(0, Math.abs(d)).allMatch(i -> step.test(axis == 0 ? d > 0 ? 1 : 0 : d > 0 ? 2 : 3))))))
                    ? sb.toString() : "-1"
            : "");
    }
}
