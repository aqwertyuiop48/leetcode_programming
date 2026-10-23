import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && tk.nextToken() instanceof String s && (Integer) s.length() instanceof Integer n
            && IntStream.range(0, n).boxed().flatMap(i -> IntStream.rangeClosed(1, Math.min(4, n - i)).mapToObj(l -> new int[]{s.substring(i, i + l).chars().reduce(0, (x, c) -> x * 27 + c - 'a' + 1), i}))
                .collect(Collectors.groupingBy(e -> e[0], Collectors.collectingAndThen(Collectors.toList(), l -> l.stream().mapToInt(e -> e[1]).toArray()))) instanceof Map<Integer, int[]> mp
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> cache
            ? IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(qi -> tk.nextToken() instanceof String a && tk.nextToken() instanceof String b
                && (Integer) a.chars().reduce(0, (x, c) -> x * 27 + c - 'a' + 1) instanceof Integer ia && (Integer) b.chars().reduce(0, (x, c) -> x * 27 + c - 'a' + 1) instanceof Integer ib
                ? mp.containsKey(ia) && mp.containsKey(ib)
                    ? String.valueOf(cache.computeIfAbsent(ia <= ib ? (long) ia * 600000 + ib : (long) ib * 600000 + ia, key -> (Boolean) (mp.get(ia).length <= mp.get(ib).length) instanceof Boolean sw
                        && (sw ? mp.get(ia) : mp.get(ib)) instanceof int[] sm && (sw ? mp.get(ib) : mp.get(ia)) instanceof int[] bg && (Integer) (sw ? a.length() : b.length()) instanceof Integer ls && (Integer) (sw ? b.length() : a.length()) instanceof Integer lb
                        ? IntStream.of(sm).map(p -> (Integer) Arrays.binarySearch(bg, p) instanceof Integer ix
                            ? ix >= 0 ? Math.max(ls, lb) : Math.min(
                                -ix - 1 < bg.length ? Math.max(p + ls, bg[-ix - 1] + lb) - p : Integer.MAX_VALUE,
                                -ix - 1 > 0 ? Math.max(p + ls, bg[-ix - 2] + lb) - bg[-ix - 2] : Integer.MAX_VALUE) : 0).min().getAsInt() : 0))
                    : "-1" : "").collect(Collectors.joining("\n")) : "");
    }
}
