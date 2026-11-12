
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new long[]{-1, 0, 0, 0} instanceof long[] st && new int[300002] instanceof int[] a
            && IntStream.range(0, b.length + 1).filter(i -> i < b.length && b[i] >= 48 && b[i] <= 57 ? (st[0] = Math.max(st[0], 0) * 10 + b[i] - 48) >= 0
                : st[0] < 0 || (st[1] == 0 ? (st[2] = st[0]) >= 0 : (st[1] & 1) == 1 ? (st[3] = st[0]) >= 0 : (a[(int) st[3] - 1] = (int) st[0]) >= 0) && ++st[1] > 0 && (st[0] = -1) < 0).count() >= 0
            && (Integer) (int) st[2] instanceof Integer n
            && new int[n] instanceof int[] mx && new int[n] instanceof int[] mn && new int[2 * n + 3] instanceof int[] cnt && new int[2 * n + 3] instanceof int[] cn4 && new long[1] instanceof long[] tot
            && IntStream.range(0, n).filter(l -> new int[]{0, 1 << 30} instanceof int[] m
                && (tot[0] += IntStream.range(l, Math.min(n, (l | 15) + 1)).filter(r -> (m[0] = Math.max(m[0], a[r])) > 0 && (m[1] = Math.min(m[1], a[r])) > 0 && m[0] - m[1] == r - l).count()) >= 0).count() >= 0
            && IntStream.iterate(16, sz -> sz < n, sz -> sz * 2).filter(sz -> IntStream.range(0, (n + 2 * sz - 1) / (2 * sz)).filter(blk ->
                (Integer) (blk * 2 * sz) instanceof Integer lo && (Integer) (lo + sz) instanceof Integer mid && (Integer) Math.min(n, lo + 2 * sz) instanceof Integer hi
                && (mid >= hi
                    || IntStream.range(0, mid - lo).filter(d -> (mx[mid - 1 - d] = d == 0 ? a[mid - 1 - d] : Math.max(a[mid - 1 - d], mx[mid - d])) > 0 && (mn[mid - 1 - d] = d == 0 ? a[mid - 1 - d] : Math.min(a[mid - 1 - d], mn[mid - d])) > 0).count() >= 0
                    && IntStream.range(mid, hi).filter(j -> (mx[j] = j == mid ? a[j] : Math.max(a[j], mx[j - 1])) > 0 && (mn[j] = j == mid ? a[j] : Math.min(a[j], mn[j - 1])) > 0).count() >= 0
                    && (tot[0] += IntStream.range(lo, mid).filter(l -> l + mx[l] - mn[l] >= mid && l + mx[l] - mn[l] < hi && mx[l + mx[l] - mn[l]] < mx[l] && mn[l + mx[l] - mn[l]] > mn[l]).count()) >= 0
                    && (tot[0] += IntStream.range(mid, hi).filter(r -> r - mx[r] + mn[r] >= lo && r - mx[r] + mn[r] < mid && mx[r - mx[r] + mn[r]] < mx[r] && mn[r - mx[r] + mn[r]] > mn[r]).count()) >= 0
                    && new int[]{mid - 1, mid, mid} instanceof int[] s3 && new int[]{mid - 1, mid, mid} instanceof int[] s4
                    && IntStream.range(0, mid - lo + 2 * (hi - mid)).filter(t ->
                        (s3[0] < lo || (s3[2] < hi && mx[s3[2]] < mx[s3[0]]
                            ? cnt[s3[2] + mn[s3[2]]]++ >= 0 && ++s3[2] > 0
                            : s3[1] < s3[2] && mn[s3[1]] > mn[s3[0]]
                                ? cnt[s3[1] + mn[s3[1]]]-- >= 0 && ++s3[1] > 0
                                : (tot[0] += cnt[mx[s3[0]] + s3[0]]) >= 0 && --s3[0] >= -1))
                        & (s4[0] < lo || (s4[2] < hi && mn[s4[2]] > mn[s4[0]]
                            ? cn4[mx[s4[2]] - s4[2] + n]++ >= 0 && ++s4[2] > 0
                            : s4[1] < s4[2] && mx[s4[1]] < mx[s4[0]]
                                ? cn4[mx[s4[1]] - s4[1] + n]-- >= 0 && ++s4[1] > 0
                                : (tot[0] += cn4[mn[s4[0]] - s4[0] + n]) >= 0 && --s4[0] >= -1))).count() >= 0
                    && IntStream.range(s3[1], s3[2]).filter(x -> cnt[x + mn[x]]-- >= 0).count() >= 0
                    && IntStream.range(s4[1], s4[2]).filter(x -> cn4[mx[x] - x + n]-- >= 0).count() >= 0)).count() >= 0).count() >= 0
            ? tot[0] : 0);
    }
}



