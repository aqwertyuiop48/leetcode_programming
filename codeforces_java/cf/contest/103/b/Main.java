import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && new boolean[n][n] instanceof boolean[][] adj && IntStream.range(0, m).mapToObj(i -> new int[] {s.nextInt() - 1, s.nextInt() - 1}).allMatch(e -> adj[e[0]][e[1]] = adj[e[1]][e[0]] = true) && new boolean[n] instanceof boolean[] vis && new int[n] instanceof int[] order && new int[] {1} instanceof int[] tail && (vis[0] = true) && IntStream.range(0, n).allMatch(i -> i >= tail[0] || IntStream.range(0, n).filter(v -> adj[order[i]][v] && !vis[v]).allMatch(v -> (vis[v] = true) && (order[tail[0]++] = v) >= 0)) && n == m && tail[0] == n ? "FHTAGN!" : "NO").ifPresent(System.out::println);
    }
}

