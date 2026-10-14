import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(moves ->
            System.out.println(
                new HashSet<Long>() instanceof HashSet<Long> seen
                && new long[]{1000, 1000} instanceof long[] pos
                && seen.add(pos[0] * 2000 + pos[1])
                && IntStream.range(0, moves.length()).allMatch(i ->
                    (moves.charAt(i) == 'L' ? (pos[0] -= 1) == pos[0]
                     : moves.charAt(i) == 'R' ? (pos[0] += 1) == pos[0]
                     : moves.charAt(i) == 'U' ? (pos[1] += 1) == pos[1]
                     : (pos[1] -= 1) == pos[1])
                    & seen.add(pos[0] * 2000 + pos[1]))
                ? "OK"
                : "BUG")));
    }
}

