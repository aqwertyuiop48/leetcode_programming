import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer v
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(j -> new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), j + 1}).toList() instanceof List<int[]> fr
            && IntStream.range(0, n).mapToObj(i -> fr.stream().filter(f -> f[0] <= i + 1 && i + 1 <= f[1]).sorted(Comparator.comparingInt((int[] f) -> f[2]).thenComparingInt(f -> f[3])).toList()).toList() instanceof List<List<int[]>> day
            && new int[n + 1][205] instanceof int[][] dp && new int[n + 1][205] instanceof int[][] par
            && Arrays.stream(dp).allMatch(r -> IntStream.range(0, 205).allMatch(l -> (r[l] = -1) < 0))
            && (dp[0][0] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, 205).filter(l -> dp[i][l] >= 0).allMatch(l -> IntStream.rangeClosed(0, day.get(i).size()).allMatch(k -> Integer.valueOf(v + day.get(i).stream().limit(k).mapToInt(f -> f[2]).sum()) instanceof Integer cost
                && (cost > l + a[i] || Integer.valueOf(a[i] - Math.max(0, cost - l)) instanceof Integer nl && (dp[i + 1][nl] >= dp[i][l] + k || (dp[i + 1][nl] = dp[i][l] + k) >= 0 && (par[i + 1][nl] = l * 1000 + k) >= 0)))))
            && Integer.valueOf(IntStream.range(0, 205).boxed().max(Comparator.comparingInt(l -> dp[n][l])).get()) instanceof Integer bl
            && Stream.iterate(new int[]{n, bl}, s -> s[0] > 0, s -> new int[]{s[0] - 1, par[s[0]][s[1]] / 1000})
                .map(s -> par[s[0]][s[1]] % 1000 + day.get(s[0] - 1).stream().limit(par[s[0]][s[1]] % 1000).map(f -> " " + f[3]).collect(Collectors.joining()))
                .toList() instanceof List<String> ls
            ? dp[n][bl] + "\n" + IntStream.range(0, n).mapToObj(i -> ls.get(n - 1 - i)).collect(Collectors.joining("\n")) : "");
    }
}
