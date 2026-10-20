import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) t[1] instanceof Integer m
            && (Integer) t[2] instanceof Integer tn
            && new long[m + 1] instanceof long[] cnt
            && IntStream.range(0, tn).allMatch(i -> ++cnt[t[3 + i] % m] > 0)
            && (Long) 1000000007L instanceof Long P
            && (Long) (m >= 64 ? -1L : (1L << m) - 1) instanceof Long mlo
            && (Long) (m > 64 ? (1L << (m - 64)) - 1 : 0L) instanceof Long mhi
            && IntStream.rangeClosed(0, m / 2).mapToLong(c -> cnt[c] + (2 * c == m || c == 0 ? 0 : cnt[m - c])).toArray() instanceof long[] W
            && ((LongBinaryOperator) (lo, hs) ->
                (Integer) (int) (hs >>> 57) instanceof Integer s
                && (Long) (hs & 144115188075855871L) instanceof Long hi
                && (Integer) (m - s) instanceof Integer u
                    ? ((s < 64 ? lo << s : 0L) & mlo) | (u < 64 ? lo >>> u | hi << (64 - u) : hi >>> (u - 64))
                    : 0L) instanceof LongBinaryOperator rl
            && ((LongBinaryOperator) (lo, hs) ->
                (Integer) (int) (hs >>> 57) instanceof Integer s
                && (Long) (hs & 144115188075855871L) instanceof Long hi
                && (Integer) (m - s) instanceof Integer u
                    ? ((s < 64 ? hi << s | lo >>> (64 - s) : lo << (s - 64)) & mhi) | (u < 64 ? hi >>> u : 0L)
                    : 0L) instanceof LongBinaryOperator rh
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> self
            && (self.getAndSet((lo, hs) ->
                (Long) (hs & 144115188075855871L) instanceof Long hi
                && (Integer) (int) (hs >>> 57) instanceof Integer last
                    ? (1 + IntStream.rangeClosed(last + 1, m / 2).mapToLong(c ->
                        ((c < 64 ? lo >>> c : hi >>> (c - 64)) & 1) != 0 || W[c] == 0 ? 0L
                        : (Long) (hi | (long) c << 57) instanceof Long h1
                            && (Long) (hi | (long) (m - c) << 57) instanceof Long h2
                            && (Long) (lo | rl.applyAsLong(lo, h1) | rl.applyAsLong(lo, h2)) instanceof Long nlo
                            && (Long) (hi | rh.applyAsLong(lo, h1) | rh.applyAsLong(lo, h2)) instanceof Long nhi
                            ? W[c] * self.get().applyAsLong(nlo, nhi | (long) c << 57) % P
                            : 0L).sum()) % P
                    : 0L) == null)
            ? self.get().applyAsLong(1L, 0L)
            : -1L);
    }
}
