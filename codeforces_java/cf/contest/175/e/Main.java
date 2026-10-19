import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer nf
            && Integer.valueOf(sc.nextInt()) instanceof Integer ne
            && Integer.valueOf(sc.nextInt()) instanceof Integer ns
            && Integer.valueOf(sc.nextInt()) instanceof Integer rf
            && Integer.valueOf(sc.nextInt()) instanceof Integer re
            && Integer.valueOf(sc.nextInt()) instanceof Integer rs
            && Integer.valueOf(sc.nextInt()) instanceof Integer df
            && Integer.valueOf(sc.nextInt()) instanceof Integer de
            && Double.valueOf(Math.sqrt((double) rf * rf - 1)) instanceof Double wf
            && Double.valueOf(Math.sqrt((double) re * re - 1)) instanceof Double we
            && Double.valueOf(Math.sqrt((double) rs * rs - 1)) instanceof Double ws
            && Integer.valueOf((nf + ne + ns + 1) / 2) instanceof Integer C
            && Integer.valueOf(2 * C) instanceof Integer S
            && IntStream.range(0, C * C).mapToDouble(i -> Math.max(0, Math.min(i / C + wf, i % C + ws) - Math.max(i / C - wf, i % C - ws))).toArray() instanceof double[] ovF
            && IntStream.range(0, C * C).mapToDouble(i -> Math.max(0, Math.min(i / C + we, i % C + ws) - Math.max(i / C - we, i % C - ws))).toArray() instanceof double[] ovE
            && ((IntToDoubleFunction) m ->
                new double[S] instanceof double[] vf
                && new double[S] instanceof double[] ve
                && IntStream.range(0, S).allMatch(s ->
                    (vf[s] = (m >> s & 1) == 1 ? 0 : df * (2 * wf + IntStream.range(0, S).filter(q -> (m >> q & 1) == 1).mapToDouble(q -> ovF[(s >> 1) * C + (q >> 1)]).sum())) >= 0
                    && (ve[s] = (m >> s & 1) == 1 ? 0 : de * (2 * we + IntStream.range(0, S).filter(q -> (m >> q & 1) == 1).mapToDouble(q -> ovE[(s >> 1) * C + (q >> 1)]).sum())) >= 0)
                && IntStream.range(0, S).filter(s -> (m >> s & 1) == 0).toArray() instanceof int[] fr
                && new double[2 * nf + 2] instanceof double[] dp
                && IntStream.range(0, dp.length).allMatch(k -> (dp[k] = k == 0 ? 0 : -1e18) < 1)
                && IntStream.range(0, fr.length).allMatch(p -> IntStream.iterate(2 * nf + 1, k -> k >= 0, k -> k - 1).allMatch(k ->
                    (dp[k] = Math.max(
                        Math.max(k >= 2 ? dp[k - 2] + vf[fr[p]] : -1e18,
                            p - (k >> 1) - (k & 1) >= 0 && p - (k >> 1) - (k & 1) < ne ? dp[k] + ve[fr[p]] : -1e18),
                        (k & 1) == 1 ? dp[k - 1] : -1e18)) < 1e30))
                ? dp[2 * nf + fr.length - nf - ne] : 0.0) instanceof IntToDoubleFunction ev
            && String.format(Locale.ROOT, "%.8f",
                IntStream.range(0, 1 << S).filter(m -> Integer.bitCount(m) == ns && ((m >> 1) & ~m & 0x55555) == 0).mapToDouble(ev).max().getAsDouble()) instanceof String out
            ? out : "");
    }
}
