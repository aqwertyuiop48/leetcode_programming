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
            && new int[56] instanceof int[] pl
            && new int[56] instanceof int[] bpl
            && new HashSet<Long>() instanceof HashSet<Long> seen
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
            && ((LongToIntFunction) key ->
                IntStream.range(0, 10).map(i -> (int) ((key >> (5 * i)) & 31)).toArray() instanceof int[] D
                && IntStream.range(0, 10).map(i -> Math.min(D[i], P[i])).toArray() instanceof int[] E
                && (Integer) Arrays.stream(E).sum() instanceof Integer se
                && se + 28 > best[0]
                && fl.apply(IntStream.range(0, 10).map(i -> D[i] - E[i]).toArray(), IntStream.range(0, 10).map(i -> P[i] - E[i]).toArray()) instanceof int[][] cap
                ? 2 * se + IntStream.range(0, 10).map(j -> cap[21][10 + j]).sum() : -1) instanceof LongToIntFunction sc
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> R
            && R.getAndSet((mask, key) ->
                (Integer) Long.numberOfTrailingZeros(~mask) instanceof Integer cell
                ? (cell >= 56
                    ? (((seen.add(key)
                            && (Integer) sc.applyAsInt(key) instanceof Integer s
                            && s > best[0]
                            && (best[0] = s) >= 0
                            && IntStream.range(0, 56).allMatch(i -> (bpl[i] = pl[i]) >= 0)) || true)
                        && best[0] < 56 ? 1L : 0L)
                    : ((!(cell % 8 < 7 && ((mask >> (cell + 1)) & 1) == 0)
                            || ((pl[cell] = 1) == 1 && (pl[cell + 1] = 0) == 0
                                && R.get().applyAsLong(mask | (3L << cell), key + (1L << (5 * tid[cc[cell] * 4 + cc[cell + 1]]))) == 1L))
                        && (cell >= 48
                            || ((pl[cell] = 8) == 8 && (pl[cell + 8] = 0) == 0
                                && R.get().applyAsLong(mask | (1L << cell) | (1L << (cell + 8)), key + (1L << (5 * tid[cc[cell] * 4 + cc[cell + 8]]))) == 1L))
                        ? 1L : 0L))
                : 0L) == null
            && R.get().applyAsLong(0L, 0L) >= 0
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
