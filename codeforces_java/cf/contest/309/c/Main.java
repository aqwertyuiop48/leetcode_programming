import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[(int) st[1]++] = (int) st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && new long[40] instanceof long[] avail && new long[40] instanceof long[] cb && new long[2] instanceof long[] rp
            && LongStream.range(0, 8).map(d -> (d & 1) | (d >> 1 & 1) << 21 | (d >> 2 & 1) << 42).toArray() instanceof long[] T
            && IntStream.range(0, 11).filter(g -> Long.valueOf(IntStream.range(0, n).mapToLong(i -> T[v[2 + i] >> 3 * g & 7]).sum()) instanceof Long sm && IntStream.range(0, 3).filter(j -> (avail[3 * g + j] = sm >> 21 * j & 2097151) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, m).filter(i -> ++cb[v[2 + n + i]] > 0).count() >= 0
            && IntStream.range(0, 31).filter(e -> (rp[0] = cb[e]) >= 0
                && IntStream.rangeClosed(e, 31).filter(k -> rp[0] > 0 && avail[k] > 0 && Long.valueOf(1L << (k - e)) instanceof Long P && Long.valueOf(Math.min(avail[k], rp[0] / P)) instanceof Long f
                    && (avail[k] -= f) >= 0 && (rp[0] -= f * P) >= 0 && (rp[1] += f * P) >= 0
                    && (rp[0] == 0 || avail[k] == 0 || (avail[k]-- > 0 && (rp[1] += rp[0]) > 0 && Long.valueOf(P - rp[0]) instanceof Long R
                        && IntStream.range(0, 31).filter(j -> (R >> j & 1) == 1 && ++avail[e + j] > 0).count() >= 0 && (rp[0] = 0) == 0))).count() >= 0).count() >= 0
            ? rp[1] : "");
    }
}
