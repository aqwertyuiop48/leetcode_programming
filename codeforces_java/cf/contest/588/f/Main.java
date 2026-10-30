import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] nums && new int[3] instanceof int[] st0
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st0[0] = st0[0] * 10 + raw[i] - '0') >= 0 && (st0[2] = 1) > 0
                : st0[2] == 1 && (nums[st0[1]++] = st0[0]) >= 0 && (st0[0] = 0) + (st0[2] = 0) == 0).count() >= 0
            && (Integer) nums[1] instanceof Integer m && (Integer) (m * 3) instanceof Integer V && (Integer) (m * 6) instanceof Integer N
            && IntStream.range(0, m).map(e -> nums[5 + 4 * e]).toArray() instanceof int[] ts
            && LongStream.range(0, 2 * m).map(i -> ((long) nums[2 + 4 * (int) (i / 2) + (int) (i % 2)] << 46) | ((long) nums[4 + 4 * (int) (i / 2)] << 16) | (i / 2)).sorted().toArray() instanceof long[] keys
            && (Boolean) IntStream.range(0, 2 * m - 2).anyMatch(i -> (keys[i] >> 16) == (keys[i + 2] >> 16)) instanceof Boolean bad
            && new int[16 * m + 16] instanceof int[] ef && new int[16 * m + 16] instanceof int[] et && new int[1] instanceof int[] ec
            && ((IntBinaryOperator) (f, t) -> (ef[ec[0]] = f) + (et[ec[0]++] = t)) instanceof IntBinaryOperator addE
            && IntStream.range(0, 2 * m).filter(i -> (Integer) (int) (keys[i] & 65535) instanceof Integer x && (Integer) (m + i) instanceof Integer p
                && addE.applyAsInt(2 * x, 2 * p) + addE.applyAsInt(2 * p + 1, 2 * x + 1) >= 0
                && (i + 1 >= 2 * m || (keys[i + 1] >> 46) != (keys[i] >> 46)
                    || (Integer) (int) (keys[i + 1] & 65535) instanceof Integer x2 && (Integer) (m + i + 1) instanceof Integer p2
                    && addE.applyAsInt(2 * p, 2 * p2) + addE.applyAsInt(2 * p2 + 1, 2 * p + 1) + addE.applyAsInt(2 * p, 2 * x2 + 1) + addE.applyAsInt(2 * x2, 2 * p + 1) >= 0
                    && ((keys[i + 1] >> 16) != (keys[i] >> 16) || addE.applyAsInt(2 * x + 1, 2 * x2) + addE.applyAsInt(2 * x2 + 1, 2 * x) >= 0))).count() >= 0
            && new int[N + 2] instanceof int[] start && new int[N + 1] instanceof int[] deg
            && IntStream.range(0, ec[0]).filter(k -> deg[ef[k]]++ >= 0).count() >= 0
            && IntStream.range(0, N).filter(v -> (start[v + 1] = start[v] + deg[v]) >= 0).count() >= 0
            && new int[start[N] + 1] instanceof int[] adj && start.clone() instanceof int[] pos
            && IntStream.range(0, ec[0]).filter(k -> (adj[pos[ef[k]]++] = et[k]) >= 0).count() >= 0
            && new int[N] instanceof int[] idx && new int[N] instanceof int[] low && new int[N] instanceof int[] comp && new int[N] instanceof int[] cs && new int[N] instanceof int[] ss && new int[N] instanceof int[] ep && new int[N] instanceof int[] sp0
            && new boolean[N] instanceof boolean[] onstk && new int[4] instanceof int[] st
            && ((IntPredicate) i -> (Integer) cs[st[0] - 1] instanceof Integer v
                && (idx[v] != 0 || (idx[v] = low[v] = ++st[1]) > 0 && (sp0[v] = st[2]) >= 0 && (ss[st[2]++] = v) >= 0 && (onstk[v] = true) && (ep[v] = start[v]) >= 0)
                && (ep[v] < start[v + 1]
                    ? (Integer) adj[ep[v]++] instanceof Integer w && (idx[w] == 0 ? (cs[st[0]++] = w) >= 0 : !onstk[w] || (low[v] = Math.min(low[v], idx[w])) >= 0)
                    : st[0]-- > 0 && (low[v] != idx[v] || IntStream.range(sp0[v], st[2]).filter(k -> (comp[ss[k]] = st[3]) >= 0 && !(onstk[ss[k]] = false)).count() >= 0 && (st[2] = sp0[v]) >= 0 && ++st[3] > 0)
                        && (st[0] == 0 || (low[cs[st[0] - 1]] = Math.min(low[cs[st[0] - 1]], low[v])) >= 0))) instanceof IntPredicate step
            && IntStream.range(0, N).filter(r -> idx[r] == 0 && (cs[0] = r) >= 0 && (st[0] = 1) > 0 && IntStream.iterate(0, k -> st[0] > 0, k -> k + 1).filter(step).count() >= 0).count() >= 0
            && (Boolean) IntStream.range(0, V).allMatch(v -> comp[2 * v] != comp[2 * v + 1]) instanceof Boolean sat && sat && !bad
            && new int[N] instanceof int[] stk && new int[2] instanceof int[] pst
            && ((BiPredicate<boolean[], Integer>) (rc, L) -> rc[L] || (rc[L] = true) && (pst[1] |= rc[L ^ 1] ? 1 : 0) >= 0 && (stk[pst[0]++] = L) >= 0
                && IntStream.iterate(0, k -> pst[0] > 0, k -> k + 1).filter(k -> (Integer) stk[--pst[0]] instanceof Integer u
                    && IntStream.range(start[u], start[u + 1]).filter(ei -> (Integer) adj[ei] instanceof Integer w2 && !rc[w2] && (rc[w2] = true) && (pst[1] |= rc[w2 ^ 1] ? 1 : 0) >= 0 && (stk[pst[0]++] = w2) >= 0).count() >= 0).count() >= 0) instanceof BiPredicate<boolean[], Integer> prop
            && LongStream.range(0, m).map(e -> ((long) ts[(int) e] << 20) | e).sorted().toArray() instanceof long[] ord
            && new boolean[N] instanceof boolean[] r1 && new int[1] instanceof int[] tc
            && IntStream.iterate(m - 1, i -> i >= 0 && pst[1] == 0, i -> i - 1).filter(i -> (Integer) (int) (ord[i] & 1048575) instanceof Integer e && (tc[0] = ts[e]) >= 0 && prop.test(r1, 2 * e + 1)).count() >= 0
            && (Integer) (pst[1] == 1 ? tc[0] : 0) instanceof Integer T && new boolean[N] instanceof boolean[] r2
            && IntStream.range(0, m).filter(e -> ts[e] > T && prop.test(r2, 2 * e + 1)).count() >= 0
            && IntStream.range(0, m).filter(e -> r2[2 * e] || !r2[2 * e + 1] && comp[2 * e] < comp[2 * e + 1]).toArray() instanceof int[] sel
            ? "Yes\n" + T + " " + sel.length + "\n" + Arrays.stream(sel).mapToObj(e -> String.valueOf(e + 1)).collect(Collectors.joining(" ")) : "No");
    }
}
