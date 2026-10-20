import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Long.valueOf(1000000000L) instanceof Long M
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && Integer.valueOf(n + 3) instanceof Integer OFF && new long[2 * OFF + 1] instanceof long[] F && (F[OFF + 1] = 1) == 1
            && IntStream.rangeClosed(2, OFF).allMatch(i -> (F[OFF + i] = (F[OFF + i - 1] + F[OFF + i - 2]) % M) >= 0)
            && IntStream.rangeClosed(1, OFF).allMatch(i -> (F[OFF - i] = ((F[OFF - i + 2] - F[OFF - i + 1]) % M + M) % M) >= 0)
            && new long[n + 3] instanceof long[] PF && IntStream.rangeClosed(1, n + 2).allMatch(i -> (PF[i] = (PF[i - 1] + F[OFF + i]) % M) >= 0)
            && new long[2 * n] instanceof long[] s0 && new long[2 * n] instanceof long[] s1 && new long[2 * n] instanceof long[] lz && new long[2] instanceof long[] qa && new long[3] instanceof long[] g
            && ((Predicate<long[]>) q -> Integer.valueOf((int) q[0]) instanceof Integer v
                && (s0[v] = (s0[v] + q[3] * ((PF[(int) q[2]] - PF[(int) q[1] - 1] + M) % M)) % M) >= 0
                && (s1[v] = (s1[v] + q[3] * ((PF[(int) q[2] + 1] - PF[(int) q[1]] + M) % M)) % M) >= 0
                && (lz[v] = (lz[v] + q[3]) % M) >= 0) instanceof Predicate<long[]> apply
            && ((Predicate<long[]>) q -> lz[(int) q[0]] == 0 || (Integer.valueOf((int) (q[1] + q[2]) / 2) instanceof Integer mid
                && apply.test(new long[]{q[0] + 1, q[1], mid, lz[(int) q[0]]}) && apply.test(new long[]{q[0] + 2 * (mid - q[1] + 1), mid + 1, q[2], lz[(int) q[0]]}) && (lz[(int) q[0]] = 0) == 0)) instanceof Predicate<long[]> push
            && ((Predicate<long[]>) q -> Integer.valueOf((int) q[0]) instanceof Integer v && Integer.valueOf((int) (q[0] + 2 * ((q[1] + q[2]) / 2 - q[1] + 1))) instanceof Integer rc
                && (s0[v] = (s0[v + 1] + s0[rc]) % M) >= 0 && (s1[v] = (s1[v + 1] + s1[rc]) % M) >= 0) instanceof Predicate<long[]> pull
            && new AtomicReference<Predicate<long[]>>() instanceof AtomicReference<Predicate<long[]>> build && new AtomicReference<Predicate<long[]>>() instanceof AtomicReference<Predicate<long[]>> upd && new AtomicReference<Predicate<long[]>>() instanceof AtomicReference<Predicate<long[]>> qry
            && build.compareAndSet(null, q -> q[1] == q[2] ? (s0[(int) q[0]] = a[(int) q[1] - 1] % M * F[OFF + (int) q[1]] % M) >= 0 && (s1[(int) q[0]] = a[(int) q[1] - 1] % M * F[OFF + (int) q[1] + 1] % M) >= 0
                : Integer.valueOf((int) (q[1] + q[2]) / 2) instanceof Integer mid && build.get().test(new long[]{q[0] + 1, q[1], mid}) && build.get().test(new long[]{q[0] + 2 * (mid - q[1] + 1), mid + 1, q[2]}) && pull.test(q))
            && upd.compareAndSet(null, q -> g[0] <= q[1] && q[2] <= g[1] ? apply.test(new long[]{q[0], q[1], q[2], g[2]})
                : Integer.valueOf((int) (q[1] + q[2]) / 2) instanceof Integer mid && push.test(q)
                    && (g[0] > mid || upd.get().test(new long[]{q[0] + 1, q[1], mid})) && (g[1] <= mid || upd.get().test(new long[]{q[0] + 2 * (mid - q[1] + 1), mid + 1, q[2]})) && pull.test(q))
            && qry.compareAndSet(null, q -> g[0] <= q[1] && q[2] <= g[1] ? (qa[0] += s0[(int) q[0]]) >= 0 && (qa[1] += s1[(int) q[0]]) >= 0
                : Integer.valueOf((int) (q[1] + q[2]) / 2) instanceof Integer mid && push.test(q)
                    && (g[0] > mid || qry.get().test(new long[]{q[0] + 1, q[1], mid})) && (g[1] <= mid || qry.get().test(new long[]{q[0] + 2 * (mid - q[1] + 1), mid + 1, q[2]})))
            && ((LongBinaryOperator) (l, r) -> (g[0] = l) > 0 && (g[1] = r) > 0 && (qa[0] = 0) == 0 && (qa[1] = 0) == 0 && qry.get().test(new long[]{0, 1, n})
                ? (qa[1] % M * F[OFF + 1 - (int) l] + qa[0] % M * F[OFF - (int) l]) % M : -1) instanceof LongBinaryOperator query
            && build.get().test(new long[]{0, 1, n})
            ? IntStream.range(0, m).mapToObj(e -> Long.valueOf(it.nextLong()) instanceof Long t
                ? t == 1 ? Long.valueOf(it.nextLong()) instanceof Long x && Long.valueOf(it.nextLong()) instanceof Long v
                        && (g[2] = ((v - query.applyAsLong(x, x)) % M + M) % M) >= 0 && (g[0] = x) > 0 && (g[1] = x) > 0 && upd.get().test(new long[]{0, 1, n}) ? (String) null : (String) null
                : t == 2 ? Long.valueOf(it.nextLong()) instanceof Long l && Long.valueOf(it.nextLong()) instanceof Long r ? String.valueOf(query.applyAsLong(l, r)) : ""
                : Long.valueOf(it.nextLong()) instanceof Long l && Long.valueOf(it.nextLong()) instanceof Long r && Long.valueOf(it.nextLong()) instanceof Long d
                        && (g[2] = d % M) >= 0 && (g[0] = l) > 0 && (g[1] = r) > 0 && upd.get().test(new long[]{0, 1, n}) ? (String) null : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
