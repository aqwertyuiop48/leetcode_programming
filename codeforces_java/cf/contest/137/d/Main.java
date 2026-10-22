import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && tk[0].toCharArray() instanceof char[] c
            && Integer.valueOf(c.length) instanceof Integer n
            && Integer.valueOf(Math.min(Integer.parseInt(tk[1]), n)) instanceof Integer k
            && Integer.valueOf(n + 1) instanceof Integer S
            && new int[S * S] instanceof int[] ct
            && IntStream.rangeClosed(2, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(i ->
                (ct[(i + len) * S + i] = (c[i] != c[i + len - 1] ? 1 : 0) + ct[(i + len - 1) * S + i + 1]) >= 0))
            && IntStream.range(0, (k + 1) * S).map(x -> x == 0 ? 0 : 100000).toArray() instanceof int[] dp
            && new int[(k + 1) * S] instanceof int[] par
            && IntStream.rangeClosed(1, k).allMatch(m -> IntStream.rangeClosed(m, n).allMatch(j ->
                Integer.valueOf(IntStream.range(m - 1, j).map(i -> (dp[(m - 1) * S + i] + ct[j * S + i]) << 9 | i).min().getAsInt()) instanceof Integer b
                && (dp[m * S + j] = b >> 9) >= 0
                && (par[m * S + j] = b & 511) >= 0))
            && IntStream.rangeClosed(1, k).boxed().min(Comparator.comparingInt(q -> dp[q * S + n])).get() instanceof Integer bm
            ? dp[bm * S + n] + "\n" + Stream.iterate(new int[]{n, bm}, st -> st[1] > 0, st -> new int[]{par[st[1] * S + st[0]], st[1] - 1})
                .map(st -> new int[]{par[st[1] * S + st[0]], st[0]})
                .sorted(Comparator.comparingInt(p -> p[0]))
                .map(p -> IntStream.range(p[0], p[1]).mapToObj(t -> String.valueOf(c[Math.min(t, p[0] + p[1] - 1 - t)])).collect(Collectors.joining()))
                .collect(Collectors.joining("+"))
            : "");
    }
}
