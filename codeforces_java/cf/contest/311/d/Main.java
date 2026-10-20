import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(95542721) instanceof Integer P
            && new int[2 * n * 48] instanceof int[] base && new int[2 * n] instanceof int[] off && new int[2 * n] instanceof int[] lz && new int[2] instanceof int[] qr
            && ((IntBinaryOperator) (node, j) -> base[node * 48 + j + off[node] - (j + off[node] >= 48 ? 48 : 0)]) instanceof IntBinaryOperator real
            && ((IntBinaryOperator) (node, k) -> (off[node] = (off[node] + k) % 48) + (lz[node] = (lz[node] + k) % 48)) instanceof IntBinaryOperator apply
            && ((Predicate<int[]>) q -> IntStream.range(0, 48).allMatch(j -> Integer.valueOf(real.applyAsInt(q[1], j) + real.applyAsInt(q[2], j)) instanceof Integer s && (base[q[0] * 48 + j] = s >= P ? s - P : s) >= 0) && (off[q[0]] = 0) == 0) instanceof Predicate<int[]> pull
            && ((Predicate<int[]>) q -> lz[q[0]] == 0 || (apply.applyAsInt(q[1], lz[q[0]]) >= 0 && apply.applyAsInt(q[2], lz[q[0]]) >= 0 && (lz[q[0]] = 0) == 0)) instanceof Predicate<int[]> push
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> build && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> upd
            && new AtomicReference<ToLongFunction<int[]>>() instanceof AtomicReference<ToLongFunction<int[]>> qry
            && build.compareAndSet(null, q -> q[1] == q[2]
                ? new long[]{a[q[1]] % P} instanceof long[] v && IntStream.range(0, 48).allMatch(j -> (base[q[0] * 48 + j] = (int) v[0]) >= 0 && (v[0] = v[0] * v[0] % P * v[0] % P) >= 0)
                : Integer.valueOf((q[1] + q[2]) / 2) instanceof Integer mid && Integer.valueOf(q[0] + 2 * (mid - q[1] + 1)) instanceof Integer rc
                    && build.get().test(new int[]{q[0] + 1, q[1], mid}) && build.get().test(new int[]{rc, mid + 1, q[2]}) && pull.test(new int[]{q[0], q[0] + 1, rc}))
            && upd.compareAndSet(null, q -> qr[0] <= q[1] && q[2] <= qr[1] ? apply.applyAsInt(q[0], 1) >= 0
                : Integer.valueOf((q[1] + q[2]) / 2) instanceof Integer mid && Integer.valueOf(q[0] + 2 * (mid - q[1] + 1)) instanceof Integer rc
                    && push.test(new int[]{q[0], q[0] + 1, rc})
                    && (qr[0] > mid || upd.get().test(new int[]{q[0] + 1, q[1], mid})) && (qr[1] <= mid || upd.get().test(new int[]{rc, mid + 1, q[2]}))
                    && pull.test(new int[]{q[0], q[0] + 1, rc}))
            && qry.compareAndSet(null, q -> qr[0] <= q[1] && q[2] <= qr[1] ? (long) real.applyAsInt(q[0], 0)
                : Integer.valueOf((q[1] + q[2]) / 2) instanceof Integer mid && Integer.valueOf(q[0] + 2 * (mid - q[1] + 1)) instanceof Integer rc
                    && push.test(new int[]{q[0], q[0] + 1, rc})
                    ? (qr[0] > mid ? 0L : qry.get().applyAsLong(new int[]{q[0] + 1, q[1], mid})) + (qr[1] <= mid ? 0L : qry.get().applyAsLong(new int[]{rc, mid + 1, q[2]})) : 0L)
            && build.get().test(new int[]{0, 0, n - 1})
            && Integer.valueOf(it.nextInt()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> Integer.valueOf(it.nextInt()) instanceof Integer t && (qr[0] = it.nextInt() - 1) >= 0 && (qr[1] = it.nextInt() - 1) >= 0
                ? t == 1 ? String.valueOf(qry.get().applyAsLong(new int[]{0, 0, n - 1}) % P) : upd.get().test(new int[]{0, 0, n - 1}) ? (String) null : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
