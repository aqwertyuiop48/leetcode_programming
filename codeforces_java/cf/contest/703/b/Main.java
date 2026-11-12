import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer k
            && new boolean[n] instanceof boolean[] cap
            && IntStream.range(0, k).filter(i -> (cap[(int) t[2 + n + i] - 1] = true) && false).count() == 0
            && new long[]{LongStream.range(0, n).map(i -> t[2 + (int) i]).sum()} instanceof long[] rem
            ? IntStream.range(0, n).mapToLong(i -> cap[i] ? t[2 + i] * (rem[0] -= t[2 + i]) : 0).sum()
                + IntStream.range(0, n).mapToLong(i -> !cap[i] && !cap[(i + 1) % n] ? t[2 + i] * t[2 + (i + 1) % n] : 0).sum() : "");
    }
}
