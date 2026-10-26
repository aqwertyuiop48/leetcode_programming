import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && Stream.concat(Stream.of(new int[]{0, 0}), IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()})).toList() instanceof List<int[]> pts
            ? IntStream.rangeClosed(1, 10).map(k -> new boolean[n + 1] instanceof boolean[] seen && (seen[0] = true)
                && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> q
                && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.rangeClosed(0, n).filter(v -> !seen[v]
                    && (Math.abs(pts.get(u)[0] - pts.get(v)[0]) == k && pts.get(u)[1] == pts.get(v)[1] || Math.abs(pts.get(u)[1] - pts.get(v)[1]) == k && pts.get(u)[0] == pts.get(v)[0])).allMatch(v -> (seen[v] = true) && q.add(v)))
                ? IntStream.rangeClosed(0, n).filter(v -> seen[v]).map(v -> Math.abs(pts.get(v)[0]) + Math.abs(pts.get(v)[1])).max().getAsInt() : 0).max().getAsInt() : 0);
    }
}
