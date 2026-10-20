import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer r && Integer.valueOf(t[1]) instanceof Integer n
            && new int[r + 2][3][3] instanceof int[][][] g
            && IntStream.rangeClosed(1, r).allMatch(len -> IntStream.range(0, 3).allMatch(a -> IntStream.range(0, 3).allMatch(b ->
                IntStream.rangeClosed(1, len).boxed().flatMap(x -> IntStream.rangeClosed(1, 2).filter(c -> !(x == 1 && a != 0 && c != a) && !(x == len && b != 0 && c != b))
                    .mapToObj(c -> g[x - 1][a][c] ^ g[len - x][c][b])).collect(Collectors.toSet()) instanceof Set<Integer> opt
                && (g[len][a][b] = IntStream.iterate(0, m -> m + 1).filter(m -> !opt.contains(m)).findFirst().getAsInt()) >= 0)))
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> t[2 + 2 * i])).mapToInt(i -> i).toArray() instanceof int[] o
            ? IntStream.rangeClosed(0, n).map(i -> g[(i == n ? r + 1 : t[2 + 2 * o[i]]) - (i == 0 ? 0 : t[2 + 2 * o[i - 1]]) - 1][i == 0 ? 0 : t[3 + 2 * o[i - 1]]][i == n ? 0 : t[3 + 2 * o[i]]]).reduce(0, (x, y) -> x ^ y) != 0 ? "WIN" : "LOSE" : "");
    }
}
