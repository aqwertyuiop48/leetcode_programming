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
            ? IntStream.rangeClosed(g[2], g[3]).filter(t ->
                IntStream.range(0, g[0]).anyMatch(i ->
                    IntStream.range(0, g[1]).anyMatch(j ->
                        g[4 + 2 * g[0] + 2 * j] + t <= g[5 + 2 * i] && g[5 + 2 * g[0] + 2 * j] + t >= g[4 + 2 * i]))).count()
            : 0);
    }
}
