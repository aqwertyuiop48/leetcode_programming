import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Arrays.stream(a).distinct().sorted().toArray() instanceof int[] vs && Integer.valueOf(vs.length) instanceof Integer K
            && new short[K][K] instanceof short[][] dp && new boolean[K] instanceof boolean[] seen && new int[]{1} instanceof int[] best
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(Arrays.binarySearch(vs, a[i])) instanceof Integer x
                && IntStream.range(0, K).allMatch(y -> Integer.valueOf(Math.max(dp[y][x], seen[y] ? 1 : 0) + 1) instanceof Integer nw
                    && (dp[x][y] >= nw || (dp[x][y] = (short) (int) nw) > 0 && (best[0] = Math.max(best[0], nw)) > 0 || true))
                && (seen[x] = true))
            ? best[0] : "");
    }
}
