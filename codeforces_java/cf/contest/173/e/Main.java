import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> rd.getAsInt()).toArray() instanceof int[] r
            && IntStream.range(0, n).map(i -> rd.getAsInt()).toArray() instanceof int[] a
            && Arrays.stream(a).distinct().sorted().toArray() instanceof int[] ua
            && Integer.valueOf(ua.length) instanceof Integer u
            && ((IntUnaryOperator) x -> Integer.valueOf(Arrays.binarySearch(ua, x)) instanceof Integer p ? (p >= 0 ? p : -p - 1) : 0) instanceof IntUnaryOperator lower
            && ((IntUnaryOperator) x -> lower.applyAsInt(x + 1)) instanceof IntUnaryOperator upper
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> r[i])).toList() instanceof List<Integer> ordR
            && new int[u + 1] instanceof int[] bit
            && ((IntUnaryOperator) pos -> IntStream.iterate(pos + 1, i -> i <= u, i -> i + (i & -i)).map(i -> ++bit[i]).max().orElse(0)) instanceof IntUnaryOperator bitAdd
            && ((IntUnaryOperator) p -> IntStream.iterate(p, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) instanceof IntUnaryOperator bitSum
            && new int[]{0} instanceof int[] ptr
            && new int[n] instanceof int[] cnt
            && ordR.stream().allMatch(L -> IntStream.iterate(ptr[0], j -> j < n && r[ordR.get(j)] <= r[L], j -> j + 1).allMatch(j -> bitAdd.applyAsInt(lower.applyAsInt(a[ordR.get(j)])) >= 0 && (ptr[0] = j + 1) > 0)
                && (cnt[L] = bitSum.applyAsInt(upper.applyAsInt(a[L] + k)) - bitSum.applyAsInt(lower.applyAsInt(a[L] - k))) >= 0)
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, u) * 2 - 1)) instanceof Integer sz
            && new int[2 * sz] instanceof int[] tree
            && ((IntBinaryOperator) (pos, val) -> (tree[sz + pos] = Math.max(tree[sz + pos], val)) >= 0
                && IntStream.iterate((sz + pos) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (tree[i] = Math.max(tree[2 * i], tree[2 * i + 1])) >= 0) ? 0 : 0) instanceof IntBinaryOperator upd
            && ((IntBinaryOperator) (l, rr) -> l > rr ? 0 : new int[]{l + sz, rr + sz + 1, 0} instanceof int[] st
                && IntStream.iterate(0, z -> st[0] < st[1], z -> z + 1).allMatch(z -> ((st[0] & 1) == 0 || (st[2] = Math.max(st[2], tree[st[0]++])) >= 0)
                    && ((st[1] & 1) == 0 || (st[2] = Math.max(st[2], tree[--st[1]])) >= 0) && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0) ? st[2] : 0) instanceof IntBinaryOperator qry
            && Integer.valueOf(rd.getAsInt()) instanceof Integer q
            && IntStream.range(0, q).mapToObj(i -> Integer.valueOf(rd.getAsInt() - 1) instanceof Integer x && Integer.valueOf(rd.getAsInt() - 1) instanceof Integer y
                ? new int[]{Math.max(r[x], r[y]), Math.max(a[x], a[y]) - k, Math.min(a[x], a[y]) + k, i} : null).sorted(Comparator.comparingInt((int[] e) -> -e[0])).toList() instanceof List<int[]> qs
            && IntStream.generate(() -> -1).limit(q).toArray() instanceof int[] ans
            && new int[]{n - 1} instanceof int[] pp
            && qs.stream().allMatch(e -> IntStream.iterate(pp[0], j -> j >= 0 && r[ordR.get(j)] >= e[0], j -> j - 1).allMatch(j -> upd.applyAsInt(lower.applyAsInt(a[ordR.get(j)]), cnt[ordR.get(j)]) >= 0 && (pp[0] = j - 1) > -5)
                && (e[1] > e[2] || Integer.valueOf(qry.applyAsInt(lower.applyAsInt(e[1]), upper.applyAsInt(e[2]) - 1)) instanceof Integer res && (ans[e[3]] = res == 0 ? -1 : res) != Integer.MIN_VALUE))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}
