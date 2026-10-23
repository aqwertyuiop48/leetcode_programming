import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer T
            && new double[][]{new double[T + 2], new double[T + 2]} instanceof double[][] cur
            && (cur[0][0] = 1) > 0
            && new int[]{0, 0, 1000000000, -1} instanceof int[] win
            && new double[2] instanceof double[] acc
            && new int[1] instanceof int[] last
            && IntStream.rangeClosed(1, n).allMatch(i ->
                new double[]{g[2 * i] / 100.0, g[2 * i + 1]} instanceof double[] in
                && new double[]{in[0], 1 - in[0], Math.pow(1 - in[0], in[1] - 1)} instanceof double[] pq
                && new int[]{(int) in[1]} instanceof int[] ta
                && cur[i % 2] instanceof double[] nw
                && cur[(i + 1) % 2] instanceof double[] old
                && Integer.valueOf(i % 2 * 2) instanceof Integer a0
                && Integer.valueOf((i + 1) % 2 * 2) instanceof Integer b0
                && IntStream.rangeClosed(win[a0], win[a0 + 1]).allMatch(j -> (nw[j] = 0) == 0)
                && Integer.valueOf(win[b0] + 1) instanceof Integer nl
                && Integer.valueOf(Math.min(T, win[b0 + 1] + ta[0])) instanceof Integer nh
                && (acc[1] = nl <= nh && ta[0] > 1 ? old[nl - 1] : 0) >= 0
                && (last[0] = nl - 1) > -5
                && (IntStream.rangeClosed(nl, nh).allMatch(j ->
                    (last[0] = j) > 0
                    && (nw[j] = acc[1] * pq[0] + (j >= ta[0] ? old[j - ta[0]] * pq[2] : 0)) > -1
                    && (acc[1] = pq[1] * acc[1] + (old[j] - (j - ta[0] + 1 >= 0 ? old[j - ta[0] + 1] * pq[2] : 0))) > -1e18
                    && (j < win[b0 + 1] || pq[2] > 1e-14 || acc[1] > 1e-14)) || true)
                && (win[a0] = IntStream.rangeClosed(nl, last[0]).filter(j -> nw[j] > 1e-14).findFirst().orElse(1000000000)) >= 0
                && (win[a0 + 1] = IntStream.iterate(last[0], j -> j >= win[a0] && win[a0] <= T, j -> j - 1).filter(j -> nw[j] > 1e-14).findFirst().orElse(-1)) > -2
                && (acc[0] += win[a0] <= win[a0 + 1] ? Arrays.stream(nw, win[a0], win[a0 + 1] + 1).sum() : 0) > -1)
            ? String.format(Locale.US, "%.9f", acc[0])
            : "");
    }
}
