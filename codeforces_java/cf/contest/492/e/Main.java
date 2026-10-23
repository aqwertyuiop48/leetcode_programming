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
            && Integer.valueOf(g0[1]) instanceof Integer m
            && Long.valueOf(g0[2]) instanceof Long dx
            && Long.valueOf(g0[3]) instanceof Long dy
            && Long.valueOf(IntStream.range(0, n).filter(k -> dx * k % n == 1 % n).findFirst().getAsInt()) instanceof Long inv
            && new int[n] instanceof int[] cnt
            && IntStream.range(0, m).allMatch(i ->
                ++cnt[(int) (((g0[5 + 2 * i] - g0[4 + 2 * i] * inv % n * dy) % n + n) % n)] > 0)
            && Integer.valueOf(IntStream.range(0, n).reduce((a, b) -> cnt[b] > cnt[a] ? b : a).getAsInt()) instanceof Integer best
            ? "0 " + best
            : "");
    }
}
