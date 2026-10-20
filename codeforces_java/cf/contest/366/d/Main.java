import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.next(), it.next(), it.next(), it.next()}).toArray(int[][]::new) instanceof int[][] es
            && IntStream.range(0, m).boxed().sorted((x, y) -> es[y][3] - es[x][3]).mapToInt(i -> i).toArray() instanceof int[] ord
            && new int[n + 1] instanceof int[] p && new int[]{0} instanceof int[] best
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> f
            && (f.getAndSet(x -> p[x] == x ? x : (p[x] = f.get().applyAsInt(p[x])))) == null
            && Arrays.stream(es).mapToInt(e -> e[2]).distinct().allMatch(L -> IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = i) > 0)
                && Arrays.stream(ord).filter(e -> es[e][2] <= L).takeWhile(e -> es[e][3] - L + 1 > best[0])
                    .filter(e -> (p[f.get().applyAsInt(es[e][0])] = f.get().applyAsInt(es[e][1])) >= 0 && f.get().applyAsInt(1) == f.get().applyAsInt(n))
                    .findFirst().stream().map(e -> best[0] = es[e][3] - L + 1).sum() >= 0)
            ? best[0] > 0 ? best[0] : "Nice work, Dima!" : "");
    }
}
