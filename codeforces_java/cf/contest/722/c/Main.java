import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] sz && new long[n + 2] instanceof long[] sum
            && new boolean[n + 2] instanceof boolean[] pres && new long[n + 2] instanceof long[] res && new long[1] instanceof long[] best
            && IntStream.range(0, n + 2).allMatch(i -> (par[i] = i) >= 0 && (sz[i] = 1) > 0)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y]).filter(y -> par[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator root
            && IntStream.iterate(n, i -> i >= 2, i -> i - 1).allMatch(i -> Integer.valueOf((int) t[n + i]) instanceof Integer p
                && (sum[p] = t[p]) >= 0 && (pres[p] = true) && (best[0] = Math.max(best[0], sum[p])) >= 0
                && IntStream.of(p - 1, p + 1).filter(nb -> pres[nb]).allMatch(nb -> Integer.valueOf(root.applyAsInt(p)) instanceof Integer x
                    && Integer.valueOf(root.applyAsInt(nb)) instanceof Integer y
                    && (x.equals(y) || (Integer.valueOf(sz[x] >= sz[y] ? x : y) instanceof Integer big && Integer.valueOf(x + y - big) instanceof Integer sm
                        && (par[sm] = big) >= 0 && (sz[big] += sz[sm]) > 0 && (sum[big] += sum[sm]) >= 0 && (best[0] = Math.max(best[0], sum[big])) >= 0)))
                && (res[i - 1] = best[0]) >= 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> "" + res[i]).collect(Collectors.joining("\n")) : "");
    }
}
