import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer v
            && IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextToken())).toArray() instanceof int[] a
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m
            && IntStream.range(0, m).mapToObj(j -> new int[]{Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken()), j + 1}).toList() instanceof List<int[]> fr
            && IntStream.range(0, n).mapToObj(i -> fr.stream().filter(f -> f[0] <= i + 1 && i + 1 <= f[1]).sorted(Comparator.comparingInt((int[] f) -> f[2]).thenComparingInt(f -> f[3])).toList()).toList() instanceof List<List<int[]>> day
            && Integer.valueOf(Arrays.stream(a).max().getAsInt() + 1) instanceof Integer D
            && IntStream.range(0, n).mapToObj(i -> new int[day.get(i).size() + 1]).toArray(int[][]::new) instanceof int[][] pre
            && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(0, day.get(i).size()).allMatch(k -> (pre[i][k] = k == 0 ? v : pre[i][k - 1] + day.get(i).get(k - 1)[2]) > 0))
            && new int[n + 1][D] instanceof int[][] dp && new int[n + 1][D] instanceof int[][] par
            && Arrays.stream(dp).allMatch(r -> IntStream.range(0, D).allMatch(l -> (r[l] = -1) < 0))
            && (dp[0][0] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> dp[i] instanceof int[] cur && dp[i + 1] instanceof int[] nx && par[i + 1] instanceof int[] pr && pre[i] instanceof int[] p && Integer.valueOf(a[i]) instanceof Integer ai
                && new int[D + 1] instanceof int[] sv && new int[D + 1] instanceof int[] sl && (sv[D] = -1) < 0 && (sl[D] = -1) < 0
                && IntStream.iterate(D - 1, l -> l >= 0, l -> l - 1).allMatch(l -> cur[l] >= sv[l + 1] ? (sv[l] = cur[l]) >= -1 && (sl[l] = l) >= 0 : (sv[l] = sv[l + 1]) >= -1 && (sl[l] = sl[l + 1]) >= -1)
                && (IntStream.range(0, p.length).allMatch(k -> p[k] - ai < D
                    && (p[k] >= D || sv[p[k]] < 0 || nx[ai] >= sv[p[k]] + k || (nx[ai] = sv[p[k]] + k) >= 0 && (pr[ai] = sl[p[k]] * 1000 + k) >= 0)
                    && IntStream.range(Math.max(0, p[k] - ai), Math.min(p[k], D)).allMatch(l -> cur[l] <= sv[l + 1] || nx[l + ai - p[k]] >= cur[l] + k || (nx[l + ai - p[k]] = cur[l] + k) >= 0 && (pr[l + ai - p[k]] = l * 1000 + k) >= 0)) || true))
            && Integer.valueOf(IntStream.range(0, D).boxed().max(Comparator.comparingInt(l -> dp[n][l])).get()) instanceof Integer bl
            && Stream.iterate(new int[]{n, bl}, s -> s[0] > 0, s -> new int[]{s[0] - 1, par[s[0]][s[1]] / 1000})
                .map(s -> par[s[0]][s[1]] % 1000 + day.get(s[0] - 1).stream().limit(par[s[0]][s[1]] % 1000).map(f -> " " + f[3]).collect(Collectors.joining()))
                .toList() instanceof List<String> ls
            ? dp[n][bl] + "\n" + IntStream.range(0, n).mapToObj(i -> ls.get(n - 1 - i)).collect(Collectors.joining("\n")) : ""));
    }
}
