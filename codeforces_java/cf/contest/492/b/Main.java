import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Arrays.stream(g0, 2, n + 2).sorted().toArray() instanceof int[] a
            && Integer.valueOf(Math.max(IntStream.range(1, n).map(i -> a[i] - a[i - 1]).max().orElse(0), Math.max(2 * a[0], 2 * (g0[1] - a[n - 1])))) instanceof Integer d2
            ? String.format(Locale.US, "%.10f", d2 / 2.0)
            : "");
    }
}
