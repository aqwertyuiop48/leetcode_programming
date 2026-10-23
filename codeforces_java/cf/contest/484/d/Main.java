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
            && new long[] {0, Long.MIN_VALUE / 2, Long.MIN_VALUE / 2} instanceof long[] st
            && IntStream.rangeClosed(1, g[0]).allMatch(i ->
                (st[1] = Math.max(st[1], st[0] + g[i])) > Long.MIN_VALUE
                && (st[2] = Math.max(st[2], st[0] - g[i])) > Long.MIN_VALUE
                && (st[0] = Math.max(st[1] - g[i], st[2] + g[i])) > Long.MIN_VALUE)
            ? st[0]
            : -1);
    }
}
