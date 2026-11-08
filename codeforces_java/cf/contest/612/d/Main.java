import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer k && new long[2 * n] instanceof long[] ev
            && IntStream.range(0, n).filter(i -> (ev[2 * i] = (v[2 + 2 * i] + 1000000000L) * 2) + (ev[2 * i + 1] = (v[3 + 2 * i] + 1000000000L) * 2 + 1) < 0).count() == 0
            && Stream.of(0).peek(z -> Arrays.sort(ev)).findFirst().isPresent()
            && new int[3] instanceof int[] cs && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, 2 * n).allMatch(j -> Long.valueOf(ev[j]) instanceof Long e
                && ((e & 1) == 0
                    ? ++cs[0] != k || (cs[1] = (int) ((e >> 1) - 1000000000L)) > Integer.MIN_VALUE
                    : cs[0]-- != k || sb.append('\n').append(cs[1]).append(' ').append((e >> 1) - 1000000000L) != null && ++cs[2] > 0))
            ? cs[2] + "" + sb : "");
    }
}
