import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer n
            && new HashMap<String, List<Integer>>() instanceof HashMap<String, List<Integer>> mp && new long[2] instanceof long[] st
            && IntStream.range(0, k).filter(i -> mp.computeIfAbsent(sc.nextToken(), x -> new ArrayList<>()).add(Integer.parseInt(sc.nextToken()))).count() >= 0
            && Stream.of(0).peek(z -> mp.values().forEach(l -> l.sort(Comparator.reverseOrder()))).findFirst().isPresent()
            && mp.entrySet().stream().allMatch(e -> e.getKey() instanceof String s && e.getValue() instanceof List<Integer> l && new StringBuilder(s).reverse().toString() instanceof String r
                && (s.equals(r)
                    ? (Long) IntStream.range(0, l.size() / 2).filter(j -> l.get(2 * j) + l.get(2 * j + 1) > 0 && (st[0] += l.get(2 * j) + l.get(2 * j + 1)) != Long.MIN_VALUE
                        && (st[1] = Math.max(st[1], l.get(2 * j + 1) < 0 ? -l.get(2 * j + 1) : 0)) >= 0).count() instanceof Long c
                        && (st[1] = Math.max(st[1], 2 * c < l.size() ? l.get((int) (2 * c)) : 0)) >= 0
                    : !(s.compareTo(r) < 0 && mp.containsKey(r))
                        || IntStream.range(0, Math.min(l.size(), mp.get(r).size())).filter(j -> l.get(j) + mp.get(r).get(j) > 0 && (st[0] += l.get(j) + mp.get(r).get(j)) != Long.MIN_VALUE).count() >= 0))
            ? st[0] + st[1] : "");
    }
}
