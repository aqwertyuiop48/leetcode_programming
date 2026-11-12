import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && sc.next() instanceof String s && sc.next() instanceof String u && Integer.valueOf(k + 1) instanceof Integer K && Integer.valueOf((m + 1) * (k + 1)) instanceof Integer W
            && s.toCharArray() instanceof char[] sa && u.toCharArray() instanceof char[] ub && new int[2 * W] instanceof int[] f && new int[2 * W] instanceof int[] g
            && Stream.of(0).peek(z -> Arrays.fill(f, -100000000)).peek(z -> Arrays.fill(g, -100000000)).findFirst().isPresent()
            && IntStream.range(0, m + 1).filter(j -> (f[j * K] = 0) == 0 && (f[W + j * K] = 0) == 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> IntStream.range(0, m * k).map(x -> x + x / k + K + 1).filter(d -> (f[(i & 1) * W + d] = Math.max(Math.max(f[((i - 1) & 1) * W + d], f[(i & 1) * W + d - K]),
                    g[(i & 1) * W + d] = sa[i - 1] == ub[d / K - 1] ? Math.max(g[((i - 1) & 1) * W + d - K], f[((i - 1) & 1) * W + d - K - 1]) + 1 : -100000000)) >= 0).count() >= 0).count() >= 0
            ? f[(n & 1) * W + m * K + k] : "");
    }
}
