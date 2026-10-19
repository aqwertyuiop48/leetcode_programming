import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && new boolean[n][n] instanceof boolean[][] adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(s.nextInt() - 1) instanceof Integer a && Integer.valueOf(s.nextInt() - 1) instanceof Integer b && (a.equals(b) || (adj[a][b] = true) && (adj[b][a] = true)))
            && IntStream.range(0, n).map(v -> (int) IntStream.range(0, n).filter(u -> adj[v][u]).count()).toArray() instanceof int[] deg
            && IntStream.range(0, n).mapToObj(v -> IntStream.range(0, n).filter(u -> adj[v][u]).boxed().sorted(Comparator.<Integer>comparingInt(u -> deg[u]).thenComparingInt(u -> u)).mapToInt(u -> u).toArray()).toArray(int[][]::new) instanceof int[][] lst
            && IntStream.range(0, n).anyMatch(st -> Stream.iterate(new long[]{st, 1L << st},
                    x -> Integer.valueOf(Arrays.stream(lst[(int) x[0]]).filter(u -> (x[1] >> u & 1) == 0).findFirst().orElse(-1)) instanceof Integer u && u >= 0 ? new long[]{u, x[1] | 1L << u} : x).limit(n)
                .reduce((x, y) -> y).get()[1] == (1L << n) - 1)
            ? "Yes" : "No");
    }
}
