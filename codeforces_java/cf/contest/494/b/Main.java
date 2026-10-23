import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] tk
            && Integer.valueOf(tk[1].length()) instanceof Integer m
            && Integer.valueOf(tk[0].length()) instanceof Integer n
            && (tk[1] + "#" + tk[0]).getBytes() instanceof byte[] u
            && new int[u.length] instanceof int[] pi
            && IntStream.range(1, u.length).allMatch(i ->
                IntStream.iterate(pi[i - 1], k -> k > 0 && u[k] != u[i], k -> pi[k - 1]).reduce((x, y) -> y) instanceof OptionalInt lastK
                && Integer.valueOf(lastK.isPresent() ? pi[lastK.getAsInt() - 1] : pi[i - 1]) instanceof Integer k2
                && (pi[i] = u[k2] == u[i] ? k2 + 1 : k2) >= 0)
            && new long[n + 1] instanceof long[] g
            && new long[n + 1] instanceof long[] gg
            && new int[1] instanceof int[] p
            && IntStream.rangeClosed(1, n).allMatch(i ->
                (pi[m + i] == m ? (p[0] = i - m + 1) > 0 : true)
                && (g[i] = (g[i - 1] + (p[0] > 0 ? (p[0] + gg[p[0] - 1]) % 1000000007L : 0)) % 1000000007L) >= 0
                && (gg[i] = (gg[i - 1] + g[i]) % 1000000007L) >= 0)
            ? "" + g[n]
            : "");
    }
}
