import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).map(p -> new int[]{Math.min(p[0], p[1]), Math.max(p[0], p[1])})
                .sorted((p, q) -> q[0] - p[0]).toList() instanceof List<int[]> ch
            && new int[2 * n + 2] instanceof int[] bit && new long[2] instanceof long[] acc
            && ch.stream().allMatch(p -> Long.valueOf(IntStream.iterate(p[1] - 1, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) instanceof Long inside
                && IntStream.iterate(p[1], i -> i <= 2 * n, i -> i + (i & -i)).allMatch(i -> ++bit[i] > 0)
                && Long.valueOf(p[1] - p[0] - 1 - 2 * inside) instanceof Long cross
                && (acc[0] += inside * (n - 1 - cross - inside)) >= 0 && (acc[1] += cross * (n - 1 - cross)) >= 0)
            ? (long) n * (n - 1) * (n - 2) / 6 - acc[0] - acc[1] / 2 : "");
    }
}

