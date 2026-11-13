import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n
            && new PriorityQueue<Integer>(Comparator.reverseOrder()) instanceof PriorityQueue<Integer> pq && new HashSet<Integer>() instanceof HashSet<Integer> set
            && IntStream.rangeClosed(1, n).allMatch(i -> pq.add(a[i]) && set.add(a[i]))
            && (IntStream.range(0, 40 * n + 40).allMatch(s -> pq.peek() instanceof Integer m
                && IntStream.iterate(m / 2, y -> y >= 1, y -> y / 2).boxed().filter(y -> !set.contains(y)).findFirst() instanceof Optional<Integer> o && o.isPresent()
                && pq.poll() != null && set.remove(m) && set.add(o.get()) && pq.add(o.get())) || true)
            ? set.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
