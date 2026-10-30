import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && Integer.valueOf(nm[0]) instanceof Integer n && Integer.valueOf(nm[1]) instanceof Integer m && Integer.valueOf(nm[2]) instanceof Integer p
            && new long[n + 1] instanceof long[] D && IntStream.rangeClosed(2, n).allMatch(h -> (D[h] = D[h - 1] + nm[1 + h]) >= 0)
            && LongStream.range(0, m).map(i -> nm[3 + n + 2 * (int) i] - D[nm[2 + n + 2 * (int) i]]).sorted().toArray() instanceof long[] a
            && new long[m + 1] instanceof long[] S && IntStream.rangeClosed(1, m).allMatch(i -> (S[i] = S[i - 1] + a[i - 1]) > Long.MIN_VALUE)
            && new long[][] {new long[m + 1], new long[m + 1]} instanceof long[][] dpa
            && IntStream.rangeClosed(1, m).allMatch(i -> (dpa[0][i] = 4000000000000000000L) > 0)
            && new long[m + 2] instanceof long[] qk && new long[m + 2] instanceof long[] qb && new long[4] instanceof long[] w && new int[4] instanceof int[] s
            && ((ToIntFunction<long[]>) q -> Math.multiplyHigh(q[0], q[1]) != Math.multiplyHigh(q[2], q[3])
                ? Long.compare(Math.multiplyHigh(q[0], q[1]), Math.multiplyHigh(q[2], q[3])) : Long.compareUnsigned(q[0] * q[1], q[2] * q[3])) instanceof ToIntFunction<long[]> cmp
            && IntStream.rangeClosed(1, Math.min(p, m)).allMatch(layer -> dpa[layer & 1] instanceof long[] d1 && dpa[(layer & 1) ^ 1] instanceof long[] d0
                && (d1[0] = 0) == 0 && (s[0] = 1) == 1 && (s[1] = 0) == 0 && (s[2] = 0) == 0 && (s[3] = 0) == 0
                && IntStream.generate(() -> 0).anyMatch(z -> s[1] == 0
                    ? d0[s[0] - 1] >= 2000000000000000000L ? (s[1] = 1) < 0
                        : s[3] - s[2] < 2 || (((w[0] = d0[s[0] - 1] + S[s[0] - 1] - qb[s[3] - 2]) > Long.MIN_VALUE) & ((w[1] = qk[s[3] - 2] - qk[s[3] - 1]) > Long.MIN_VALUE)
                            & ((w[2] = qb[s[3] - 1] - qb[s[3] - 2]) > Long.MIN_VALUE) & ((w[3] = qk[s[3] - 2] + s[0] - 1) > Long.MIN_VALUE) && cmp.applyAsInt(w) > 0)
                            ? (qk[s[3]] = 1 - s[0]) < Long.MAX_VALUE && (qb[s[3]++] = d0[s[0] - 1] + S[s[0] - 1]) < Long.MAX_VALUE && (s[1] = 1) < 0
                            : (s[3] -= 1) < 0
                    : s[2] + 1 >= s[3] || qk[s[2] + 1] * a[s[0] - 1] + qb[s[2] + 1] > qk[s[2]] * a[s[0] - 1] + qb[s[2]]
                        ? (d1[s[0]] = a[s[0] - 1] * s[0] - S[s[0]] + qk[s[2]] * a[s[0] - 1] + qb[s[2]]) > Long.MIN_VALUE && (s[1] = 0) == 0 && ++s[0] > m
                        : (s[2] += 1) < 0))
            ? String.valueOf(dpa[Math.min(p, m) & 1][m]) : "");
    }
}
