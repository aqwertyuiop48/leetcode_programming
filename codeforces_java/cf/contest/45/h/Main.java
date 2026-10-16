import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            IntStream.range(0, a[1]).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1}).toArray(int[][]::new) instanceof int[][] ed
            && IntStream.range(0, a[0]).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && Arrays.stream(ed).allMatch(e -> adj.get(e[0]).add(e[1]) && adj.get(e[1]).add(e[0]))
            && IntStream.generate(() -> -1).limit(a[0]).toArray() instanceof int[] par
            && (par[0] = 0) == 0
            && new int[a[0]] instanceof int[] dep
            && new ArrayList<Integer>(List.of(0)) instanceof ArrayList<Integer> order
            && IntStream.iterate(0, i -> i < order.size(), i -> i + 1).allMatch(i -> adj.get(order.get(i)).stream().filter(w -> par[w] == -1).allMatch(w -> (par[w] = order.get(i)) >= 0 && (dep[w] = dep[order.get(i)] + 1) > 0 && order.add(w)))
            && new boolean[a[0]] instanceof boolean[] cov
            && Arrays.stream(ed).filter(e -> par[e[1]] != e[0] && par[e[0]] != e[1]).allMatch(e -> Stream.iterate(new int[]{e[0], e[1]}, p -> p[0] != p[1],
                p -> dep[p[0]] >= dep[p[1]] ? new int[]{(cov[p[0]] = true) ? par[p[0]] : 0, p[1]} : new int[]{p[0], (cov[p[1]] = true) ? par[p[1]] : 0}).mapToInt(p -> 0).sum() >= 0)
            && new int[a[0]] instanceof int[] comp
            && order.stream().allMatch(v -> (comp[v] = !cov[v] ? v : comp[par[v]]) >= 0)
            && new boolean[a[0]] instanceof boolean[] bend
            && IntStream.range(1, a[0]).filter(v -> !cov[v]).allMatch(v -> (bend[v] = true) && (bend[par[v]] = true))
            && IntStream.range(0, a[0]).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ch
            && IntStream.range(1, a[0]).filter(v -> !cov[v]).allMatch(v -> ch.get(comp[par[v]]).add(v))
            && new AtomicReference<Function<Integer, List<Integer>>>() instanceof AtomicReference<Function<Integer, List<Integer>>> rec
            && rec.compareAndSet(null, c -> ch.get(c).isEmpty() ? List.of(c) : Stream.concat(c == 0 && ch.get(c).size() == 1 ? Stream.of(c) : Stream.<Integer>empty(), ch.get(c).stream().flatMap(d -> rec.get().apply(d).stream())).toList())
            && rec.get().apply(0) instanceof List<Integer> lv
            && ((IntUnaryOperator) c -> IntStream.range(0, a[0]).filter(x -> comp[x] == c && !bend[x]).min().orElse(c) + 1) instanceof IntUnaryOperator pick
            ? (lv.size() < 2 ? "0" : a[0] == 2 ? "-1" : (lv.size() + 1) / 2 + "\n" + IntStream.range(0, (lv.size() + 1) / 2).mapToObj(i -> pick.applyAsInt(lv.get(i)) + " " + pick.applyAsInt(lv.get(i + lv.size() / 2))).collect(Collectors.joining("\n")))
            : "")));
    }
}




