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
            && new long[1] instanceof long[] r
            && (r[0] = 1) > 0
            && IntStream.rangeClosed(1, g[0] + 1).allMatch(i ->
                (Integer) (g[1] - (i <= g[0] ? g[1 + i] : g[1])) instanceof Integer b
                && (Integer) (i > 1 ? g[1] - g[i] : 0) instanceof Integer p
                && (b >= 0 || (r[0] = 0) == 0)
                && (b - p == 1
                    || (b.intValue() == p ? (r[0] = r[0] * (1 + p) % 1000000007L) >= 0
                    : b - p == -1 ? (r[0] = r[0] * p % 1000000007L) >= 0
                    : (r[0] = 0) == 0)))
            ? r[0]
            : -1);
    }
}
