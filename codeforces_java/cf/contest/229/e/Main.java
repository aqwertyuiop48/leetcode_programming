import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> IntStream.range(0, Integer.parseInt(tk.nextToken())).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toList() instanceof List<int[]> ps
            && ps.stream().flatMapToInt(Arrays::stream).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Integer> all
            && (Integer) all.get(n - 1) instanceof Integer T
            && new double[1002][1002] instanceof double[][] C
            && IntStream.rangeClosed(0, 1001).allMatch(i -> (C[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = C[i - 1][j - 1] + C[i - 1][j]) >= 0))
            && IntStream.range(0, m).map(i -> (int) Arrays.stream(ps.get(i)).filter(x -> x > T).count()).toArray() instanceof int[] g
            && IntStream.range(0, m).map(i -> (int) Arrays.stream(ps.get(i)).filter(x -> x == T).count()).toArray() instanceof int[] e
            && (Integer) IntStream.range(0, m).map(i -> g[i]).sum() instanceof Integer G
            && (Integer) IntStream.range(0, m).map(i -> e[i]).sum() instanceof Integer E
            && (Integer) (n - G) instanceof Integer x
            && (Double) IntStream.range(0, m).filter(i -> e[i] == 0).mapToDouble(i -> 1.0 / C[ps.get(i).length][g[i]]).reduce(1.0, (u, v) -> u * v) instanceof Double p0
            && IntStream.range(0, m).filter(i -> e[i] == 1).boxed().reduce(IntStream.rangeClosed(0, x).mapToDouble(j -> j == 0 ? 1.0 : 0.0).toArray(),
                (dp, i) -> IntStream.rangeClosed(0, x).mapToDouble(j -> dp[j] / C[ps.get(i).length][g[i]] + (j > 0 ? dp[j - 1] / C[ps.get(i).length][g[i] + 1] : 0.0)).toArray(),
                (u, v) -> u) instanceof double[] dpf
            ? String.format(Locale.US, "%.12f", p0 * dpf[x] / C[E][x]) : "");
    }
}
