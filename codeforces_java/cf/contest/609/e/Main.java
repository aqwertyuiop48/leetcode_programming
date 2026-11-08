import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> Integer.valueOf(i < raw.length ? raw[i] : 32) instanceof Integer ch
                && (ch >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + ch - 48) >= 0 : st[0] < 0 || ((v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0))).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && LongStream.range(0, m).map(i -> ((long) v[4 + 3 * (int) i] << 18) | i).sorted().toArray() instanceof long[] ord
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && IntStream.rangeClosed(0, n).map(x -> 1).toArray() instanceof int[] sz
            && IntStream.rangeClosed(0, n).map(x -> Integer.MAX_VALUE).toArray() instanceof int[] tt
            && new long[]{0} instanceof long[] W
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] f
            && (f[0] = x -> par[x] == x ? x : f[0].applyAsInt(par[x])) != null
            && IntStream.range(0, m).filter(k -> Integer.valueOf((int) (ord[k] & 262143)) instanceof Integer e
                && Integer.valueOf(f[0].applyAsInt(v[2 + 3 * e])) instanceof Integer ru && Integer.valueOf(f[0].applyAsInt(v[3 + 3 * e])) instanceof Integer rv && ru - rv != 0
                && Integer.valueOf(sz[ru] >= sz[rv] ? ru : rv) instanceof Integer big && Integer.valueOf(ru + rv - big) instanceof Integer small
                && (par[small] = big) > 0 && (sz[big] += sz[small]) > 0 && (tt[small] = k) >= 0 && (W[0] += v[4 + 3 * e]) > 0).count() >= 0
            ? IntStream.range(0, m).mapToObj(i -> new int[]{v[2 + 3 * i], v[3 + 3 * i], 0} instanceof int[] s
                && IntStream.range(0, 40).takeWhile(z -> s[0] != s[1] && (tt[s[0]] < tt[s[1]]
                    ? (s[2] = Math.max(s[2], tt[s[0]])) >= 0 && (s[0] = par[s[0]]) >= 0
                    : (s[2] = Math.max(s[2], tt[s[1]])) >= 0 && (s[1] = par[s[1]]) >= 0)).count() >= 0
                ? String.valueOf(W[0] - (ord[s[2]] >> 18) + v[4 + 3 * i]) : "").collect(Collectors.joining("\n")) : "");
    }
}
