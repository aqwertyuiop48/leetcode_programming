import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer S
            && Integer.valueOf(n + 1) instanceof Integer N
            && new int[N] instanceof int[] inn
            && new int[N] instanceof int[] out
            && new int[N] instanceof int[] w
            && new int[N] instanceof int[] s
            && new int[N] instanceof int[] v
            && IntStream.range(0, N).allMatch(i -> i == n
                ? (out[i] = 2 * n + 1) > 0 && (s[i] = S) >= 0
                : (inn[i] = g0[2 + 5 * i]) >= 0 && (out[i] = g0[3 + 5 * i]) >= 0 && (w[i] = g0[4 + 5 * i]) >= 0
                    && (s[i] = Math.min(S, g0[5 + 5 * i])) >= 0 && (v[i] = g0[6 + 5 * i]) >= 0)
            && IntStream.range(0, N).mapToLong(i -> ((long) (out[i] - inn[i]) * 4096 + s[i] + w[i]) * 1024 + i).sorted().toArray() instanceof long[] ord
            && new int[N][] instanceof int[][] F
            && new int[N + 1][S + 1] instanceof int[][] gm
            && IntStream.range(0, N).allMatch(r -> (Integer) (int) (ord[r] & 1023) instanceof Integer i
                && IntStream.range(0, r).map(q -> (int) (ord[q] & 1023)).filter(c -> inn[c] >= inn[i] && out[c] <= out[i])
                    .mapToLong(c -> (long) out[c] * 1024 + c + 1).sorted().toArray() instanceof long[] keys
                && (Integer) keys.length instanceof Integer m
                && (Integer) Math.min(S, s[i]) instanceof Integer K
                && IntStream.rangeClosed(1, m).allMatch(t -> (Integer) (int) ((keys[t - 1] & 1023) - 1) instanceof Integer c
                    && (Integer) Arrays.binarySearch(keys, (long) (inn[c] + 1) * 1024) instanceof Integer ip
                    && gm[t] instanceof int[] cur
                    && gm[t - 1] instanceof int[] pv
                    && gm[ip ^ (ip >> 31)] instanceof int[] pp
                    && F[c] instanceof int[] fc
                    && IntStream.rangeClosed(0, K).reduce(0, (u, k) -> (cur[k] = Math.max(pv[k], fc[k] + pp[k])) < 0 ? 1 : 0) >= 0)
                && (F[i] = IntStream.rangeClosed(0, S).map(c -> c < w[i] ? -1000000000 : v[i] + gm[m][Math.min(c - w[i], K)]).toArray()) != null)
            ? F[n][S] : 0);
    }
}
