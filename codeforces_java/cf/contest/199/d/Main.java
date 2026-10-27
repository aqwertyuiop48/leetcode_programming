import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && (s.next() + s.next()) instanceof String g
            && new int[2 * n] instanceof int[] dist
            && IntStream.range(0, 2 * n).allMatch(i -> (dist[i] = -1) < 0)
            && (dist[0] = 0) == 0
            && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> dq
            ? Stream.generate(dq::poll).takeWhile(Objects::nonNull).anyMatch(v -> IntStream.range(0, 3).anyMatch(m -> Integer.valueOf(v / n) instanceof Integer w
                && Integer.valueOf(v % n + (m == 0 ? 1 : m == 1 ? -1 : k)) instanceof Integer nx
                && Integer.valueOf(m == 2 ? 1 - w : w) instanceof Integer nw
                && (nx >= n || nx >= 0 && nx > dist[v] && g.charAt(nw * n + nx) != 'X' && dist[nw * n + nx] < 0
                    && (dist[nw * n + nx] = dist[v] + 1) > 0 && !dq.add(nw * n + nx)))) ? "YES" : "NO"
            : "");
    }
}

