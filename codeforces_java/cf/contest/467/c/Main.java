import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && new long[g[0] + 1] instanceof long[] pre
            && IntStream.rangeClosed(1, g[0]).allMatch(i -> (pre[i] = pre[i - 1] + g[2 + i]) >= 0)
            && new long[][] {new long[g[0] + 1], new long[g[0] + 1]} instanceof long[][] d
            && IntStream.rangeClosed(1, g[2]).allMatch(j ->
                (d[j & 1][0] = -4000000000000000000L) < 0
                && IntStream.rangeClosed(1, g[0]).allMatch(i ->
                    (d[j & 1][i] = i < g[1]
                        ? -4000000000000000000L
                        : Math.max(d[j & 1][i - 1], d[j - 1 & 1][i - g[1]] + pre[i] - pre[i - g[1]])) * 0 == 0))
            ? d[g[2] & 1][g[0]]
            : -1);
    }
}
