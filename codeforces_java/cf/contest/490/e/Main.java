import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).split("\n") instanceof String[] ln
            && Integer.valueOf(ln[0].trim()) instanceof Integer n
            && new long[1] instanceof long[] prev
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, n).allMatch(i ->
                ln[i].trim() instanceof String p
                && String.valueOf(prev[0] + 1) instanceof String T
                && Integer.valueOf(p.length()) instanceof Integer L
                && Integer.valueOf(T.length()) instanceof Integer TL
                && Integer.valueOf((int) IntStream.range(0, Math.min(L, TL))
                    .takeWhile(x -> p.charAt(x) == '?' || p.charAt(x) == T.charAt(x)).count()) instanceof Integer ml
                && Integer.valueOf(IntStream.iterate(Math.min(ml, L - 1), x -> x >= 0, x -> x - 1)
                    .filter(x -> L - TL != 0 || (p.charAt(x) == '?' ? T.charAt(x) < '9' : p.charAt(x) > T.charAt(x)))
                    .findFirst().orElse(-1)) instanceof Integer q
                && (L > TL
                    ? IntStream.range(0, L).mapToObj(x -> String.valueOf(p.charAt(x) == '?' ? (x == 0 ? '1' : '0') : p.charAt(x))).collect(Collectors.joining())
                    : L < TL ? null
                    : ml - L == 0 ? T
                    : q < 0 ? null
                    : IntStream.range(0, L).mapToObj(x -> String.valueOf(
                        x < q ? T.charAt(x)
                        : x == q ? (p.charAt(x) == '?' ? (char) (T.charAt(x) + 1) : p.charAt(x))
                        : p.charAt(x) == '?' ? '0' : p.charAt(x))).collect(Collectors.joining())) instanceof String res
                && (prev[0] = Long.parseLong(res)) > 0
                && sb.append(res).append('\n') != null)
            ? "YES\n" + sb
            : "NO");
    }
}
