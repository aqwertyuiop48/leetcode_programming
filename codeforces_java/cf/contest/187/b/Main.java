import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && Integer.valueOf(rd.getAsInt()) instanceof Integer r
            && IntStream.range(0, m).mapToObj(c -> IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> rd.getAsInt()).toArray()).toArray(int[][]::new)).toList() instanceof List<int[][]> cars
            && cars.stream().allMatch(d -> IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j])) >= 0))))
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> cars.stream().mapToInt(d -> d[i][j]).min().getAsInt()).toArray()).toArray(int[][]::new) instanceof int[][] base
            && new int[n + 1][][] instanceof int[][][] best
            && (best[0] = base) != null
            && IntStream.rangeClosed(1, n).allMatch(c -> (best[c] = IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> IntStream.range(0, n).map(k -> best[c - 1][i][k] + base[k][j]).min().getAsInt()).toArray()).toArray(int[][]::new)) != null)
            ? IntStream.range(0, r).mapToObj(q -> Integer.valueOf(rd.getAsInt() - 1) instanceof Integer s && Integer.valueOf(rd.getAsInt() - 1) instanceof Integer t && Integer.valueOf(Math.min(n, rd.getAsInt())) instanceof Integer k
                ? String.valueOf(best[k][s][t]) : "").collect(Collectors.joining("\n"))
            : "");
    }
}

