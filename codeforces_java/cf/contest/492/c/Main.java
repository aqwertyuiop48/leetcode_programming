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
            && Long.valueOf(g0[1]) instanceof Long r
            && IntStream.range(0, n).mapToLong(i -> (long) g0[4 + 2 * i] << 20 | g0[3 + 2 * i]).sorted().toArray() instanceof long[] key
            && new long[]{(long) g0[2] * n - IntStream.range(0, n).mapToLong(i -> g0[3 + 2 * i]).sum(), 0} instanceof long[] st
            && Arrays.stream(key).allMatch(k ->
                st[0] <= 0
                || (Long.valueOf(Math.min(st[0], r - (k & 1048575))) instanceof Long take
                    && (st[1] += take * (k >> 20)) >= 0
                    && (st[0] -= take) >= -1))
            ? "" + st[1]
            : "");
    }
}
