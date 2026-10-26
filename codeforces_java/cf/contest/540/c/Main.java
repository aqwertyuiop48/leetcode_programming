import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && (Integer) (s.nextInt() - 1) instanceof Integer r1 && (Integer) (s.nextInt() - 1) instanceof Integer c1 && (Integer) (s.nextInt() - 1) instanceof Integer r2 && (Integer) (s.nextInt() - 1) instanceof Integer c2
            && new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}} instanceof int[][] dirs
            && (Integer) (int) Arrays.stream(dirs).filter(d -> r2 + d[0] >= 0 && r2 + d[0] < n && c2 + d[1] >= 0 && c2 + d[1] < m && g[r2 + d[0]][c2 + d[1]] == '.').count() instanceof Integer cnt
            && (Boolean) (Math.abs(r1 - r2) + Math.abs(c1 - c2) == 1) instanceof Boolean adj
            && (g[r1][c1] = 'S') == 'S'
            && new boolean[n][m] instanceof boolean[][] seen && new ArrayDeque<int[]>(List.of(new int[]{r1, c1})) instanceof ArrayDeque<int[]> q && (seen[r1][c1] = true)
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> Arrays.stream(dirs).allMatch(d -> u[0] + d[0] >= 0 && u[0] + d[0] < n && u[1] + d[1] >= 0 && u[1] + d[1] < m
                && !seen[u[0] + d[0]][u[1] + d[1]] && (g[u[0] + d[0]][u[1] + d[1]] == '.' || u[0] + d[0] == r2 && u[1] + d[1] == c2)
                ? (seen[u[0] + d[0]][u[1] + d[1]] = true) && q.add(new int[]{u[0] + d[0], u[1] + d[1]}) : true))
            ? r1 == r2 && c1 == c2 ? cnt >= 1 ? "YES" : "NO"
                : !seen[r2][c2] ? "NO" : g[r2][c2] == 'X' ? "YES" : cnt >= 2 || adj && cnt >= 1 ? "YES" : "NO" : "");
    }
}
