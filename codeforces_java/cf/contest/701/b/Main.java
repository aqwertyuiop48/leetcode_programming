import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Long.valueOf(t[0]) instanceof Long n && Integer.valueOf((int) t[1]) instanceof Integer m
            && new boolean[(int) (long) n + 1] instanceof boolean[] row && new boolean[(int) (long) n + 1] instanceof boolean[] col
            && new long[]{0, 0} instanceof long[] cnt
            ? IntStream.range(0, m).mapToObj(i -> (row[(int) t[2 + 2 * i]] ? 0 : (row[(int) t[2 + 2 * i]] = true) ? ++cnt[0] : 0)
                + (col[(int) t[3 + 2 * i]] ? 0 : (col[(int) t[3 + 2 * i]] = true) ? ++cnt[1] : 0) >= 0 ? Long.toString((n - cnt[0]) * (n - cnt[1])) : "").collect(Collectors.joining(" ")) : "");
    }
}
