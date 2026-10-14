import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                && IntStream.rangeClosed(0, nm[0]).<List<int[]>>mapToObj(i -> new ArrayList<>()).collect(Collectors.toList()) instanceof List<List<int[]>> adj
                && IntStream.range(0, nm[1]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i}).toArray(int[][]::new) instanceof int[][] E
                && Arrays.stream(E).allMatch(e -> adj.get(e[0]).add(new int[]{e[1], e[2]}) && adj.get(e[1]).add(new int[]{e[0], e[2]}))
                && new int[nm[0] + 1] instanceof int[] col
                && new int[1] instanceof int[] ex
                && new AtomicReference<BiPredicate<Integer, Integer>>() instanceof AtomicReference<BiPredicate<Integer, Integer>> f
                && f.compareAndSet(null, (u, c) -> (col[u] = c) >= 0 && adj.get(u).stream().allMatch(e ->
                    e[1] == ex[0] || (col[e[0]] == -1 ? f.get().test(e[0], 1 - c) : col[e[0]] != c)))
                ? IntStream.range(0, nm[1])
                    .filter(e -> (ex[0] = e) >= 0
                        && IntStream.rangeClosed(0, nm[0]).allMatch(i -> (col[i] = -1) < 0)
                        && IntStream.rangeClosed(1, nm[0]).allMatch(v -> col[v] != -1 || f.get().test(v, 0)))
                    .mapToObj(e -> "" + (e + 1))
                    .collect(Collectors.collectingAndThen(Collectors.toList(), l -> l.size() + "\n" + String.join(" ", l)))
                : ""));
    }
}
