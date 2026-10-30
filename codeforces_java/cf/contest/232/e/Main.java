import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[2] instanceof int[] ps && new int[raw.length + 1] instanceof int[] acc
            && Stream.of(0).peek(z -> Arrays.setAll(acc, i -> i < raw.length && raw[i] >= '0' && raw[i] <= '9' ? (i > 0 ? acc[i - 1] : 0) * 10 + raw[i] - '0'
                : i > 0 && raw[i - 1] >= '0' && raw[i - 1] <= '9' ? (t[ps[1]++] = acc[i - 1]) * 0 : 0)).findFirst().isPresent()
            && (Integer) t[0] instanceof Integer n && (Integer) t[1] instanceof Integer m && (Integer) t[2] instanceof Integer q
            && IntStream.range(0, Math.min(raw.length, t[0] * (t[1] + 2) + 32)).filter(i -> raw[i] == '.' || raw[i] == '#').map(i -> raw[i] == '.' ? 1 : 0).toArray() instanceof int[] g
            && new int[q] instanceof int[] mids && new int[n + 2] instanceof int[] cnt
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] nodeOf
            && (nodeOf[0] = (lohi, key) -> (Integer) (int) (((lohi >> 10) + (lohi & 1023)) >> 1) instanceof Integer mid
                ? (key >> 10) > mid ? nodeOf[0].applyAsLong(((long) (mid + 1) << 10) | (lohi & 1023), key)
                    : (key & 1023) < mid ? nodeOf[0].applyAsLong(((lohi >> 10) << 10) | (mid - 1), key) : mid : 0L) != null
            && IntStream.range(0, q).allMatch(i -> (mids[i] = (int) nodeOf[0].applyAsLong((long) (n - 1), ((long) (t[3 + 4 * i] - 1) << 10) | (t[5 + 4 * i] - 1))) >= 0 && ++cnt[mids[i] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(i -> (cnt[i] += cnt[i - 1]) >= 0)
            && cnt.clone() instanceof int[] fp && new int[q] instanceof int[] ord
            && IntStream.range(0, q).allMatch(i -> (ord[fp[mids[i]]++] = i) >= 0)
            && new boolean[q] instanceof boolean[] ans
            && (Integer) (32 - Integer.numberOfLeadingZeros(Math.max(m, 2) - 1)) instanceof Integer sh && (Integer) (1 << sh) instanceof Integer mp
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] rec
            && (rec[0] = (lo, hi) -> lo > hi ? 0
                : (Integer) ((lo + hi) >> 1) instanceof Integer mid
                    && (cnt[mid + 1] == cnt[mid]
                        || new long[(mid - lo + 1) * mp * 8] instanceof long[] L && new long[(hi - mid + 1) * mp * 8] instanceof long[] R
                        && Stream.of(0).peek(z0 -> Arrays.setAll(L, idx -> (idx >> 3 & mp - 1) >= m || g[(mid - (idx >> 3 >> sh)) * m + m - 1 - (idx >> 3 & mp - 1)] == 0 ? 0L
                                : (idx >> 3 >> sh > 0 ? L[idx - 8 * mp] : 0L) | ((idx >> 3 & mp - 1) > 0 ? L[idx - 8] : 0L)
                                    | (idx >> 3 >> sh == 0 && ((m - 1 - (idx >> 3 & mp - 1)) >> 6) == (idx & 7) ? 1L << ((m - 1 - (idx >> 3 & mp - 1)) & 63) : 0L)))
                            .peek(z1 -> Arrays.setAll(R, idx -> (idx >> 3 & mp - 1) >= m || g[(mid + (idx >> 3 >> sh)) * m + (idx >> 3 & mp - 1)] == 0 ? 0L
                                : (idx >> 3 >> sh > 0 ? R[idx - 8 * mp] : 0L) | ((idx >> 3 & mp - 1) > 0 ? R[idx - 8] : 0L)
                                    | (idx >> 3 >> sh == 0 && ((idx >> 3 & mp - 1) >> 6) == (idx & 7) ? 1L << ((idx >> 3 & mp - 1) & 63) : 0L)))
                            .peek(z2 -> IntStream.range(cnt[mid], cnt[mid + 1]).forEach(j -> ans[ord[j]] = (Integer) (((mid - t[3 + 4 * ord[j]] + 1) * mp + m - t[4 + 4 * ord[j]]) * 8) instanceof Integer bl
                                && (Integer) (((t[5 + 4 * ord[j]] - 1 - mid) * mp + t[6 + 4 * ord[j]] - 1) * 8) instanceof Integer br
                                && ((L[bl] & R[br]) | (L[bl + 1] & R[br + 1]) | (L[bl + 2] & R[br + 2]) | (L[bl + 3] & R[br + 3]) | (L[bl + 4] & R[br + 4]) | (L[bl + 5] & R[br + 5]) | (L[bl + 6] & R[br + 6]) | (L[bl + 7] & R[br + 7])) != 0)).findFirst().isPresent())
                    ? rec[0].applyAsInt(lo, mid - 1) + rec[0].applyAsInt(mid + 1, hi) : 0) != null
            && rec[0].applyAsInt(0, n - 1) >= 0
            ? IntStream.range(0, q).mapToObj(i -> ans[i] ? "Yes" : "No").collect(Collectors.joining("\n")) : "");
    }
}
