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
            && Integer.valueOf(IntStream.rangeClosed(1, n).map(i -> g[i]).max().getAsInt()) instanceof Integer mx
            && new int[mx + 1] instanceof int[] prev
            && IntStream.rangeClosed(1, n).allMatch(i -> (prev[g[i]] = g[i]) > 0)
            && IntStream.rangeClosed(1, mx).allMatch(v -> (prev[v] = Math.max(prev[v], prev[v - 1])) >= 0)
            ? IntStream.rangeClosed(1, mx).filter(x -> prev[x] == x)
                .map(x -> IntStream.rangeClosed(2, mx / x + 1).map(k -> prev[Math.min(k * x - 1, mx)] - (k * x - x)).max().orElse(0))
                .max().orElse(0)
            : -1);
    }
}
