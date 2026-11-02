import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                (i == raw.length ? 32 : (int) raw[i]) >= '0' && (i == raw.length ? 32 : (int) raw[i]) <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') < 0 | (ps[2] = 1) < 0
                    : (i < raw.length && raw[i] == '-') ? (ps[3] = 1) < 0
                        : ps[2] != 0 && ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) == Integer.MIN_VALUE | (ps[0] = 0) != 0 | (ps[2] = 0) != 0 | (ps[3] = 0) != 0)).count() >= 0
            && Integer.valueOf(g[0]) instanceof Integer n && Integer.valueOf(g[1]) instanceof Integer vx && Integer.valueOf(g[2]) instanceof Integer vy
            && Integer.valueOf(n + 1) instanceof Integer N1 && Integer.valueOf(N1 * N1) instanceof Integer V
            && IntStream.range(0, V).mapToLong(v -> ((long) ((v / N1) * vy - (v % N1) * vx + 30000000) << 20) | v).sorted().toArray() instanceof long[] ks
            && new int[]{0, -1} instanceof int[] cu && new int[V] instanceof int[] rank
            && IntStream.range(0, V).allMatch(i -> ((ks[i] >> 20) == cu[1] || (cu[1] = (int) (ks[i] >> 20)) >= 0 && ++cu[0] > 0) && (rank[(int) (ks[i] & 1048575)] = cu[0] - 1) >= 0)
            && Integer.valueOf(cu[0] - 1 <= 1 ? 1 : Integer.highestOneBit(cu[0] - 2) << 1) instanceof Integer SZ
            && Integer.valueOf(Integer.numberOfTrailingZeros(SZ)) instanceof Integer LOG
            && Integer.valueOf(LOG + 1) instanceof Integer S && Long.valueOf(((1L << 40) + S - 1) / S) instanceof Long MUL
            && new int[2 * SZ] instanceof int[] tg && new int[2 * SZ] instanceof int[] mn && new int[8] instanceof int[] st && new long[1] instanceof long[] ans
            && IntStream.range(0, n * n).mapToLong(i -> ((long) ((i / n) * vx + (i % n) * vy + 30000000) << 20) | i).sorted().toArray() instanceof long[] ord
            && IntStream.range(0, n * n * S).allMatch(t -> Integer.valueOf(t - (int) (((long) t * MUL) >>> 40) * S) instanceof Integer s
                && (s != 0 || (st[6] = g[3 + (int) (ord[t / S] & 1048575)]) >= 0
                    && (st[6] == 0 || (st[7] = ((int) (ord[t / S] & 1048575) / n) * N1 + (int) (ord[t / S] & 1048575) % n) >= 0
                        && (st[4] = Integer.MAX_VALUE) > 0 && (st[5] = Integer.MAX_VALUE) > 0
                        && (st[0] = Math.min(Math.min(rank[st[7]], rank[st[7] + N1 + 1]), Math.min(rank[st[7] + N1], rank[st[7] + 1])) + SZ) > 0 && (st[2] = st[0]) > 0
                        && (st[1] = Math.max(Math.max(rank[st[7]], rank[st[7] + N1 + 1]), Math.max(rank[st[7] + N1], rank[st[7] + 1])) + SZ) > 0 && (st[3] = st[1] - 1) > 0))
                && (st[6] == 0
                    || (s == 0 || (st[4] = Math.max(st[4], tg[st[0] - 1])) >= 0 && (st[5] = Math.max(st[5], tg[st[1]])) >= 0)
                        && (st[0] < st[1]
                            ? ((st[0] & 1) == 0 || (st[4] = Math.min(st[4], mn[st[0]])) >= 0 && (tg[st[0]] = Math.max(tg[st[0]], st[6])) >= 0 && (mn[st[0]] = Math.max(mn[st[0]], st[6])) >= 0 && ++st[0] > 0)
                                && ((st[1] & 1) == 0 || --st[1] > 0 && (st[5] = Math.min(st[5], mn[st[1]])) >= 0 && (tg[st[1]] = Math.max(tg[st[1]], st[6])) >= 0 && (mn[st[1]] = Math.max(mn[st[1]], st[6])) >= 0)
                            : (st[0] & 1) == 0 || ++st[0] > 0)
                        && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0
                        && (s == 0 || (mn[st[2] >> s] = Math.max(tg[st[2] >> s], Math.min(mn[2 * (st[2] >> s)], mn[2 * (st[2] >> s) + 1]))) >= 0
                            && (st[2] >> s == st[3] >> s || (mn[st[3] >> s] = Math.max(tg[st[3] >> s], Math.min(mn[2 * (st[3] >> s)], mn[2 * (st[3] >> s) + 1]))) >= 0))
                        && (s < LOG || (ans[0] += Math.max(0, st[6] - Math.min(st[4], st[5]))) >= 0)))
            ? String.valueOf(ans[0]) : "");
    }
}
