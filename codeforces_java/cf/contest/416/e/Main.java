import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && new int[n][n] instanceof int[][] d
            && IntStream.range(0, n).allMatch(i -> Arrays.stream(new int[]{i}).allMatch(z -> IntStream.range(0, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000000000) >= 0)))
            && new int[m][3] instanceof int[][] e
            && IntStream.range(0, m).allMatch(i -> (e[i][0] = it.nextInt() - 1) >= 0 && (e[i][1] = it.nextInt() - 1) >= 0 && (e[i][2] = it.nextInt()) > 0
                && (d[e[i][0]][e[i][1]] = Math.min(d[e[i][0]][e[i][1]], e[i][2])) > 0 && (d[e[i][1]][e[i][0]] = d[e[i][0]][e[i][1]]) > 0)
            && IntStream.range(0, n).allMatch(k -> d[k] instanceof int[] dk && IntStream.range(0, n).allMatch(i -> d[i] instanceof int[] di && Integer.valueOf(di[k]) instanceof Integer dik
                && IntStream.range(0, n).allMatch(j -> (di[j] = Math.min(di[j], dik + dk[j])) >= 0)))
            && new int[n][n] instanceof int[][] cnt
            && IntStream.range(0, n).allMatch(s -> d[s] instanceof int[] ds && cnt[s] instanceof int[] cs && IntStream.range(0, m).allMatch(i ->
                (ds[e[i][0]] + e[i][2] != ds[e[i][1]] || ++cs[e[i][1]] > 0 || true) && (ds[e[i][1]] + e[i][2] != ds[e[i][0]] || ++cs[e[i][0]] > 0 || true)))
            ? IntStream.range(0, n).boxed().flatMap(s -> IntStream.range(s + 1, n).mapToObj(t -> d[s][t] >= 1000000000 ? 0
                : IntStream.range(0, n).filter(v -> d[s][v] + d[v][t] == d[s][t]).map(v -> cnt[s][v]).sum())).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
