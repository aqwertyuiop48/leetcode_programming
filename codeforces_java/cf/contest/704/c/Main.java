import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] bp && new int[n + 1] instanceof int[] bq && new int[n + 1] instanceof int[] bnp && new int[n + 1] instanceof int[] bnq
            && new int[2 * m + 2] instanceof int[] inc && new int[m + 1] instanceof int[] u0 && new int[m + 1] instanceof int[] u1 && new int[]{2, 0} instanceof int[] pos
            && IntStream.range(0, 2 * m + 2).filter(i -> (inc[i] = -1) > 0).count() == 0
            && IntStream.range(0, n).filter(i -> Integer.valueOf((int) t[pos[0]]) instanceof Integer k
                && Integer.valueOf((int) t[pos[0] + 1]) instanceof Integer a && Integer.valueOf(k == 2 ? (int) t[pos[0] + 2] : a) instanceof Integer b
                && ((Math.abs(a) == Math.abs(b)
                    ? (u0[Math.abs(a)] ^= a == b ? (a < 0 ? 1 : 0) : 1) + (u1[Math.abs(a)] ^= a == b ? (a < 0 ? 0 : 1) : 1) < 0
                    : (bp[pos[1]] = Math.abs(a)) + (bq[pos[1]] = Math.abs(b)) + (bnp[pos[1]] = a < 0 ? 1 : 0) + (bnq[pos[1]] = b < 0 ? 1 : 0)
                        + (inc[inc[2 * Math.abs(a)] < 0 ? 2 * Math.abs(a) : 2 * Math.abs(a) + 1] = pos[1]) + (inc[inc[2 * Math.abs(b)] < 0 ? 2 * Math.abs(b) : 2 * Math.abs(b) + 1] = pos[1]++) < 0)
                    || (pos[0] += k + 1) < 0)).count() >= 0
            && new boolean[m + 1] instanceof boolean[] vis && new long[][]{new long[4]} instanceof long[][] dp && new long[2] instanceof long[] res
            && new int[]{0, -1, 0} instanceof int[] cs
            && ((Supplier<Boolean>) () -> !(cs[1] >= 0 && cs[0] == cs[2])
                && Integer.valueOf(inc[2 * cs[0]] >= 0 && inc[2 * cs[0]] != cs[1] ? inc[2 * cs[0]] : inc[2 * cs[0] + 1] >= 0 && inc[2 * cs[0] + 1] != cs[1] ? inc[2 * cs[0] + 1] : -1) instanceof Integer cl && cl >= 0
                && Integer.valueOf(bp[cl] == cs[0] ? bq[cl] : bp[cl]) instanceof Integer w
                && Integer.valueOf(bp[cl] == cs[0] ? 1 : 0) instanceof Integer fw
                && ((LongBinaryOperator) (v2, p2) -> (dp[0][(int) (p2 ^ (fw == 1 ? ((0 ^ bnp[cl]) | (v2 ^ bnq[cl])) : ((v2 ^ bnp[cl]) | (0 ^ bnq[cl]))) ^ (w == cs[2] ? 0 : v2 == 0 ? u0[w] : u1[w]))]
                    + dp[0][2 + (int) (p2 ^ (fw == 1 ? ((1 ^ bnp[cl]) | (v2 ^ bnq[cl])) : ((v2 ^ bnp[cl]) | (1 ^ bnq[cl]))) ^ (w == cs[2] ? 0 : v2 == 0 ? u0[w] : u1[w]))]) % 1000000007L) instanceof LongBinaryOperator h
                && (dp[0] = new long[]{h.applyAsLong(0, 0), h.applyAsLong(0, 1), h.applyAsLong(1, 0), h.applyAsLong(1, 1)}) != null
                && (cs[1] = cl) == cl && (cs[0] = w) == w && (vis[w] = true)) instanceof Supplier<Boolean> step
            && ((IntBinaryOperator) (start, fixed) -> (dp[0] = IntStream.range(0, 4).mapToLong(i -> (fixed < 0 || i / 2 == fixed) && (i / 2 == 0 ? u0[start] : u1[start]) == i % 2 ? 1 : 0).toArray()) != null
                && (cs[0] = start) == start && (cs[2] = start) == start && (cs[1] = -1) == -1 && (vis[start] = true)
                && Stream.generate(step).takeWhile(x -> x).count() >= 0
                && (res[0] = ((fixed != 1 ? dp[0][0] : 0) + (fixed != 0 ? dp[0][2] : 0)) % 1000000007L) >= 0 && (res[1] = ((fixed != 1 ? dp[0][1] : 0) + (fixed != 0 ? dp[0][3] : 0)) % 1000000007L) >= 0 ? 0 : 1) instanceof IntBinaryOperator run
            && new long[]{1, 0} instanceof long[] tot && new long[2] instanceof long[] sv
            && IntStream.rangeClosed(1, m).filter(v -> !vis[v] && inc[2 * v + 1] < 0
                && run.applyAsInt(v, -1) == 0 && Long.valueOf(tot[0]) instanceof Long a0 && Long.valueOf(tot[1]) instanceof Long a1
                && (tot[0] = (a0 * res[0] + a1 * res[1]) % 1000000007L) >= 0 && (tot[1] = (a0 * res[1] + a1 * res[0]) % 1000000007L) < -1).count() >= 0
            && IntStream.rangeClosed(1, m).filter(v -> !vis[v]
                && run.applyAsInt(v, 0) == 0 && (sv[0] = res[0]) >= 0 && (sv[1] = res[1]) >= 0 && run.applyAsInt(v, 1) == 0
                && (res[0] = (res[0] + sv[0]) % 1000000007L) >= 0 && (res[1] = (res[1] + sv[1]) % 1000000007L) >= 0
                && Long.valueOf(tot[0]) instanceof Long a0 && Long.valueOf(tot[1]) instanceof Long a1
                && (tot[0] = (a0 * res[0] + a1 * res[1]) % 1000000007L) >= 0 && (tot[1] = (a0 * res[1] + a1 * res[0]) % 1000000007L) < -1).count() >= 0
            ? tot[1] : "");
    }
}
