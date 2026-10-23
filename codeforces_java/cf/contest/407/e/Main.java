import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Long) Long.parseLong(tk.nextToken()) instanceof Long k && (Long) Long.parseLong(tk.nextToken()) instanceof Long d
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && new int[]{0, 0, 1} instanceof int[] bst
            ? d == 0
                ? (IntStream.range(0, n).allMatch(r -> (r > 0 && a[r] == a[r - 1] ? ++bst[2] > 0 : (bst[2] = 1) > 0) && (bst[2] <= bst[1] || ((bst[1] = bst[2]) > 0 && (bst[0] = r - bst[2] + 1) >= 0))) ? (bst[0] + 1) + " " + (bst[0] + bst[1]) : (bst[0] + 1) + " " + (bst[0] + bst[1]))
                : (LongStream.of(a).map(v -> Math.floorDiv(v, d)).toArray() instanceof long[] b
                    && new long[4 * n] instanceof long[] mn && new long[4 * n] instanceof long[] lz && new Object[3] instanceof Object[] ref
                    && (ref[0] = (Predicate<long[]>) q -> q[1] == q[2] ? (mn[(int) q[0]] = q[1]) >= 0
                        : ((Predicate<long[]>) ref[0]).test(new long[]{2 * q[0], q[1], (q[1] + q[2]) / 2}) && ((Predicate<long[]>) ref[0]).test(new long[]{2 * q[0] + 1, (q[1] + q[2]) / 2 + 1, q[2]}) && (mn[(int) q[0]] = Math.min(mn[(int) (2 * q[0])], mn[(int) (2 * q[0] + 1)])) >= 0) != null
                    && ((Predicate<long[]>) ref[0]).test(new long[]{1, 0, n - 1})
                    && (ref[1] = (Predicate<long[]>) q -> q[3] > q[2] || q[4] < q[1] || (q[3] <= q[1] && q[2] <= q[4] ? (mn[(int) q[0]] += q[5]) > Long.MIN_VALUE && (lz[(int) q[0]] += q[5]) > Long.MIN_VALUE
                        : (lz[(int) q[0]] == 0 || (mn[(int) (2 * q[0])] += lz[(int) q[0]]) > Long.MIN_VALUE && (lz[(int) (2 * q[0])] += lz[(int) q[0]]) > Long.MIN_VALUE && (mn[(int) (2 * q[0] + 1)] += lz[(int) q[0]]) > Long.MIN_VALUE && (lz[(int) (2 * q[0] + 1)] += lz[(int) q[0]]) > Long.MIN_VALUE && (lz[(int) q[0]] = 0) == 0)
                            && ((Predicate<long[]>) ref[1]).test(new long[]{2 * q[0], q[1], (q[1] + q[2]) / 2, q[3], q[4], q[5]}) && ((Predicate<long[]>) ref[1]).test(new long[]{2 * q[0] + 1, (q[1] + q[2]) / 2 + 1, q[2], q[3], q[4], q[5]})
                            && (mn[(int) q[0]] = Math.min(mn[(int) (2 * q[0])], mn[(int) (2 * q[0] + 1)])) > Long.MIN_VALUE)) != null
                    && (ref[2] = (ToIntFunction<long[]>) q -> q[3] > q[2] || q[4] < q[1] || mn[(int) q[0]] > q[5] ? -1 : q[1] == q[2] ? (int) q[1]
                        : (lz[(int) q[0]] == 0 || (mn[(int) (2 * q[0])] += lz[(int) q[0]]) > Long.MIN_VALUE && (lz[(int) (2 * q[0])] += lz[(int) q[0]]) > Long.MIN_VALUE && (mn[(int) (2 * q[0] + 1)] += lz[(int) q[0]]) > Long.MIN_VALUE && (lz[(int) (2 * q[0] + 1)] += lz[(int) q[0]]) > Long.MIN_VALUE && (lz[(int) q[0]] = 0) == 0)
                            && (Integer) ((ToIntFunction<long[]>) ref[2]).applyAsInt(new long[]{2 * q[0], q[1], (q[1] + q[2]) / 2, q[3], q[4], q[5]}) instanceof Integer lres && lres >= 0 ? lres
                            : ((ToIntFunction<long[]>) ref[2]).applyAsInt(new long[]{2 * q[0] + 1, (q[1] + q[2]) / 2 + 1, q[2], q[3], q[4], q[5]})) != null
                    && new int[n] instanceof int[] smax && new int[n] instanceof int[] smin && new int[]{0, 0, 0, 0, 1} instanceof int[] st && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> last
                    && IntStream.range(0, n).allMatch(r -> (Integer) (r > 0 && Math.floorMod(a[r], d) == Math.floorMod(a[r - 1], d) ? st[3] : r) instanceof Integer bs
                        && (st[3] = bs) >= 0 && (st[2] = Math.max(st[2], Math.max(bs, last.getOrDefault(a[r], -1) + 1))) >= 0 && (last.put(a[r], r) == null || true)
                        && (IntStream.range(0, n).anyMatch(t -> !(st[0] > 0 && b[smax[st[0] - 1]] <= b[r] && ((Predicate<long[]>) ref[1]).test(new long[]{1, 0, n - 1, st[0] > 1 ? smax[st[0] - 2] + 1 : 0, smax[st[0] - 1], b[r] - b[smax[st[0] - 1]]}) && --st[0] >= 0)) || true) && (smax[st[0]++] = r) >= 0
                        && (IntStream.range(0, n).anyMatch(t -> !(st[1] > 0 && b[smin[st[1] - 1]] >= b[r] && ((Predicate<long[]>) ref[1]).test(new long[]{1, 0, n - 1, st[1] > 1 ? smin[st[1] - 2] + 1 : 0, smin[st[1] - 1], b[smin[st[1] - 1]] - b[r]}) && --st[1] >= 0)) || true) && (smin[st[1]++] = r) >= 0
                        && (Integer) ((ToIntFunction<long[]>) ref[2]).applyAsInt(new long[]{1, 0, n - 1, st[2], r, k + r}) instanceof Integer l
                        && (l < 0 || r - l + 1 <= bst[1] || ((bst[1] = r - l + 1) > 0 && (bst[0] = l) >= 0)))
                    ? (bst[0] + 1) + " " + (bst[0] + bst[1]) : "") : "");
    }
}
