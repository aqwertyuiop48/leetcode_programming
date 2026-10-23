import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer l
            && Integer.valueOf(n + 1) instanceof Integer w
            && new double[w * w] instanceof double[] sq
            && IntStream.range(0, w).allMatch(i -> IntStream.range(i + 1, w).allMatch(j ->
                (sq[i * w + j] = Math.sqrt(Math.abs((j == 0 ? 0 : g0[2 * j]) - (i == 0 ? 0 : g0[2 * i]) - l))) >= 0))
            && new double[w] instanceof double[] dp
            && new int[w] instanceof int[] pv
            && new int[w] instanceof int[] bp
            && new double[]{1e18, 0, 0, 0} instanceof double[] lam
            && new double[3] instanceof double[] t
            && new boolean[1] instanceof boolean[] done
            && IntStream.range(0, 100).allMatch(it -> done[0]
                || (IntStream.rangeClosed(1, n).allMatch(i ->
                        (t[1] = 1e30) > 0
                        && IntStream.range(0, i).allMatch(j ->
                            (t[0] = dp[j] + sq[j * w + i]) < t[1] ? (t[1] = t[0]) == t[0] && (pv[i] = j) >= 0 : true)
                        && (dp[i] = t[1] - lam[0] * g0[2 * i + 1]) == dp[i])
                    && (lam[2] = IntStream.iterate(n, i -> i > 0, i -> pv[i]).mapToDouble(i -> sq[pv[i] * w + i]).sum()
                        / IntStream.iterate(n, i -> i > 0, i -> pv[i]).mapToDouble(i -> g0[2 * i + 1]).sum()) == lam[2]
                    && (lam[2] < lam[0] - 1e-12
                        ? (lam[0] = lam[2]) == lam[2] && IntStream.range(0, w).allMatch(k -> (bp[k] = pv[k]) >= 0)
                        : (done[0] = true))))
            ? IntStream.iterate(n, i -> i > 0, i -> bp[i]).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
