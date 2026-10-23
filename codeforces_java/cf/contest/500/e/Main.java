import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1 + 2 * n]) instanceof Integer q
            && IntStream.range(0, q).mapToLong(j -> ((long) g[2 + 2 * n + 2 * j] << 20) | j).sorted().toArray() instanceof long[] qk
            && new long[q] instanceof long[] ans
            && new int[n + 2] instanceof int[] nIdx
            && new long[n + 2] instanceof long[] sR
            && new long[n + 2] instanceof long[] cum
            && new int[]{0, q - 1} instanceof int[] cnt
            && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(i ->
                new long[]{(long) g[2 * i - 1] + g[2 * i]} instanceof long[] R
                && (cnt[0] == 0 || g[-2 * nIdx[cnt[0] - 1] - 1] > R[0]
                    || IntStream.iterate(cnt[0] - 1, k -> k >= 0 && g[-2 * nIdx[k] - 1] <= R[0], k -> k - 1)
                        .allMatch(k -> (R[0] = Math.max(R[0], sR[k])) > 0 && (cnt[0] = k) >= 0))
                && (nIdx[cnt[0]] = -i) < 0
                && (sR[cnt[0]] = R[0]) > 0
                && (cum[cnt[0]] = cnt[0] == 0 ? 0 : cum[cnt[0] - 1] + g[-2 * nIdx[cnt[0] - 1] - 1] - R[0]) >= 0
                && (cnt[0]++) >= 0
                && (cnt[1] < 0 || (qk[cnt[1]] >> 20) != i || IntStream.iterate(cnt[1], k -> k >= 0 && (qk[k] >> 20) == i, k -> k - 1).allMatch(k ->
                    Integer.valueOf((int) (qk[k] & 0xFFFFF)) instanceof Integer j
                    && Integer.valueOf(Arrays.binarySearch(nIdx, 0, cnt[0], -g[3 + 2 * n + 2 * j])) instanceof Integer res
                    && (ans[j] = cum[cnt[0] - 1] - cum[res >= 0 ? res : -(res + 1)]) >= 0
                    && (cnt[1] = k - 1) > -2)))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) + "\n"
            : "");
    }
}
