import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> it.next()).toArray()).toArray(int[][]::new) instanceof int[][] a
            && Arrays.stream(a).mapToInt(r -> Arrays.stream(r).sum()).toArray() instanceof int[] rs
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).map(i -> a[i][j]).sum()).toArray() instanceof int[] cs
            && new boolean[n + m] instanceof boolean[] fl
            && IntStream.generate(() -> IntStream.range(0, n + m).filter(k -> k < n ? rs[k] < 0 : cs[k - n] < 0).findFirst().orElse(-1)).takeWhile(c -> c >= 0)
                .allMatch(c -> (fl[c] ^= true) | true
                    && (c < n ? IntStream.range(0, m).allMatch(j -> (cs[j] -= 2 * a[c][j]) + (a[c][j] = -a[c][j]) != Integer.MIN_VALUE) && (rs[c] = -rs[c]) != Integer.MIN_VALUE
                        : IntStream.range(0, n).allMatch(i -> (rs[i] -= 2 * a[i][c - n]) + (a[i][c - n] = -a[i][c - n]) != Integer.MIN_VALUE) && (cs[c - n] = -cs[c - n]) != Integer.MIN_VALUE))
            ? IntStream.of(0, 1).mapToObj(h -> Integer.valueOf(h == 0 ? 0 : n) instanceof Integer o && Integer.valueOf(h == 0 ? n : m) instanceof Integer len
                && IntStream.range(0, len).filter(k -> fl[o + k]).boxed().toList() instanceof List<Integer> l ? l.size() + l.stream().map(k -> " " + (k + 1)).collect(Collectors.joining()) : "").collect(Collectors.joining("\n")) : "");
    }
}
