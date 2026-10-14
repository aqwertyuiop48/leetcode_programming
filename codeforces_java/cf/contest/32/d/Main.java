import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()} instanceof int[] h
                && IntStream.range(0, h[0]).mapToObj(i -> sc.next()).toArray(String[]::new) instanceof String[] g
                && IntStream.rangeClosed(1, 150).boxed().flatMap(x -> IntStream.range(x, h[0] - x).boxed().flatMap(i -> IntStream.range(x, h[1] - x)
                    .filter(j -> g[i].charAt(j) == '*' && g[i - x].charAt(j) == '*' && g[i + x].charAt(j) == '*' && g[i].charAt(j - x) == '*' && g[i].charAt(j + x) == '*')
                    .mapToObj(j -> new int[]{x, i, j})))
                    .skip(h[2] - 1).findFirst() instanceof Optional<int[]> o
                ? o.map(c -> (c[1] + 1) + " " + (c[2] + 1) + "\n" + (c[1] + 1 - c[0]) + " " + (c[2] + 1) + "\n" + (c[1] + 1 + c[0]) + " " + (c[2] + 1)
                    + "\n" + (c[1] + 1) + " " + (c[2] + 1 - c[0]) + "\n" + (c[1] + 1) + " " + (c[2] + 1 + c[0])).orElse("-1")
                : ""));
    }
}
