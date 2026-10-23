import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && Integer.valueOf(n + 1) instanceof Integer s
            && new int[s] instanceof int[] a
            && new int[30 * (n + 2)] instanceof int[] d
            && IntStream.range(0, 30).allMatch(b ->
                IntStream.range(0, m).allMatch(j -> (g[4 + 3 * j] >> b & 1) == 0
                    || ((d[b * (n + 2) + g[2 + 3 * j]] += 1) > -(1 << 30) && (d[b * (n + 2) + g[3 + 3 * j] + 1] -= 1) < (1 << 30)))
                && IntStream.rangeClosed(1, n).allMatch(i -> (d[b * (n + 2) + i] += d[b * (n + 2) + i - 1]) >= 0
                    && (d[b * (n + 2) + i] == 0 || (a[i] |= 1 << b) > 0)))
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(n)) instanceof Integer lv
            && new int[lv * s] instanceof int[] sp
            && IntStream.rangeClosed(1, n).allMatch(i -> (sp[i] = a[i]) >= 0)
            && IntStream.range(1, lv).allMatch(k -> IntStream.rangeClosed(1, n - (1 << k) + 1).allMatch(i ->
                (sp[k * s + i] = sp[(k - 1) * s + i] & sp[(k - 1) * s + i + (1 << (k - 1))]) >= 0))
            && IntStream.range(0, m).allMatch(j ->
                Integer.valueOf(31 - Integer.numberOfLeadingZeros(g[3 + 3 * j] - g[2 + 3 * j] + 1)) instanceof Integer k
                && (sp[k * s + g[2 + 3 * j]] & sp[k * s + g[3 + 3 * j] - (1 << k) + 1]) == g[4 + 3 * j])
            ? "YES\n" + IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(a[i])).collect(Collectors.joining(" "))
            : "NO");
    }
}
