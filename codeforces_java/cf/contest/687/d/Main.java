import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && Integer.valueOf(v[2]) instanceof Integer q
            && IntStream.range(0, m).mapToLong(i -> ((long) v[5 + 3 * i] << 17) | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, m).map(s -> (int) (keys[m - 1 - s] & 131071)).toArray() instanceof int[] eid
            && IntStream.range(0, m).map(s -> v[3 + 3 * eid[s]] - 1).toArray() instanceof int[] ea
            && IntStream.range(0, m).map(s -> v[4 + 3 * eid[s]] - 1).toArray() instanceof int[] eb
            && IntStream.range(0, m).map(s -> v[5 + 3 * eid[s]]).toArray() instanceof int[] ew
            && new int[m] instanceof int[] sPos && IntStream.range(0, m).filter(s -> (sPos[eid[s]] = s) < 0).count() == 0
            && new int[]{Integer.MAX_VALUE} instanceof int[] tgt
            && ((Supplier<IntUnaryOperator[]>) () -> new int[n] instanceof int[] p && new int[n] instanceof int[] par && new int[n] instanceof int[] stamp && new int[n] instanceof int[] col && new int[1] instanceof int[] cur && new int[2] instanceof int[] rr && new int[1] instanceof int[] uc && new int[1] instanceof int[] frozen
                && new IntUnaryOperator[1] instanceof IntUnaryOperator[] ff
                && (ff[0] = x -> (stamp[x] != cur[0] ? (stamp[x] = cur[0]) * 0 + (p[x] = x) * 0 + (par[x] = 0) : 0) + (p[x] == x ? x : (par[x] ^= ff[0].applyAsInt(p[x]) * 0 + par[p[x]]) * 0 + (p[x] = p[p[x]]))) != null
                ? new IntUnaryOperator[]{x -> (cur[0]++) * 0 + (uc[0] = 0) * 0 + (frozen[0] = 0), c -> frozen[0] == 1 ? (col[ea[c]] == col[eb[c]] ? 2 : 0) : (rr[0] = ff[0].applyAsInt(ea[c])) != (rr[1] = ff[0].applyAsInt(eb[c]))
                    ? (p[rr[0]] = rr[1]) * 0 + (par[rr[0]] = par[ea[c]] ^ par[eb[c]] ^ 1) * 0 + (++uc[0] == tgt[0] ? (int) IntStream.range(0, n).filter(u -> (col[u] = ff[0].applyAsInt(u) * 0 + par[u]) < 0).count() * 0 + (frozen[0] = 1) * 0 : 0) + 1
                    : par[ea[c]] == par[eb[c]] ? 2 : 0} : null) instanceof Supplier<IntUnaryOperator[]> mk
            && mk.get() instanceof IntUnaryOperator[] wp && wp[0].applyAsInt(0) >= 0 && (tgt[0] = (int) IntStream.range(0, m).filter(c -> wp[1].applyAsInt(c) == 1).count()) >= 0
            && mk.get() instanceof IntUnaryOperator[] bp && new int[1] instanceof int[] stop
            && ((Function<int[], int[]>) cand -> (stop[0] = 0) == 0 && bp[0].applyAsInt(0) >= 0
                ? Arrays.stream(cand).filter(c -> stop[0] == 0 && Integer.valueOf(bp[1].applyAsInt(c)) instanceof Integer r && r > 0 && (r < 2 || (stop[0] = 1) > 0)).toArray() : null) instanceof Function<int[], int[]> build
            && Integer.valueOf(128) instanceof Integer B
            && Integer.valueOf((m + B - 1) / B) instanceof Integer nb && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * nb - 1))) instanceof Integer NB
            && new int[2 * NB][] instanceof int[][] T
            && IntStream.range(0, NB).filter(t -> (T[NB + t] = build.apply(IntStream.range(t * B, Math.min(m, t * B + B)).map(i -> sPos[i]).sorted().toArray())) == null).count() == 0
            && IntStream.range(1, NB).map(i -> NB - i).filter(nd -> (T[nd] = build.apply(IntStream.concat(Arrays.stream(T[2 * nd]), Arrays.stream(T[2 * nd + 1])).sorted().toArray())) == null).count() == 0
            && Integer.valueOf((m + 63) / 64 + 1) instanceof Integer W
            ? IntStream.range(0, 4).parallel().mapToObj(ch -> mk.get() instanceof IntUnaryOperator[] qp && new long[W] instanceof long[] bits && new int[2] instanceof int[] st
                ? IntStream.range(q * ch / 4, q * (ch + 1) / 4).mapToObj(j -> Integer.valueOf(v[3 + 3 * m + 2 * j] - 1) instanceof Integer l && Integer.valueOf(v[4 + 3 * m + 2 * j] - 1) instanceof Integer r
                    && qp[0].applyAsInt(0) >= 0 && Integer.valueOf(l / B) instanceof Integer bl && Integer.valueOf(r / B) instanceof Integer br
                    && IntStream.rangeClosed(l, bl == br ? r : bl * B + B - 1).filter(i -> (bits[sPos[i] >> 6] |= 1L << sPos[i]) == 0).count() == 0
                    && IntStream.rangeClosed(br * B, bl == br ? -1 : r).filter(i -> (bits[sPos[i] >> 6] |= 1L << sPos[i]) == 0).count() == 0
                    && (st[0] = NB + bl + 1) > 0 && (st[1] = NB + br) > 0
                    && IntStream.generate(() -> 0).takeWhile(z -> st[0] < st[1] && ((st[0] & 1) == 1 ? Arrays.stream(T[st[0]++]).filter(s -> (bits[s >> 6] |= 1L << s) == 0).count() == 0 : true)
                        && ((st[1] & 1) == 1 ? Arrays.stream(T[--st[1]]).filter(s -> (bits[s >> 6] |= 1L << s) == 0).count() == 0 : true)
                        && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0).count() >= 0
                    && Integer.valueOf(IntStream.range(0, W).flatMap(w -> LongStream.iterate(bits[w], bb -> bb != 0, bb -> bb & (bb - 1)).mapToInt(bb -> (w << 6) + Long.numberOfTrailingZeros(bb)))
                        .filter(c -> qp[1].applyAsInt(c) == 2).map(c -> ew[c]).findFirst().orElse(-1)) instanceof Integer ans
                    && IntStream.range(0, W).filter(w -> (bits[w] = 0L) < 0).count() == 0 ? String.valueOf(ans) : "").collect(Collectors.joining(String.valueOf((char) 10))) : "")
                .filter(s -> s.length() > 0).collect(Collectors.joining(String.valueOf((char) 10))) : "");
    }
}
