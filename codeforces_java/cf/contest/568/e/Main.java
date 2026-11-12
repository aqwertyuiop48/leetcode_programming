import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] == 45 ? (st[3] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[3] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[2] = 0) + (st[3] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && Arrays.copyOfRange(nums, 1, n + 1) instanceof int[] a
            && (Integer) nums[n + 1] instanceof Integer m
            && Arrays.stream(nums, n + 2, n + 2 + m).sorted().toArray() instanceof int[] sb
            && IntStream.range(0, m).filter(i -> i == 0 || sb[i] != sb[i - 1]).toArray() instanceof int[] starts
            && (Integer) starts.length instanceof Integer mm
            && IntStream.range(0, mm).map(t -> sb[starts[t]]).toArray() instanceof int[] bs
            && IntStream.range(0, mm).map(t -> (t + 1 < mm ? starts[t + 1] : m) - starts[t]).toArray() instanceof int[] cnt
            && Arrays.copyOf(bs, mm + 1) instanceof int[] bsx
            && (bsx[mm] = Integer.MAX_VALUE) > 0
            && ((IntUnaryOperator) r -> (r ^ (r >> 31)) + 1 + (r >> 31)) instanceof IntUnaryOperator fx
            && ((IntUnaryOperator) x -> fx.applyAsInt(Arrays.binarySearch(bs, x))) instanceof IntUnaryOperator nbi
            && IntStream.rangeClosed(0, n + 1).map(i -> i == 0 ? 0 : Integer.MAX_VALUE).toArray() instanceof int[] c
            && new int[n + 2] instanceof int[] idx
            && new int[n] instanceof int[] lenAt
            && new int[n] instanceof int[] prevPos
            && new int[n] instanceof int[] prevVal
            && new int[]{0} instanceof int[] ll
            && new int[n + 3] instanceof int[] sIdx
            && IntStream.range(0, n).filter(i -> a[i] >= 0
                ? (Integer) Arrays.binarySearch(c, 1, ll[0] + 1, a[i]) instanceof Integer r
                    && (Integer) (r >= 0 ? r : -r - 1) instanceof Integer l
                    && (lenAt[i] = l) >= 0 && (prevPos[i] = idx[l - 1]) >= 0 && (prevVal[i] = c[l - 1]) >= 0
                    && (a[i] < c[l] ? (c[l] = a[i]) >= 0 && (idx[l] = i) >= 0 && (sIdx[l + 1] = nbi.applyAsInt(a[i])) >= 0 : true)
                    && (ll[0] = Math.max(ll[0], l)) >= 0
                : (Integer) ll[0] instanceof Integer l0
                    && LongStream.rangeClosed(-l0 - 1, -1).map(t -> bsx[sIdx[(int) -t]] < c[(int) -t] ? (c[(int) -t] = bsx[sIdx[(int) -t]]) * 0 + (idx[(int) -t] = i) * 0 + (sIdx[1 - (int) t] = sIdx[(int) -t] + 1) * 0 : 0).sum() >= 0
                    && (ll[0] = c[l0 + 1] < Integer.MAX_VALUE ? l0 + 1 : l0) >= 0).count() >= 0
            && (Integer) ll[0] instanceof Integer lf
            && a.clone() instanceof int[] res
            && IntStream.range(0, n).filter(i -> a[i] >= 0).mapToLong(i -> lenAt[i] * (long) (n + 1) + i).sorted().toArray() instanceof long[] kk
            && IntStream.range(0, n).filter(i -> a[i] < 0).toArray() instanceof int[] gp
            && Stream.iterate(new int[]{idx[lf], c[lf], lf}, s -> s[2] > 0, s ->
                s[2] == 1 ? new int[]{0, 0, 0}
                : a[s[0]] >= 0 ? new int[]{prevPos[s[0]], prevVal[s[0]], s[2] - 1}
                : (Integer) Arrays.binarySearch(kk, (long) (s[2] - 1) * (n + 1) + s[0] - 1) instanceof Integer r2
                    && (Integer) (r2 >= 0 ? r2 : -r2 - 2) instanceof Integer ins
                    && ins >= 0 && kk[ins] / (n + 1) == s[2] - 1 && a[(int) (kk[ins] % (n + 1))] < s[1]
                    ? new int[]{(int) (kk[ins] % (n + 1)), a[(int) (kk[ins] % (n + 1))], s[2] - 1}
                    : new int[]{gp[Arrays.binarySearch(gp, s[0]) - 1], bs[Arrays.binarySearch(bs, s[1]) - 1], s[2] - 1})
                .filter(s -> a[s[0]] < 0 ? (res[s[0]] = s[1]) >= 0 && (cnt[Arrays.binarySearch(bs, s[1])]--) >= 0 : true).count() >= 0
            && IntStream.range(0, m).filter(j -> (Integer) Arrays.binarySearch(starts, j) instanceof Integer rj && (Integer) (rj >= 0 ? rj : -rj - 2) instanceof Integer tj && j - starts[tj] < cnt[tj]).map(j -> sb[j]).toArray() instanceof int[] left
            && new int[]{0} instanceof int[] q
            && IntStream.range(0, n).filter(i -> res[i] < 0 && (res[i] = left[q[0]++]) >= 0 || true).count() >= 0
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
