import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && new boolean[2 * n][2 * n] instanceof boolean[][] bad && new boolean[2 * n][2 * n] instanceof boolean[][] atk
            && IntStream.range(0, n * n).filter(t -> g.get(t / n).charAt(t % n) == 'o').allMatch(t -> IntStream.range(0, n * n).allMatch(u ->
                g.get(u / n).charAt(u % n) != '.' || (bad[u / n - t / n + n][u % n - t % n + n] = true)))
            && IntStream.range(0, n * n).filter(t -> g.get(t / n).charAt(t % n) == 'o').allMatch(t -> IntStream.range(0, n * n).allMatch(u ->
                bad[u / n - t / n + n][u % n - t % n + n] || (atk[u / n][u % n] = true)))
            ? IntStream.range(0, n * n).anyMatch(t -> g.get(t / n).charAt(t % n) == 'x' && !atk[t / n][t % n]) ? "NO"
                : "YES\n" + IntStream.rangeClosed(-(n - 1), n - 1).mapToObj(dx -> IntStream.rangeClosed(-(n - 1), n - 1).mapToObj(dy -> dx == 0 && dy == 0 ? "o" : bad[dx + n][dy + n] ? "." : "x").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
