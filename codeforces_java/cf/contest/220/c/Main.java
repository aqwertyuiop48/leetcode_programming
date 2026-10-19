import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n + 1] instanceof int[] pa && IntStream.range(0, n).allMatch(i -> (pa[it.next()] = i) >= 0)
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] b
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> ms
            && IntStream.range(0, n).allMatch(p -> ms.merge(p - pa[b[p]], 1, Integer::sum) > 0)
            ? IntStream.range(0, n).mapToObj(sft -> (sft == 0 || Integer.valueOf(sft - 1) instanceof Integer p && Integer.valueOf(p - pa[b[p]]) instanceof Integer oldKey
                    && (ms.computeIfPresent(oldKey, (kk, v) -> v == 1 ? null : v - 1) == null || true) && ms.merge(p + n - pa[b[p]], 1, Integer::sum) > 0)
                ? String.valueOf(Stream.of(ms.floorKey(sft), ms.ceilingKey(sft)).filter(Objects::nonNull).mapToInt(k -> Math.abs(k - sft)).min().getAsInt()) : "").collect(Collectors.joining("\n")) : "");
    }
}
