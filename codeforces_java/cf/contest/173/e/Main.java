import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] r && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.of(a).distinct().sorted().toArray() instanceof int[] ua && (Integer) ua.length instanceof Integer u
            && ((IntUnaryOperator) x -> Math.max(Arrays.binarySearch(ua, x), ~Arrays.binarySearch(ua, x))) instanceof IntUnaryOperator lower
            && IntStream.range(0, n).map(j -> lower.applyAsInt(a[j])).toArray() instanceof int[] ai
            && IntStream.range(0, n).mapToLong(i -> (long) r[i] << 20 | i).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] ordR
            && new int[u + 1] instanceof int[] bit && new int[]{0} instanceof int[] ptr && new int[n] instanceof int[] cnt
            && Arrays.stream(ordR).allMatch(L -> IntStream.iterate(ptr[0], j -> j < n && r[ordR[j]] <= r[L], j -> j + 1).allMatch(j -> IntStream.iterate(ai[ordR[j]] + 1, i -> i <= u, i -> i + (i & -i)).allMatch(i -> ++bit[i] > 0) && (ptr[0] = j + 1) > 0)
                && (cnt[L] = IntStream.iterate(lower.applyAsInt(a[L] + k + 1), i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum() - IntStream.iterate(lower.applyAsInt(a[L] - k), i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) >= 0)
            && (Integer) Integer.highestOneBit(Math.max(1, u) * 2 - 1) instanceof Integer sz && new int[2 * sz] instanceof int[] tree && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.range(0, 2 * q).map(i -> Integer.parseInt(tk.nextToken()) - 1).toArray() instanceof int[] qxy
            && IntStream.range(0, q).mapToLong(i -> (long) (1_000_000_001 - Math.max(r[qxy[2 * i]], r[qxy[2 * i + 1]])) << 20 | i).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] qo
            && IntStream.generate(() -> -1).limit(q).toArray() instanceof int[] ans && new int[]{n - 1} instanceof int[] pp
            && Arrays.stream(qo).allMatch(qi -> (Integer) Math.max(r[qxy[2 * qi]], r[qxy[2 * qi + 1]]) instanceof Integer thr
                && IntStream.iterate(pp[0], j -> j >= 0 && r[ordR[j]] >= thr, j -> j - 1).allMatch(j -> (tree[sz + ai[ordR[j]]] = Math.max(tree[sz + ai[ordR[j]]], cnt[ordR[j]])) >= 0
                    && IntStream.iterate((sz + ai[ordR[j]]) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (tree[i] = Math.max(tree[2 * i], tree[2 * i + 1])) >= 0) && (pp[0] = j - 1) > -5)
                && (Integer) (Math.max(a[qxy[2 * qi]], a[qxy[2 * qi + 1]]) - k) instanceof Integer lo && (Integer) (Math.min(a[qxy[2 * qi]], a[qxy[2 * qi + 1]]) + k) instanceof Integer hi
                && (lo > hi || new int[]{lower.applyAsInt(lo) + sz, lower.applyAsInt(hi + 1) + sz, 0} instanceof int[] st
                    && IntStream.iterate(0, z -> st[0] < st[1], z -> z + 1).allMatch(z -> ((st[0] & 1) == 0 || (st[2] = Math.max(st[2], tree[st[0]++])) >= 0)
                        && ((st[1] & 1) == 0 || (st[2] = Math.max(st[2], tree[--st[1]])) >= 0) && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0)
                    && (ans[qi] = st[2] == 0 ? -1 : st[2]) != Integer.MIN_VALUE))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}


