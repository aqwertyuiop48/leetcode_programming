import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> i < raw.length && raw[i] > 47 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && new double[n] instanceof double[] E && new double[n] instanceof double[] sum && new double[n] instanceof double[] prod && new boolean[n] instanceof boolean[] done && new int[]{n - 1} instanceof int[] cur
            && Double.valueOf(1e300) instanceof Double INF
            && IntStream.range(0, n).filter(v -> (prod[v] = 1) > 0 & (E[v] = INF) > 0).count() >= 0 && (E[n - 1] = 0) == 0 && (done[n - 1] = true)
            && (IntStream.range(0, n).allMatch(it -> Double.valueOf(E[cur[0]]) instanceof Double e
                && IntStream.range(0, n).filter(v -> !done[v]).filter(v -> Double.valueOf(tok[1 + v * n + cur[0]] / 100.0) instanceof Double q && (sum[v] += e * q * prod[v]) >= 0 && (prod[v] *= 1 - q) >= 0 && (E[v] = prod[v] < 1 ? (1 + sum[v]) / (1 - prod[v]) : INF) >= 0).count() >= 0
                && IntStream.range(0, n).filter(v -> !done[v] && E[v] < INF).reduce((x, y) -> E[x] <= E[y] ? x : y) instanceof OptionalInt o && o.isPresent() && (done[o.getAsInt()] = true) && (cur[0] = o.getAsInt()) != 0) || true)
            ? String.format(Locale.ROOT, "%.15f", E[0]) : "");
    }
}
