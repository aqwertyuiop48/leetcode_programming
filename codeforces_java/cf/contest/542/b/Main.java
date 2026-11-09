import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] tk && new long[4] instanceof long[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && (raw[i] >= 48 || raw[i] == 45)
                ? (raw[i] == 45 ? (cur[1] = 1) == 1 : (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0) && (cur[2] = 1) == 1
                : cur[2] == 0 || ((tk[(int) cur[3]++] = cur[1] == 1 ? -cur[0] : cur[0]) >= Long.MIN_VALUE && (cur[0] = 0) == 0 && (cur[1] = 0) == 0 && (cur[2] = 0) == 0)) || true)
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Long.valueOf(tk[1]) instanceof Long r
            && IntStream.range(0, n).filter(i -> tk[3 + 2 * i] >= 0).toArray() instanceof int[] idx && Integer.valueOf(idx.length) instanceof Integer nd
            && Arrays.stream(idx).map(i -> (int) Math.max(tk[2 + 2 * i], 0)).toArray() instanceof int[] Lc
            && Arrays.stream(idx).map(i -> (int) tk[3 + 2 * i]).toArray() instanceof int[] Rc
            && IntStream.range(0, 2 * nd).mapToLong(e -> ((long) (e % 2 == 0 ? Lc[e / 2] : Rc[e / 2] + 1) << 19) | e).sorted().toArray() instanceof long[] keys
            && new int[2 * nd + 1] instanceof int[] ut && new int[2 * nd + 2] instanceof int[] gs && new int[1] instanceof int[] gc
            && IntStream.range(0, 2 * nd).allMatch(k -> (k > 0 && (keys[k] >> 19) == (keys[k - 1] >> 19)) || ((ut[gc[0]] = (int) (keys[k] >> 19)) >= 0 && (gs[gc[0]++] = k) >= 0))
            && (gs[gc[0]] = 2 * nd) >= 0
            && Integer.valueOf(4 * nd + 16) instanceof Integer cap && Integer.valueOf(Integer.highestOneBit(cap - 1) * 2) instanceof Integer Nn && Integer.valueOf(Integer.numberOfTrailingZeros(Nn)) instanceof Integer LOG
            && new int[2 * Nn] instanceof int[] mx && IntStream.range(0, 2 * Nn).allMatch(i -> (mx[i] = -(1 << 29)) < 0)
            && new int[Nn] instanceof int[] ad && new int[8] instanceof int[] tr && new int[LOG + 2] instanceof int[] pth
            && new int[]{1, 1, 0, 0} instanceof int[] st
            && new long[cap] instanceof long[] start && new int[cap] instanceof int[] dval && new int[gc[0] + 1] instanceof int[] runAtG
            && ((IntBinaryOperator) (p, v) -> p <= 0 ? 0
                : (tr[0] = 1) > 0 && (tr[1] = 0) == 0 && (tr[2] = Nn) > 0 && (tr[5] = 0) == 0
                    && (IntStream.range(0, LOG + 1).allMatch(lev -> tr[1] + tr[2] <= p
                        ? ((mx[tr[0]] += v) > Integer.MIN_VALUE && (tr[0] >= Nn || (ad[tr[0]] += v) > Integer.MIN_VALUE) && false)
                        : ((pth[tr[5]++] = tr[0]) >= 0 && (tr[2] >>= 1) > 0 && (tr[1] + tr[2] < p
                            ? (mx[2 * tr[0]] += v) > Integer.MIN_VALUE && (2 * tr[0] >= Nn || (ad[2 * tr[0]] += v) > Integer.MIN_VALUE) && (tr[0] = 2 * tr[0] + 1) > 0 && (tr[1] += tr[2]) >= 0
                            : (tr[0] = 2 * tr[0]) > 0))) || true)
                    && IntStream.range(0, tr[5]).allMatch(j -> Integer.valueOf(pth[tr[5] - 1 - j]) instanceof Integer nd2 && (mx[nd2] = Math.max(mx[2 * nd2], mx[2 * nd2 + 1]) + ad[nd2]) > Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator padd
            && ((IntUnaryOperator) q -> (tr[0] = 1) > 0 && (tr[1] = 0) == 0 && (tr[2] = Nn) > 0 && (tr[3] = 0) == 0 && (tr[4] = -(1 << 30)) < 0
                && (IntStream.range(0, LOG + 1).allMatch(lev -> tr[1] + tr[2] <= q
                    ? (tr[4] = Math.max(tr[4], mx[tr[0]] + tr[3])) < Integer.MIN_VALUE
                    : ((tr[3] += ad[tr[0]]) > Integer.MIN_VALUE && (tr[2] >>= 1) > 0 && (tr[1] + tr[2] < q
                        ? (tr[4] = Math.max(tr[4], mx[2 * tr[0]] + tr[3])) > Integer.MIN_VALUE && (tr[0] = 2 * tr[0] + 1) > 0 && (tr[1] += tr[2]) >= 0
                        : (tr[0] = 2 * tr[0]) > 0))) || true) ? tr[4] : 0) instanceof IntUnaryOperator qry
            && ((IntBinaryOperator) (i0, v) -> (tr[0] = 1) > 0 && (tr[1] = 0) == 0 && (tr[2] = Nn) > 0 && (tr[3] = 0) == 0
                && IntStream.range(0, LOG).allMatch(lev -> (pth[lev] = tr[0]) >= 0 && (tr[3] += ad[tr[0]]) > Integer.MIN_VALUE && (tr[2] >>= 1) > 0
                    && (i0 >= tr[1] + tr[2] ? (tr[0] = 2 * tr[0] + 1) > 0 && (tr[1] += tr[2]) >= 0 : (tr[0] = 2 * tr[0]) > 0))
                && (mx[tr[0]] = v - tr[3]) > Integer.MIN_VALUE
                && IntStream.range(0, LOG).allMatch(j -> Integer.valueOf(pth[LOG - 1 - j]) instanceof Integer nd2 && (mx[nd2] = Math.max(mx[2 * nd2], mx[2 * nd2 + 1]) + ad[nd2]) > Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator sset
            && sset.applyAsInt(0, 0) == 0 && (start[0] = -1) < 0
            && IntStream.range(0, gc[0]).allMatch(g -> Integer.valueOf(ut[g]) instanceof Integer T
                && IntStream.iterate(0, z -> st[1] < st[0] && start[st[1]] + r < T, z -> z + 1).allMatch(z -> Long.valueOf(start[st[1]++] + r) instanceof Long te
                    && Integer.valueOf(qry.applyAsInt(st[1]) + st[2]) instanceof Integer dn
                    && (dn <= dval[st[0] - 1] || ((start[st[0]] = te) >= 0 && (dval[st[0]] = dn) >= 0 && sset.applyAsInt(st[0], dn - st[2]) == 0 && (st[3] = Math.max(st[3], dn)) >= 0 && ++st[0] > 0)))
                && IntStream.range(gs[g], gs[g + 1]).allMatch(k -> Integer.valueOf((int) (keys[k] & 524287)) instanceof Integer eid
                    && ((eid & 1) == 0 ? ++st[2] > 0 : padd.applyAsInt(runAtG[Arrays.binarySearch(ut, 0, gc[0], Lc[eid >> 1])], -1) == 0))
                && IntStream.iterate(0, z -> st[1] < st[0] && start[st[1]] + r <= T, z -> z + 1).allMatch(z -> ++st[1] > 0)
                && Integer.valueOf(qry.applyAsInt(st[1]) + st[2]) instanceof Integer d
                && (start[st[0]] = T) >= 0 && (dval[st[0]] = d) >= 0 && sset.applyAsInt(st[0], d - st[2]) == 0 && (st[3] = Math.max(st[3], d)) >= 0 && (runAtG[g] = st[0]) >= 0 && ++st[0] > 0)
            ? st[3] : "");
    }
}
