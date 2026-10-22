import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(k)) instanceof Integer L
            && Integer.valueOf(L + 1) instanceof Integer D
            && ((IntUnaryOperator) j -> 2 + 2 * L + IntStream.range(1, j).filter(q -> (k >> (q - 1) & 1) == 1).map(q -> D - q - 1).sum()) instanceof IntUnaryOperator off
            && Integer.valueOf(off.applyAsInt(L + 1)) instanceof Integer n
            && Stream.of(Stream.of(new int[]{0, 2}, new int[]{0, 3}),
                IntStream.range(1, L).boxed().flatMap(j -> Stream.of(new int[]{2 * j, 2 * j + 2}, new int[]{2 * j, 2 * j + 3}, new int[]{2 * j + 1, 2 * j + 2}, new int[]{2 * j + 1, 2 * j + 3})),
                IntStream.rangeClosed(1, L).filter(j -> (k >> (j - 1) & 1) == 1).boxed().flatMap(j -> IntStream.range(0, D - j)
                    .mapToObj(t -> new int[]{t == 0 ? 2 * j : off.applyAsInt(j) + t - 1, t == D - j - 1 ? 1 : off.applyAsInt(j) + t}))).flatMap(x -> x).toList() instanceof List<int[]> es
            && IntStream.range(0, n).mapToObj(i -> "N".repeat(n).toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && es.stream().allMatch(e -> (g[e[0]][e[1]] = 'Y') == 'Y' && (g[e[1]][e[0]] = 'Y') == 'Y')
            ? n + "\n" + Arrays.stream(g).map(String::new).collect(Collectors.joining("\n")) : "");
    }
}
