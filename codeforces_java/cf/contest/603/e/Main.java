import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer m
            && LongStream.range(0, m).map(i -> ((long) a[4 + 3 * (int) i] << 17) | i).sorted().toArray() instanceof long[] ks
            && new int[m + 1] instanceof int[] sidx && new int[m + 1] instanceof int[] pos
            && IntStream.range(0, m).filter(j -> (sidx[j] = (int) (ks[j] & 131071)) >= 0 && (pos[sidx[j]] = j) >= 0).count() == m
            && (sidx[m] = m) == m
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sz
            && IntStream.range(0, n + 1).filter(i -> (par[i] = i) >= 0 && (sz[i] = 1) > 0).count() > 0
            && new int[m + n + 5] instanceof int[] stk && new int[]{0, n} instanceof int[] tp
            && new int[m] instanceof int[] ans
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fnd
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> sol
            && fnd.getAndSet(x -> par[x] == x ? x : fnd.get().applyAsInt(par[x])) == null
            && (IntBinaryOperator) ((c, p) -> (par[c] = p) + ((sz[c] & 1) == 1 && (sz[p] & 1) == 1 ? (tp[1] -= 2) : 0) + (sz[p] += sz[c]) + (stk[tp[0]++] = c)) instanceof IntBinaryOperator attach
            && (IntBinaryOperator) ((ru, rv) -> ru == rv ? 0 : sz[ru] < sz[rv] ? attach.applyAsInt(ru, rv) : attach.applyAsInt(rv, ru)) instanceof IntBinaryOperator link
            && (IntPredicate) (e -> link.applyAsInt(fnd.get().applyAsInt(a[2 + 3 * e]), fnd.get().applyAsInt(a[3 + 3 * e])) >= 0) instanceof IntPredicate unite
            && (IntBinaryOperator) ((c, p) -> (sz[p] -= sz[c]) + (par[c] = c) + ((sz[c] & 1) == 1 && (sz[p] & 1) == 1 ? (tp[1] += 2) : 0)) instanceof IntBinaryOperator detach
            && (IntConsumer) (t -> IntStream.range(0, tp[0] - t).filter(z -> detach.applyAsInt(stk[--tp[0]], par[stk[tp[0]]]) >= 0).count()) instanceof IntConsumer rollback
            && sol.getAndSet(g -> g[0] > g[1] || ((Integer) g[0] instanceof Integer l && (Integer) g[1] instanceof Integer r && (Integer) g[2] instanceof Integer lo && (Integer) g[3] instanceof Integer hi
                && (Integer) ((l + r) / 2) instanceof Integer mid && (Integer) tp[0] instanceof Integer t0
                && IntStream.rangeClosed(l, mid).filter(i -> pos[i] < lo && unite.test(i)).count() >= 0
                && (Integer) tp[0] instanceof Integer t1
                && (Integer) IntStream.rangeClosed(lo, hi).filter(j -> (sidx[j] > mid || unite.test(sidx[j])) && (tp[1] == 0 || j == hi)).findFirst().orElse(-1) instanceof Integer res
                && (ans[mid] = res == m ? -1 : a[4 + 3 * sidx[res]]) != -2
                && IntStream.of(0).peek(z -> rollback.accept(t1)).findFirst().isPresent()
                && sol.get().test(new int[]{mid + 1, r, lo, res})
                && IntStream.of(0).peek(z -> rollback.accept(t0)).findFirst().isPresent()
                && IntStream.range(lo, res).filter(j -> sidx[j] < l && unite.test(sidx[j])).count() >= 0
                && sol.get().test(new int[]{l, mid - 1, res, hi})
                && IntStream.of(0).peek(z -> rollback.accept(t0)).findFirst().isPresent())) == null
            && sol.get().test(new int[]{0, m - 1, 0, m})
            ? IntStream.range(0, m).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining("\n")) : "");
    }
}
