import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Arrays.stream(t, 0, 7).collect(Collectors.joining()).chars().map(c -> "BRWY".indexOf(c)).toArray() instanceof int[] cc
            && IntStream.range(0, 10).map(i -> Integer.parseInt(t[7 + i])).toArray() instanceof int[] P
            && new int[]{0, 0, 0, 0, 1, 1, 1, 2, 2, 3} instanceof int[] pa
            && new int[]{3, 2, 1, 0, 3, 2, 1, 3, 2, 3} instanceof int[] pb
            && new int[16] instanceof int[] tid
            && IntStream.range(0, 10).allMatch(i -> (tid[pa[i] * 4 + pb[i]] = i) >= 0 && (tid[pb[i] * 4 + pa[i]] = i) >= 0)
            && new boolean[100] instanceof boolean[] shr
            && IntStream.range(0, 100).allMatch(q ->
                (shr[q] = pa[q / 10] == pa[q % 10] || pa[q / 10] == pb[q % 10] || pb[q / 10] == pa[q % 10] || pb[q / 10] == pb[q % 10]) || true)
            && new int[]{-1} instanceof int[] best
            && new int[56] instanceof int[] bpl
            && ((BiFunction<int[], int[], int[][]>) (dd, pp) ->
                new int[22][22] instanceof int[][] cap
                && new boolean[22] instanceof boolean[] vis
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> DF
                && IntStream.range(0, 10).allMatch(i ->
                    (cap[20][i] = dd[i]) >= 0
                    && (cap[10 + i][21] = pp[i]) >= 0
                    && IntStream.range(0, 10).allMatch(j -> !shr[i * 10 + j] || (cap[i][10 + j] = 1000) > 0))
                && DF.getAndSet((u, f) ->
                    u == 21 ? f
                    : !(vis[u] = true) ? 0
                    : IntStream.range(0, 22).filter(v -> !vis[v] && cap[u][v] > 0)
                        .map(v -> (Integer) DF.get().applyAsInt(v, Math.min(f, cap[u][v])) instanceof Integer r
                            && r > 0 && (cap[u][v] -= r) >= 0 && (cap[v][u] += r) > 0 ? r : 0)
                        .filter(r -> r > 0).findFirst().orElse(0)) == null
                && ((IntSupplier) () -> IntStream.range(0, 22).allMatch(z -> !(vis[z] = false)) ? DF.get().applyAsInt(20, 1000) : 0) instanceof IntSupplier push
                && IntStream.iterate(push.getAsInt(), q -> q > 0, q -> push.getAsInt()).sum() >= 0
                ? cap : null) instanceof BiFunction<int[], int[], int[][]> fl
            && IntStream.range(0, 56).map(tt -> cc[(tt % 7) * 8 + tt / 7]).toArray() instanceof int[] ct
            && IntStream.range(0, 56).mapToLong(c -> c % 7 < 6 ? 1L << (5 * tid[ct[c] * 4 + ct[Math.min(c + 1, 55)]]) : 0L).toArray() instanceof long[] hb
            && IntStream.range(0, 56).mapToLong(c -> c < 49 ? 1L << (5 * tid[ct[c] * 4 + ct[Math.min(c + 7, 55)]]) : 0L).toArray() instanceof long[] vb
            && new LongBinaryOperator[]{
                (k, c) -> ((k >>> 50) & 1L) != 0 ? (k & ((1L << 50) - 1)) | ((k >>> 51) << 50) : -1L,
                (k, c) -> ((k >>> 50) & 3L) == 0 && hb[(int) c] != 0 ? ((k & ((1L << 50) - 1)) + hb[(int) c]) | (((k >>> 51) | 1L) << 50) : -1L,
                (k, c) -> ((k >>> 50) & 1L) == 0 && vb[(int) c] != 0 ? ((k & ((1L << 50) - 1)) + vb[(int) c]) | (((k >>> 51) | 64L) << 50) : -1L
            } instanceof LongBinaryOperator[] fw
            && IntStream.range(0, 56).boxed().reduce(new ArrayList<long[]>(List.of(new long[]{0L})),
                (lst, c) -> LongStream.concat(
                        LongStream.concat(Arrays.stream(lst.get(c)).map(k -> fw[0].applyAsLong(k, c)), Arrays.stream(lst.get(c)).map(k -> fw[1].applyAsLong(k, c))),
                        Arrays.stream(lst.get(c)).map(k -> fw[2].applyAsLong(k, c))).filter(x -> x >= 0).sorted().toArray() instanceof long[] srt
                    && lst.add(IntStream.range(0, srt.length).filter(i -> i == 0 || srt[i] != srt[i - 1]).mapToLong(i -> srt[i]).toArray()) ? lst : lst,
                (x, y) -> x) instanceof ArrayList<long[]> lay
            && IntStream.range(0, 10).map(i -> (1 << pa[i]) | (1 << pb[i])).toArray() instanceof int[] cm
            && lay.get(56) instanceof long[] fin
            && IntStream.range(0, fin.length * 10).map(q -> (int) ((fin[q / 10] >> (5 * (q % 10))) & 31)).toArray() instanceof int[] dd
            && IntStream.range(0, 160).map(q -> (cm[q % 10] & ~(q / 10)) != 0 ? 1 : 0).toArray() instanceof int[] am
            && IntStream.range(0, 160).map(q -> (cm[q % 10] & (q / 10)) != 0 ? 1 : 0).toArray() instanceof int[] bm
            && IntStream.range(0, fin.length * 16).map(q ->
                (Integer) ((q / 16) * 10) instanceof Integer b
                && (Integer) ((q % 16) * 10) instanceof Integer xb
                ? 2 * Math.min(dd[b + 0], P[0]) + am[xb + 0] * Math.max(dd[b + 0] - P[0], 0) + bm[xb + 0] * Math.max(P[0] - dd[b + 0], 0)
                    + 2 * Math.min(dd[b + 1], P[1]) + am[xb + 1] * Math.max(dd[b + 1] - P[1], 0) + bm[xb + 1] * Math.max(P[1] - dd[b + 1], 0)
                    + 2 * Math.min(dd[b + 2], P[2]) + am[xb + 2] * Math.max(dd[b + 2] - P[2], 0) + bm[xb + 2] * Math.max(P[2] - dd[b + 2], 0)
                    + 2 * Math.min(dd[b + 3], P[3]) + am[xb + 3] * Math.max(dd[b + 3] - P[3], 0) + bm[xb + 3] * Math.max(P[3] - dd[b + 3], 0)
                    + 2 * Math.min(dd[b + 4], P[4]) + am[xb + 4] * Math.max(dd[b + 4] - P[4], 0) + bm[xb + 4] * Math.max(P[4] - dd[b + 4], 0)
                    + 2 * Math.min(dd[b + 5], P[5]) + am[xb + 5] * Math.max(dd[b + 5] - P[5], 0) + bm[xb + 5] * Math.max(P[5] - dd[b + 5], 0)
                    + 2 * Math.min(dd[b + 6], P[6]) + am[xb + 6] * Math.max(dd[b + 6] - P[6], 0) + bm[xb + 6] * Math.max(P[6] - dd[b + 6], 0)
                    + 2 * Math.min(dd[b + 7], P[7]) + am[xb + 7] * Math.max(dd[b + 7] - P[7], 0) + bm[xb + 7] * Math.max(P[7] - dd[b + 7], 0)
                    + 2 * Math.min(dd[b + 8], P[8]) + am[xb + 8] * Math.max(dd[b + 8] - P[8], 0) + bm[xb + 8] * Math.max(P[8] - dd[b + 8], 0)
                    + 2 * Math.min(dd[b + 9], P[9]) + am[xb + 9] * Math.max(dd[b + 9] - P[9], 0) + bm[xb + 9] * Math.max(P[9] - dd[b + 9], 0) : 0).toArray() instanceof int[] sco
            && IntStream.range(0, fin.length).map(k -> IntStream.range(0, 16).map(X -> sco[k * 16 + X]).min().getAsInt()).toArray() instanceof int[] ks
            && IntStream.range(0, fin.length).boxed().max(Comparator.comparingInt((Integer k) -> ks[k])).get() instanceof Integer bi
            && (Long) fin[bi] instanceof Long bk
            && new long[]{bk} instanceof long[] cur
            && IntStream.range(0, 56).map(i -> 55 - i).allMatch(c ->
                (Long) (cur[0] >>> 50) instanceof Long pf
                && (Long) (cur[0] & ((1L << 50) - 1)) instanceof Long vec
                && new long[]{
                    pf < 64 ? vec | (((pf << 1) | 1L) << 50) : -1L,
                    pf < 64 && (pf & 1L) != 0 && hb[c] != 0 ? (vec - hb[c]) | (((pf << 1) ^ 2L) << 50) : -1L,
                    (pf & 64L) != 0 && vb[c] != 0 ? (vec - vb[c]) | (((pf << 1) & 127L) << 50) : -1L} instanceof long[] cd
                && (Integer) IntStream.range(0, 3).filter(o -> cd[o] >= 0 && Arrays.binarySearch(lay.get(c), cd[o]) >= 0 && fw[o].applyAsLong(cd[o], c) == cur[0]).findFirst().getAsInt() instanceof Integer o0
                && (bpl[(c % 7) * 8 + c / 7] = o0 == 1 ? 8 : o0 == 2 ? 1 : 0) >= 0
                && (cur[0] = cd[o0]) >= 0)
            && IntStream.range(0, 56).filter(c -> bpl[c] != 0).toArray() instanceof int[] st
            && Arrays.stream(st).map(c -> tid[cc[c] * 4 + cc[c + bpl[c]]]).toArray() instanceof int[] ty
            && IntStream.range(0, 10).map(i -> (int) Arrays.stream(ty).filter(x -> x == i).count()).toArray() instanceof int[] D0
            && IntStream.range(0, 10).map(i -> Math.min(D0[i], P[i])).toArray() instanceof int[] ex
            && fl.apply(IntStream.range(0, 10).map(i -> D0[i] - ex[i]).toArray(), IntStream.range(0, 10).map(i -> P[i] - ex[i]).toArray()) instanceof int[][] cap2
            && IntStream.range(0, 10).mapToObj(i -> IntStream.range(0, 10).map(j -> cap2[10 + j][i]).toArray()).toArray(int[][]::new) instanceof int[][] fr
            && IntStream.generate(() -> -1).limit(st.length).toArray() instanceof int[] pill
            && new int[10] instanceof int[] used
            && IntStream.range(0, st.length).allMatch(d ->
                ex[ty[d]] <= 0 || ((pill[d] = ty[d]) >= 0 && --ex[ty[d]] >= 0 && ++used[ty[d]] > 0))
            && IntStream.range(0, st.length).allMatch(d ->
                pill[d] != -1
                || (IntStream.range(0, 10).filter(j -> fr[ty[d]][j] > 0).findFirst() instanceof OptionalInt o
                    && (!o.isPresent() || ((pill[d] = o.getAsInt()) >= 0 && --fr[ty[d]][o.getAsInt()] >= 0 && ++used[o.getAsInt()] > 0))))
            && IntStream.range(0, st.length).allMatch(d ->
                pill[d] != -1
                || (IntStream.range(0, 10).filter(j -> P[j] - used[j] > 0).findFirst() instanceof OptionalInt o2
                    && (pill[d] = o2.getAsInt()) >= 0 && ++used[o2.getAsInt()] > 0))
            && new int[56] instanceof int[] col
            && IntStream.range(0, st.length).allMatch(d ->
                (Integer) st[d] instanceof Integer c1
                && (Integer) (c1 + bpl[c1]) instanceof Integer c2
                && (Integer) ((cc[c1] == pa[pill[d]] ? 1 : 0) + (cc[c2] == pb[pill[d]] ? 1 : 0)) instanceof Integer s1
                && (Integer) ((cc[c1] == pb[pill[d]] ? 1 : 0) + (cc[c2] == pa[pill[d]] ? 1 : 0)) instanceof Integer s2
                && (col[c1] = s1 >= s2 ? pa[pill[d]] : pb[pill[d]]) >= 0
                && (col[c2] = s1 >= s2 ? pb[pill[d]] : pa[pill[d]]) >= 0)
            && IntStream.range(0, 13).mapToObj(i -> ".".repeat(15).toCharArray()).toArray(char[][]::new) instanceof char[][] out
            && IntStream.range(0, 56).allMatch(c -> (out[c / 8 * 2][c % 8 * 2] = "BRWY".charAt(col[c])) != 0)
            && Arrays.stream(st).allMatch(c -> bpl[c] == 1
                ? (out[c / 8 * 2][c % 8 * 2 + 1] = '-') != 0
                : (out[c / 8 * 2 + 1][c % 8 * 2] = '|') != 0)
            ? IntStream.range(0, 56).filter(c -> col[c] == cc[c]).count() + "\n"
                + Arrays.stream(out).map(String::new).collect(Collectors.joining("\n"))
            : "");
    }
}
