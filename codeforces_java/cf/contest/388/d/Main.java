import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long M
            && IntStream.range(0, 32).mapToObj(c -> new long[]{0, c == 0 ? 1 : 0}).toArray(long[][]::new) instanceof long[][] init
            && IntStream.iterate(29, i -> i >= 0, i -> i - 1).boxed().reduce(init, (dp, i) -> new long[32][2] instanceof long[][] nd
                && Integer.valueOf(n >> i & 1) instanceof Integer nb
                && IntStream.range(0, 31).allMatch(c -> IntStream.range(0, 2).allMatch(t -> Long.valueOf(dp[c][t]) instanceof Long v
                    && Long.valueOf(c == 0 ? 1 : (1L << (c - 1)) % M) instanceof Long w
                    && Integer.valueOf(t == 1 && nb == 1 ? 0 : t) instanceof Integer lo
                    && (t == 1 && nb == 0 || (nd[c + 1][t] = (nd[c + 1][t] + v) % M) >= 0)
                    && (t == 1 && nb == 0 || c == 0 || (nd[c][t] = (nd[c][t] + v * w) % M) >= 0)
                    && (nd[c][lo] = (nd[c][lo] + v * w) % M) >= 0))
                ? nd : dp, (a, b) -> a) instanceof long[][] fin
            ? Arrays.stream(fin).flatMapToLong(Arrays::stream).sum() % M : "");
    }
}
