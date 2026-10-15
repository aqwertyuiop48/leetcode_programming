import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && (Integer) (int) IntStream.range(0, raw.length).filter(i -> raw[i] > 32).count() instanceof Integer n
            && new int[n + 1] instanceof int[] degree
            && new long[]{0, 0, 1, 0, 0, 1, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] > 32).allMatch(i ->
                (st[0] = (st[0] * 131 + raw[i]) % 1_000_000_007L) >= 0
                && (st[1] = (st[1] + raw[i] * st[2]) % 1_000_000_007L) >= 0
                && (st[2] = st[2] * 131 % 1_000_000_007L) >= 0
                && (st[3] = (st[3] * 137 + raw[i]) % 998_244_353L) >= 0
                && (st[4] = (st[4] + raw[i] * st[5]) % 998_244_353L) >= 0
                && (st[5] = st[5] * 137 % 998_244_353L) >= 0
                && ++st[6] > 0
                && (degree[(int) st[6]] = st[0] == st[1] && st[3] == st[4] ? 1 + degree[(int) st[6] / 2] : 0) >= 0
                && (st[6] >= 0 && (st[6] != n || true)))
            ? IntStream.rangeClosed(1, n).mapToLong(L -> degree[L]).sum()
            : 0L);
    }
}
