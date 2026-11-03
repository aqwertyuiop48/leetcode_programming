import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[4] instanceof int[] s && new int[buf.length / 2 + 4] instanceof int[] tk
            && IntStream.rangeClosed(0, buf.length).filter(i -> i < buf.length && (buf[i] >= '0' || buf[i] == '-')
                ? buf[i] == '-' ? (s[3] = 1) > 0 : (s[0] = s[0] * 10 + buf[i] - '0') >= 0 && (s[2] = 1) > 0
                : s[2] == 1 && (tk[s[1]++] = s[3] == 1 ? -s[0] : s[0]) != 1 << 31 && (s[0] = 0) == 0 && (s[2] = 0) == 0 && (s[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> new int[]{tk[2 + 3 * i], tk[3 + 3 * i], tk[4 + 3 * i]}).sorted(Comparator.comparingInt(a -> a[0])).toArray(int[][]::new) instanceof int[][] vr
            && IntStream.range(0, m).mapToObj(i -> new int[]{tk[2 + 3 * n + 3 * i], tk[3 + 3 * n + 3 * i], tk[4 + 3 * n + 3 * i]}).toArray(int[][]::new) instanceof int[][] hr
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt(i -> hr[i][0])).mapToInt(Integer::intValue).toArray() instanceof int[] so
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt(i -> hr[i][0] + hr[i][2])).mapToInt(Integer::intValue).toArray() instanceof int[] eo
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt(i -> hr[i][1])).mapToInt(Integer::intValue).toArray() instanceof int[] yo
            && new int[m] instanceof int[] slot && IntStream.range(0, m).allMatch(j -> (slot[yo[j]] = j + 1) > 0)
            && IntStream.range(0, m).map(j -> 2 * hr[yo[j]][1]).toArray() instanceof int[] sy2
            && IntStream.range(0, m).map(j -> 2 * hr[so[j]][0]).toArray() instanceof int[] sx2
            && IntStream.range(0, m).map(j -> 2 * (hr[eo[j]][0] + hr[eo[j]][2])).toArray() instanceof int[] ex2
            && ((IntPredicate) k -> new int[2] instanceof int[] pt && new int[65537] instanceof int[] bit
                && ((IntBinaryOperator) (r, d) -> Integer.valueOf(r) instanceof Integer j0 && bit[j0] + (bit[j0] += d) >= 0
                && Integer.valueOf(Math.min(j0 + (j0 & -j0), 65536)) instanceof Integer j1 && bit[j1] + (bit[j1] += d) >= 0
                && Integer.valueOf(Math.min(j1 + (j1 & -j1), 65536)) instanceof Integer j2 && bit[j2] + (bit[j2] += d) >= 0
                && Integer.valueOf(Math.min(j2 + (j2 & -j2), 65536)) instanceof Integer j3 && bit[j3] + (bit[j3] += d) >= 0
                && Integer.valueOf(Math.min(j3 + (j3 & -j3), 65536)) instanceof Integer j4 && bit[j4] + (bit[j4] += d) >= 0
                && Integer.valueOf(Math.min(j4 + (j4 & -j4), 65536)) instanceof Integer j5 && bit[j5] + (bit[j5] += d) >= 0
                && Integer.valueOf(Math.min(j5 + (j5 & -j5), 65536)) instanceof Integer j6 && bit[j6] + (bit[j6] += d) >= 0
                && Integer.valueOf(Math.min(j6 + (j6 & -j6), 65536)) instanceof Integer j7 && bit[j7] + (bit[j7] += d) >= 0
                && Integer.valueOf(Math.min(j7 + (j7 & -j7), 65536)) instanceof Integer j8 && bit[j8] + (bit[j8] += d) >= 0
                && Integer.valueOf(Math.min(j8 + (j8 & -j8), 65536)) instanceof Integer j9 && bit[j9] + (bit[j9] += d) >= 0
                && Integer.valueOf(Math.min(j9 + (j9 & -j9), 65536)) instanceof Integer j10 && bit[j10] + (bit[j10] += d) >= 0
                && Integer.valueOf(Math.min(j10 + (j10 & -j10), 65536)) instanceof Integer j11 && bit[j11] + (bit[j11] += d) >= 0
                && Integer.valueOf(Math.min(j11 + (j11 & -j11), 65536)) instanceof Integer j12 && bit[j12] + (bit[j12] += d) >= 0
                && Integer.valueOf(Math.min(j12 + (j12 & -j12), 65536)) instanceof Integer j13 && bit[j13] + (bit[j13] += d) >= 0
                && Integer.valueOf(Math.min(j13 + (j13 & -j13), 65536)) instanceof Integer j14 && bit[j14] + (bit[j14] += d) >= 0
                && Integer.valueOf(Math.min(j14 + (j14 & -j14), 65536)) instanceof Integer j15 && bit[j15] + (bit[j15] += d) >= 0
                && Integer.valueOf(Math.min(j15 + (j15 & -j15), 65536)) instanceof Integer j16 && bit[j16] + (bit[j16] += d) >= 0
                    ? 0 : 0) instanceof IntBinaryOperator upd
                && ((IntUnaryOperator) i -> Integer.valueOf(i) instanceof Integer j0 && Integer.valueOf(j0 & (j0 - 1)) instanceof Integer j1 && Integer.valueOf(j1 & (j1 - 1)) instanceof Integer j2 && Integer.valueOf(j2 & (j2 - 1)) instanceof Integer j3 && Integer.valueOf(j3 & (j3 - 1)) instanceof Integer j4 && Integer.valueOf(j4 & (j4 - 1)) instanceof Integer j5 && Integer.valueOf(j5 & (j5 - 1)) instanceof Integer j6 && Integer.valueOf(j6 & (j6 - 1)) instanceof Integer j7 && Integer.valueOf(j7 & (j7 - 1)) instanceof Integer j8 && Integer.valueOf(j8 & (j8 - 1)) instanceof Integer j9 && Integer.valueOf(j9 & (j9 - 1)) instanceof Integer j10 && Integer.valueOf(j10 & (j10 - 1)) instanceof Integer j11 && Integer.valueOf(j11 & (j11 - 1)) instanceof Integer j12 && Integer.valueOf(j12 & (j12 - 1)) instanceof Integer j13 && Integer.valueOf(j13 & (j13 - 1)) instanceof Integer j14 && Integer.valueOf(j14 & (j14 - 1)) instanceof Integer j15 && Integer.valueOf(j15 & (j15 - 1)) instanceof Integer j16
                    ? bit[j0] + bit[j1] + bit[j2] + bit[j3] + bit[j4] + bit[j5] + bit[j6] + bit[j7] + bit[j8] + bit[j9] + bit[j10] + bit[j11] + bit[j12] + bit[j13] + bit[j14] + bit[j15] + bit[j16] : 0) instanceof IntUnaryOperator pref
                && IntStream.range(0, n).anyMatch(vi -> vr[vi][2] >= 2 * k
                    && Integer.valueOf(-Arrays.binarySearch(sx2, 2 * (vr[vi][0] - k) + 1) - 1) instanceof Integer na
                    && IntStream.range(pt[0], Math.max(pt[0], na)).map(q -> hr[so[q]][2] >= 2 * k ? upd.applyAsInt(slot[so[q]], 1) : 0).sum() >= 0
                    && (pt[0] = Math.max(pt[0], na)) >= 0
                    && Integer.valueOf(-Arrays.binarySearch(ex2, 2 * (vr[vi][0] + k - 1) + 1) - 1) instanceof Integer nr
                    && IntStream.range(pt[1], Math.max(pt[1], nr)).map(q -> hr[eo[q]][2] >= 2 * k ? upd.applyAsInt(slot[eo[q]], -1) : 0).sum() >= 0
                    && (pt[1] = Math.max(pt[1], nr)) >= 0
                    && pref.applyAsInt(-Arrays.binarySearch(sy2, 2 * (vr[vi][1] + vr[vi][2] - k) + 1) - 1) - pref.applyAsInt(-Arrays.binarySearch(sy2, 2 * (vr[vi][1] + k) - 1) - 1) > 0)) instanceof IntPredicate ok
            ? new int[]{0, 50000001} instanceof int[] bs
                && (IntStream.iterate(0, y -> bs[1] - bs[0] > 1, y -> y + 1).allMatch(y -> Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid
                    && (ok.test(mid) ? (bs[0] = mid) >= 0 : (bs[1] = mid) >= 0)) || true) ? bs[0] : -1 : "");
    }
}
