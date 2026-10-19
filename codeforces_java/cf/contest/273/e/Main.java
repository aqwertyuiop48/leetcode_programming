import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Long.valueOf(sc.nextLong()) instanceof Long p
            && Long.valueOf(1000000007L) instanceof Long M
            && new ArrayList<long[]>(List.of(new long[]{1, 2, 0})) instanceof ArrayList<long[]> iv && new long[]{3} instanceof long[] cur
            && IntStream.iterate(0, z -> cur[0] <= p, z -> z + 1).allMatch(z -> Long.valueOf(cur[0]) instanceof Long L
                && iv.stream().filter(e -> e[0] <= L / 3 && L / 3 <= e[1]).findFirst().get() instanceof long[] e1
                && iv.stream().filter(e -> e[0] <= L - L / 3 && L - L / 3 <= e[1]).findFirst().get() instanceof long[] e2
                && Long.valueOf(IntStream.iterate(0, x -> x == e1[2] || x == e2[2], x -> x + 1).count()) instanceof Long v
                && Long.valueOf(Math.min(p, Math.min(3 * e1[1] + 2, 3 * e2[1] / 2))) instanceof Long R
                && (iv.get(iv.size() - 1)[2] == v ? (iv.get(iv.size() - 1)[1] = R) > 0 : iv.add(new long[]{L, R, v}))
                && (cur[0] = R + 1) > 0)
            && new long[8] instanceof long[] cnt
            && iv.stream().filter(e -> e[0] <= p - 1).allMatch(e -> Long.valueOf(Math.min(e[1], p - 1)) instanceof Long hi
                && (cnt[(int) e[2]] = (cnt[(int) e[2]] + ((hi - e[0] + 1) * p - (e[0] + hi) * (hi - e[0] + 1) / 2) % M) % M) >= 0)
            && new long[][]{{1, 0, 0, 0, 0, 0, 0, 0}} instanceof long[][] dp
            && IntStream.range(0, n).allMatch(i -> new long[8] instanceof long[] nd
                && IntStream.range(0, 64).allMatch(q -> (nd[(q / 8) ^ (q % 8)] = (nd[(q / 8) ^ (q % 8)] + dp[0][q / 8] * cnt[q % 8]) % M) >= 0)
                && (dp[0] = nd) != null)
            ? Arrays.stream(dp[0]).skip(1).sum() % M : "");
    }
}
