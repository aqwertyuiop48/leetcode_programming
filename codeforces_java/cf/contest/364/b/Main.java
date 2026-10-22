import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer d
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] c && Integer.valueOf(Arrays.stream(c).sum()) instanceof Integer total
            && new boolean[total + 1] instanceof boolean[] dp && (dp[0] = true)
            && Arrays.stream(c).allMatch(x -> IntStream.iterate(total, s -> s >= x, s -> s - 1).allMatch(s -> (dp[s] |= dp[s - x]) || true))
            && new int[]{0, 0} instanceof int[] st && new boolean[]{true} instanceof boolean[] go
            && IntStream.iterate(0, z -> go[0], z -> z + 1).allMatch(z -> IntStream.iterate(Math.min(st[0] + d, total), s -> s > st[0], s -> s - 1).filter(s -> dp[s]).findFirst() instanceof OptionalInt nx
                && (nx.isPresent() ? (st[0] = nx.getAsInt()) > 0 && ++st[1] > 0 : !(go[0] = false)))
            ? st[0] + " " + st[1] : "");
    }
}
