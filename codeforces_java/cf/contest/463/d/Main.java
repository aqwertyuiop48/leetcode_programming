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
            && Integer.valueOf(g[1]) instanceof Integer k
            && new int[k * (n + 1)] instanceof int[] pos
            && IntStream.range(0, k).allMatch(q -> IntStream.range(0, n).allMatch(i ->
                (pos[q * (n + 1) + g[2 + q * n + i]] = i) >= 0))
            && new int[n] instanceof int[] dp
            && IntStream.range(0, n).allMatch(i ->
                (dp[i] = 1 + IntStream.range(0, i).filter(j ->
                    IntStream.range(1, k).allMatch(q -> pos[q * (n + 1) + g[2 + j]] < pos[q * (n + 1) + g[2 + i]]))
                    .map(j -> dp[j]).max().orElse(0)) > 0)
            ? IntStream.of(dp).max().getAsInt()
            : 0);
    }
}
