import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> new int[]{it.next(), it.next()}).collect(Collectors.groupingBy(p -> p[1], Collectors.collectingAndThen(Collectors.mapping(p -> n - p[0] + 1, Collectors.toList()), l -> l.stream().mapToInt(x -> x).sorted().toArray()))) instanceof Map<Integer, int[]> by
            && Integer.valueOf(Math.min(n, (int) Math.sqrt(6.0 * k) + 2)) instanceof Integer H && Integer.valueOf(1000000000) instanceof Integer INF
            && IntStream.rangeClosed(0, H).map(j -> j == 0 ? 0 : INF).toArray() instanceof int[] f0 && new int[][]{f0} instanceof int[][] st && new int[0] instanceof int[] none
            && IntStream.rangeClosed(1, n).allMatch(i -> st[0] instanceof int[] f && by.getOrDefault(i, none) instanceof int[] hv && new int[]{INF, 0} instanceof int[] sp
                && IntStream.rangeClosed(0, H).map(j -> Integer.valueOf(sp[0] = Math.min(sp[0], f[j])) instanceof Integer pm && Integer.valueOf(sp[1] += sp[1] < hv.length && hv[sp[1]] == j ? 1 : 0) instanceof Integer pp
                    ? Math.min(INF, Math.min(j == 0 ? Math.min(f[0], f[1]) : j < H ? f[j + 1] : INF, j >= 1 && j <= n - i + 1 ? j * (j + 1) / 2 + 2 + pm : INF) + 3 * (hv.length - pp)) : 0).toArray() instanceof int[] g
                && (st[0] = g) != null)
            ? Arrays.stream(st[0]).min().getAsInt() : "");
    }
}
