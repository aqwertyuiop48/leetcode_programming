import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(moves ->
            System.out.println(
                new int[moves.length() + 1] instanceof int[] px
                && new int[moves.length() + 1] instanceof int[] py
                && IntStream.range(0, moves.length()).allMatch(i ->
                    (px[i + 1] = px[i] + (moves.charAt(i) == 'R' ? 1 : moves.charAt(i) == 'L' ? -1 : 0)) < 1000
                    && (py[i + 1] = py[i] + (moves.charAt(i) == 'U' ? 1 : moves.charAt(i) == 'D' ? -1 : 0)) < 1000)
                && IntStream.range(0, moves.length() + 1).allMatch(i ->
                    IntStream.range(i + 1, moves.length() + 1).allMatch(j -> Math.abs(px[i] - px[j]) + Math.abs(py[i] - py[j]) >= j - i))
                ? "OK"
                : "BUG")));
    }
}
