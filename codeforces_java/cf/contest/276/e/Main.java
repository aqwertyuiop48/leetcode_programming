import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer q
            && Stream.generate(ArrayList<Integer>::new).limit(n + 1).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(it.nextInt()) instanceof Integer x && Integer.valueOf(it.nextInt()) instanceof Integer y && adj.get(x).add(y) && adj.get(y).add(x))
            && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] base && new int[n + 1] instanceof int[] len && new int[]{0} instanceof int[] cnt
            && adj.get(1).stream().allMatch(s -> new ArrayList<Integer>() instanceof ArrayList<Integer> ch && new int[]{s, 1} instanceof int[] st
                && IntStream.iterate(0, z -> st[0] != 0, z -> z + 1).allMatch(z -> ch.add(st[0]) && Integer.valueOf(st[0]) instanceof Integer cur
                    && (st[0] = adj.get(cur).stream().filter(u -> u != st[1]).findFirst().orElse(0)) >= 0 && (st[1] = cur) > 0)
                && IntStream.range(0, ch.size()).allMatch(i -> (dep[ch.get(i)] = i + 1) > 0 && (base[ch.get(i)] = cnt[0]) >= 0 && (len[ch.get(i)] = ch.size()) > 0)
                && (cnt[0] += ch.size()) > 0)
            && new long[n + 3] instanceof long[] tb && new long[n + 3] instanceof long[] gb
            && ((Predicate<long[]>) a -> a[1] > a[2] || (a[0] == 0 ? tb : gb) instanceof long[] bit
                && IntStream.iterate((int) a[1], i -> i <= n + 2, i -> i + (i & -i)).allMatch(i -> (bit[i] += a[3]) != Long.MIN_VALUE)
                && IntStream.iterate((int) a[2] + 1, i -> i <= n + 2, i -> i + (i & -i)).allMatch(i -> (bit[i] -= a[3]) != Long.MIN_VALUE)) instanceof Predicate<long[]> radd
            && ((ToLongFunction<long[]>) a -> (a[0] == 0 ? tb : gb) instanceof long[] bit
                ? IntStream.iterate((int) a[1], i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bit[i]).sum() : 0) instanceof ToLongFunction<long[]> pq
            ? IntStream.range(0, q).mapToObj(i -> it.nextInt() == 0
                ? Integer.valueOf(it.nextInt()) instanceof Integer v && Integer.valueOf(it.nextInt()) instanceof Integer x && Integer.valueOf(it.nextInt()) instanceof Integer d
                    && (v == 1 ? radd.test(new long[]{1, 1, Math.min(d, n) + 1, x})
                        : d < dep[v] ? radd.test(new long[]{0, base[v] + dep[v] - d, base[v] + Math.min(len[v], dep[v] + d), x})
                        : radd.test(new long[]{1, 1, Math.min(d - dep[v], n) + 1, x}) && radd.test(new long[]{0, base[v] + d - dep[v] + 1, base[v] + Math.min(len[v], dep[v] + d), x}))
                    ? (String) null : (String) null
                : Integer.valueOf(it.nextInt()) instanceof Integer v ? String.valueOf(pq.applyAsLong(new long[]{1, dep[v] + 1}) + (v == 1 ? 0 : pq.applyAsLong(new long[]{0, base[v] + dep[v]}))) : (String) null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
