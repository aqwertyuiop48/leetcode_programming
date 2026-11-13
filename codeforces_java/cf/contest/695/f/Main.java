import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (st[3] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : st[1] == 1 ? (nums[st[2]++] = st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 : 0) > 5).count() >= 0
            && Integer.valueOf(nums[0]) instanceof Integer n && new int[n + 1] instanceof int[] spf && new int[n + 1] instanceof int[] rad && new int[n + 1] instanceof int[] Q && new int[n + 1] instanceof int[] lp
            && IntStream.rangeClosed(2, n).filter(i -> spf[i] == 0 ? (spf[i] = i) > 0 && (long) i * i <= n && IntStream.iterate(i * i, j -> j <= n, j -> j + i).filter(j -> spf[j] == 0 && (spf[j] = i) < 0).count() >= 0 : true).count() >= 0
            && (rad[1] = 1) == 1
            && IntStream.rangeClosed(2, n).filter(x -> Integer.valueOf(spf[x]) instanceof Integer p && Integer.valueOf(x / p) instanceof Integer y
                && (rad[x] = y % p == 0 ? rad[y] : rad[y] * p) > 0 && (lp[x] = y == 1 ? p : lp[y]) > 0 && (Q[x] = (long) lp[x] * lp[x] > n ? lp[x] : 0) < 0).count() >= 0
            && ((IntPredicate) x -> x == 1 || (spf[x] == x && 2 * x > n)) instanceof IntPredicate iso
            && ((IntUnaryOperator) x -> Q[x] == 0 ? rad[x] : rad[x] / Q[x]) instanceof IntUnaryOperator small
            && new int[n + 1] instanceof int[] cntRad && new int[n + 1] instanceof int[] fixedRad && new int[n + 1] instanceof int[] gs && new int[n + 1] instanceof int[] forced && new int[n + 1] instanceof int[] mp && new int[n + 1] instanceof int[] rv && new int[n + 2] instanceof int[] used && new int[] {0, 0} instanceof int[] ci
            && IntStream.rangeClosed(1, n).filter(x -> iso.test(x) ? ci[0]++ < 0 : (cntRad[rad[x]]++ < 0 || (spf[x] == x && (long) x * x > n && gs[n / x]++ < 0))).count() >= 0
            && new long[n + 1] instanceof long[] fact && (fact[0] = 1) == 1 && IntStream.rangeClosed(1, n).filter(i -> (fact[i] = fact[i - 1] * i % 1000000007L) < 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> nums[i] != 0 && !(Integer.valueOf(nums[i]) instanceof Integer v && v <= n && used[v]++ == 0 && iso.test(i) == iso.test(v)
                && (iso.test(i) ? ci[1]++ >= 0 : small.applyAsInt(i) == small.applyAsInt(v) && (Q[i] == 0) == (Q[v] == 0) && fixedRad[rad[i]]++ >= 0
                    && (Q[i] == 0 || (n / Q[i] == n / Q[v] && (mp[Q[i]] == 0 || mp[Q[i]] == Q[v]) && (rv[Q[v]] == 0 || rv[Q[v]] == Q[i])
                        && (mp[Q[i]] != 0 || ((mp[Q[i]] = Q[v]) > 0 && (rv[Q[v]] = Q[i]) > 0 && forced[n / Q[i]]++ >= 0)))))))
                .count() == 0
            ? Long.toString(IntStream.rangeClosed(1, n).mapToLong(m -> fact[gs[m] - forced[m]] * fact[cntRad[m] - fixedRad[m]] % 1000000007L).reduce(fact[ci[0] - ci[1]], (x, y) -> x * y % 1000000007L)) : "0");
    }
}
