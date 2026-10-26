import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer m && (Integer) (n * m) instanceof Integer nm
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toList() instanceof List<String> g
            && new int[n + 1][m + 1] instanceof int[][] pre
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (pre[i + 1][j + 1] = pre[i][j + 1] + pre[i + 1][j] - pre[i][j] + (g.get(i).charAt(j) == '*' ? 1 : 0)) >= 0))
            && new boolean[2][16 * nm] instanceof boolean[][] bufs
            && IntStream.range(0, 16 * nm).allMatch(t -> (Integer) (t / nm) instanceof Integer P && (Integer) ((t % nm) / m) instanceof Integer i && (Integer) (t % m) instanceof Integer j
                && ((bufs[1][t] = i + 1 < n && j + 1 < m && (g.get(i).charAt(j) == '*' ? 1 : 0) == (P & 1) && (g.get(i).charAt(j + 1) == '*' ? 1 : 0) == (P >> 1 & 1)
                    && (g.get(i + 1).charAt(j) == '*' ? 1 : 0) == (P >> 2 & 1) && (g.get(i + 1).charAt(j + 1) == '*' ? 1 : 0) == (P >> 3 & 1)) || true))
            ? IntStream.rangeClosed(2, 9).filter(k -> (1 << k) <= Math.min(n, m)).mapToLong(k -> (Integer) (1 << k) instanceof Integer s && (Integer) (s / 2) instanceof Integer h
                && bufs[k & 1] instanceof boolean[] cur && bufs[(k - 1) & 1] instanceof boolean[] prev
                && IntStream.range(0, 16 * nm).allMatch(t -> (Integer) (t / nm) instanceof Integer P && (Integer) ((t % nm) / m) instanceof Integer i && (Integer) (t % m) instanceof Integer j
                    && ((cur[t] = i + s <= n && j + s <= m && ((P >> 0 & 1) == 1 ? pre[i + 0 * h + h][j + 0 * h + h] - pre[i + 0 * h][j + 0 * h + h] - pre[i + 0 * h + h][j + 0 * h] + pre[i + 0 * h][j + 0 * h] == h * h : prev[P * nm + (i + 0 * h) * m + j + 0 * h]) && ((P >> 1 & 1) == 1 ? pre[i + 0 * h + h][j + 1 * h + h] - pre[i + 0 * h][j + 1 * h + h] - pre[i + 0 * h + h][j + 1 * h] + pre[i + 0 * h][j + 1 * h] == h * h : prev[P * nm + (i + 0 * h) * m + j + 1 * h]) && ((P >> 2 & 1) == 1 ? pre[i + 1 * h + h][j + 0 * h + h] - pre[i + 1 * h][j + 0 * h + h] - pre[i + 1 * h + h][j + 0 * h] + pre[i + 1 * h][j + 0 * h] == h * h : prev[P * nm + (i + 1 * h) * m + j + 0 * h]) && ((P >> 3 & 1) == 1 ? pre[i + 1 * h + h][j + 1 * h + h] - pre[i + 1 * h][j + 1 * h + h] - pre[i + 1 * h + h][j + 1 * h] + pre[i + 1 * h][j + 1 * h] == h * h : prev[P * nm + (i + 1 * h) * m + j + 1 * h])) || true))
                ? IntStream.range(0, nm).filter(t -> IntStream.range(0, 16).anyMatch(P -> cur[P * nm + t])).count() : 0L).sum() : 0);
    }
}
