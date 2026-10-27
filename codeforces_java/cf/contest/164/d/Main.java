import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, 2 * n).map(i -> sc.nextInt()).toArray() instanceof int[] xy
            && IntStream.range(0, n).mapToObj(v -> LongStream.range(0, n).map(u -> ((long) ((xy[2 * v] - xy[2 * (int) u]) * (xy[2 * v] - xy[2 * (int) u]) + (xy[2 * v + 1] - xy[2 * (int) u + 1]) * (xy[2 * v + 1] - xy[2 * (int) u + 1])) << 10) | u).sorted().toArray()).toArray(long[][]::new) instanceof long[][] rows
            && new int[n] instanceof int[] cut
            && new int[n] instanceof int[] deg
            && new boolean[n] instanceof boolean[] rm
            && new int[n] instanceof int[] cid
            && new int[n] instanceof int[] orig
            && new int[n + 2] instanceof int[] off
            && new int[2 * k * k + 16] instanceof int[] adjArr
            && new int[n] instanceof int[] cdeg
            && new boolean[n] instanceof boolean[] calive
            && new int[n + 2] instanceof int[] stack
            && new int[n + 2] instanceof int[] fl
            && new int[8] instanceof int[] st
            && ((IntPredicate) v -> !(calive[v] = false) && (stack[st[0]++] = v) >= 0
                && IntStream.range(off[v], off[v + 1]).allMatch(i -> !calive[adjArr[i]] || ((cdeg[adjArr[i]]--) >= 0 && (st[1]--) >= 0))) instanceof IntPredicate rmv
            && ((IntPredicate) mark -> IntStream.iterate(st[0] - 1, i -> i >= mark, i -> i - 1).allMatch(i ->
                (calive[stack[i]] = true) && IntStream.range(off[stack[i]], off[stack[i] + 1]).allMatch(j -> !calive[adjArr[j]] || ((cdeg[adjArr[j]]++) >= 0 && (st[1]++) >= 0)))
                && (st[0] = mark) >= 0) instanceof IntPredicate undo
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> sv
            && sv.getAndSet(rem ->
                Integer.valueOf(IntStream.range(0, st[2]).filter(v -> calive[v]).map(v -> cdeg[v] << 12 | v).max().orElse(0)) instanceof Integer mx
                && Integer.valueOf(mx >> 12) instanceof Integer maxd
                && Integer.valueOf(mx & 4095) instanceof Integer v1
                && (maxd == 0
                    || (rem > 0 && (long) st[1] <= (long) rem * maxd
                        && IntStream.range(0, st[2]).filter(u -> calive[u] && cdeg[u] == 1).findFirst() instanceof OptionalInt u1o
                        && (u1o.isPresent()
                            ? Integer.valueOf(IntStream.range(off[u1o.getAsInt()], off[u1o.getAsInt() + 1]).map(i -> adjArr[i]).filter(ww -> calive[ww]).findFirst().getAsInt()) instanceof Integer w
                                && rmv.test(w) && sv.get().test(rem - 1)
                            : maxd > rem || maxd == 2
                                ? rmv.test(v1) && sv.get().test(rem - 1)
                                : Integer.valueOf(st[0]) instanceof Integer mark
                                    && ((rmv.test(v1) && sv.get().test(rem - 1))
                                        || (undo.test(mark) && IntStream.range(off[v1], off[v1 + 1]).allMatch(i -> !calive[adjArr[i]] || rmv.test(adjArr[i])) && sv.get().test(rem - maxd))))))) == null
            && ((IntPredicate) D ->
                IntStream.range(0, n).allMatch(v -> Integer.valueOf(Arrays.binarySearch(rows[v], ((long) D + 1) << 10)) instanceof Integer r && (cut[v] = Math.max(r, ~r)) >= 0 && (deg[v] = n - cut[v]) >= 0 && !(rm[v] = false))
                && (st[3] = k) >= 0 && (st[4] = 0) == 0
                && IntStream.generate(() -> 0).map(z -> IntStream.range(0, n).filter(v -> !rm[v] && deg[v] > st[3]).findFirst().orElse(-1)).takeWhile(v -> v >= 0).allMatch(v ->
                    (rm[v] = true) && (fl[st[4]++] = v) >= 0 && (st[3]--) >= 0
                    && IntStream.range(cut[v], n).allMatch(j -> (deg[(int) (rows[v][j] & 1023)]--) >= 0) && st[3] >= 0)
                && st[3] >= 0
                && Long.valueOf(IntStream.range(0, n).filter(v -> !rm[v]).mapToLong(v -> deg[v]).sum() / 2) instanceof Long E
                && E <= (long) st[3] * st[3]
                && (st[2] = 0) == 0
                && IntStream.range(0, n).allMatch(v -> (cid[v] = !rm[v] && deg[v] > 0 ? st[2]++ : -1) >= -1 && (cid[v] < 0 || (orig[cid[v]] = v) >= 0))
                && (st[5] = 0) == 0
                && IntStream.range(0, st[2]).allMatch(c -> (off[c] = st[5]) >= 0 && (cdeg[c] = deg[orig[c]]) >= 0 && (calive[c] = true)
                    && IntStream.range(cut[orig[c]], n).map(j -> cid[(int) (rows[orig[c]][j] & 1023)]).filter(x -> x >= 0).allMatch(x -> (adjArr[st[5]++] = x) >= 0))
                && (off[st[2]] = st[5]) >= 0
                && (st[1] = E.intValue()) >= 0
                && (st[0] = 0) == 0
                && sv.get().test(st[3])) instanceof IntPredicate chk
            && new int[]{0, (int) Arrays.stream(rows).mapToLong(r -> r[n - 1] >> 10).max().getAsLong()} instanceof int[] lh
            && IntStream.generate(() -> 0).takeWhile(z -> lh[0] < lh[1]).allMatch(z ->
                (chk.test((lh[0] + lh[1]) >>> 1) ? (lh[1] = (lh[0] + lh[1]) >>> 1) : (lh[0] = ((lh[0] + lh[1]) >>> 1) + 1)) >= 0)
            && chk.test(lh[0])
            && new boolean[n] instanceof boolean[] used
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, st[4]).allMatch(i -> (used[fl[i]] = true) && sb.append(fl[i] + 1).append(' ') != null)
            && IntStream.range(0, st[0]).allMatch(i -> (used[orig[stack[i]]] = true) && sb.append(orig[stack[i]] + 1).append(' ') != null)
            && IntStream.range(0, n).filter(i -> !used[i]).limit(k - st[4] - st[0]).allMatch(i -> sb.append(i + 1).append(' ') != null)
            ? sb.toString().trim() : "");
    }
}

