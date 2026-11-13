import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(sc.nextInt()) instanceof Integer bud
            && IntStream.range(0, m).map(q -> sc.nextInt()).toArray() instanceof int[] p
            && new int[n][m] instanceof int[][] w
            && IntStream.range(0, n).filter(i -> IntStream.range(0, sc.nextInt()).filter(q -> (w[i][sc.nextInt() - 1] += sc.nextInt()) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, n).map(i -> Arrays.stream(w[i]).sum()).toArray() instanceof int[] S
            && IntStream.range(0, m).map(j -> IntStream.range(0, n).map(i -> w[i][j]).sum()).toArray() instanceof int[] L
            && Long.valueOf(LongStream.range(0, 1L << m)
                .filter(ms -> IntStream.range(0, m).filter(j -> (ms >> j & 1) == 1).map(j -> p[j]).asLongStream().sum() <= bud)
                .map(ms -> (((long) Math.max(Arrays.stream(S).max().getAsInt(), IntStream.range(0, m).map(j -> (ms >> j & 1) == 1 ? (L[j] + 1) / 2 : L[j]).max().getAsInt()) << 20
                    | IntStream.range(0, m).filter(j -> (ms >> j & 1) == 1).map(j -> p[j]).sum()) << 10) | ms)
                .min().getAsLong()) instanceof Long key
            && Integer.valueOf((int) (key & 1023)) instanceof Integer mask && Integer.valueOf((int) (key >> 30)) instanceof Integer T
            && Integer.valueOf(m + Integer.bitCount(mask)) instanceof Integer Mp && Integer.valueOf(n + Mp) instanceof Integer N
            && IntStream.range(0, m).map(j -> j + Integer.bitCount(mask & ((1 << j) - 1))).toArray() instanceof int[] base
            && new int[Mp] instanceof int[] oc
            && IntStream.range(0, m).filter(j -> (oc[base[j]] = j) + ((mask >> j & 1) == 1 ? (oc[base[j] + 1] = j) : 0) >= 0).count() >= 0
            && new int[N][N] instanceof int[][] a
            && IntStream.range(0, n).filter(i -> IntStream.range(0, m).filter(j -> (mask >> j & 1) == 1
                    ? (a[i][base[j]] = Math.max(0, Math.min(w[i][j], T - IntStream.range(0, i).map(k -> w[k][j]).sum()))) + (a[i][base[j] + 1] = w[i][j] - a[i][base[j]]) >= 0
                    : (a[i][base[j]] = w[i][j]) >= 0).count() >= 0
                && (a[i][Mp + i] = T - S[i]) >= 0).count() >= 0
            && IntStream.range(0, Mp).filter(c -> (a[n + c][c] = T - IntStream.range(0, n).map(i -> a[i][c]).sum()) >= 0
                && IntStream.range(0, n).filter(i -> (a[n + c][Mp + i] = a[i][c]) >= 0).count() >= 0).count() >= 0
            && new int[N] instanceof int[] mr && new int[N] instanceof int[] mc && new int[N] instanceof int[] vis
            && IntStream.range(0, N).filter(i -> (mr[i] = -1) + (mc[i] = -1) > 0).count() == 0
            && new int[]{0, 0, 0} instanceof int[] st
            && new IntPredicate[1] instanceof IntPredicate[] dfs
            && ((dfs[0] = u -> IntStream.range(0, N).anyMatch(v -> a[u][v] > 0 && vis[v] != st[0] && (vis[v] = st[0]) >= 0
                && (mc[v] < 0 || dfs[0].test(mc[v])) && (mc[v] = u) >= 0 && (mr[u] = v) >= 0)) != null)
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.iterate(0, it -> st[1] < T, it -> it + 1).filter(it ->
                IntStream.range(0, N).filter(u -> mr[u] < 0 && ++st[2] > 0 && (st[0] = st[2]) > 0 && dfs[0].test(u)).count() >= 0
                && Integer.valueOf(IntStream.range(0, N).map(u -> a[u][mr[u]]).min().getAsInt()) instanceof Integer d
                && IntStream.range(0, n).filter(u -> mr[u] < Mp && sb.append(u + 1).append(' ').append(oc[mr[u]] + 1).append(' ').append(st[1]).append(' ').append(d).append('\n') != null).count() >= 0
                && IntStream.range(0, N).filter(u -> (a[u][mr[u]] -= d) > 0 || (mc[mr[u]] = -1) + (mr[u] = -1) != 0).count() >= 0
                && (st[1] += d) > 0).count() >= 0
            && Long.valueOf(sb.chars().filter(ch -> ch == 10).count()) instanceof Long g
            ? T + "\n" + IntStream.range(0, m).mapToObj(j -> (mask >> j & 1) == 1 ? "1" : "0").collect(Collectors.joining()) + "\n" + g + "\n" + sb.toString().trim() : "");
    }
}
