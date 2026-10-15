import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            s.next() instanceof String t
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> i - 1).toArray() instanceof int[] pv
            && IntStream.range(0, n).map(i -> i + 1).toArray() instanceof int[] nx
            && new boolean[n] instanceof boolean[] r
            && new PriorityQueue<int[]>((x, y) -> x[0] != y[0] ? Integer.compare(x[0], y[0]) : Integer.compare(x[1], y[1])) instanceof PriorityQueue<int[]> pq
            && IntStream.range(0, n - 1).filter(i -> t.charAt(i) != t.charAt(i + 1)).allMatch(i -> pq.add(new int[]{Math.abs(a[i] - a[i + 1]), i, i + 1}))
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> !r[e[1]] && !r[e[2]] && (r[e[1]] = r[e[2]] = true))
                .map(e -> Optional.of(new int[]{pv[e[1]], nx[e[2]]}).map(w ->
                    ((w[0] < 0 || (nx[w[0]] = w[1]) >= 0) && (w[1] >= n || (pv[w[1]] = w[0]) >= -1) && (w[0] < 0 || w[1] >= n || t.charAt(w[0]) == t.charAt(w[1]) || pq.add(new int[]{Math.abs(a[w[0]] - a[w[1]]), w[0], w[1]})) ? "" : "") + (e[1] + 1) + " " + (e[2] + 1)).get())
                .toList() instanceof List<String> out
            ? out.size() + (out.isEmpty() ? "" : "\n" + String.join("\n", out))
            : "")));
    }
}


