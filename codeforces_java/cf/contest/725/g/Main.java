import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[0]) instanceof Integer n && Integer.valueOf((int) a[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] nxt
            && Stream.of(0).peek(z0 -> Arrays.fill(head, -1)).findFirst().isPresent()
            && IntStream.rangeClosed(1, n).filter(i0 -> (par[i0] = (int) a[1 + i0]) >= 0 && (nxt[i0] = head[par[i0]]) >= -1 && (head[par[i0]] = i0) > 0).count() >= 0
            // BFS order and depth
            && new int[n + 1] instanceof int[] order && new int[n + 1] instanceof int[] depth && new int[]{1} instanceof int[] qn
            && IntStream.rangeClosed(0, n).filter(qi -> IntStream.iterate(head[order[qi]], c -> c != -1, c -> nxt[c])
                .filter(c -> (order[qn[0]++] = c) >= 0 && (depth[c] = depth[order[qi]] + 1) > 0).count() >= 0).count() >= 0
            // sizes and heavy child
            && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] heavy
            && Stream.of(0).peek(z0 -> Arrays.fill(sz, 1)).peek(z0 -> Arrays.fill(heavy, -1)).findFirst().isPresent()
            && IntStream.iterate(n, qi -> qi >= 1, qi -> qi - 1).filter(qi -> (sz[par[order[qi]]] += sz[order[qi]]) > 0
                && ((heavy[par[order[qi]]] < 0 || sz[order[qi]] > sz[heavy[par[order[qi]]]]) && (heavy[par[order[qi]]] = order[qi]) > 0)).count() >= 0
            // chains
            && new int[n + 1] instanceof int[] top && new int[n + 1] instanceof int[] pos && new int[n + 1] instanceof int[] nodeAt && new int[]{0} instanceof int[] pc
            && IntStream.rangeClosed(0, n).filter(qi -> (order[qi] == 0 || heavy[par[order[qi]]] != order[qi])
                && IntStream.iterate(order[qi], u -> u != -1, u -> heavy[u])
                    .filter(u -> (top[u] = order[qi]) >= 0 && (pos[u] = pc[0]++) >= 0 && (nodeAt[pos[u]] = u) >= 0).count() >= 0).count() >= 0
            // segment tree
            && Integer.valueOf(Integer.highestOneBit(n) * 2) instanceof Integer NN
            && new int[2 * NN] instanceof int[] md && new long[2 * NN] instanceof long[] tag && new long[2 * NN] instanceof long[] mx
            && Stream.of(0).peek(z0 -> Arrays.fill(tag, Long.MIN_VALUE / 4)).peek(z0 -> Arrays.fill(mx, Long.MIN_VALUE / 4)).findFirst().isPresent()
            && IntStream.rangeClosed(0, n).filter(v -> (md[NN + pos[v]] = depth[v]) < 0).count() >= 0
            && IntStream.iterate(NN - 1, i1 -> i1 >= 1, i1 -> i1 - 1).filter(i1 -> (md[i1] = Math.max(md[2 * i1], md[2 * i1 + 1])) < 0).count() >= 0
            && new long[1] instanceof long[] vr && new int[2] instanceof int[] qr && new long[1] instanceof long[] tq
            && new int[200] instanceof int[] stN && new long[200] instanceof long[] stA && new int[1] instanceof int[] sp && new int[1] instanceof int[] fres
            && ((IntPredicate) i2 -> (tag[i2] = Math.max(tag[i2], vr[0])) > Long.MIN_VALUE && (mx[i2] = Math.max(mx[i2], vr[0] + 2L * md[i2])) > Long.MIN_VALUE) instanceof IntPredicate ap
            // range chmax
            && ((IntBinaryOperator) (ul, ur) -> new int[]{ul + NN, ur + NN + 1} instanceof int[] lr
                && (IntStream.generate(() -> 0).allMatch(z4 -> lr[0] < lr[1] && ((lr[0] & 1) == 0 || ap.test(lr[0]++)) && ((lr[1] & 1) == 0 || ap.test(--lr[1]))
                    && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0) || true)
                && IntStream.iterate((ul + NN) >> 1, i3 -> i3 >= 1, i3 -> i3 >> 1)
                    .filter(i3 -> (mx[i3] = Math.max(Math.max(mx[2 * i3], mx[2 * i3 + 1]), tag[i3] + 2L * md[i3])) < Long.MIN_VALUE).count() >= 0
                && IntStream.iterate((ur + NN) >> 1, i3 -> i3 >= 1, i3 -> i3 >> 1)
                    .filter(i3 -> (mx[i3] = Math.max(Math.max(mx[2 * i3], mx[2 * i3 + 1]), tag[i3] + 2L * md[i3])) < Long.MIN_VALUE).count() >= 0 ? 0 : 0) instanceof IntBinaryOperator upd
            // rightmost position in [qr0, qr1] with key > tq
            && ((IntSupplier) () -> (fres[0] = -1) < 0 && (sp[0] = 1) > 0 && (stN[0] = 1) > 0 && (stA[0] = Long.MIN_VALUE / 4) < 0
                && (IntStream.generate(() -> 0).allMatch(z3 -> sp[0] > 0 && Integer.valueOf(stN[--sp[0]]) instanceof Integer nd && Long.valueOf(stA[sp[0]]) instanceof Long ac
                    && Integer.valueOf(31 - Integer.numberOfLeadingZeros(nd)) instanceof Integer dp && Integer.valueOf(NN >> dp) instanceof Integer s2
                    && Integer.valueOf((nd - (1 << dp)) * s2) instanceof Integer nl
                    ? (nl + s2 - 1 < qr[0] || nl > qr[1] || Math.max(mx[nd], ac + 2L * md[nd]) <= tq[0] ? true
                        : s2 == 1 ? (fres[0] = nl) < 0
                        : (stN[sp[0]] = 2 * nd) + (stA[sp[0]++] = Math.max(ac, tag[nd])) + (stN[sp[0]] = 2 * nd + 1) + (stA[sp[0]++] = Math.max(ac, tag[nd])) > Long.MIN_VALUE)
                    : false) || true)
                ? fres[0] : -1) instanceof IntSupplier fl
            // processing order: by (T, sender, index)
            && IntStream.range(0, m).mapToLong(j0 -> a[3 + n + 2 * j0] + depth[(int) a[2 + n + 2 * j0]]).toArray() instanceof long[] Tarr
            && IntStream.range(0, m).boxed().sorted(Comparator.<Integer>comparingLong(j1 -> Tarr[j1]).thenComparingLong(j1 -> a[2 + n + 2 * j1]).thenComparingInt(j1 -> j1))
                .mapToInt(Integer::intValue).toArray() instanceof int[] srt
            && new long[m] instanceof long[] res && new int[1] instanceof int[] cv && new int[1] instanceof int[] cu
            && Arrays.stream(srt).filter(j -> Integer.valueOf((int) a[2 + n + 2 * j]) instanceof Integer x && Long.valueOf(Tarr[j]) instanceof Long T
                && (tq[0] = T) > Long.MIN_VALUE && (fres[0] = -1) < 0 && (cv[0] = x) > 0
                && (IntStream.generate(() -> 0).allMatch(z5 -> (qr[0] = pos[top[cv[0]]]) >= 0 && (qr[1] = pos[cv[0]]) >= 0 && fl.getAsInt() < 0
                    && top[cv[0]] != 0 && (cv[0] = par[top[cv[0]]]) >= 0) || true)
                && Integer.valueOf(fres[0] >= 0 ? nodeAt[fres[0]] : 0) instanceof Integer z
                && (vr[0] = T - 2L * depth[z]) > Long.MIN_VALUE && (cu[0] = x) > 0
                && (IntStream.generate(() -> 0).allMatch(z6 -> top[cu[0]] == top[z]
                    ? (cu[0] == z || upd.applyAsInt(pos[z] + 1, pos[cu[0]]) >= 0) && false
                    : upd.applyAsInt(pos[top[cu[0]]], pos[cu[0]]) >= 0 && (cu[0] = par[top[cu[0]]]) >= 0) || true)
                && (res[j] = T + depth[x] - 2L * depth[z]) > Long.MIN_VALUE).count() >= 0
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
