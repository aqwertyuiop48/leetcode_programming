import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(1, n).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt(), i}).collect(Collectors.groupingBy(s -> s[0])).values().stream()
                .map(l -> l.stream().sorted(Comparator.comparingInt((int[] s) -> -s[1])).toList())
                .sorted(Comparator.comparingInt((List<int[]> l) -> -l.size())).toList() instanceof List<List<int[]>> g
            && Integer.valueOf(g.size()) instanceof Integer k
            && g.stream().map(l -> LongStream.concat(LongStream.of(0), l.stream().mapToLong(s -> s[1])).toArray()).peek(a -> Arrays.parallelPrefix(a, Long::sum)).toList() instanceof List<long[]> pre
            && new int[n + 2] instanceof int[] ge
            && g.stream().allMatch(l -> ++ge[l.size()] > 0)
            && IntStream.iterate(n, t -> t >= 1, t -> t - 1).allMatch(t -> (ge[t] += ge[t + 1]) >= 0)
            && ((BiFunction<Integer, Integer, Long>) (x, t) -> pre.get(x)[Math.min(g.get(x).size(), t + 1)]) instanceof BiFunction<Integer, Integer, Long> val
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> tops
            ? k == 1
                ? g.get(0).get(0)[1] + "\n1\n" + g.get(0).get(0)[2]
                : IntStream.range(0, k).mapToObj(j -> Integer.valueOf(g.get(j).size()) instanceof Integer t
                        && tops.computeIfAbsent(t, tt -> IntStream.range(0, ge[tt]).boxed().sorted(Comparator.comparingLong((Integer x) -> -val.apply(x, tt))).limit(2).toList()) instanceof List<Integer> tp
                        && Integer.valueOf(tp.get(0) == j ? (tp.size() > 1 ? tp.get(1) : -1) : tp.get(0)) instanceof Integer partner
                        ? new long[]{partner < 0 ? -1 : pre.get(j)[t] + val.apply(partner, t), j, partner} : null)
                    .max(Comparator.comparingLong(a -> a[0])).get() instanceof long[] best
                    && Integer.valueOf((int) best[1]) instanceof Integer y
                    && Integer.valueOf((int) best[2]) instanceof Integer x
                    && Integer.valueOf(Math.min(g.get(x).size(), g.get(y).size() + 1)) instanceof Integer u
                    && Integer.valueOf(u > g.get(y).size() || g.get(x).get(0)[0] > g.get(y).get(0)[0] ? 0 : 1) instanceof Integer swap
                    && (swap == 0 ? g.get(x).subList(0, u) : g.get(y).subList(0, g.get(y).size())) instanceof List<int[]> a
                    && (swap == 0 ? g.get(y).subList(0, g.get(y).size()) : g.get(x).subList(0, u)) instanceof List<int[]> b
                    ? best[0] + "\n" + (a.size() + b.size()) + "\n" + IntStream.range(0, a.size() + b.size()).mapToObj(i -> String.valueOf(i % 2 == 0 ? a.get(i / 2)[2] : b.get(i / 2)[2])).collect(Collectors.joining(" "))
                    : ""
            : "");
    }
}

