import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && st.nextToken() instanceof String s1 && st.nextToken() instanceof String s2 && st.nextToken() instanceof String v && Integer.valueOf(s1.length()) instanceof Integer n1 && Integer.valueOf(s2.length()) instanceof Integer n2 && Integer.valueOf(v.length()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(k -> IntStream.range(0, 26).map(c -> IntStream.rangeClosed(0, Math.min(m, k + 1)).filter(l -> (v.substring(0, k) + (char) ('A' + c)).endsWith(v.substring(0, l))).max().getAsInt()).toArray()).toArray(int[][]::new) instanceof int[][] go
            && new int[n1 + 1][n2 + 1][m] instanceof int[][][] f
            && IntStream.iterate(n1 - 1, i -> i >= 0, i -> i - 1).map(i -> IntStream.iterate(n2 - 1, j -> j >= 0, j -> j - 1).map(j -> IntStream.range(0, m).map(k -> f[i][j][k] = Math.max(Math.max(f[i + 1][j][k], f[i][j + 1][k]), s1.charAt(i) == s2.charAt(j) && go[k][s1.charAt(i) - 'A'] < m ? 1 + f[i + 1][j + 1][go[k][s1.charAt(i) - 'A']] : 0)).sum()).sum()).sum() >= 0
            && (Function<int[], int[]>) (s -> s1.charAt(s[0]) == s2.charAt(s[1]) && go[s[2]][s1.charAt(s[0]) - 'A'] < m && f[s[0]][s[1]][s[2]] == 1 + f[s[0] + 1][s[1] + 1][go[s[2]][s1.charAt(s[0]) - 'A']] ? new int[] {s[0] + 1, s[1] + 1, go[s[2]][s1.charAt(s[0]) - 'A']} : f[s[0]][s[1] + 1][s[2]] == f[s[0]][s[1]][s[2]] ? new int[] {s[0], s[1] + 1, s[2]} : new int[] {s[0] + 1, s[1], s[2]}) instanceof Function<int[], int[]> nx)
            System.out.print(f[0][0][0] == 0 ? "0" : Stream.iterate(new int[] {0, 0, 0}, s -> f[s[0]][s[1]][s[2]] > 0, nx::apply).map(s -> nx.apply(s) instanceof int[] t && t[0] == s[0] + 1 && t[1] == s[1] + 1 ? String.valueOf(s1.charAt(s[0])) : "").collect(Collectors.joining()));
    }
}
