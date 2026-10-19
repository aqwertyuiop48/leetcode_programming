import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toList() instanceof List<String> g
            && new int[n + 1][m + 1] instanceof int[][] pre
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (pre[i + 1][j + 1] = pre[i][j + 1] + pre[i + 1][j] - pre[i][j] + (g.get(i).charAt(j) == '*' ? 1 : 0)) >= 0))
            && IntStream.range(0, 16).mapToObj(P -> IntStream.range(0, n).mapToObj(i -> new boolean[m] instanceof boolean[] row
                && IntStream.range(0, m).allMatch(j -> (row[j] = i + 1 < n && j + 1 < m && IntStream.range(0, 4).allMatch(q -> (g.get(i + q / 2).charAt(j + q % 2) == '*' ? 1 : 0) == (P >> q & 1))) | true) ? row : null).toArray(boolean[][]::new)).toArray(boolean[][][]::new) instanceof boolean[][][] lvl1
            ? (Long) IntStream.rangeClosed(2, 9).boxed().reduce(new Object[]{lvl1, 0L}, (st, k) -> 1 << k > Math.min(n, m) ? st : Integer.valueOf(1 << k) instanceof Integer s && Integer.valueOf(s / 2) instanceof Integer h
                && IntStream.range(0, 16).mapToObj(P -> IntStream.range(0, n).mapToObj(i -> new boolean[m] instanceof boolean[] row
                    && IntStream.range(0, m).allMatch(j -> (row[j] = i + s <= n && j + s <= m && IntStream.range(0, 4).allMatch(q -> (P >> q & 1) == 1
                        ? pre[i + q / 2 * h + h][j + q % 2 * h + h] - pre[i + q / 2 * h][j + q % 2 * h + h] - pre[i + q / 2 * h + h][j + q % 2 * h] + pre[i + q / 2 * h][j + q % 2 * h] == h * h
                        : ((boolean[][][]) st[0])[P][i + q / 2 * h][j + q % 2 * h])) | true) ? row : null).toArray(boolean[][]::new)).toArray(boolean[][][]::new) instanceof boolean[][][] nxt
                    ? new Object[]{nxt, (Long) st[1] + IntStream.range(0, n).mapToLong(i -> IntStream.range(0, m).filter(j -> IntStream.range(0, 16).anyMatch(P -> nxt[P][i][j])).count()).sum()} : st, (x, y) -> x)[1] : "");
    }
}
