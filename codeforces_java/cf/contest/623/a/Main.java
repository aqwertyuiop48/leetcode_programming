import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer m
            && new boolean[n][n] instanceof boolean[][] adj
            && IntStream.range(0, m).filter(e -> Integer.valueOf(st.nextToken()) instanceof Integer u
                && Integer.valueOf(st.nextToken()) instanceof Integer w && (adj[u - 1][w - 1] = adj[w - 1][u - 1] = true)).count() >= 0
            && IntStream.range(0, n).map(i -> (int) IntStream.range(0, n).filter(j -> adj[i][j]).count()).toArray() instanceof int[] deg
            && Integer.valueOf(IntStream.range(0, n).filter(i -> deg[i] != n - 1).findFirst().orElse(-1)) instanceof Integer f
            && new char[n] instanceof char[] c
            && IntStream.range(0, n).filter(i -> (c[i] = deg[i] == n - 1 ? 'b' : (i == f || adj[f][i]) ? 'a' : 'c') < 0).count() >= 0
            ? IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j -> adj[i][j] == (Math.abs(c[i] - c[j]) <= 1)))
                ? "Yes\n" + new String(c) : "No" : "");
    }
}
