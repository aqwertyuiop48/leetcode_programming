import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long w && Long.valueOf(t[2]) instanceof Long v && Long.valueOf(t[3]) instanceof Long u
            ? String.format(Locale.US, "%.10f",
                IntStream.range(0, n).allMatch(i -> t[4 + 2 * i] * u >= t[5 + 2 * i] * v) || IntStream.range(0, n).allMatch(i -> t[4 + 2 * i] * u <= t[5 + 2 * i] * v)
                    ? (double) w / u
                    : IntStream.range(0, n).mapToDouble(i -> (double) t[4 + 2 * i] / v + (double) (w - t[5 + 2 * i]) / u).max().getAsDouble()) : "");
    }
}
