import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && new int[]{0, 1, 1, 1, 0, -1, -1, -1} instanceof int[] DJ && new int[]{-1, -1, 0, 1, 1, 1, 0, -1} instanceof int[] DI0
            && new int[]{0, 1, 1, 1, 0, -1, -1, -1} instanceof int[] DI && new int[]{1, 1, 0, -1, -1, -1, 0, 1} instanceof int[] DJ2
            && new int[8][n][m] instanceof int[][][] cnt
            && IntStream.range(0, 8).allMatch(d -> IntStream.range(0, n).map(r -> DI[d] > 0 ? n - 1 - r : r).allMatch(i -> IntStream.range(0, m).map(c -> DJ2[d] > 0 ? m - 1 - c : c)
                .allMatch(j -> (cnt[d][i][j] = g[i].charAt(j) != '0' ? 0 : 1 + (i + DI[d] >= 0 && i + DI[d] < n && j + DJ2[d] >= 0 && j + DJ2[d] < m ? cnt[d][i + DI[d]][j + DJ2[d]] : 0)) >= 0)))
            && new int[][]{{0, 2, 3, 1}, {2, 4, 5, 1}, {4, 6, 7, 1}, {6, 0, 1, 1}, {7, 1, 2, 2}, {1, 3, 4, 2}, {3, 5, 6, 2}, {5, 7, 0, 2}} instanceof int[][] ori
            ? IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, m).boxed().flatMap(j -> Arrays.stream(ori).map(o -> new int[]{i, j, o[0], o[1], o[2], o[3]}))).mapToLong(q ->
                IntStream.rangeClosed(1, Math.min(cnt[q[2]][q[0]][q[1]], cnt[q[3]][q[0]][q[1]]) - 1).filter(L -> cnt[q[4]][q[0] + L * DI[q[2]]][q[1] + L * DJ2[q[2]]] >= q[5] * L + 1).count()).sum() : 0);
    }
}
