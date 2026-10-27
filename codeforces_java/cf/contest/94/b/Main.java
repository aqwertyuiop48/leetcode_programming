import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new boolean[5][5] instanceof boolean[][] g
            && IntStream.range(0, s.nextInt()).allMatch(i ->
                new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] e
                && (g[e[0]][e[1]] = g[e[1]][e[0]] = true))
            && IntStream.range(0, 125).anyMatch(t ->
                t / 25 < t / 5 % 5 && t / 5 % 5 < t % 5
                && g[t / 25][t / 5 % 5] == g[t / 5 % 5][t % 5]
                && g[t / 5 % 5][t % 5] == g[t / 25][t % 5])
            ? "WIN"
            : "FAIL");
    }
}





