import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(java.util.regex.Pattern.compile("\\s+") instanceof java.util.regex.Pattern pt && new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> pt.splitAsStream(l.trim())).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(2 * n) instanceof Integer LM && Long.valueOf(1000000007L) instanceof Long MOD
            && new int[m][] instanceof int[][] vis && new int[m] instanceof int[] ea && new int[m] instanceof int[] eb && new int[]{2} instanceof int[] ptr
            && IntStream.range(0, m).allMatch(i -> (ea[i] = t[ptr[0]]) > 0 && (eb[i] = t[ptr[0] + 1]) > 0 && Integer.valueOf(t[ptr[0] + 2]) instanceof Integer k
                && (vis[i] = Arrays.copyOfRange(t, ptr[0] + 3, ptr[0] + 3 + k)) != null && (ptr[0] += 3 + k) > 0)
            && IntStream.rangeClosed(0, n).mapToObj(i -> IntStream.generate(() -> -1).limit(n + 1).toArray()).toArray(int[][]::new) instanceof int[][] eid
            && IntStream.range(0, m).filter(i -> vis[i].length <= LM + 1).allMatch(i -> (eid[ea[i]][eb[i]] = i) >= 0)
            && ((Function<int[], int[]>) beta -> new int[][]{beta} instanceof int[][] cur && new ArrayList<Integer>(List.of(beta[beta.length - 1])) instanceof ArrayList<Integer> vs && new boolean[]{true} instanceof boolean[] ok
                && IntStream.iterate(0, i -> ok[0] && cur[0].length > 1, i -> i + 1).allMatch(i -> Integer.valueOf(eid[cur[0][cur[0].length - 2]][cur[0][cur[0].length - 1]]) instanceof Integer f
                    && (f < 0 || vs.size() > LM ? !(ok[0] = false)
                        : (cur[0] = IntStream.concat(Arrays.stream(vis[f]), Arrays.stream(cur[0], 0, cur[0].length - 1)).toArray()).length < LM + 3 ? vs.add(cur[0][cur[0].length - 1]) : !(ok[0] = false)))
                && ok[0] ? vs.stream().mapToInt(x -> x).toArray() : null) instanceof Function<int[], int[]> rev
            && ((BiFunction<Integer, int[], int[]>) (c0, q0) -> new int[][]{q0} instanceof int[][] cq && new ArrayList<Integer>(List.of(c0)) instanceof ArrayList<Integer> vs && new boolean[]{true} instanceof boolean[] ok
                && IntStream.iterate(0, i -> ok[0] && cq[0].length > 0, i -> i + 1).allMatch(i -> Integer.valueOf(eid[vs.get(vs.size() - 1)][cq[0][0]]) instanceof Integer f
                    && (f < 0 || vs.size() > LM ? !(ok[0] = false)
                        : Integer.valueOf(cq[0][0]) instanceof Integer w && (cq[0] = IntStream.concat(Arrays.stream(cq[0], 1, cq[0].length), Arrays.stream(vis[f])).toArray()).length < LM + 3 ? vs.add(w) : !(ok[0] = false)))
                && ok[0] ? vs.stream().mapToInt(x -> x).toArray() : null) instanceof BiFunction<Integer, int[], int[]> fwd
            && IntStream.rangeClosed(0, n).mapToObj(i -> (List<int[]>) new ArrayList<int[]>()).collect(Collectors.toList()) instanceof List<List<int[]>> lb
            && IntStream.rangeClosed(0, n).mapToObj(i -> (List<int[]>) new ArrayList<int[]>()).collect(Collectors.toList()) instanceof List<List<int[]>> qb
            && new boolean[n + 1][n + 1] instanceof boolean[][] emp
            && IntStream.range(0, m).filter(i -> eid[ea[i]][eb[i]] == i).allMatch(i -> (vis[i].length == 0 ? (emp[ea[i]][eb[i]] = true)
                : (vis[i][vis[i].length - 1] != ea[i] || Optional.ofNullable(rev.apply(vis[i])).map(r -> r.length > LM || lb.get(eb[i]).add(new int[]{r[r.length - 1], r.length})).isEmpty() || true)
                && (vis[i][0] != eb[i] || Optional.ofNullable(fwd.apply(eb[i], Arrays.copyOfRange(vis[i], 1, vis[i].length))).map(r -> r.length > LM || qb.get(ea[i]).add(new int[]{r[r.length - 1], r.length})).isEmpty() || true)))
            && new long[n + 1][n + 1][LM + 1] instanceof long[][][] Zr
            && IntStream.range(0, m).filter(i -> eid[ea[i]][eb[i]] == i).allMatch(i -> IntStream.range(1, vis[i].length).filter(tt -> vis[i][tt - 1] == ea[i] && vis[i][tt] == eb[i])
                .allMatch(tt -> Optional.ofNullable(rev.apply(Arrays.copyOf(vis[i], tt))).flatMap(lr -> Optional.ofNullable(fwd.apply(eb[i], Arrays.copyOfRange(vis[i], tt + 1, vis[i].length))).map(rr ->
                    Integer.valueOf(lr.length + rr.length - 1) instanceof Integer c && (c > LM || (Zr[lr[lr.length - 1]][rr[rr.length - 1]][c] += 1) > 0))).isEmpty() || true))
            && IntStream.rangeClosed(1, LM).allMatch(c -> IntStream.rangeClosed(1, n).allMatch(v -> IntStream.rangeClosed(1, n).allMatch(v2 -> (Zr[v][v2][c] %= MOD) >= 0
                && (Zr[v][v2][c] == 0 || lb.get(v).stream().allMatch(b -> c + b[1] > LM || (Zr[b[0]][v2][c + b[1]] += Zr[v][v2][c]) > 0)))))
            && new long[n + 1][LM + 1] instanceof long[][] RW && new long[n + 1][LM + 1] instanceof long[][] Q
            && IntStream.rangeClosed(1, n).allMatch(v -> (RW[v][0] = 1) > 0)
            && IntStream.rangeClosed(0, LM).allMatch(s -> (s == 0 || IntStream.rangeClosed(1, n).allMatch(v -> (RW[v][s] = (qb.get(v).stream().filter(b -> b[1] <= s).mapToLong(b -> RW[b[0]][s - b[1]]).sum()
                    + IntStream.rangeClosed(1, n).filter(w -> emp[v][w]).mapToLong(w -> Q[w][s - 1]).sum()) % MOD) >= 0))
                && IntStream.rangeClosed(1, n).allMatch(w -> (Q[w][s] = IntStream.rangeClosed(1, n).mapToLong(v2 -> IntStream.rangeClosed(1, s).mapToLong(c -> Zr[w][v2][c] * RW[v2][s - c] % MOD).sum() % MOD).sum() % MOD) >= 0))
            ? IntStream.rangeClosed(1, LM).mapToObj(s -> String.valueOf(IntStream.rangeClosed(1, n).mapToLong(w -> Q[w][s]).sum() % MOD)).collect(Collectors.joining("\n")) : "");
    }
}
