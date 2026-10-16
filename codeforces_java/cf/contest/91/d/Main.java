import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer n
            && new int[n + 1] instanceof int[] a
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = sc.nextInt()) > 0)
            && new boolean[n + 1] instanceof boolean[] vis
            && new ArrayList<String>() instanceof ArrayList<String> ops
            && ((BiPredicate<List<Integer>, List<Integer>>) (p, q) -> ops.add(p.size() + "\n"
                + p.stream().map(String::valueOf).collect(Collectors.joining(" ")) + "\n"
                + q.stream().map(String::valueOf).collect(Collectors.joining(" ")))) instanceof BiPredicate<List<Integer>, List<Integer>> em
            && ((UnaryOperator<List<Integer>>) c -> IntStream.range(0, c.size()).mapToObj(i -> c.get((i + 1) % c.size())).toList()) instanceof UnaryOperator<List<Integer>> rot
            && ((BinaryOperator<List<Integer>>) (x, y) -> Stream.concat(x.stream(), y.stream()).toList()) instanceof BinaryOperator<List<Integer>> cat
            && IntStream.rangeClosed(1, n).filter(i -> !vis[i] && a[i] != i).mapToObj(i ->
                Stream.concat(Stream.of(i), Stream.iterate(a[i], x -> x != i, x -> a[x])).collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> c
                && c.stream().allMatch(x -> vis[x] = true)
                && (Integer) ((c.size() - 2) / 4) instanceof Integer r
                && IntStream.range(0, r).allMatch(j -> em.test(
                    List.of(c.get(0), c.get(4 * j + 1), c.get(4 * j + 2), c.get(4 * j + 3), c.get(4 * j + 4)),
                    List.of(c.get(4 * j + 1), c.get(4 * j + 2), c.get(4 * j + 3), c.get(4 * j + 4), c.get(0))))
                ? Stream.concat(Stream.of(c.get(0)), c.stream().skip(4L * r + 1)).toList()
                : List.<Integer>of()).toList() instanceof List<List<Integer>> rest
            && rest.stream().filter(c -> c.size() >= 4).allMatch(c -> em.test(c, rot.apply(c)))
            && rest.stream().filter(c -> c.size() == 2).toList() instanceof List<List<Integer>> twos
            && rest.stream().filter(c -> c.size() == 3).toList() instanceof List<List<Integer>> threes
            && (Integer) Math.min(twos.size(), threes.size()) instanceof Integer m
            && IntStream.range(0, m).allMatch(i -> em.test(cat.apply(threes.get(i), twos.get(i)), cat.apply(rot.apply(threes.get(i)), rot.apply(twos.get(i)))))
            && threes.subList(m, threes.size()) instanceof List<List<Integer>> l3
            && twos.subList(m, twos.size()) instanceof List<List<Integer>> l2
            && IntStream.range(0, l3.size() / 3).allMatch(j ->
                l3.get(3 * j + 1) instanceof List<Integer> b
                && em.test(cat.apply(l3.get(3 * j), List.of(b.get(0), b.get(1))), cat.apply(rot.apply(l3.get(3 * j)), List.of(b.get(1), b.get(0))))
                && em.test(cat.apply(List.of(b.get(0), b.get(2)), l3.get(3 * j + 2)), cat.apply(List.of(b.get(2), b.get(0)), rot.apply(l3.get(3 * j + 2)))))
            && IntStream.range(3 * (l3.size() / 3), l3.size()).allMatch(i -> em.test(l3.get(i), rot.apply(l3.get(i))))
            && IntStream.range(0, l2.size() / 2).allMatch(j -> em.test(cat.apply(l2.get(2 * j), l2.get(2 * j + 1)), cat.apply(rot.apply(l2.get(2 * j)), rot.apply(l2.get(2 * j + 1)))))
            && (l2.size() % 2 == 0 || em.test(l2.get(l2.size() - 1), rot.apply(l2.get(l2.size() - 1))))
            ? ops.size() + (ops.isEmpty() ? "" : "\n") + String.join("\n", ops)
            : ""));
    }
}



