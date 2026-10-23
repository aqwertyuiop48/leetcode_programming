import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && g[0].charAt(0) != g[0].charAt(1)
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (i == j || i + j == n - 1) == (g[i].charAt(j) == g[0].charAt(0)) && (i == j || i + j == n - 1 || g[i].charAt(j) == g[0].charAt(1))))
            ? "YES" : "NO");
    }
}
