import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer w && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new TreeSet<Integer>(List.of(0, h)) instanceof TreeSet<Integer> hs && new TreeSet<Integer>(List.of(0, w)) instanceof TreeSet<Integer> vs
            && new TreeMap<Integer, Integer>(Map.of(h, 1)) instanceof TreeMap<Integer, Integer> hm && new TreeMap<Integer, Integer>(Map.of(w, 1)) instanceof TreeMap<Integer, Integer> vm
            ? IntStream.range(0, n).mapToObj(i -> (Boolean) tk.nextToken().equals("H") instanceof Boolean isH && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x
                && (isH ? hs : vs) instanceof TreeSet<Integer> set && (isH ? hm : vm) instanceof TreeMap<Integer, Integer> map
                && (Integer) set.lower(x) instanceof Integer lo && (Integer) set.higher(x) instanceof Integer hi
                && map.compute(hi - lo, (key, v) -> v == 1 ? null : v - 1) == null | true && map.merge(x - lo, 1, Integer::sum) > 0 && map.merge(hi - x, 1, Integer::sum) > 0 && set.add(x)
                ? String.valueOf((long) vm.lastKey() * hm.lastKey()) : "").collect(Collectors.joining("\n")) : "");
    }
}
