import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && new int[m + 1] instanceof int[] tp && new int[m + 1] instanceof int[] qa && new int[m + 1] instanceof int[] qb
            && IntStream.rangeClosed(1, m).allMatch(q -> (tp[q] = it.nextInt()) > 0 && (qa[q] = it.nextInt()) > 0 && (tp[q] == 2 || (qb[q] = it.nextInt()) > 0))
            && IntStream.rangeClosed(1, m).filter(q -> tp[q] == 1).boxed().sorted(Comparator.comparingInt((Integer q) -> qb[q] - q).thenComparingInt(q -> q)).mapToInt(x -> x).toArray() instanceof int[] ord
            && new int[m + 1] instanceof int[] rk && IntStream.range(0, ord.length).allMatch(i -> (rk[ord[i]] = i) >= 0)
            && Integer.valueOf(Integer.highestOneBit(Math.max(ord.length, 1)) * 2) instanceof Integer sz && Integer.valueOf(Integer.highestOneBit(n + 2) * 2) instanceof Integer szp
            && new int[2 * sz] instanceof int[] tkey && new int[2 * sz] instanceof int[] tall && new int[2 * szp] instanceof int[] tpos
            && new int[m + 1] instanceof int[] S && new boolean[m + 1] instanceof boolean[] alive && new boolean[m + 1] instanceof boolean[] inKey && new boolean[m + 1] instanceof boolean[] inPos
            && new int[n + 2] instanceof int[] posTree && new int[n + 1] instanceof int[] bit && new int[]{0} instanceof int[] tot && new int[m + 1] instanceof int[] ans
            && ((BiFunction<int[], int[], Integer>) (t, a) -> new int[]{a[1] + a[0], a[2] + a[0], 0} instanceof int[] lr
                && IntStream.iterate(0, i -> lr[0] < lr[1], i -> i + 1).allMatch(i -> ((lr[0] & 1) == 0 || (lr[2] = Math.max(lr[2], t[lr[0]++])) >= 0) && ((lr[1] & 1) == 0 || (lr[2] = Math.max(lr[2], t[--lr[1]])) >= 0) && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                ? lr[2] : 0) instanceof BiFunction<int[], int[], Integer> qm
            && ((BiFunction<int[], int[], Boolean>) (t, a) -> (t[a[1] + a[0]] = a[2]) >= 0 && IntStream.iterate((a[1] + a[0]) >> 1, j -> j >= 1, j -> j >> 1).allMatch(j -> (t[j] = Math.max(t[2 * j], t[2 * j + 1])) >= 0)) instanceof BiFunction<int[], int[], Boolean> upd
            && ((BiFunction<Integer, Integer, Boolean>) (p, dl) -> IntStream.iterate(p, i -> i <= n, i -> i + (i & -i)).allMatch(i -> (bit[i] += dl) > -1)) instanceof BiFunction<Integer, Integer, Boolean> add
            && ((Function<Integer, Integer>) p -> IntStream.iterate(p - 1, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) instanceof Function<Integer, Integer> pre
            && ((Function<Integer, Integer>) k -> new int[]{0, k} instanceof int[] st
                && IntStream.iterate(Integer.highestOneBit(n), pw -> pw > 0, pw -> pw >> 1).allMatch(pw -> st[0] + pw > n || bit[st[0] + pw] >= st[1] || (st[1] -= bit[st[0] + pw]) > -1 << 30 && (st[0] += pw) >= 0)
                ? st[0] + 1 : 0) instanceof Function<Integer, Integer> kth
            && ((BiPredicate<Integer, Integer>) (id, v) -> (S[id] = v) > 0 && upd.apply(tall, new int[]{sz, rk[id], v})) instanceof BiPredicate<Integer, Integer> put
            && ((IntPredicate) id -> (inKey[id] = true) && upd.apply(tkey, new int[]{sz, rk[id], S[id]})) instanceof IntPredicate addKey
            && ((IntPredicate) s -> Integer.valueOf(qa[s]) instanceof Integer p && Integer.valueOf(pre.apply(p)) instanceof Integer r
                && put.test(s, 1 + Math.max(qm.apply(tpos, new int[]{szp, p + 1, n + 1}), IntStream.rangeClosed(Math.max(1, s - 9), s - 1).filter(j -> tp[j] == 1 && alive[j] && qa[j] > p && qb[j] - j > qb[s] - s).map(j -> S[j]).max().orElse(0)))
                && (alive[s] = true) && (posTree[p] = s) > 0 && add.apply(p, 1) && ++tot[0] > 0
                && IntStream.rangeClosed(Math.max(1, s - 9), s).filter(j -> tp[j] == 1 && alive[j]).boxed().sorted(Comparator.comparingInt((Integer j) -> j - qb[j])).mapToInt(x -> x).toArray() instanceof int[] y
                && IntStream.range(0, y.length).allMatch(a -> IntStream.range(0, a).filter(b -> qa[y[b]] > qa[y[a]]).allMatch(b -> put.test(y[a], Math.max(S[y[a]], 1 + S[y[b]]))))
                && IntStream.range(0, y.length).allMatch(a -> !inKey[y[a]] || upd.apply(tkey, new int[]{sz, rk[y[a]], S[y[a]]}))
                && (r >= 10 ? addKey.test(s) : tot[0] < 11 || addKey.test(posTree[kth.apply(11)]))) instanceof IntPredicate plant
            && ((IntPredicate) s -> Integer.valueOf(kth.apply(qa[s])) instanceof Integer pd && Integer.valueOf(posTree[pd]) instanceof Integer d
                && !(alive[d] = false) && upd.apply(tall, new int[]{sz, rk[d], 0}) && add.apply(pd, -1) && --tot[0] >= 0
                && (!inPos[d] || (inPos[d] = false) || upd.apply(tpos, new int[]{szp, pd, 0}))
                && (tot[0] < 10 || Integer.valueOf(posTree[kth.apply(10)]) instanceof Integer f && (inKey[f] = false) == false && upd.apply(tkey, new int[]{sz, rk[f], 0}))
                && IntStream.rangeClosed(1, Math.min(10, tot[0])).map(k -> posTree[kth.apply(k)]).toArray() instanceof int[] w
                && IntStream.iterate(Math.min(w.length, qa[s] - 1) - 1, r -> r >= 0, r -> r - 1).allMatch(r -> Integer.valueOf(w[r]) instanceof Integer i
                    && put.test(i, 1 + Math.max(IntStream.range(r + 1, w.length).filter(c -> qb[w[c]] - w[c] > qb[i] - i).map(c -> S[w[c]]).max().orElse(0), qm.apply(tkey, new int[]{sz, rk[i] + 1, sz})))
                    && (!inPos[i] || upd.apply(tpos, new int[]{szp, qa[i], S[i]})))) instanceof IntPredicate cut
            && IntStream.rangeClosed(1, m).allMatch(s -> (tp[s] == 1 ? plant.test(s) : cut.test(s))
                && (s - 9 < 1 || tp[s - 9] != 1 || !alive[s - 9] || (inPos[s - 9] = true) && upd.apply(tpos, new int[]{szp, qa[s - 9], S[s - 9]}))
                && (ans[s] = tall[1]) >= 0)
            ? IntStream.rangeClosed(1, m).mapToObj(s -> String.valueOf(ans[s])).collect(Collectors.joining("\n")) : "");
    }
}
