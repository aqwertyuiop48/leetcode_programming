import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && Integer.valueOf(s.nextInt()) instanceof Integer c
            && Integer.valueOf(Math.max(a, Math.max(b, c))) instanceof Integer N && Integer.valueOf(Math.max(b, c)) instanceof Integer M && Integer.valueOf(N + 1) instanceof Integer W
            && new int[W * W] instanceof int[] g
            && IntStream.range(0, W * W).allMatch(t -> Integer.valueOf(t / W) instanceof Integer i && Integer.valueOf(t % W) instanceof Integer j
                && (g[t] = i == 0 ? j : j == 0 ? i : i >= j ? g[(i - j) * W + j] : g[t - i]) >= 0)
            && new int[M + 2] instanceof int[] start && IntStream.rangeClosed(1, M).allMatch(d -> (start[d + 1] = start[d] + M / d) > 0)
            && Integer.valueOf(start[M + 1]) instanceof Integer P
            && new int[P] instanceof int[] pd && new int[P] instanceof int[] py
            && IntStream.rangeClosed(1, M).allMatch(d -> IntStream.rangeClosed(1, M / d).allMatch(k -> (pd[start[d] + k - 1] = d) > 0 && (py[start[d] + k - 1] = d * k) > 0))
            && new int[M + 1] instanceof int[] mu && (mu[1] = 1) == 1
            && IntStream.range(0, P).allMatch(t -> py[t] == pd[t] || (mu[py[t]] -= mu[pd[t]]) > -999999)
            && IntStream.rangeClosed(0, M).map(y -> y == 0 ? 0 : b / y).toArray() instanceof int[] bq
            && IntStream.rangeClosed(0, M).map(y -> y == 0 ? 0 : c / y).toArray() instanceof int[] cq
            && new int[M + 1] instanceof int[] fb && new int[M + 1] instanceof int[] fc
            ? Math.floorMod(IntStream.rangeClosed(1, a).mapToLong(x ->
                IntStream.rangeClosed(0, M).allMatch(i -> (fb[i] = 0) == 0 && (fc[i] = 0) == 0)
                && IntStream.range(0, P).allMatch(t -> g[x * W + py[t]] != 1 || (fb[pd[t]] += bq[py[t]]) >= 0 && (fc[pd[t]] += cq[py[t]]) >= 0)
                ? (long) (a / x) * (IntStream.rangeClosed(1, Math.min(b, c)).filter(d -> g[x * W + d] == 1).mapToLong(d -> (long) mu[d] * fb[d] * fc[d]).sum() % (1L << 30)) : 0L).sum(), 1L << 30) : "");
    }
}
