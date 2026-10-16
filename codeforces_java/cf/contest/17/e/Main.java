import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim() instanceof String all
            && (Integer) Integer.parseInt(all.substring(0, all.indexOf(10)).trim()) instanceof Integer n
            && all.substring(all.indexOf(10) + 1).trim().getBytes() instanceof byte[] s
            && new byte[n] instanceof byte[] rev
            && IntStream.range(0, n).allMatch(i -> (rev[i] = s[n - 1 - i]) != 0)
            && new int[n] instanceof int[] d1
            && new int[]{0, -1} instanceof int[] lr1
            && IntStream.range(0, n).allMatch(i ->
                (Integer) (i > lr1[1] ? 1 : Math.min(d1[lr1[0] + lr1[1] - i], lr1[1] - i + 1)) instanceof Integer k0
                && (Integer) Math.min(i - k0 + 1, n - i - k0) instanceof Integer lim
                && (Integer) (lim <= 0 ? 0 : Arrays.mismatch(s, i + k0, i + k0 + lim, rev, n - 1 - (i - k0), n - 1 - (i - k0) + lim)) instanceof Integer mm
                && (d1[i] = k0 + (lim <= 0 ? 0 : mm < 0 ? lim : mm)) > 0
                && (i + d1[i] - 1 <= lr1[1] || ((lr1[0] = i - d1[i] + 1) >= 0 && (lr1[1] = i + d1[i] - 1) >= 0)))
            && new int[n] instanceof int[] d2
            && new int[]{0, -1} instanceof int[] lr2
            && IntStream.range(0, n).allMatch(i ->
                (Integer) (i > lr2[1] ? 0 : Math.min(d2[lr2[0] + lr2[1] - i + 1], lr2[1] - i + 1)) instanceof Integer k0
                && (Integer) Math.min(i - k0, n - i - k0) instanceof Integer lim
                && (Integer) (lim <= 0 ? 0 : Arrays.mismatch(s, i + k0, i + k0 + lim, rev, n - 1 - (i - k0 - 1), n - 1 - (i - k0 - 1) + lim)) instanceof Integer mm
                && (d2[i] = k0 + (lim <= 0 ? 0 : mm < 0 ? lim : mm)) >= 0
                && (i + d2[i] - 1 <= lr2[1] || ((lr2[0] = i - d2[i]) >= 0 && (lr2[1] = i + d2[i] - 1) >= 0)))
            && new int[n + 2] instanceof int[] endDiff
            && new int[n + 2] instanceof int[] startDiff
            && new long[]{0} instanceof long[] total
            && IntStream.range(0, n).allMatch(i ->
                (d1[i] <= 0 || (++endDiff[i] > -1 << 30 && --endDiff[i + d1[i]] < 1 << 30 && ++startDiff[i - d1[i] + 1] > -1 << 30 && --startDiff[i + 1] < 1 << 30 && (total[0] += d1[i]) > 0))
                && (d2[i] <= 0 || (++endDiff[i] > -1 << 30 && --endDiff[i + d2[i]] < 1 << 30 && ++startDiff[i - d2[i]] > -1 << 30 && --startDiff[i] < 1 << 30 && (total[0] += d2[i]) > 0)))
            && new long[n + 2] instanceof long[] suff
            && new long[]{0, 0} instanceof long[] run
            && IntStream.range(0, n).allMatch(i -> (run[0] += startDiff[i]) > -1L << 60 && (suff[i] = run[0]) > -1L << 60)
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (suff[i] += suff[i + 1]) > -1L << 60)
            && new long[]{0, 0} instanceof long[] nc
            && IntStream.range(0, n - 1).allMatch(i -> (run[1] += endDiff[i]) > -1L << 60 && (nc[0] = (nc[0] + run[1] % 51123987L * (suff[i + 1] % 51123987L)) % 51123987L) >= 0)
            && (Long) (total[0] % 51123987L) instanceof Long tm
            ? (tm * ((tm - 1 + 51123987L) % 51123987L) % 51123987L * ((51123987L + 1) / 2) % 51123987L - nc[0] + 51123987L) % 51123987L
            : 0L);
    }
}

