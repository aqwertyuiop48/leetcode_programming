import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] es
            && new boolean[n + 1] instanceof boolean[] vis
            && new int[]{1} instanceof int[] cur
            && (vis[1] = true)
            && Long.valueOf(Arrays.stream(es).mapToLong(e -> e[2]).sum()) instanceof Long tot
            && Long.valueOf(IntStream.range(0, n).mapToLong(step ->
                Integer.valueOf(cur[0]) instanceof Integer c
                && Arrays.stream(es).filter(e -> e[0] == c || e[1] == c).filter(e -> !vis[e[0] == c ? e[1] : e[0]]).findFirst()
                    .or(() -> Arrays.stream(es).filter(e -> (e[0] == c && e[1] == 1) || (e[1] == c && e[0] == 1)).findFirst()).get() instanceof int[] ch
                && Integer.valueOf(ch[0] == c ? ch[1] : ch[0]) instanceof Integer nb
                && (vis[nb] = true)
                && (cur[0] = nb) > 0
                ? (ch[0] != c ? ch[2] : 0L)
                : 0L).sum()) instanceof Long cost
            ? Math.min(cost, tot - cost)
            : 0L));
    }
}


