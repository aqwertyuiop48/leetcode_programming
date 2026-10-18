import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String g
            && IntStream.range(0, n * m).filter(i -> g.charAt(i) == '#').toArray() instanceof int[] cells
            ? cells.length <= 2 ? -1
                : ((IntPredicate) rm -> new boolean[n * m] instanceof boolean[] seen
                    && (seen[rm] = true)
                    && new ArrayDeque<Integer>(List.of(cells[0] == rm ? cells[1] : cells[0])) instanceof ArrayDeque<Integer> dq
                    && (seen[dq.peek()] = true)
                    && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> IntStream.of(v - m, v + m, v % m > 0 ? v - 1 : -1, v % m < m - 1 ? v + 1 : -1)
                        .filter(u -> u >= 0 && u < n * m && g.charAt(u) == '#' && !seen[u]).allMatch(u -> (seen[u] = true) && dq.add(u))).count() == cells.length - 1) instanceof IntPredicate conn
                    && Arrays.stream(cells).allMatch(conn) ? 2 : 1
            : "");
    }
}
