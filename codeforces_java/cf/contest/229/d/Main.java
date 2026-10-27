import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new long[n + 1] instanceof long[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + s.nextLong()) > 0)
            && new int[n + 1] instanceof int[] f && new long[n + 1] instanceof long[] g
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.range(0, i).filter(j -> pre[i] - pre[j] >= g[j]).boxed()
                .reduce(new long[]{1, pre[i]}, (best, j) -> f[j] + 1 > best[0] || f[j] + 1 == best[0] && pre[i] - pre[j] < best[1] ? new long[]{f[j] + 1, pre[i] - pre[j]} : best, (x, y) -> x) instanceof long[] b
                && (f[i] = (int) b[0]) > 0 && (g[i] = b[1]) > 0)
            ? n - f[n] : "");
    }
}

