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
            && Arrays.copyOfRange(g0, 1, g0[0] + 1) instanceof int[] a
            && new StringBuilder() instanceof StringBuilder sb
            && new int[1] instanceof int[] cnt
            && IntStream.range(0, a.length).allMatch(i ->
                (Integer) IntStream.range(i, a.length).reduce((x, y) -> a[y] < a[x] ? y : x).getAsInt() instanceof Integer j
                && (j == i
                    || ((a[i] ^= a[j]) >= 0 && (a[j] ^= a[i]) >= 0 && (a[i] ^= a[j]) >= 0
                        && sb.append(i).append(' ').append(j).append('\n') != null && ++cnt[0] > 0)))
            ? cnt[0] + "\n" + sb
            : "");
    }
}
