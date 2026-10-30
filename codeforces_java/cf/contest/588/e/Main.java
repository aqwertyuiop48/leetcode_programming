import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : st[2] == 1 && (nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) + (st[2] = 0) == 0).count() >= 0
            && (Integer) nums[0] instanceof Integer n && (Integer) nums[1] instanceof Integer m && (Integer) nums[2] instanceof Integer q
            && (Integer) 3 instanceof Integer eb && (Integer) (3 + 2 * (n - 1)) instanceof Integer cb && (Integer) (cb + m) instanceof Integer qb && (Integer) 17 instanceof Integer LOG
            && new int[n + 2] instanceof int[] deg && IntStream.range(0, n - 1).filter(i -> deg[nums[eb + 2 * i]]++ + deg[nums[eb + 2 * i + 1]]++ >= 0).count() >= 0
            && new int[n + 2] instanceof int[] start && IntStream.rangeClosed(1, n).filter(v -> (start[v + 1] = start[v] + deg[v]) >= 0).count() >= 0
            && new int[2 * n] instanceof int[] adj && start.clone() instanceof int[] pos
            && IntStream.range(0, n - 1).filter(i -> (adj[pos[nums[eb + 2 * i]]++] = nums[eb + 2 * i + 1]) + (adj[pos[nums[eb + 2 * i + 1]]++] = nums[eb + 2 * i]) >= 0).count() >= 0
            && new int[LOG][n + 1] instanceof int[][] up && new int[n + 1] instanceof int[] dep && new int[n] instanceof int[] queue && new int[]{1} instanceof int[] tail
            && (queue[0] = 1) == 1
            && IntStream.range(0, n).filter(i -> (Integer) queue[i] instanceof Integer v
                && IntStream.range(start[v], start[v + 1]).filter(e -> adj[e] != up[0][v] && (up[0][adj[e]] = v) > 0 && (dep[adj[e]] = dep[v] + 1) >= 0 && (queue[tail[0]++] = adj[e]) >= 0).count() >= 0).count() >= 0
            && (up[0][1] = 1) == 1
            && IntStream.range(1, LOG).filter(j -> IntStream.rangeClosed(1, n).filter(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) >= 0).count() >= 0).count() >= 0
            && ((IntBinaryOperator) (j, v) -> (j * (n + 1) + v) * 11) instanceof IntBinaryOperator off
            && (Integer) (LOG * (n + 1) * 11) instanceof Integer S0
            && IntStream.range(0, S0 + 33).map(i -> Integer.MAX_VALUE).toArray() instanceof int[] LST
            && new int[n + 1] instanceof int[] cnt
            && IntStream.range(0, m).filter(i -> cnt[nums[cb + i]] < 10 && (LST[off.applyAsInt(0, nums[cb + i]) + cnt[nums[cb + i]]++] = i + 1) > 0).count() >= 0
            && ((Predicate<int[]>) p -> new int[2] instanceof int[] z && (LST[p[0] + 0] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 1] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 2] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 3] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 4] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 5] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 6] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 7] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 8] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0 && (LST[p[0] + 9] = LST[p[1] + z[0]] <= LST[p[2] + z[1]] ? LST[p[1] + z[0]++] : LST[p[2] + z[1]++]) >= 0) instanceof Predicate<int[]> mrg
            && IntStream.range(1, LOG).filter(j -> IntStream.rangeClosed(1, n).filter(v -> mrg.test(new int[]{off.applyAsInt(j, v), off.applyAsInt(j - 1, v), off.applyAsInt(j - 1, up[j - 1][v])})).count() >= 0).count() >= 0
            && new int[]{S0 + 22} instanceof int[] sr
            && ((IntPredicate) o -> (Integer) (sr[0] == S0 ? S0 + 11 : S0) instanceof Integer dst && mrg.test(new int[]{dst, sr[0], o}) && (sr[0] = dst) >= 0) instanceof IntPredicate add
            ? IntStream.range(0, q).mapToObj(qi -> (Integer) nums[qb + 3 * qi] instanceof Integer u0 && (Integer) nums[qb + 3 * qi + 1] instanceof Integer v0 && (Integer) nums[qb + 3 * qi + 2] instanceof Integer a
                && (Integer) Math.abs(dep[u0] - dep[v0]) instanceof Integer df
                && new int[]{dep[u0] >= dep[v0] ? u0 : v0, dep[u0] >= dep[v0] ? v0 : u0} instanceof int[] w
                && (sr[0] = S0 + 22) > 0
                && IntStream.range(0, 2 * LOG).filter(t -> t < LOG ? ((df >> t) & 1) == 1 && add.test(off.applyAsInt(t, w[0])) && (w[0] = up[t][w[0]]) > 0
                    : (Integer) (2 * LOG - 1 - t) instanceof Integer j && up[j][w[0]] != up[j][w[1]] && add.test(off.applyAsInt(j, w[0])) && add.test(off.applyAsInt(j, w[1])) && (w[0] = up[j][w[0]]) > 0 && (w[1] = up[j][w[1]]) > 0).count() >= 0
                && add.test(off.applyAsInt(0, w[0])) && (w[0] == w[1] || add.test(off.applyAsInt(0, w[1])) && add.test(off.applyAsInt(0, up[0][w[0]])))
                ? IntStream.range(0, Math.min(a, 10)).map(k -> LST[sr[0] + k]).filter(x -> x != Integer.MAX_VALUE).boxed().collect(Collectors.collectingAndThen(Collectors.toList(),
                    ids -> ids.size() + (ids.isEmpty() ? "" : " " + ids.stream().map(String::valueOf).collect(Collectors.joining(" ")))))
                : "").collect(Collectors.joining("\n")) : "");
    }
}
