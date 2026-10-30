import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry(new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in, new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new Scanner(io.getKey()) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer v
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(j -> new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), j + 1}).toList() instanceof List<int[]> fr
            && IntStream.range(0, n).mapToObj(i -> fr.stream().filter(f -> f[0] <= i + 1 && i + 1 <= f[1]).sorted(Comparator.comparingInt((int[] f) -> f[2]).thenComparingInt(f -> f[3])).toList()).toList() instanceof List<List<int[]>> day
            && Integer.valueOf(Arrays.stream(a).max().getAsInt() + 1) instanceof Integer D
            && IntStream.range(0, n).mapToObj(i -> new int[day.get(i).size() + 1]).toArray(int[][]::new) instanceof int[][] pre
            && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(0, day.get(i).size()).allMatch(k -> (pre[i][k] = k == 0 ? v : pre[i][k - 1] + day.get(i).get(k - 1)[2]) > 0))
            && new int[n + 1][D] instanceof int[][] dp && new int[n + 1][D] instanceof int[][] par
            && Arrays.stream(dp).allMatch(r -> IntStream.range(0, D).allMatch(l -> (r[l] = -1) < 0))
            && (dp[0][0] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, D).filter(l -> dp[i][l] >= 0).allMatch(l -> IntStream.rangeClosed(0, day.get(i).size()).allMatch(k -> Integer.valueOf(pre[i][k]) instanceof Integer cost
                && (cost > l + a[i] || Integer.valueOf(a[i] - Math.max(0, cost - l)) instanceof Integer nl && (dp[i + 1][nl] >= dp[i][l] + k || (dp[i + 1][nl] = dp[i][l] + k) >= 0 && (par[i + 1][nl] = l * 1000 + k) >= 0)))))
            && Integer.valueOf(IntStream.range(0, D).boxed().max(Comparator.comparingInt(l -> dp[n][l])).get()) instanceof Integer bl
            && Stream.iterate(new int[]{n, bl}, s -> s[0] > 0, s -> new int[]{s[0] - 1, par[s[0]][s[1]] / 1000})
                .map(s -> par[s[0]][s[1]] % 1000 + day.get(s[0] - 1).stream().limit(par[s[0]][s[1]] % 1000).map(f -> " " + f[3]).collect(Collectors.joining()))
                .toList() instanceof List<String> ls
            ? dp[n][bl] + "\n" + IntStream.range(0, n).mapToObj(i -> ls.get(n - 1 - i)).collect(Collectors.joining("\n")) : ""));
    }
}
