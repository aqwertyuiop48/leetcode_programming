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
            && new int[2 * sz] instanceof int[] mn
            && new int[2 * sz] instanceof int[] tg
            && new int[2] instanceof int[] hh
            && ((IntPredicate) x -> tg[x] == 0
                || ((mn[2 * x] = Math.max(mn[2 * x], tg[x])) >= 0 & (tg[2 * x] = Math.max(tg[2 * x], tg[x])) >= 0
                    & (mn[2 * x + 1] = Math.max(mn[2 * x + 1], tg[x])) >= 0 & (tg[2 * x + 1] = Math.max(tg[2 * x + 1], tg[x])) >= 0
                    & (tg[x] = 0) == 0)) instanceof IntPredicate push
            && ((IntPredicate) x -> (mn[x] = Math.max(mn[x], hh[0])) >= 0 & (tg[x] = Math.max(tg[x], hh[0])) >= 0) instanceof IntPredicate ap
            && ((IntPredicate) x -> (mn[x] = Math.min(mn[2 * x], mn[2 * x + 1])) >= 0) instanceof IntPredicate upd
            && new long[1] instanceof long[] ans
            && IntStream.range(0, n * n).allMatch(q ->
                Integer.valueOf(vx >= 0 ? q / n : n - 1 - q / n) instanceof Integer x
                && Integer.valueOf(vy >= 0 ? q % n : n - 1 - q % n) instanceof Integer y
                && Integer.valueOf(g[3 + x * n + y]) instanceof Integer h
                && (h == 0
                    || (Integer.valueOf(rk[(x + (vy < 0 ? 1 : 0)) * w1 + y + (vx > 0 ? 1 : 0)] + sz) instanceof Integer l
                        && Integer.valueOf(rk[(x + (vy > 0 ? 1 : 0)) * w1 + y + (vx < 0 ? 1 : 0)] + sz) instanceof Integer r
                        && (hh[0] = h) > 0
                        && (hh[1] = Integer.MAX_VALUE) > 0
                        && IntStream.iterate(lg, i -> i >= 1, i -> i - 1).allMatch(i ->
                            (((l >> i) << i) == l || push.test(l >> i)) & (((r >> i) << i) == r || push.test((r - 1) >> i)))
                        && IntStream.rangeClosed(0, lg).allMatch(j ->
                            Integer.valueOf(l + (1 << j) - 1 >> j) instanceof Integer lj
                            && Integer.valueOf(r >> j) instanceof Integer rj
                            && (lj >= rj
                                || (((lj & 1) == 0 || ((hh[1] = Math.min(hh[1], mn[lj])) >= 0 & ap.test(lj)))
                                    & ((rj & 1) == 0 || ((hh[1] = Math.min(hh[1], mn[rj - 1])) >= 0 & ap.test(rj - 1)))))
                            && (j == 0 || ((((l >> j) << j) == l || upd.test(l >> j)) & (((r >> j) << j) == r || upd.test((r - 1) >> j)))))
                        && (ans[0] += Math.max(0, h - hh[1])) >= 0)))
            ? String.valueOf(ans[0])
            : "");
    }
}
