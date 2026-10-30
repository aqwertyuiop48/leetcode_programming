import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer L && Integer.valueOf(v[2]) instanceof Integer W
            && new int[n + 1] instanceof int[] start && new int[2 * n] instanceof int[] adj && new int[2 * n] instanceof int[] wt
            && IntStream.range(1, n).allMatch(i -> (start[i + 1]++) >= 0 && (start[v[3 + 2 * (i - 1)]]++) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (start[i] += start[i - 1]) >= 0)
            && start.clone() instanceof int[] pos
            && IntStream.range(1, n).allMatch(i -> (adj[pos[i]] = v[3 + 2 * (i - 1)] - 1) >= 0 && (wt[pos[i]++] = v[4 + 2 * (i - 1)]) >= 0
                && (adj[pos[v[3 + 2 * (i - 1)] - 1]] = i) >= 0 && (wt[pos[v[3 + 2 * (i - 1)] - 1]++] = v[4 + 2 * (i - 1)]) >= 0)
            && new int[2 * n + 4] instanceof int[] bit && new int[2 * n + 4] instanceof int[] sbase && new int[2 * n + 4] instanceof int[] send
            && new AtomicReference<LongUnaryOperator>() instanceof AtomicReference<LongUnaryOperator> addR && new AtomicReference<LongUnaryOperator>() instanceof AtomicReference<LongUnaryOperator> qryR
            && addR.compareAndSet(null, x -> (x & 1048575) > (x >> 40) ? 0L : (bit[(int) (((x >> 20) & 1048575) + (x & 1048575))]++) * 0L + addR.get().applyAsLong(x + ((x & 1048575) & -(x & 1048575))))
            && qryR.compareAndSet(null, x -> (x & 1048575) == 0 ? 0L : bit[(int) (((x >> 20) & 1048575) + (x & 1048575))] + qryR.get().applyAsLong(x - ((x & 1048575) & -(x & 1048575))))
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] pp && new int[n] instanceof int[] D && new long[n] instanceof long[] Wd
            && new int[n] instanceof int[] sz && new int[n] instanceof int[] ptrp && new int[n] instanceof int[] stk && new int[n] instanceof int[] grp && new int[n] instanceof int[] wid && new int[n] instanceof int[] best
            && new boolean[n] instanceof boolean[] rem && new int[n + 1] instanceof int[] cq && new int[n + 1] instanceof int[] cs
            && new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1} instanceof int[] st && new long[1] instanceof long[] ans
            && IntStream.iterate(0, t -> st[6] < st[7], t -> t + 1).allMatch(t -> (st[5] = st[7] - st[6]) > 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[4] = 0) == 0
                && IntStream.iterate(0, z -> st[0] > 0 || st[4] < st[5], z -> z + 1).allMatch(z ->
                    st[0] == 0
                    ? (cs[st[4]] = st[1]) >= 0 && (ord[st[1]] = cq[st[6] + st[4]]) >= 0 && (pp[st[1]] = -1) < 0 && (D[st[1]] = 0) == 0 && (Wd[st[1]] = 0) == 0
                        && (ptrp[st[1]] = start[ord[st[1]]]) >= 0 && (stk[st[0]++] = st[1]++) >= 0 && ++st[4] > 0
                    : ptrp[stk[st[0] - 1]] == start[ord[stk[st[0] - 1]] + 1] ? --st[0] >= 0
                    : (st[2] = ptrp[stk[st[0] - 1]]++) >= 0 && (rem[adj[st[2]]] || (pp[stk[st[0] - 1]] >= 0 && adj[st[2]] == ord[pp[stk[st[0] - 1]]])
                        || (st[3] = st[1]++) >= 0 && (ord[st[3]] = adj[st[2]]) >= 0 && (pp[st[3]] = stk[st[0] - 1]) >= 0 && (D[st[3]] = D[stk[st[0] - 1]] + 1) > 0
                        && (Wd[st[3]] = Math.min(Wd[stk[st[0] - 1]] + wt[st[2]], W + 1L)) >= 0 && (ptrp[st[3]] = start[adj[st[2]]]) >= 0 && (stk[st[0]++] = st[3]) >= 0))
                && IntStream.range(0, st[1]).allMatch(i -> (sz[i] = 1) > 0 && (wid[i] = pp[i] < 0 ? i : wid[pp[i]]) >= 0 && (grp[i] = pp[i] < 0 ? -1 : pp[pp[i]] < 0 ? i : grp[pp[i]]) > -2 && (best[i] = -1) < 0)
                && IntStream.iterate(st[1] - 1, i -> i >= 0, i -> i - 1).allMatch(i -> pp[i] < 0 || (sz[pp[i]] += sz[i]) > 0)
                && (t == 0
                    ? (cq[st[8]++] = ord[IntStream.range(0, st[1]).filter(i -> 2 * sz[i] >= st[1]).reduce((a, b) -> sz[a] <= sz[b] ? a : b).getAsInt()]) >= 0
                    : IntStream.range(0, st[1]).allMatch(i -> pp[i] < 0 || 2 * sz[i] < sz[grp[i]] || (best[grp[i]] >= 0 && sz[best[grp[i]]] <= sz[i]) || (best[grp[i]] = i) >= 0)
                    && IntStream.range(0, st[1]).filter(q -> pp[q] >= 0 && pp[pp[q]] < 0 && sz[q] >= 2).allMatch(q -> (cq[st[8]++] = ord[best[q]]) >= 0)
                    && LongStream.concat(IntStream.range(0, st[1]).mapToLong(i -> (((long) (wid[i] ^ 65536)) << 47) | (Wd[i] << 17) | D[i]),
                        IntStream.range(0, st[1]).filter(i -> pp[i] >= 0).mapToLong(i -> (((long) (grp[i] ^ 65536)) << 47) | (Wd[i] << 17) | D[i])).sorted().toArray() instanceof long[] K
                    && IntStream.range(0, K.length).allMatch(x -> (sbase[x] = x > 0 && (K[x] >> 47) == (K[x - 1] >> 47) ? sbase[x - 1] : x) >= 0)
                    && IntStream.iterate(K.length - 1, x -> x >= 0, x -> x - 1).allMatch(x -> (send[x] = x < K.length - 1 && (K[x] >> 47) == (K[x + 1] >> 47) ? send[x + 1] : x + 1) > 0)
                    && LongStream.concat(IntStream.range(0, K.length).mapToLong(x -> ((long) sbase[x] << 40) | ((2L * (K[x] & 131071)) << 20) | x),
                        IntStream.range(0, K.length).filter(x -> (K[x] & 131071) <= L && ((K[x] >> 17) & 1073741823L) <= W).mapToLong(x -> ((long) sbase[x] << 40) | ((2L * (L - (K[x] & 131071)) + 1) << 20) | x)).sorted().toArray() instanceof long[] ev
                    && new long[1] instanceof long[] tot
                    && Arrays.stream(ev).allMatch(e -> Integer.valueOf((int) (e & 1048575)) instanceof Integer x
                        && (((e >> 20) & 1) == 0 ? addR.get().applyAsLong(((long) (send[x] - sbase[x]) << 40) | ((long) sbase[x] << 20) | (x - sbase[x] + 1)) >= 0
                            : Integer.valueOf(-Arrays.binarySearch(K, sbase[x], send[x], ((K[x] >> 47) << 47) | (((W - ((K[x] >> 17) & 1073741823L) + 1) << 17) - 1)) - 1) instanceof Integer ins
                            && (tot[0] += (pp[(int) (((K[x] >> 47) & 131071) ^ 65536)] < 0 ? 1 : -1) * (qryR.get().applyAsLong(((long) sbase[x] << 20) | (ins - sbase[x])) - (x < ins && 2 * (K[x] & 131071) <= L ? 1 : 0))) > Long.MIN_VALUE))
                    && (ans[0] += tot[0] / 2) > Long.MIN_VALUE
                    && IntStream.range(0, K.length + 2).allMatch(q -> (bit[q] = 0) == 0)
                    && IntStream.range(0, st[5]).allMatch(j -> rem[ord[cs[j]]] = true))
                && (st[6] = st[7]) > 0 && (st[7] = st[8]) > 0)
            ? ans[0] : "");
    }
}
