import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer q && Integer.valueOf(2 * q + 6) instanceof Integer N
            && new int[N] instanceof int[] dep && IntStream.range(0, 20).mapToObj(j -> new int[N]).toArray(int[][]::new) instanceof int[][] up
            && IntStream.rangeClosed(1, 4).allMatch(v -> (dep[v] = v == 1 ? 0 : 1) >= 0 && IntStream.range(0, 20).allMatch(j -> (up[j][v] = 1) > 0))
            && ((IntBinaryOperator) (c, p) -> (dep[c] = dep[p] + 1) + (up[0][c] = p) + IntStream.range(1, 20).map(j -> up[j][c] = up[j - 1][up[j - 1][c]]).sum()) instanceof IntBinaryOperator add
            && ((IntBinaryOperator) (a, b) -> (dep[a] >= dep[b] ? new int[]{a, b} : new int[]{b, a}) instanceof int[] hl
                && new int[]{IntStream.range(0, 20).reduce(hl[0], (x, j) -> ((dep[hl[0]] - dep[hl[1]]) >> j & 1) == 1 ? up[j][x] : x), hl[1]} instanceof int[] st
                && IntStream.iterate(19, j -> j >= 0, j -> j - 1).map(j -> st[0] != st[1] && up[j][st[0]] != up[j][st[1]] ? new int[]{st[0] = up[j][st[0]], st[1] = up[j][st[1]]}.length : 0).sum() >= 0
                ? dep[a] + dep[b] - 2 * dep[st[0] == st[1] ? st[0] : up[0][st[0]]] : -1) instanceof IntBinaryOperator dist
            && new int[]{2, 3, 2} instanceof int[] s && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, q).map(i -> add.applyAsInt(2 * i + 3, t[i]) + add.applyAsInt(2 * i + 4, t[i])
                + (Integer.valueOf(dist.applyAsInt(2 * i + 3, s[0])) instanceof Integer d1 && Integer.valueOf(dist.applyAsInt(2 * i + 3, s[1])) instanceof Integer d2
                    ? (d1 > s[2] && d1 >= d2 ? new int[]{s[1] = 2 * i + 3, s[2] = d1}.length : d2 > s[2] ? new int[]{s[0] = 2 * i + 3, s[2] = d2}.length : 0) : 0)
                + sb.append(s[2]).append('\n').length()).sum() >= 0
            ? sb.toString().trim() : "");
    }
}
