import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer s
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && Integer.valueOf(IntStream.range(0, n).reduce(0, (x, y) -> a[y] > a[x] ? y : x)) instanceof Integer mx
            && Integer.valueOf(s - a[mx]) instanceof Integer need
            && need >= 0
            && IntStream.range(0, n).filter(i -> i != mx && a[i] <= need).boxed().sorted(Comparator.comparingInt(i -> a[i])).mapToInt(i -> i).toArray() instanceof int[] items && new int[1] instanceof int[] rc
            && new long[(need >> 6) + 1] instanceof long[] B && (B[0] = 1) == 1
            && IntStream.range(0, need + 1).map(i -> -2).toArray() instanceof int[] first && (first[0] = -1) == -1
            && IntStream.range(0, items.length).takeWhile(k -> first[need] == -2).allMatch(k -> Integer.valueOf(a[items[k]]) instanceof Integer x && Integer.valueOf(x >> 6) instanceof Integer ws && Integer.valueOf(x & 63) instanceof Integer bs
                && IntStream.iterate(Math.min(B.length - 1, (rc[0] >> 6) + ws + 1), w -> w >= ws, w -> w - 1).allMatch(w -> Long.valueOf(((B[w - ws] << bs) | (bs > 0 && w - ws - 1 >= 0 ? B[w - ws - 1] >>> (64 - bs) : 0L)) & ~B[w]) instanceof Long nw
                    && (B[w] |= nw) >= Long.MIN_VALUE
                    && LongStream.iterate(nw, v -> v != 0, v -> v & (v - 1)).allMatch(v -> w * 64 + Long.numberOfTrailingZeros(v) > need || (first[w * 64 + Long.numberOfTrailingZeros(v)] = k) >= 0)) && (rc[0] = Math.min(need, rc[0] + x)) >= 0)
            ? first[need] == -2 ? "-1" : IntStream.iterate(need, v -> v > 0, v -> v - a[items[first[v]]]).map(v -> items[first[v]]).boxed().collect(Collectors.toSet()) instanceof Set<Integer> chosen
                && IntStream.range(0, n).filter(i -> i != mx && !chosen.contains(i)).boxed().sorted((x, y) -> a[y] - a[x]).toList() instanceof List<Integer> R
                && new int[n] instanceof int[] nxt && (nxt[mx] = R.isEmpty() ? 0 : R.get(0) + 1) >= 0 && IntStream.range(0, R.size()).allMatch(j -> (nxt[R.get(j)] = j + 1 < R.size() ? R.get(j + 1) + 1 : 0) >= 0)
                ? IntStream.range(0, n).mapToObj(i -> (a[i] - (nxt[i] > 0 ? a[nxt[i] - 1] : 0)) + (nxt[i] > 0 ? " 1 " + nxt[i] : " 0")).collect(Collectors.joining("\n")) : "" : "-1");
    }
}
