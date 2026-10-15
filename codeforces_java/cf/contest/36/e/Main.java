import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && Integer.valueOf(v[0]) instanceof Integer m
            && IntStream.rangeClosed(0, m).map(e -> e < m ? v[1 + 2 * e] : 0).toArray() instanceof int[] ea
            && IntStream.rangeClosed(0, m).map(e -> e < m ? v[2 + 2 * e] : 0).toArray() instanceof int[] eb
            && IntStream.rangeClosed(0, 10000).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, m).allMatch(e -> adj.get(ea[e]).add(e) && adj.get(eb[e]).add(e))
            && new boolean[m + 1] instanceof boolean[] used
            && new int[10001] instanceof int[] ptr
            && new int[10001] instanceof int[] comp
            && ((Function<Integer, List<Integer>>) s -> new ArrayDeque<int[]>(List.of(new int[]{s, -1})) instanceof ArrayDeque<int[]> stk
                && new ArrayList<Integer>() instanceof ArrayList<Integer> res
                && Stream.generate(stk::peekFirst).takeWhile(Objects::nonNull).allMatch(top ->
                    IntStream.iterate(ptr[top[0]], i -> i < adj.get(top[0]).size(), i -> i + 1).filter(i -> !used[adj.get(top[0]).get(i)]).boxed().findFirst() instanceof Optional<Integer> o
                    && (o.isPresent()
                        ? (Integer.valueOf(adj.get(top[0]).get(o.get())) instanceof Integer e
                            && (ptr[top[0]] = o.get() + 1) > 0 && (used[e] = true) && stk.offerFirst(new int[]{ea[e] ^ eb[e] ^ top[0], e}))
                        : (stk.pollFirst() != null && (top[1] < 0 || res.add(top[1])))))
                ? IntStream.range(0, res.size()).mapToObj(i -> res.get(res.size() - 1 - i)).toList()
                : List.<Integer>of()) instanceof Function<Integer, List<Integer>> euler
            && ((BiFunction<Integer, Integer, Integer>) (s, id) -> (comp[s] = id) > 0
                ? Stream.iterate(List.of(s), f -> !f.isEmpty(), f -> f.stream().flatMap(u -> adj.get(u).stream().map(e -> ea[e] ^ eb[e] ^ u)).filter(w -> comp[w] == 0 && (comp[w] = id) > 0).toList()).mapToInt(List::size).sum()
                : 0) instanceof BiFunction<Integer, Integer, Integer> label
            && ((BiFunction<List<Integer>, List<Integer>, String>) (p, q) -> p.size() + "\n" + p.stream().map(x -> "" + (x + 1)).collect(Collectors.joining(" "))
                + "\n" + q.size() + "\n" + q.stream().map(x -> "" + (x + 1)).collect(Collectors.joining(" "))) instanceof BiFunction<List<Integer>, List<Integer>, String> fmt
            && label.apply(ea[0], 1) > 0
            && IntStream.range(0, m).filter(e -> comp[ea[e]] == 0).boxed().findFirst() instanceof Optional<Integer> r2
            && (r2.isEmpty() || label.apply(ea[r2.get()], 2) > 0)
            && IntStream.range(0, m).allMatch(e -> comp[ea[e]] > 0)
            && IntStream.rangeClosed(1, 10000).filter(x -> adj.get(x).size() % 2 == 1).boxed().toList() instanceof List<Integer> odd
            && odd.stream().filter(x -> comp[x] == 1).toList() instanceof List<Integer> o1
            && odd.stream().filter(x -> comp[x] == 2).toList() instanceof List<Integer> o2
            ? (r2.isPresent()
                ? (o1.size() <= 2 && o2.size() <= 2
                    ? fmt.apply(euler.apply(o1.isEmpty() ? ea[0] : o1.get(0)), euler.apply(o2.isEmpty() ? ea[r2.get()] : o2.get(0)))
                    : "-1")
                : ((o1.size() == 0 || o1.size() == 2) && m >= 2
                    ? (euler.apply(o1.isEmpty() ? ea[0] : o1.get(0)) instanceof List<Integer> t ? fmt.apply(t.subList(0, 1), t.subList(1, t.size())) : "")
                    : o1.size() == 4
                        ? (adj.get(o1.get(0)).add(m) && adj.get(o1.get(1)).add(m) && (ea[m] = o1.get(0)) >= 0 && (eb[m] = o1.get(1)) >= 0
                            && euler.apply(o1.get(2)) instanceof List<Integer> t2 && Integer.valueOf(t2.indexOf(m)) instanceof Integer k
                            ? fmt.apply(t2.subList(0, k), t2.subList(k + 1, t2.size())) : "-1")
                        : "-1"))
            : "-1");
    }
}

