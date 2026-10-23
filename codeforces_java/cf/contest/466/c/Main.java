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
                    : i < raw.length && raw[i] == '-'
                        ? (ps[3] = 1) > 0
                        : (ps[2] != 1 || ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) * 0 == 0 && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && new long[g[0] + 1] instanceof long[] pre
            && IntStream.rangeClosed(1, g[0]).allMatch(i -> (pre[i] = pre[i - 1] + g[i]) * 0 == 0)
            && new long[2] instanceof long[] st
            ? pre[g[0]] % 3 != 0 ? 0L
                : IntStream.range(1, g[0]).allMatch(j ->
                    (pre[j] != pre[g[0]] / 3 * 2 || (st[1] += st[0]) >= 0)
                    && (pre[j] != pre[g[0]] / 3 || ++st[0] > 0)) ? st[1] : -1L
            : -1L);
    }
}
