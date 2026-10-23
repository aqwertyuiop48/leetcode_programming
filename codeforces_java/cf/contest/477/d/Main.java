import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && (Integer) s.length() instanceof Integer n
            && s.chars().map(c -> c - '0').toArray() instanceof int[] ch
            && new int[n + 1][] instanceof int[][] tt
            && new short[n + 1][] instanceof short[][] gg
            && new short[n + 1][] instanceof short[][] mm
            && new int[4] instanceof int[] t
            && (tt[0] = new int[n + 2]) != null
            && (mm[0] = new short[n + 2]) != null
            && IntStream.range(0, n + 2).allMatch(i -> (mm[0][i] = 20000) > 0)
            && IntStream.rangeClosed(1, n).allMatch(L -> (tt[L] = new int[n - L + 1]) != null
                && (gg[L] = new short[n - L + 1]) != null
                && (mm[L] = new short[n - L + 1]) != null
                && new short[n - L + 1] instanceof short[] lc
                && IntStream.range(0, n - L).reduce(0, (u, k) ->
                    (lc[n - L - 1 - k] = (short) (ch[n - L - 1 - k] == ch[n - 1 - k] ? 1 + lc[n - L - k] : 0)) < 0 ? 1 : 0) >= 0
                && tt[L] instanceof int[] ta
                && tt[L - 1] instanceof int[] tp
                && gg[L] instanceof short[] ga
                && mm[L - 1] instanceof short[] mp
                && mm[L] instanceof short[] ma
                && IntStream.rangeClosed(L, n).reduce(0, (u, j) ->
                    ((t[0] = j >= 2 * L && ch[j - L] == 1
                            && (lc[j - 2 * L] >= L || ch[j - 2 * L + lc[j - 2 * L]] < ch[j - L + lc[j - 2 * L]]) ? 1 : 0) >= 0
                        & (t[1] = ch[j - L] == 0 ? 0 : j == L ? 1 : t[0] == 1 ? ta[j - 2 * L] : j >= 2 * L ? tp[j - 2 * L + 1] : tt[j - L][0]) >= 0
                        & (t[2] = ch[j - L] == 0 ? 20000 : j == L ? 1
                            : Math.min(20000, 1 + Math.min(j >= 2 * L ? mp[j - 2 * L + 1] : mm[j - L][0], t[0] == 1 ? ga[j - 2 * L] : 20000))) >= 0
                        & (ta[j - L] = (tp[j - L + 1] + t[1] - 1000000007) + (((tp[j - L + 1] + t[1] - 1000000007) >> 31) & 1000000007)) >= 0
                        & (ga[j - L] = (short) t[2]) >= 0
                        & (ma[j - L] = (short) Math.min(mp[j - L + 1], t[2])) >= 0) ? 0 : 1) >= 0)
            && IntStream.rangeClosed(1, Math.min(14, n)).filter(L -> gg[L][n - L] < 20000)
                .mapToLong(L -> Long.parseLong(s.substring(n - L), 2) + gg[L][n - L]).min() instanceof OptionalLong o
            && (Integer) IntStream.rangeClosed(15, n).filter(L -> gg[L][n - L] < 20000).findFirst().orElse(0) instanceof Integer lb
            ? tt[n][0] + "\n" + (o.isPresent() ? o.getAsLong() % 1000000007L
                : (s.substring(n - lb).chars().asLongStream().reduce(0L, (v, c) -> (v * 2 + c - '0') % 1000000007L) + gg[lb][n - lb]) % 1000000007L)
            : "");
    }
}
