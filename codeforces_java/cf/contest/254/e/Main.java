
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer v
            && IntStream.concat(IntStream.of(0), IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextToken()))).toArray() instanceof int[] a
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m
            && IntStream.range(0, m).mapToObj(j -> new int[]{Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), j + 1}).toList() instanceof List<int[]> fr
            && IntStream.rangeClosed(1, n).mapToObj(i -> fr.stream().filter(f -> f[0] <= i && i <= f[1]).sorted(Comparator.comparingInt((int[] f) -> f[2]).thenComparingInt(f -> f[3])).toList()).toList() instanceof List<List<int[]>> day
            && IntStream.rangeClosed(0, n).mapToObj(i -> new int[i == 0 ? 1 : day.get(i - 1).size() + 1]).toArray(int[][]::new) instanceof int[][] T
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.range(0, T[i].length).allMatch(k -> (T[i][k] = k == 0 ? v : T[i][k - 1] + day.get(i - 1).get(k - 1)[2]) > 0))
            && new int[n + 1][402] instanceof int[][] dp
            && Arrays.stream(dp).allMatch(r -> IntStream.range(0, 402).allMatch(y -> (r[y] = -1000000000) < 0))
            && (dp[0][0] = 0) == 0
            && IntStream.rangeClosed(1, n).allMatch(i -> dp[i - 1] instanceof int[] cur && dp[i] instanceof int[] nx && T[i] instanceof int[] t && Integer.valueOf(a[i]) instanceof Integer ai && Integer.valueOf(a[i - 1]) instanceof Integer ap
                && Stream.of(0).peek(z -> IntStream.range(0, t.length).forEach(k -> IntStream.rangeClosed(Math.max(0, ai - t[k]), Math.min(ai, ai + ap - t[k])).forEach(y -> nx[y] = Math.max(nx[y], cur[y + t[k] - ai] + k)))).findFirst().isPresent()
                && IntStream.iterate(ai - 1, y -> y >= 0, y -> y - 1).allMatch(y -> (nx[y] = Math.max(nx[y], nx[y + 1])) > Integer.MIN_VALUE))
            && ((IntBinaryOperator) (i, y) -> IntStream.range(0, T[i].length).filter(k -> Math.max(0, y + T[i][k] - a[i]) <= a[i - 1] && k + dp[i - 1][Math.max(0, y + T[i][k] - a[i])] == dp[i][y]).findFirst().getAsInt()) instanceof IntBinaryOperator kOf
            && Stream.iterate(new int[]{n, 0, kOf.applyAsInt(n, 0)}, s -> s[0] > 0, s -> new int[]{s[0] - 1, Math.max(0, s[1] + T[s[0]][s[2]] - a[s[0]]), s[0] > 1 ? kOf.applyAsInt(s[0] - 1, Math.max(0, s[1] + T[s[0]][s[2]] - a[s[0]])) : 0})
                .map(s -> s[2] + day.get(s[0] - 1).stream().limit(s[2]).map(f -> " " + f[3]).collect(Collectors.joining()))
                .toList() instanceof List<String> ls
            ? dp[n][0] + "\n" + IntStream.range(0, n).mapToObj(i -> ls.get(n - 1 - i)).collect(Collectors.joining("\n")) : ""));
    }
}



