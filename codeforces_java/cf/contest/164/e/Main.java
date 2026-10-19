import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((nums[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1)) * 2) instanceof Integer SZ
            && Integer.valueOf(Integer.numberOfTrailingZeros(SZ)) instanceof Integer LOG
            && Long.valueOf(Long.MIN_VALUE / 4) instanceof Long NEG
            && Long.valueOf(NEG / 2) instanceof Long NEGH
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long INF
            && new long[2 * SZ] instanceof long[] sum
            && new long[2 * SZ] instanceof long[] mt
            && LongStream.generate(() -> NEG).limit(2 * SZ).toArray() instanceof long[] mx
            && new long[8] instanceof long[] w
            && new long[4] instanceof long[] ac
            && new long[2] instanceof long[] rs
            && new int[2] instanceof int[] bs
            && new int[1] instanceof int[] nd
            && new int[1] instanceof int[] sn
            && ((IntPredicate) lo ->
                (sn[0] = lo + SZ) >= 0 && (rs[0] = 0) == 0 && (rs[1] = NEG) < 0 && (ac[0] = 0) == 0
                && IntStream.range(0, LOG + 1).allMatch(h ->
                    ((sn[0] & 1) == 1 && sn[0] < ((2 * SZ) >> h)
                        ? (rs[1] = Math.max(rs[1], mx[sn[0]] - ac[0])) < Long.MAX_VALUE && (ac[0] += sum[sn[0]]) >= 0 && (rs[0] = Math.max(rs[0], mt[sn[0]])) >= 0 && (sn[0]++) >= 0
                        : true)
                    && (sn[0] >>= 1) >= 0)
                && (rs[1] = rs[1] < NEGH ? NEG : rs[1] - (sum[1] - ac[0])) < Long.MAX_VALUE) instanceof IntPredicate suf
            && ((IntPredicate) pp ->
                Integer.valueOf(pp >= 0 ? pp : ~pp) instanceof Integer i0
                && (sum[SZ + i0] = pp >= 0 ? nums[3 + 3 * i0] : 0) >= 0
                && (mx[SZ + i0] = pp >= 0 ? nums[1 + 3 * i0] - 1 : NEG) < Long.MAX_VALUE
                && (mt[SZ + i0] = pp >= 0 ? nums[3 + 3 * i0] : 0) >= 0
                && IntStream.iterate((SZ + i0) >> 1, x -> x >= 1, x -> x >> 1).allMatch(x ->
                    (sum[x] = sum[2 * x] + sum[2 * x + 1]) >= 0
                    && (mx[x] = Math.max(mx[2 * x], mx[2 * x + 1] - sum[2 * x])) < Long.MAX_VALUE
                    && (mt[x] = Math.max(mt[2 * x], mt[2 * x + 1])) >= 0)) instanceof IntPredicate set
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).allMatch(i ->
                Long.valueOf(sum[1] + Math.max(0L, mx[1])) instanceof Long ans
                && (Math.max(ans + 1, nums[1 + 3 * i]) + nums[3 + 3 * i] - 1 <= nums[2 + 3 * i]
                    ? set.test(i) && sb.append("0 ") != null
                    : ans + 1 - nums[1 + 3 * i] <= nums[3 + 3 * i]
                        ? sb.append("-1 ") != null
                        : (w[0] = ans + 1 - nums[1 + 3 * i]) >= 0
                            && (w[1] = mx[1]) < Long.MAX_VALUE
                            && (nd[0] = 1) == 1 && (ac[0] = 0) == 0 && (ac[1] = NEG) < 0
                            && IntStream.range(0, LOG).allMatch(h ->
                                mx[2 * nd[0] + 1] - ac[0] - sum[2 * nd[0]] == w[1]
                                    ? (ac[1] = Math.max(ac[1], mx[2 * nd[0]] - ac[0])) < Long.MAX_VALUE && (ac[0] += sum[2 * nd[0]]) >= 0 && (nd[0] = 2 * nd[0] + 1) > 0
                                    : (nd[0] = 2 * nd[0]) > 0)
                            && Integer.valueOf(nd[0] - SZ) instanceof Integer q
                            && Long.valueOf(Math.max(0L, ac[1])) instanceof Long pm
                            && suf.test(q + 1)
                            && Long.valueOf(Math.min(w[1] - pm + nums[3 + 3 * q], rs[1] < NEGH ? INF : w[1] - rs[1])) instanceof Long rq
                            && (bs[0] = q + 1) > 0 && (bs[1] = SZ - 1) > 0 && (w[2] = 0) == 0
                            && (bs[0] > bs[1]
                                ? true
                                : IntStream.generate(() -> 0).takeWhile(z -> bs[0] < bs[1]).allMatch(z ->
                                    Integer.valueOf((bs[0] + bs[1]) >> 1) instanceof Integer mid
                                    && suf.test(mid + 1)
                                    && (Math.max(mt[SZ + mid], rs[0]) < (rs[1] < NEGH ? INF : w[1] - rs[1]) ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) >= 0))
                                    && suf.test(bs[0] + 1)
                                    && (w[2] = Math.max(mt[SZ + bs[0]], rs[0])) >= 0
                                    && (bs[0] > q + 1 ? suf.test(bs[0]) && (w[2] = Math.max(w[2], rs[1] < NEGH ? INF : w[1] - rs[1])) >= 0 : true))
                            && Long.valueOf(Math.min(Math.max(rq, w[2]), w[0])) instanceof Long v
                            && (v <= nums[3 + 3 * i]
                                ? sb.append("-1 ") != null
                                : (mt[1] >= v
                                    ? (nd[0] = 1) == 1 && IntStream.range(0, LOG).allMatch(h -> (nd[0] = mt[2 * nd[0] + 1] >= v ? 2 * nd[0] + 1 : 2 * nd[0]) > 0)
                                    : (nd[0] = SZ - 1) > 0)
                                    && Integer.valueOf(nd[0] - SZ) instanceof Integer k1
                                    && Integer.valueOf(k1 > q && suf.test(k1 + 1) && (rs[1] < NEGH || w[1] - rs[1] >= v) ? k1 : q) instanceof Integer k
                                    && set.test(~k) && set.test(i) && sb.append(k + 1).append(' ') != null)))
            ? sb.toString().trim() : "");
    }
}
