import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer tc ? IntStream.range(0, tc).mapToObj(q -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && new String[]{s.next(), s.next(), s.next()} instanceof String[] g && ((BiPredicate<Integer, Integer>) (r, c) -> c >= n || g[r].charAt(c) == '.' || g[r].charAt(c) == 's') instanceof BiPredicate<Integer, Integer> fr && new boolean[3][n + 4] instanceof boolean[][] reach && IntStream.range(0, 3).filter(r -> g[r].charAt(0) == 's').map(r -> (reach[r][0] = true) ? 1 : 0).sum() >= 0 && IntStream.range(0, n).map(c -> IntStream.range(0, 3).filter(r -> reach[r][c]).map(r -> (int) IntStream.rangeClosed(Math.max(0, r - 1), Math.min(2, r + 1)).filter(nr -> fr.test(r, c + 1) && fr.test(nr, c + 1) && fr.test(nr, c + 2) && fr.test(nr, c + 3) && (reach[nr][c + 3] = true)).count()).sum()).sum() >= 0 ? (IntStream.range(0, 3).anyMatch(r -> reach[r][n - 1] || reach[r][n] || reach[r][n + 1] || reach[r][n + 2]) ? "YES" : "NO") : "").collect(Collectors.joining("\n")) : "");
    }
}
