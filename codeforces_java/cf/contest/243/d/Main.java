import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] g
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((g[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Integer.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer vx
            && Integer.valueOf(g[2]) instanceof Integer vy
            && Integer.valueOf(n + 1) instanceof Integer w1
            && Integer.valueOf(w1 * w1) instanceof Integer pc
            && IntStream.range(0, pc).map(p -> p / w1 * vy - p % w1 * vx).toArray() instanceof int[] ww
            && IntStream.range(0, pc).mapToLong(p -> ((long) ww[p] << 20) | p).sorted().toArray() instanceof long[] keys
            && new int[pc] instanceof int[] rk
            && new int[1] instanceof int[] rc
            && IntStream.range(0, pc).allMatch(i ->
                (i == 0 || keys[i] >> 20 == keys[i - 1] >> 20 || ++rc[0] > 0)
                && (rk[(int) (keys[i] & 1048575)] = rc[0]) >= 0)
            && Integer.valueOf(rc[0] <= 1 ? 1 : Integer.highestOneBit(rc[0] - 1) * 2) instanceof Integer sz
            && Integer.valueOf(Integer.numberOfTrailingZeros(sz)) instanceof Integer lg
            && new int[4 * sz + 4] instanceof int[] dt
            && new int[8] instanceof int[] s
            && new long[1] instanceof long[] ans
            && Integer.valueOf(lg + 1) instanceof Integer L
            && IntStream.range(0, n * n * L).allMatch(t ->
                Integer.valueOf(t % L) instanceof Integer k
                && (k > 0 || Integer.valueOf(t / L) instanceof Integer q
                    && Integer.valueOf(vx >= 0 ? q / n : n - 1 - q / n) instanceof Integer x
                    && Integer.valueOf(vy >= 0 ? q % n : n - 1 - q % n) instanceof Integer y
                    && (s[4] = g[3 + x * n + y]) >= 0
                    && (s[4] == 0
                        || (Integer.valueOf(rk[(x + (vy < 0 ? 1 : 0)) * w1 + y + (vx > 0 ? 1 : 0)] + sz) instanceof Integer l
                            && Integer.valueOf(rk[(x + (vy > 0 ? 1 : 0)) * w1 + y + (vx < 0 ? 1 : 0)] + sz) instanceof Integer r
                            && (s[0] = l) > 0 && (s[1] = r) > 0 && (s[5] = l) > 0 && (s[6] = r) > 0
                            && (s[2] = Integer.MAX_VALUE) > 0 && (s[3] = Integer.MAX_VALUE) > 0)))
                && (s[4] == 0
                    || (s[2] = Math.max(s[2], dt[2 * (s[0] - 1) + 1])) >= 0 && (s[3] = Math.max(s[3], dt[2 * s[1] + 1])) >= 0
                    && (s[0] >= s[1]
                        || (((s[0] & 1) == 0 || (s[2] = Math.min(s[2], dt[2 * s[0]])) >= 0 && (dt[2 * s[0] + 1] = Math.max(dt[2 * s[0] + 1], s[4])) > 0 && (dt[2 * s[0]] = Math.max(dt[2 * s[0]], s[4])) > 0 && ++s[0] > 0)
                            & ((s[1] & 1) == 0 || --s[1] > 0 && (s[3] = Math.min(s[3], dt[2 * s[1]])) >= 0 && (dt[2 * s[1] + 1] = Math.max(dt[2 * s[1] + 1], s[4])) > 0 && (dt[2 * s[1]] = Math.max(dt[2 * s[1]], s[4])) > 0)))
                    && (s[0] >>= 1) >= 0 && (s[1] >>= 1) >= 0
                    && (k == 0
                        || (((dt[2 * (s[5] >> k)] = Math.max(dt[2 * (s[5] >> k) + 1], Math.min(dt[4 * (s[5] >> k)], dt[4 * (s[5] >> k) + 2]))) >= 0)
                            & ((dt[2 * ((s[6] - 1) >> k)] = Math.max(dt[2 * ((s[6] - 1) >> k) + 1], Math.min(dt[4 * ((s[6] - 1) >> k)], dt[4 * ((s[6] - 1) >> k) + 2]))) >= 0)))
                    && (k < lg || (ans[0] += Math.max(0, s[4] - Math.min(s[2], s[3]))) >= 0)))
            ? String.valueOf(ans[0])
            : "");
    }
}
