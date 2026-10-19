import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer t
            && Arrays.copyOfRange(g0, 2, 2 + n) instanceof int[] a
            && Integer.valueOf(Math.max(1, (int) (n / Math.sqrt(t)))) instanceof Integer bs
            && LongStream.range(0, t).map(q -> Long.valueOf(g0[2 + n + 2 * (int) q] - 1) instanceof Long l
                && Long.valueOf(g0[3 + n + 2 * (int) q] - 1) instanceof Long r
                ? ((l / bs << 18 | ((l / bs & 1) == 0 ? r : 262143 - r)) << 18) | q : 0).sorted().toArray() instanceof long[] keys
            && Arrays.stream(a).sorted().distinct().toArray() instanceof int[] vals
            && Arrays.stream(a).map(v -> Arrays.binarySearch(vals, v)).toArray() instanceof int[] c
            && new int[vals.length + 1] instanceof int[] cnt
            && new long[]{0} instanceof long[] cur
            && new int[]{0, -1} instanceof int[] win
            && new long[t] instanceof long[] ans
            && Arrays.stream(keys).filter(key -> Integer.valueOf((int) (key & 262143)) instanceof Integer qi
                && Integer.valueOf(g0[2 + n + 2 * qi] - 1) instanceof Integer ql
                && Integer.valueOf(g0[3 + n + 2 * qi] - 1) instanceof Integer qr
                && IntStream.range(ql, Math.max(ql, win[0])).mapToLong(i -> (cur[0] += (2L * cnt[c[i]]++ + 1) * a[i]) * 0).sum() >= 0
                && IntStream.range(win[1] + 1, Math.max(win[1] + 1, qr + 1)).mapToLong(i -> (cur[0] += (2L * cnt[c[i]]++ + 1) * a[i]) * 0).sum() >= 0
                && IntStream.range(win[0], Math.max(win[0], ql)).mapToLong(i -> (cur[0] -= (2L * cnt[c[i]]-- - 1) * a[i]) * 0).sum() >= 0
                && IntStream.range(qr + 1, Math.max(qr + 1, win[1] + 1)).mapToLong(i -> (cur[0] -= (2L * cnt[c[i]]-- - 1) * a[i]) * 0).sum() >= 0
                && (win[0] = ql) >= 0 && (win[1] = qr) >= 0 && (ans[qi] = cur[0]) < 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
