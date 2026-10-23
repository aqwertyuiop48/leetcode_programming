import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toArray(String[]::new) instanceof String[] r
            && new boolean[n] instanceof boolean[] ok
            ? IntStream.range(0, m)
                .filter(j -> IntStream.range(0, n - 1).anyMatch(i -> !ok[i] && r[i].charAt(j) > r[i + 1].charAt(j))
                    || !IntStream.range(0, n - 1).allMatch(i -> (ok[i] |= r[i].charAt(j) < r[i + 1].charAt(j)) || true))
                .count()
            : 0);
    }
}
