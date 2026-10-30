import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer n && (Integer) o[1] instanceof Integer m && (Integer) o[2] instanceof Integer q
                && new int[n] instanceof int[] adj
                && IntStream.range(0, m).filter(i -> (adj[o[3 + 2 * i] - 1] |= 1 << (o[4 + 2 * i] - 1)) >= 0 && (adj[o[4 + 2 * i] - 1] |= 1 << (o[3 + 2 * i] - 1)) >= 0).count() >= 0
                && new int[1 << n] instanceof int[] nb
                && IntStream.range(0, 1 << n).filter(s -> (nb[s] = s == 0 ? 0 : nb[s & (s - 1)] | adj[Integer.numberOfTrailingZeros(s)]) < 0).count() >= 0
                && new int[n << n] instanceof int[] bad
                && IntStream.range(0, n << n).filter(idx -> (bad[idx] = IntStream.range(0, q).anyMatch(j -> o[5 + 2 * m + 3 * j] - 1 == (idx >> n) && ((idx & ((1 << n) - 1)) >> (o[3 + 2 * m + 3 * j] - 1) & 1) + ((idx & ((1 << n) - 1)) >> (o[4 + 2 * m + 3 * j] - 1) & 1) == 2) ? 1 : 0) < 0).count() >= 0
                && new long[n << n] instanceof long[] dp && new long[1 << n] instanceof long[] sum
                && new long[n << n] instanceof long[] cm
                && IntStream.range(0, n << n).filter(idx -> (Integer) (idx / n) instanceof Integer mask && (Integer) (idx % n) instanceof Integer v && (mask >> v & 1) == 1
                        && (dp[(v << n) + mask] = mask == (1 << v) ? 1L
                        : (Integer) (mask ^ (1 << v)) instanceof Integer rem && (Integer) (rem & -rem) instanceof Integer low && (Integer) (rem ^ low) instanceof Integer r2
                                ? IntStream.iterate(r2, s -> s >= 0, s -> s == 0 ? -1 : (s - 1) & r2).mapToLong(s -> (Integer) (low | s) instanceof Integer sub && (Integer) (nb[sub] & (mask ^ sub)) instanceof Integer cr
                                        ? (bad[(v << n) + sub] == 1 ? 0L
                                        : cr == 0 ? sum[sub] * dp[(v << n) + (mask ^ sub)]
                                        : cr == (1 << v) && Integer.bitCount(adj[v] & sub) == 1 ? cm[(Integer.numberOfTrailingZeros(adj[v] & sub) << n) + sub] * dp[(v << n) + (mask ^ sub)] : 0L)
                                        : 0L).sum() : 0L) >= 0
                        && (sum[mask] += (cm[(v << n) + mask] = IntStream.range(0, q).allMatch(j -> o[5 + 2 * m + 3 * j] - 1 != v || ((mask >> (o[3 + 2 * m + 3 * j] - 1) & 1) + (mask >> (o[4 + 2 * m + 3 * j] - 1) & 1)) == 2) ? dp[(v << n) + mask] : 0L)) >= 0).count() >= 0
                ? cm[(1 << n) - 1] : 0);
    }
}
