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
            && Integer.valueOf(g[0]) instanceof Integer n
            && new long[2 * n] instanceof long[] d1
            && new long[2 * n] instanceof long[] d2
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j ->
                (d1[i + j] += g[1 + i * n + j]) >= 0 && (d2[i - j + n] += g[1 + i * n + j]) >= 0))
            && new long[] {-1, -1} instanceof long[] best
            && new int[2] instanceof int[] pos
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j ->
                (Long) (d1[i + j] + d2[i - j + n] - g[1 + i * n + j]) instanceof Long v
                && (v <= best[i + j & 1] || ((best[i + j & 1] = v) >= 0 && (pos[i + j & 1] = i * n + j) >= 0))))
            ? best[0] + best[1] + "\n" + (pos[0] / n + 1) + " " + (pos[0] % n + 1) + " " + (pos[1] / n + 1) + " " + (pos[1] % n + 1)
            : "");
    }
}
