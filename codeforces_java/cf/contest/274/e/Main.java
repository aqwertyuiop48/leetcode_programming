import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k
            && new HashMap<Integer, TreeSet<Integer>>() instanceof HashMap<Integer, TreeSet<Integer>> d1 && new HashMap<Integer, TreeSet<Integer>>() instanceof HashMap<Integer, TreeSet<Integer>> d2
            && new HashSet<Long>() instanceof HashSet<Long> bl
            && ((BiPredicate<Integer, Integer>) (r, c) -> bl.add((long) r * (m + 2) + c) & d1.computeIfAbsent(r - c, x -> new TreeSet<>()).add(r) & d2.computeIfAbsent(r + c, x -> new TreeSet<>()).add(r) | true) instanceof BiPredicate<Integer, Integer> add
            && ((BiPredicate<Integer, Integer>) (r, c) -> bl.contains((long) r * (m + 2) + c)) instanceof BiPredicate<Integer, Integer> blk
            && IntStream.rangeClosed(0, n + 1).allMatch(r -> add.test(r, 0) && add.test(r, m + 1))
            && IntStream.rangeClosed(0, m + 1).allMatch(c -> add.test(0, c) && add.test(n + 1, c))
            && IntStream.range(0, k).allMatch(i -> add.test(Integer.valueOf(it.next()), Integer.valueOf(it.next())))
            && Integer.valueOf(it.next()) instanceof Integer sr && Integer.valueOf(it.next()) instanceof Integer sc && it.next() instanceof String dir
            && Integer.valueOf(dir.charAt(0) == 'N' ? -1 : 1) instanceof Integer dr && Integer.valueOf(dir.charAt(1) == 'W' ? -1 : 1) instanceof Integer dc
            && ((Function<int[], int[]>) q -> (q[2] == q[3] ? d1.get(q[0] - q[1]) : d2.get(q[0] + q[1])) instanceof TreeSet<Integer> ts
                && Integer.valueOf(q[2] > 0 ? ts.higher(q[0]) : ts.lower(q[0])) instanceof Integer R
                && Integer.valueOf(q[1] + (R - q[0]) * q[2] * q[3]) instanceof Integer C
                ? new int[]{R - q[2], C - q[3], R, C} : null) instanceof Function<int[], int[]> far
            && far.apply(new int[]{sr, sc, -dr, -dc}) instanceof int[] e0
            && new int[]{e0[0], e0[1], dr, dc} instanceof int[] st && new int[]{e0[0], e0[1], dr, dc} instanceof int[] start
            && new long[]{0} instanceof long[] tot && new boolean[]{false, false} instanceof boolean[] fl
            && (IntStream.iterate(0, z -> z + 1).allMatch(z -> far.apply(st) instanceof int[] f
                && (tot[0] += Math.abs(f[2] - st[0])) >= 0
                && Boolean.valueOf(blk.test(f[2], f[1])) instanceof Boolean ab && Boolean.valueOf(blk.test(f[0], f[3])) instanceof Boolean bb
                && (ab != bb || (fl[0] = true))
                && (ab == bb ? new int[]{f[0], f[1], -st[2], -st[3]} : ab ? new int[]{f[0], f[3], -st[2], st[3]} : new int[]{f[2], f[1], st[2], -st[3]}) instanceof int[] ns
                && IntStream.range(0, 4).allMatch(i -> (st[i] = ns[i]) != 99999999)
                && !Arrays.equals(st, start)) || true)
            ? fl[0] ? tot[0] / 2 : tot[0] : "");
    }
}
