import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(q -> IntStream.generate(() -> Integer.parseInt(tk.nextToken())).limit(Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] sv
            && (Integer) Arrays.stream(sv).mapToInt(x -> x.length).sum() instanceof Integer T
            && IntStream.generate(() -> -1000000000).limit(m + 1).toArray() instanceof int[] init && (init[0] = 0) == 0
            && new int[][]{init} instanceof int[][] st && new int[]{0, 0, 0, 0} instanceof int[] rg
            && IntStream.range(0, n).allMatch(q -> (Integer) sv[q].length instanceof Integer L && (rg[3] = 0) == 0
                && IntStream.rangeClosed(0, L).map(i -> i == 0 ? 0 : (rg[3] += sv[q][i - 1])).toArray() instanceof int[] p
                && IntStream.rangeClosed(0, L).map(k -> IntStream.rangeClosed(0, k).map(l -> p[l] + p[L] - p[L - (k - l)]).max().getAsInt()).toArray() instanceof int[] bs
                && (Integer) (rg[2] + L) instanceof Integer so && (Integer) Math.min(m, so) instanceof Integer hi2 && (Integer) Math.max(0, m - (T - so)) instanceof Integer lo2
                && IntStream.generate(() -> -1000000000).limit(m + 1).toArray() instanceof int[] nd
                && IntStream.rangeClosed(0, L).map(k -> Math.max(lo2, rg[0] + k) > Math.min(hi2, rg[1] + k) ? 0
                    : IntStream.rangeClosed(Math.max(lo2, rg[0] + k), Math.min(hi2, rg[1] + k)).map(j -> nd[j] = Math.max(nd[j], st[0][j - k] + bs[k])).max().getAsInt()).sum() >= 0
                && (st[0] = nd) != null && (rg[0] = lo2) >= 0 && (rg[1] = hi2) >= 0 && (rg[2] = so) >= 0)
            ? st[0][m] : -1);
    }
}
