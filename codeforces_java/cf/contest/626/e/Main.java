import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && IntStream.rangeClosed(1, n).mapToLong(i -> tok[i]).sorted().toArray() instanceof long[] s && new long[n + 1] instanceof long[] pre
            && IntStream.range(0, n).filter(i -> (pre[i + 1] = pre[i] + s[i]) >= 0).count() >= 0 && new long[]{0, 1, 0, 0} instanceof long[] best
            && IntStream.range(0, n).allMatch(i -> new int[]{0, Math.min(i, n - 1 - i)} instanceof int[] lh
                && IntStream.range(0, 19).allMatch(z -> lh[0] >= lh[1] || (Integer.valueOf((lh[0] + lh[1] + 1) / 2) instanceof Integer mid
                    && ((s[i - mid] + s[n - mid]) * (2L * mid - 1) > 2L * (s[i] + pre[i] - pre[i - mid + 1] + pre[n] - pre[n - mid + 1]) ? (lh[0] = mid) : (lh[1] = mid - 1)) >= 0))
                && Long.valueOf(2L * lh[0] + 1) instanceof Long D && Long.valueOf(s[i] + pre[i] - pre[i - lh[0]] + pre[n] - pre[n - lh[0]] - D * s[i]) instanceof Long N
                && (Math.multiplyHigh(N, best[1]) > Math.multiplyHigh(best[0], D) || (Math.multiplyHigh(N, best[1]) == Math.multiplyHigh(best[0], D) && Long.compareUnsigned(N * best[1], best[0] * D) > 0)
                    ? (best[0] = N) >= 0 & (best[1] = D) > 0 & (best[2] = i) >= 0 & (best[3] = lh[0]) >= 0 : true))
            ? (2 * best[3] + 1) + "\n" + LongStream.concat(LongStream.rangeClosed(best[2] - best[3], best[2]).map(j -> s[(int) j]), LongStream.range(n - best[3], n).map(j -> s[(int) j])).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
