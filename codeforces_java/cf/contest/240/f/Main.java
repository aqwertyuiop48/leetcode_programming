import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            && new StringTokenizer(ls.get(0)) instanceof StringTokenizer h0 && Integer.valueOf(h0.nextToken()) instanceof Integer n && Integer.valueOf(h0.nextToken()) instanceof Integer m
            && ls.get(1).trim() instanceof String s
            && new TreeMap<Integer, int[]>() instanceof TreeMap<Integer, int[]> mp
            && IntStream.rangeClosed(1, n).allMatch(i -> mp.put(i, new int[]{i, s.charAt(i - 1) - 'a'}) == null)
            && ((IntUnaryOperator) pos -> pos > n || !(mp.floorEntry(pos) instanceof Map.Entry<Integer, int[]> e) || e.getKey() >= pos || e.getValue()[0] < pos
                ? 0 : mp.put(pos, new int[]{e.getValue()[0], e.getValue()[1]}) == null && mp.put(e.getKey(), new int[]{pos - 1, e.getValue()[1]}) != null ? 0 : 1) instanceof IntUnaryOperator split
            && new int[26] instanceof int[] cnt && new int[1] instanceof int[] pp
            && IntStream.range(0, m).allMatch(qi -> new StringTokenizer(ls.get(2 + qi)) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer l && Integer.valueOf(st.nextToken()) instanceof Integer r
                && split.applyAsInt(l) == 0 && split.applyAsInt(r + 1) == 0
                && mp.subMap(l, true, r, true) instanceof SortedMap<Integer, int[]> sub
                && IntStream.range(0, 26).allMatch(c -> (cnt[c] = 0) == 0)
                && sub.entrySet().stream().allMatch(e -> (cnt[e.getValue()[1]] += e.getValue()[0] - e.getKey() + 1) > 0)
                && (IntStream.range(0, 26).filter(c -> cnt[c] % 2 == 1).count() > 1 || sub.keySet().removeIf(k -> true)
                    && (pp[0] = l) > 0
                    && IntStream.range(0, 26).allMatch(c -> cnt[c] / 2 == 0 || mp.put(pp[0], new int[]{pp[0] + cnt[c] / 2 - 1, c}) == null && (pp[0] += cnt[c] / 2) > 0)
                    && IntStream.range(0, 26).allMatch(c -> cnt[c] % 2 == 0 || mp.put(pp[0], new int[]{pp[0], c}) == null && ++pp[0] > 0)
                    && IntStream.iterate(25, c -> c >= 0, c -> c - 1).allMatch(c -> cnt[c] / 2 == 0 || mp.put(pp[0], new int[]{pp[0] + cnt[c] / 2 - 1, c}) == null && (pp[0] += cnt[c] / 2) > 0)))
            ? mp.entrySet().stream().map(e -> String.valueOf((char) ('a' + e.getValue()[1])).repeat(e.getValue()[0] - e.getKey() + 1)).collect(Collectors.joining()) : "");
    }
}
