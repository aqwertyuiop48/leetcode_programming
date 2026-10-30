import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && tk.nextToken().getBytes() instanceof byte[] s && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> map
            && IntStream.range(0, n).allMatch(i -> map.put(i, s[i] - 'a') == null) && map.put(n, -1) == null
            && ((java.util.function.IntPredicate) p -> map.containsKey(p) || map.put(p, map.floorEntry(p).getValue()) == null) instanceof java.util.function.IntPredicate split
            && IntStream.range(0, q).allMatch(z -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
                && split.test(l) && split.test(r) && new ArrayList<>(map.subMap(l, true, r, false).entrySet()) instanceof ArrayList<Map.Entry<Integer, Integer>> es && new int[26] instanceof int[] cnt
                && IntStream.range(0, es.size()).allMatch(j -> (cnt[es.get(j).getValue()] += (j + 1 < es.size() ? es.get(j + 1).getKey() : r) - es.get(j).getKey()) >= 0)
                && map.subMap(l, true, r, false).keySet().removeIf(x -> true) && new int[]{l} instanceof int[] pos
                && IntStream.range(0, 26).map(t -> k == 1 ? t : 25 - t).filter(ch -> cnt[ch] > 0).allMatch(ch -> map.put(pos[0], ch) == null && (pos[0] += cnt[ch]) > 0))
            && new ArrayList<>(map.entrySet()) instanceof ArrayList<Map.Entry<Integer, Integer>> fin && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, fin.size() - 1).allMatch(j -> sb.append(String.valueOf((char) ('a' + fin.get(j).getValue())).repeat(fin.get(j + 1).getKey() - fin.get(j).getKey())) != null)
            ? sb.toString() : "");
    }
}
