import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] by
            && new long[by.length / 2 + 4] instanceof long[] cd && new long[]{0, 0, 0} instanceof long[] ps
            && IntStream.rangeClosed(0, by.length).allMatch(i -> (i < by.length ? by[i] : 32) >= 97
                ? (cd[(int) ps[0]++] = (ps[1] << 5) | (by[i] - 97)) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0
                : (i < by.length ? by[i] : 32) >= 48
                    ? (ps[1] = ps[1] * 10 + by[i] - 48) >= 0 && (ps[2] = 1) > 0
                    : (i < by.length && by[i] == 45) ? (ps[2] = 0) == 0 : ps[2] == 0 || ((cd[(int) ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf((int) cd[0]) instanceof Integer n && Integer.valueOf((int) cd[1]) instanceof Integer m
            && ((UnaryOperator<long[]>) raw -> new long[raw.length + 1] instanceof long[] pre
                && IntStream.range(0, raw.length).allMatch(i -> (pre[i + 1] = pre[i] + (raw[i] >> 5)) >= 0)
                && IntStream.range(0, raw.length).filter(i -> i == 0 || (raw[i] & 31) != (raw[i - 1] & 31)).toArray() instanceof int[] st
                ? IntStream.range(0, st.length).mapToLong(g -> ((pre[g + 1 < st.length ? st[g + 1] : raw.length] - pre[st[g]]) << 5) | (raw[st[g]] & 31)).toArray() : null) instanceof UnaryOperator<long[]> merge
            && merge.apply(Arrays.copyOfRange(cd, 2, 2 + n)) instanceof long[] T
            && merge.apply(Arrays.copyOfRange(cd, 2 + n, 2 + n + m)) instanceof long[] S
            && Integer.valueOf(T.length) instanceof Integer nt && Integer.valueOf(S.length) instanceof Integer ns
            && Integer.valueOf(ns - 2) instanceof Integer k
            && Arrays.copyOfRange(S, 1, Math.max(1, ns - 1)) instanceof long[] M
            && new int[Math.max(1, k)] instanceof int[] fail
            && ((ToIntBiFunction<Integer, Long>) (j, x) -> IntStream.iterate(j, jj -> jj > 0 && M[jj] != x, jj -> fail[jj - 1]).reduce((p, q) -> q) instanceof OptionalInt o
                ? (o.isPresent() ? fail[o.getAsInt() - 1] : j) : j) instanceof ToIntBiFunction<Integer, Long> fb
            && IntStream.range(1, k).allMatch(i -> Integer.valueOf(fb.applyAsInt(fail[i - 1], M[i])) instanceof Integer j && (fail[i] = j + (M[j] == M[i] ? 1 : 0)) >= 0)
            && new int[]{0} instanceof int[] jh
            ? (ns == 1 ? IntStream.range(0, nt).filter(i -> (T[i] & 31) == (S[0] & 31) && (T[i] >> 5) >= (S[0] >> 5)).mapToLong(i -> (T[i] >> 5) - (S[0] >> 5) + 1).sum()
                : ns == 2 ? IntStream.range(0, nt - 1).filter(i -> (T[i] & 31) == (S[0] & 31) && (T[i] >> 5) >= (S[0] >> 5) && (T[i + 1] & 31) == (S[1] & 31) && (T[i + 1] >> 5) >= (S[1] >> 5)).count()
                : IntStream.range(0, nt).filter(e -> Integer.valueOf(fb.applyAsInt(jh[0] == k ? fail[k - 1] : jh[0], T[e])) instanceof Integer j1
                    && (jh[0] = j1 + (M[j1] == T[e] ? 1 : 0)) == k && e - k >= 0 && e + 1 < nt
                    && (T[e - k] & 31) == (S[0] & 31) && (T[e - k] >> 5) >= (S[0] >> 5)
                    && (T[e + 1] & 31) == (S[ns - 1] & 31) && (T[e + 1] >> 5) >= (S[ns - 1] >> 5)).count()) : "");
    }
}
