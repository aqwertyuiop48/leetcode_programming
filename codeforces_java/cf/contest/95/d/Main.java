import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt()} instanceof int[] tk
            && new long[1002] instanceof long[] p10
            && (p10[0] = 1) > 0
            && IntStream.range(1, 1002).allMatch(i -> (p10[i] = p10[i - 1] * 10 % 1000000007L) > 0)
            && new long[1002][tk[1] + 1] instanceof long[][] g
            && IntStream.rangeClosed(1, 1001).allMatch(len ->
                IntStream.rangeClosed(0, tk[1]).allMatch(st ->
                    (g[len][st] = (2 * (st >= 1 ? p10[len - 1] : g[len - 1][1])
                        + 8 * g[len - 1][st == 0 ? 0 : st + 1 > tk[1] ? 0 : st + 1]) % 1000000007L) >= 0))
            && ((Function<String, long[]>) w ->
                new long[]{0, 0, 0} instanceof long[] st
                && IntStream.range(0, w.length()).allMatch(i ->
                    Integer.valueOf(w.charAt(i) - '0') instanceof Integer d
                    && Integer.valueOf(w.length() - i - 1) instanceof Integer rem
                    && Integer.valueOf((d > 4 ? 1 : 0) + (d > 7 ? 1 : 0)) instanceof Integer cl
                    && Integer.valueOf(st[1] == 0 ? 0 : st[1] + 1 > tk[1] ? 0 : (int) st[1] + 1) instanceof Integer ns
                    && (st[2] = (st[2] + (st[0] == 1
                        ? d * p10[rem]
                        : cl * (st[1] >= 1 ? p10[rem] : g[rem][1]) + (d - cl) * g[rem][ns])) % 1000000007L) >= 0
                    && (st[0] = st[0] == 1 || ((d == 4 || d == 7) && st[1] >= 1) ? 1 : 0) >= 0
                    && (st[1] = d == 4 || d == 7 ? 1 : ns) >= 0)
                ? new long[]{st[2], st[0]} : null) instanceof Function<String, long[]> cnt
            ? IntStream.range(0, tk[0]).mapToObj(q ->
                s.next() instanceof String l
                && s.next() instanceof String r
                && cnt.apply(r) instanceof long[] hi
                && cnt.apply(l) instanceof long[] lo
                ? String.valueOf(((hi[0] + hi[1] - lo[0]) % 1000000007L + 1000000007L) % 1000000007L)
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}

