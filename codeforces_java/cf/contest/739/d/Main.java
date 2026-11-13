import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(q -> sc.next() instanceof String t ? (t.equals("?") ? -1 : Integer.parseInt(t)) : 0).toArray() instanceof int[] raw
            && IntStream.range(0, n).map(i -> raw[2 * i]).toArray() instanceof int[] pa
            && IntStream.range(0, n).map(i -> raw[2 * i + 1]).toArray() instanceof int[] pb
            && Boolean.valueOf(IntStream.range(0, n).allMatch(i -> pa[i] < n && pb[i] <= n)) instanceof Boolean ok
            && Integer.valueOf(IntStream.range(0, n).filter(i -> pa[i] > 0 && pb[i] < 0).boxed().max(Comparator.comparingInt(i -> pa[i])).orElse(-1)) instanceof Integer des
            && new boolean[n + 2] instanceof boolean[] pr0
            && IntStream.range(0, n).filter(i -> pb[i] > 0 && (pr0[Math.min(pb[i], n + 1)] = true)).count() >= 0
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(c -> !pr0[c]).findFirst().orElse(0)) instanceof Integer free
            && ((IntFunction<String>) cs -> pa.clone() instanceof int[] a2 && pb.clone() instanceof int[] b2
                && (des < 0 || (b2[des] = cs) > 0)
                && new boolean[n + 2] instanceof boolean[] pr && new int[n + 2] instanceof int[] c0 && new int[n + 2] instanceof int[] mx
                && new boolean[n + 2][n + 2] instanceof boolean[][] hv
                && IntStream.range(0, n).filter(i -> b2[i] > 0 && (pr[b2[i]] = true) && a2[i] >= 0 && (hv[a2[i]][b2[i]] = true)
                    && (mx[b2[i]] = Math.max(mx[b2[i]], a2[i])) >= 0 && (a2[i] > 0 || ++c0[b2[i]] > 0)).count() >= 0
                && IntStream.rangeClosed(1, n).filter(c -> pr[c]).boxed().flatMap(c -> Stream.concat(
                        IntStream.range(0, Math.max(c, (c0[c] + c - 1) / c * c) - c0[c]).mapToObj(q -> new int[]{0, c}),
                        IntStream.range(1, mx[c]).filter(j -> !hv[j][c]).mapToObj(j -> new int[]{j, c}))).toList() instanceof List<int[]> sl
                && sl.size() <= n
                && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] mv
                && new int[n] instanceof int[] vis && new int[1] instanceof int[] stp
                && new IntPredicate[1] instanceof IntPredicate[] dfs
                && ((dfs[0] = s -> IntStream.range(0, n).anyMatch(v -> (a2[v] < 0 || b2[v] < 0)
                    && (a2[v] < 0 || a2[v] == sl.get(s)[0]) && (b2[v] < 0 || b2[v] == sl.get(s)[1])
                    && vis[v] != stp[0] && (vis[v] = stp[0]) > 0
                    && (mv[v] < 0 || dfs[0].test(mv[v])) && (mv[v] = s) >= 0)) != null)
                && IntStream.range(0, sl.size()).allMatch(s -> ++stp[0] > 0 && dfs[0].test(s))
                && IntStream.range(0, n).map(v -> a2[v] >= 0 && b2[v] > 0 ? a2[v] : mv[v] >= 0 ? sl.get(mv[v])[0] : a2[v] >= 0 ? a2[v] : b2[v] > 0 ? 1 : 0).toArray() instanceof int[] A2
                && IntStream.range(0, n).map(v -> a2[v] >= 0 && b2[v] > 0 ? b2[v] : mv[v] >= 0 ? sl.get(mv[v])[1] : a2[v] >= 0 ? (a2[v] == 0 ? 1 : cs) : b2[v] > 0 ? b2[v] : 1).toArray() instanceof int[] C2
                && new int[n + 1][n + 1] instanceof int[][] rep
                && IntStream.range(0, n).filter(v -> (rep[A2[v]][C2[v]] = v + 1) > 0).count() >= 0
                && new int[n + 1][n + 1] instanceof int[][] pos && new int[n + 1] instanceof int[] cc && new int[n] instanceof int[] idx
                && IntStream.range(0, n).filter(v -> A2[v] == 0 && (idx[v] = cc[C2[v]]++) >= 0 && (pos[C2[v]][idx[v]] = v) >= 0).count() >= 0
                && IntStream.rangeClosed(1, n).allMatch(c -> cc[c] % c == 0)
                && IntStream.range(0, n).map(v -> A2[v] == 0 ? pos[C2[v]][idx[v] - idx[v] % C2[v] + (idx[v] % C2[v] + 1) % C2[v]] : rep[A2[v] - 1][C2[v]] - 1).toArray() instanceof int[] f
                && Arrays.stream(f).allMatch(x -> x >= 0)
                ? Arrays.stream(f).mapToObj(x -> String.valueOf(x + 1)).collect(Collectors.joining(" ")) : null) instanceof IntFunction<String> att
            ? (ok ? (des < 0 ? IntStream.of(0) : IntStream.rangeClosed(1, n).filter(c -> pr0[c] || c == free)).mapToObj(att).filter(Objects::nonNull).findFirst().orElse("-1") : "-1") : "");
    }
}
