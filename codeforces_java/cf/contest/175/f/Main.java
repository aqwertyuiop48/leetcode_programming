import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] nums
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((nums[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0
                        && (i >= raw.length || (raw[i] != '+' && raw[i] != '?') || (nums[ps[1]++] = raw[i] == '+' ? -1 : -2) < 0))
            && Integer.valueOf(nums[0]) instanceof Integer n
            && Integer.valueOf(nums[1]) instanceof Integer m
            && new int[m + 1] instanceof int[] cp
            && (cp[0] = 2 + m) > 0
            && IntStream.range(0, m).allMatch(i -> (cp[i + 1] = cp[i] + nums[cp[i]] + 1) > 0)
            && Integer.valueOf(nums[cp[m]]) instanceof Integer q
            && Integer.valueOf(cp[m] + 1) instanceof Integer q0
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] mainIdx
            && new int[n + 1] instanceof int[] chainOf
            && new int[n + 1] instanceof int[] posOf
            && IntStream.range(0, m).allMatch(i -> (mainIdx[nums[2 + i]] = i) >= 0
                && IntStream.range(1, nums[cp[i]] - 1).allMatch(j -> (chainOf[nums[cp[i] + 1 + j]] = i) >= 0 && (posOf[nums[cp[i] + 1 + j]] = j) >= 0))
            && new int[n] instanceof int[] gE
            && new int[m] instanceof int[] cT
            && new int[m] instanceof int[] gD
            && new int[m] instanceof int[] sg
            && IntStream.generate(() -> 1).limit(m).toArray() instanceof int[] sl
            && new int[n + 2 * m + 8] instanceof int[] bit
            && new int[]{0, n + 1, n + m + 2} instanceof int[] bs
            && new int[]{n, m, m} instanceof int[] sz
            && new TreeSet<Integer>() instanceof TreeSet<Integer> nzE
            && new TreeSet<Integer>() instanceof TreeSet<Integer> nzS
            && ((IntUnaryOperator) x -> cp[x] - 2 - m - 2 * x) instanceof IntUnaryOperator eo
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> pfr
            && pfr.getAndSet((id, i) -> i <= 0 ? 0 : bit[bs[id] + i] + pfr.get().applyAsInt(id, i & (i - 1))) == null
            && ((IntBinaryOperator) (id, i) -> pfr.get().applyAsInt(id, i)) instanceof IntBinaryOperator pf
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> adr
            && adr.getAndSet((key, d) -> (key & 1048575) > sz[key >> 20] ? 0 : (bit[bs[key >> 20] + (key & 1048575)] += d) > Integer.MIN_VALUE ? adr.get().applyAsInt(key + ((key & 1048575) & -(key & 1048575)), d) : 1) == null
            && ((IntBinaryOperator) (key, d) -> adr.get().applyAsInt(key, d)) instanceof IntBinaryOperator ad
            && ((IntBinaryOperator) (key, r) -> pf.applyAsInt(key >> 20, r) - pf.applyAsInt(key >> 20, key & 1048575)) instanceof IntBinaryOperator rg
            && IntStream.range(0, m).allMatch(i -> ad.applyAsInt((2 << 20) + i + 1, 1) == 0)
            && ((IntPredicate) i ->
                Integer.valueOf(Math.min(gD[i], cT[i])) instanceof Integer ng
                && Integer.valueOf(gD[i] <= cT[i] ? 1 : nums[cp[i]] - 1) instanceof Integer nl
                && (ng == sg[i] || (ad.applyAsInt((1 << 20) + i + 1, ng - sg[i]) == 0 && (sg[i] = ng) >= 0 && ((ng > 0 ? nzS.add(i) : nzS.remove(i)) || true)))
                && (nl == sl[i] || (ad.applyAsInt((2 << 20) + i + 1, nl - sl[i]) == 0 && (sl[i] = nl) >= 0))) instanceof IntPredicate refresh
            && ((IntPredicate) x ->
                IntStream.generate(() -> Objects.requireNonNullElse(nzE.ceiling(eo.applyAsInt(x)), Integer.MAX_VALUE)).takeWhile(e -> e <= eo.applyAsInt(x) + nums[cp[x]] - 2)
                    .allMatch(e -> ad.applyAsInt(e + 1, -gE[e]) == 0 && (gE[e] = 0) == 0 && (nzE.remove(e) || true))
                && (cT[x] = 0) == 0) instanceof IntPredicate clr
            && ((IntBinaryOperator) (lo, hi) ->
                IntStream.generate(() -> Objects.requireNonNullElse(nzS.ceiling(lo), Integer.MAX_VALUE)).takeWhile(x -> x < hi)
                    .allMatch(x -> (gD[x] <= cT[x] ? (gD[x] = 0) == 0 : clr.test(x)) && refresh.test(x)) ? 0 : 1) instanceof IntBinaryOperator csg
            && new int[32] instanceof int[] et
            && new int[32] instanceof int[] eu
            && new int[32] instanceof int[] ev
            && new int[32] instanceof int[] ei
            && new int[32] instanceof int[] ep1
            && new int[32] instanceof int[] ep2
            && new int[32] instanceof int[] eg
            && new int[32] instanceof int[] el
            && new int[32] instanceof int[] best
            && new int[32] instanceof int[] cur
            && new int[33] instanceof int[] curNodes
            && new int[8] instanceof int[] p1a
            && new int[8] instanceof int[] p2a
            && new int[33] instanceof int[] gAcc
            && new int[33] instanceof int[] rAcc
            && new int[4] instanceof int[] bst
            && new int[4] instanceof int[] ct
            && ((IntBinaryOperator) (e, from) ->
                et[e] == 0
                    ? (from == eu[e]
                        ? (gD[ep1[e]] <= cT[ep1[e]] ? nums[2 + (ep1[e] + 1) % m] : nums[cp[ep1[e]] + 2])
                        : (Integer.valueOf((ep2[e] - 1 + m) % m) instanceof Integer z
                            ? (gD[z] <= cT[z] ? nums[2 + z] : nums[cp[z] + nums[cp[z]] - 1])
                            : 0))
                    : et[e] == 1
                        ? (from == eu[e] ? ev[e] : eu[e])
                        : (from == eu[e] ? nums[cp[ei[e]] + 2 + ep1[e]] : nums[cp[ei[e]] + ep2[e]])) instanceof IntBinaryOperator fc
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> sv
            && new int[16] instanceof int[] vis
            && new int[32] instanceof int[] nu
            && new int[32] instanceof int[] nv
            && new int[n + 1] instanceof int[] slot
            && new int[16] instanceof int[] ncas
            && new int[16] instanceof int[] inc
            && new int[33] instanceof int[] curSlot
            && new int[2] instanceof int[] nc
            && ((IntUnaryOperator) c -> slot[c] > 0 ? slot[c] - 1
                : (ncas[nc[0]] = c) > 0 && (slot[c] = ++nc[0]) > 0 && (inc[nc[0] - 1] = 0) == 0 ? nc[0] - 1 : -1) instanceof IntUnaryOperator slt
            && sv.getAndSet(de ->
                Integer.valueOf(de >> 20) instanceof Integer depth
                && (curSlot[depth] == 1
                    ? (!(bst[0] < 0 || gAcc[depth] < bst[1] || (gAcc[depth] == bst[1] && (rAcc[depth] < bst[2] || (rAcc[depth] == bst[2]
                            && IntStream.range(0, Math.min(depth, bst[0])).filter(i -> cur[i] != best[i]).findFirst() instanceof OptionalInt d0
                            && d0.isPresent() && fc.applyAsInt(cur[d0.getAsInt()], curNodes[d0.getAsInt()]) < fc.applyAsInt(best[d0.getAsInt()], curNodes[d0.getAsInt()])))))
                        || ((bst[0] = depth) >= 0 && (bst[1] = gAcc[depth]) >= 0 && (bst[2] = rAcc[depth]) >= 0 && IntStream.range(0, depth).allMatch(i -> (best[i] = cur[i]) >= 0)))
                    : (de & 1048575) == 0
                        || (Integer.valueOf(Integer.numberOfTrailingZeros(de & 1048575)) instanceof Integer e
                            && Integer.valueOf(nu[e] == curSlot[depth] ? nv[e] : nu[e]) instanceof Integer o
                            && (vis[o] != 0
                                || (bst[0] >= 0 && (gAcc[depth] + eg[e] > bst[1] || (gAcc[depth] + eg[e] == bst[1] && rAcc[depth] + el[e] > bst[2])))
                                || ((cur[depth] = e) >= 0 && (curSlot[depth + 1] = o) >= 0 && (curNodes[depth + 1] = ncas[o]) > 0
                                    && (gAcc[depth + 1] = gAcc[depth] + eg[e]) >= 0 && (rAcc[depth + 1] = rAcc[depth] + el[e]) >= 0
                                    && (vis[o] = 1) > 0 && sv.get().test(((depth + 1) << 20) | inc[o]) && (vis[o] = 0) == 0))
                            && sv.get().test((depth << 20) | ((de & 1048575) & ((de & 1048575) - 1)))))) == null
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(j ->
                Integer.valueOf(nums[q0 + 3 * j]) instanceof Integer op
                && Integer.valueOf(nums[q0 + 3 * j + 1]) instanceof Integer s
                && Integer.valueOf(nums[q0 + 3 * j + 2]) instanceof Integer t
                && (op == -1
                    ? (mainIdx[s] >= 0 && mainIdx[t] >= 0
                        ? (Integer.valueOf(mainIdx[t] == (mainIdx[s] + 1) % m ? mainIdx[s] : mainIdx[t]) instanceof Integer sgm && (gD[sgm]++) >= 0 && refresh.test(sgm))
                        : (Integer.valueOf(mainIdx[s] < 0 ? s : t) instanceof Integer v
                            && Integer.valueOf(v.equals(s) ? t : s) instanceof Integer u
                            && Integer.valueOf(chainOf[v]) instanceof Integer c
                            && Integer.valueOf(eo.applyAsInt(c) + (nums[cp[c] + posOf[v]] == u ? posOf[v] - 1 : posOf[v])) instanceof Integer ed
                            && (gE[ed]++) >= 0 && (cT[c]++) >= 0 && ad.applyAsInt(ed + 1, 1) == 0 && (nzE.add(ed) || true) && refresh.test(c)))
                    : s.equals(t)
                        ? sb.append("0\n") != null
                        : (Integer.valueOf(mainIdx[s] < 0 ? chainOf[s] : -1) instanceof Integer sa
                            && Integer.valueOf(mainIdx[t] < 0 ? chainOf[t] : -1) instanceof Integer tb
                            && IntStream.concat(mainIdx[s] >= 0 ? IntStream.of(mainIdx[s]) : IntStream.of(sa, (sa + 1) % m), mainIdx[t] >= 0 ? IntStream.of(mainIdx[t]) : IntStream.of(tb, (tb + 1) % m)).sorted().toArray() instanceof int[] ms0
                            && IntStream.range(0, ms0.length).filter(i -> i == 0 || ms0[i] != ms0[i - 1]).map(i -> ms0[i]).toArray() instanceof int[] ms
                            && Integer.valueOf(ms.length) instanceof Integer K
                            && (ct[0] = 0) == 0 && (nc[0] = 0) == 0 && slt.applyAsInt(s) == 0 && slt.applyAsInt(t) == 1
                            && IntStream.range(0, K).allMatch(x -> (p1a[x] = pf.applyAsInt(1, ms[x])) >= 0 && (p2a[x] = pf.applyAsInt(2, ms[x])) >= 0)
                            && Integer.valueOf(pf.applyAsInt(1, m)) instanceof Integer tot1
                            && Integer.valueOf(pf.applyAsInt(2, m)) instanceof Integer tot2
                            && IntStream.range(0, K).allMatch(x ->
                                Integer.valueOf(ms[x]) instanceof Integer u
                                && Integer.valueOf(ms[(x + 1) % K]) instanceof Integer v
                                && Integer.valueOf(((v - u) % m + m) % m == 0 ? m : ((v - u) % m + m) % m) instanceof Integer cnt
                                && ((cnt == 1 && (u.equals(sa) || u.equals(tb)))
                                    || (Integer.valueOf(ct[0]++) instanceof Integer k
                                        && (et[k] = 0) == 0 && (eu[k] = nums[2 + u]) > 0 && (ev[k] = nums[2 + v]) > 0 && (ep1[k] = u) >= 0 && (ep2[k] = v) >= 0
                                        && (eg[k] = x + 1 < K ? p1a[x + 1] - p1a[x] : tot1 - p1a[x] + p1a[0]) >= 0
                                        && (el[k] = x + 1 < K ? p2a[x + 1] - p2a[x] : tot2 - p2a[x] + p2a[0]) >= 0
                                        && (nu[k] = slt.applyAsInt(eu[k])) >= 0 && (nv[k] = slt.applyAsInt(ev[k])) >= 0 && (inc[nu[k]] |= 1 << k) > 0 && (inc[nv[k]] |= 1 << k) > 0)))
                            && IntStream.range(0, 2).filter(i0 -> (i0 == 0 ? sa : tb) >= 0 && (i0 == 0 || !tb.equals(sa))).map(i0 -> i0 == 0 ? sa : tb).allMatch(c ->
                                Integer.valueOf(ct[0]++) instanceof Integer k
                                && (et[k] = 1) >= 0 && (eu[k] = nums[2 + c]) > 0 && (ev[k] = nums[2 + (c + 1) % m]) > 0 && (ei[k] = c) >= 0 && (eg[k] = gD[c]) >= 0 && (el[k] = 1) > 0
                                && (nu[k] = slt.applyAsInt(eu[k])) >= 0 && (nv[k] = slt.applyAsInt(ev[k])) >= 0 && (inc[nu[k]] |= 1 << k) > 0 && (inc[nv[k]] |= 1 << k) > 0
                                && IntStream.concat(IntStream.of(0, nums[cp[c]] - 1), IntStream.of(s, t).filter(v -> mainIdx[v] < 0 && chainOf[v] == c).map(v -> posOf[v])).sorted().toArray() instanceof int[] pp
                                && IntStream.range(0, pp.length - 1).allMatch(i ->
                                    Integer.valueOf(ct[0]++) instanceof Integer k2
                                    && (et[k2] = 2) >= 0 && (eu[k2] = nums[cp[c] + 1 + pp[i]]) > 0 && (ev[k2] = nums[cp[c] + 1 + pp[i + 1]]) > 0 && (ei[k2] = c) >= 0
                                    && (ep1[k2] = pp[i]) >= 0 && (ep2[k2] = pp[i + 1]) > 0
                                    && (eg[k2] = rg.applyAsInt(eo.applyAsInt(c) + pp[i], eo.applyAsInt(c) + pp[i + 1])) >= 0 && (el[k2] = pp[i + 1] - pp[i]) > 0
                                    && (nu[k2] = slt.applyAsInt(eu[k2])) >= 0 && (nv[k2] = slt.applyAsInt(ev[k2])) >= 0 && (inc[nu[k2]] |= 1 << k2) > 0 && (inc[nv[k2]] |= 1 << k2) > 0))
                            && (bst[0] = -1) < 0 && (curNodes[0] = s) > 0 && (curSlot[0] = 0) == 0 && (gAcc[0] = 0) == 0 && (rAcc[0] = 0) == 0
                            && (vis[0] = 1) > 0 && sv.get().test(inc[0]) && (vis[0] = 0) == 0
                            && IntStream.range(0, nc[0]).allMatch(j2 -> (slot[ncas[j2]] = 0) == 0)
                            && Integer.valueOf(bst[1]) instanceof Integer total
                            && IntStream.range(0, bst[0]).allMatch(i ->
                                Integer.valueOf(best[i]) instanceof Integer e
                                && (et[e] == 0
                                    ? (Integer.valueOf(((ep2[e] - ep1[e]) % m + m) % m == 0 ? m : ((ep2[e] - ep1[e]) % m + m) % m) instanceof Integer cnt
                                        && (ep1[e] + cnt <= m
                                            ? csg.applyAsInt(ep1[e], ep1[e] + cnt) == 0
                                            : csg.applyAsInt(ep1[e], m) == 0 && csg.applyAsInt(0, ep1[e] + cnt - m) == 0))
                                    : et[e] == 1
                                        ? ((gD[ei[e]] = 0) == 0 && refresh.test(ei[e]))
                                        : (Integer.valueOf(ei[e]) instanceof Integer c
                                            && IntStream.generate(() -> Objects.requireNonNullElse(nzE.ceiling(eo.applyAsInt(c) + ep1[e]), Integer.MAX_VALUE)).takeWhile(x -> x <= eo.applyAsInt(c) + ep2[e] - 1)
                                                .allMatch(x -> ad.applyAsInt(x + 1, -gE[x]) == 0 && (cT[c] -= gE[x]) > Integer.MIN_VALUE && (gE[x] = 0) == 0 && (nzE.remove(x) || true))
                                            && refresh.test(c))))
                            && sb.append(total).append('\n') != null)))
            ? sb.toString() : "");
    }
}
