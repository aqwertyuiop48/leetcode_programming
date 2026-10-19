import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(it.nextInt()) instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> new int[]{it.nextInt(), it.nextInt(), it.nextInt(), it.nextInt()}).toList() instanceof List<int[]> cuts
            && new int[]{n - 1, m - 1} instanceof int[] lines && new int[]{m, n} instanceof int[] L
            && ((Function<Integer, TreeMap<Integer, List<int[]>>>) o -> cuts.stream().filter(c -> o == 0 ? c[0] == c[2] && c[0] > 0 && c[0] < n : c[1] == c[3] && c[1] > 0 && c[1] < m)
                .collect(Collectors.groupingBy(c -> o == 0 ? c[0] : c[1], TreeMap::new, Collectors.mapping(c -> o == 0 ? new int[]{Math.min(c[1], c[3]), Math.max(c[1], c[3])} : new int[]{Math.min(c[0], c[2]), Math.max(c[0], c[2])}, Collectors.toList()))))
                instanceof Function<Integer, TreeMap<Integer, List<int[]>>> grp
            && ((Function<List<int[]>, List<int[]>>) iv -> new ArrayList<int[]>() instanceof ArrayList<int[]> mg
                && iv.stream().sorted(Comparator.comparingInt(a -> a[0])).allMatch(a -> mg.isEmpty() || mg.get(mg.size() - 1)[1] < a[0] ? mg.add(new int[]{a[0], a[1]}) : (mg.get(mg.size() - 1)[1] = Math.max(mg.get(mg.size() - 1)[1], a[1])) >= 0)
                ? mg : null) instanceof Function<List<int[]>, List<int[]>> merge
            && IntStream.range(0, 2).mapToObj(o -> grp.apply(o).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, e -> merge.apply(e.getValue()), (a, b) -> a, TreeMap::new))).toList() instanceof List<TreeMap<Integer, List<int[]>>> mp
            && ((ToLongBiFunction<Integer, List<int[]>>) (o, mg) -> L[o] - mg.stream().mapToLong(a -> a[1] - a[0]).sum()) instanceof ToLongBiFunction<Integer, List<int[]>> pile
            && Long.valueOf(IntStream.range(0, 2).mapToLong(o -> ((lines[o] - mp.get(o).size()) % 2 == 1 ? (long) L[o] : 0L) ^ mp.get(o).values().stream().mapToLong(mg -> pile.applyAsLong(o, mg)).reduce(0, (a, b) -> a ^ b)).reduce(0, (a, b) -> a ^ b)) instanceof Long X
            ? X == 0 ? "SECOND"
                : "FIRST\n" + IntStream.range(0, 2).boxed().flatMap(o -> Stream.concat(
                    mp.get(o).entrySet().stream().filter(e -> (pile.applyAsLong(o, e.getValue()) ^ X) < pile.applyAsLong(o, e.getValue())).map(e -> new long[]{o, e.getKey(), pile.applyAsLong(o, e.getValue()) - (pile.applyAsLong(o, e.getValue()) ^ X), 1}),
                    Stream.of(0).filter(z -> lines[o] - mp.get(o).size() > 0 && (L[o] ^ X) < L[o]).map(z -> new long[]{o, IntStream.rangeClosed(1, lines[o]).filter(x -> !mp.get(o).containsKey(x)).findFirst().getAsInt(), L[o] - (L[o] ^ X), 0})))
                    .findFirst().map(mv -> Long.valueOf(mv[3]) instanceof Long touched
                        ? Long.valueOf(touched == 0 ? mv[2] : mp.get((int) mv[0]).get((int) mv[1]) instanceof List<int[]> mg
                            ? new long[]{0, mv[2]} instanceof long[] stt && mg.stream().allMatch(a -> stt[1] <= 0 || (a[0] - stt[0] >= stt[1] ? (stt[0] += stt[1]) >= 0 && (stt[1] = 0) == 0 : (stt[1] -= a[0] - stt[0]) >= 0 && (stt[0] = a[1]) >= 0)) ? stt[0] + stt[1] : 0 : 0) instanceof Long t
                            ? mv[0] == 0 ? mv[1] + " 0 " + mv[1] + " " + t : "0 " + mv[1] + " " + t + " " + mv[1] : "" : "").get() : "");
    }
}
