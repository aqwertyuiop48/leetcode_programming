import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> tk[2 + i].chars().map(c -> c == '.' ? 0 : c == '+' ? 1 : 2).toArray()).toArray(int[][]::new) instanceof int[][] g
            && new int[]{0, 0, 1, 0, 0} instanceof int[] st && new long[1] instanceof long[] tt && new int[1] instanceof int[] fin
            && IntStream.iterate(0, z -> fin[0] == 0, z -> z + 1).allMatch(z -> st[0] == n - 1 ? (fin[0] = 1) > 0
                : g[st[0] + 1][st[1]] == 0 ? (tt[0]++) >= 0 && (st[0]++) >= 0 && (st[3] = st[1]) >= 0 && (st[4] = st[1]) >= 0
                : (tt[0] += Math.abs((st[2] > 0 ? st[4] : st[3]) - st[1])) >= 0 && (st[1] = st[2] > 0 ? st[4] : st[3]) >= 0
                    && Integer.valueOf(st[1] + st[2]) instanceof Integer nc
                    && (nc < 0 || nc >= m || g[st[0]][nc] == 2
                        ? Integer.valueOf(st[2] > 0 ? st[3] - 1 : st[4] + 1) instanceof Integer o && (o < 0 || o >= m || g[st[0]][o] == 2 ? (fin[0] = 2) > 0 : (tt[0]++) >= 0 && (st[2] = -st[2]) != 0)
                        : g[st[0]][nc] == 1 ? (g[st[0]][nc] = 0) == 0 && (tt[0]++) >= 0 && (st[2] = -st[2]) != 0
                        : (tt[0]++) >= 0 && (st[1] = nc) >= 0 && (st[2] > 0 ? (st[4] = nc) : (st[3] = nc)) >= 0))
            ? fin[0] == 2 ? "Never" : String.valueOf(tt[0]) : "");
    }
}
