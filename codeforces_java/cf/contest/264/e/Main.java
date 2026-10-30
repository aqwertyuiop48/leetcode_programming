import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums && new int[3] instanceof int[] ps
            && IntStream.range(0, raw.length).allMatch(i -> raw[i] >= 48 ? (ps[0] = ps[0] * 10 + raw[i] - 48) >= 0 && (ps[1] = 1) > 0 : ps[1] == 0 || (nums[ps[2]++] = ps[0]) >= 0 && (ps[0] = 0) == 0 && (ps[1] = 0) == 0)
            && Integer.valueOf(nums[0]) instanceof Integer n && Integer.valueOf(nums[1]) instanceof Integer m
            && new int[m + 1] instanceof int[] tp && new int[m + 1] instanceof int[] qa && new int[m + 1] instanceof int[] qb
            && (ps[0] = 2) == 2 && IntStream.rangeClosed(1, m).allMatch(q -> (tp[q] = nums[ps[0]++]) > 0 && (qa[q] = nums[ps[0]++]) > 0 && (tp[q] == 2 || (qb[q] = nums[ps[0]++]) > 0))
            && IntStream.rangeClosed(1, m).filter(q -> tp[q] == 1).mapToLong(q -> ((long) (qb[q] - q + m) << 20) | q).sorted().toArray() instanceof long[] ks
            && new int[m + 1] instanceof int[] rk && IntStream.range(0, ks.length).allMatch(i -> (rk[(int) (ks[i] & 1048575)] = i) >= 0)
            && Integer.valueOf(ks.length) instanceof Integer K
            && Integer.valueOf(Integer.highestOneBit(Math.max(K, n + 2)) * 2) instanceof Integer SZ
            && new int[2][2 * SZ] instanceof int[][] TT
            && new int[m + 1] instanceof int[] S && new int[m + 3] instanceof int[] cnt && new int[m + 1] instanceof int[] ans
            && new boolean[m + 1] instanceof boolean[] alive && new boolean[m + 1] instanceof boolean[] inKey && new boolean[m + 1] instanceof boolean[] inPos
            && new int[n + 2] instanceof int[] posTree && new int[n + 1] instanceof int[] bit
            && new int[12] instanceof int[] L && new int[12] instanceof int[] y && new int[4] instanceof int[] g && new int[3] instanceof int[] cu
            && new int[4] instanceof int[] st && new IntSupplier[1] instanceof IntSupplier[] wk
            && (wk[0] = () -> st[0] >= st[1] ? st[2]
                : ((st[0] & 1) == 0 || (st[2] = Math.max(st[2], TT[st[3]][st[0]++])) >= 0) && ((st[1] & 1) == 0 || (st[2] = Math.max(st[2], TT[st[3]][--st[1]])) >= 0)
                    && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0 ? wk[0].getAsInt() : -1) != null
            && ((IntBinaryOperator) (a, hi) -> (st[0] = a & 268435455) >= 0 && (st[1] = hi) >= 0 && (st[2] = 0) == 0 && (st[3] = a >>> 28) >= 0 ? wk[0].getAsInt() : 0) instanceof IntBinaryOperator qm
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] up
            && (up[0] = (t, j) -> j < 1 ? 0 : TT[t][j] == Math.max(TT[t][2 * j], TT[t][2 * j + 1]) ? 0 : (TT[t][j] = Math.max(TT[t][2 * j], TT[t][2 * j + 1])) >= 0 ? up[0].applyAsInt(t, j >> 1) : -1) != null
            && ((IntBinaryOperator) (a, v) -> (TT[a >>> 28][SZ + (a & 268435455)] = v) >= 0 && up[0].applyAsInt(a >>> 28, (SZ + (a & 268435455)) >> 1) >= 0 ? 0 : -1) instanceof IntBinaryOperator setv
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] pr
            && (pr[0] = i -> i <= 0 ? 0 : bit[i] + pr[0].applyAsInt(i - (i & -i))) != null
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] ad
            && (ad[0] = (i, d) -> i > n ? 0 : (bit[i] += d) < Integer.MAX_VALUE ? ad[0].applyAsInt(i + (i & -i), d) : -1) != null
            && new int[2] instanceof int[] kst && new IntUnaryOperator[1] instanceof IntUnaryOperator[] kr
            && (kr[0] = pw -> pw == 0 ? kst[0] + 1 : ((kst[0] + pw > n || bit[kst[0] + pw] >= kst[1] || (kst[1] -= bit[kst[0] + pw]) > -1000000000 && (kst[0] += pw) >= 0) ? kr[0].applyAsInt(pw >> 1) : -1)) != null
            && ((IntUnaryOperator) k -> (kst[0] = 0) == 0 && (kst[1] = k) == k ? kr[0].applyAsInt(Integer.highestOneBit(n)) : 0) instanceof IntUnaryOperator kth
            && ((IntBinaryOperator) (id, v) -> cnt[S[id]]-- < Integer.MAX_VALUE && cnt[S[id] = v]++ < Integer.MAX_VALUE && (g[2] = Math.max(g[2], v)) >= 0 ? 0 : -1) instanceof IntBinaryOperator put
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] rsc
            && (rsc[0] = j -> j >= cu[0] ? 0 : Math.max(alive[j] && qa[j] > cu[1] && qb[j] - j > qb[cu[0]] - cu[0] ? S[j] : 0, rsc[0].applyAsInt(j + 1))) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] bub
            && (bub[0] = i -> i > 0 && y[i - 1] - qb[y[i - 1]] > y[i] - qb[y[i]]
                ? ((y[i] ^= y[i - 1]) >= 0 && (y[i - 1] ^= y[i]) >= 0 && (y[i] ^= y[i - 1]) >= 0 ? bub[0].applyAsInt(i - 1) : -1) : 0) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] bld
            && (bld[0] = j -> j > cu[0] ? 0 : (!alive[j] || (y[g[3]] = j) > 0 && bub[0].applyAsInt(g[3]++) >= 0) ? bld[0].applyAsInt(j + 1) : -1) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] rel
            && (rel[0] = u -> u >= g[3] * g[3] ? 0
                : ((u % g[3] < u / g[3] && qa[y[u % g[3]]] > qa[y[u / g[3]]]) ? put.applyAsInt(y[u / g[3]], Math.max(S[y[u / g[3]]], 1 + S[y[u % g[3]]])) : 0) >= 0 ? rel[0].applyAsInt(u + 1) : -1) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] kup
            && (kup[0] = a -> a >= g[3] ? 0 : (!inKey[y[a]] || setv.applyAsInt(268435456 | rk[y[a]], S[y[a]]) >= 0) ? kup[0].applyAsInt(a + 1) : -1) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] shl
            && (shl[0] = i -> i <= cu[2] ? 0 : (L[i] = L[i - 1]) >= 0 ? shl[0].applyAsInt(i - 1) : -1) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] shr
            && (shr[0] = i -> i >= g[1] - 1 ? 0 : (L[i] = L[i + 1]) >= 0 ? shr[0].applyAsInt(i + 1) : -1) != null
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] lat
            && (lat[0] = (i, c) -> c >= g[1] ? 0 : Math.max(qb[L[c]] - L[c] > qb[L[i]] - L[i] ? S[L[c]] : 0, lat[0].applyAsInt(i, c + 1))) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] rc
            && (rc[0] = i -> i < 0 ? 0
                : put.applyAsInt(L[i], 1 + Math.max(lat[0].applyAsInt(i, i + 1), qm.applyAsInt(268435456 | (SZ + rk[L[i]] + 1), SZ + K))) >= 0 && (!inPos[L[i]] || setv.applyAsInt(qa[L[i]], S[L[i]]) >= 0) ? rc[0].applyAsInt(i - 1) : -1) != null
            && ((IntPredicate) id -> (inKey[id] = true) && setv.applyAsInt(268435456 | rk[id], S[id]) >= 0) instanceof IntPredicate ak
            && ((IntPredicate) s -> (cu[0] = s) > 0 && (cu[1] = qa[s]) > 0 && (cu[2] = pr[0].applyAsInt(qa[s] - 1)) >= 0
                && put.applyAsInt(s, 1 + Math.max(qm.applyAsInt(SZ + qa[s] + 1, SZ + n + 1), rsc[0].applyAsInt(Math.max(1, s - 9)))) >= 0
                && (alive[s] = true) && (posTree[qa[s]] = s) > 0 && ad[0].applyAsInt(qa[s], 1) >= 0 && ++g[0] > 0
                && (g[3] = 0) == 0 && bld[0].applyAsInt(Math.max(1, s - 9)) >= 0
                && rel[0].applyAsInt(0) >= 0 && kup[0].applyAsInt(0) >= 0
                && (cu[2] >= 10 ? ak.test(s) : g[1]++ >= 0 && shl[0].applyAsInt(g[1] - 1) >= 0 && (L[cu[2]] = s) > 0 && (g[1] <= 10 || ak.test(L[--g[1]])))) instanceof IntPredicate plant
            && ((IntPredicate) s -> (cu[0] = L[qa[s] - 1]) > 0
                && !(alive[cu[0]] = false) && put.applyAsInt(cu[0], 0) >= 0 && ad[0].applyAsInt(qa[cu[0]], -1) >= 0 && --g[0] >= 0
                && (!inPos[cu[0]] || !(inPos[cu[0]] = false) && setv.applyAsInt(qa[cu[0]], 0) >= 0)
                && shr[0].applyAsInt(qa[s] - 1) >= 0 && --g[1] >= 0
                && (g[0] < 10 || (cu[1] = posTree[kth.applyAsInt(10)]) > 0 && !(inKey[cu[1]] = false) && setv.applyAsInt(268435456 | rk[cu[1]], 0) >= 0 && (L[g[1]++] = cu[1]) > 0)
                && rc[0].applyAsInt(qa[s] - 2) >= 0) instanceof IntPredicate cut
            && new IntSupplier[1] instanceof IntSupplier[] fx
            && (fx[0] = () -> g[2] > 0 && cnt[g[2]] <= 0 ? (--g[2] >= 0 ? fx[0].getAsInt() : -1) : g[2]) != null
            && IntStream.rangeClosed(1, m).allMatch(s -> (tp[s] == 1 ? plant.test(s) : cut.test(s))
                && (s - 9 < 1 || !alive[s - 9] || (inPos[s - 9] = true) && setv.applyAsInt(qa[s - 9], S[s - 9]) >= 0)
                && (ans[s] = fx[0].getAsInt()) >= 0)
            ? IntStream.rangeClosed(1, m).mapToObj(s -> String.valueOf(ans[s])).collect(Collectors.joining("\n")) : "");
    }
}
