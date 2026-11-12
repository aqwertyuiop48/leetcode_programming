import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Long.valueOf(IntStream.range(0, raw.length).filter(k -> raw[k] >= 48 && (k == 0 || raw[k - 1] < 48)).count()) instanceof Long cnt
            && new long[(int) cnt.longValue()] instanceof long[] v
            && new long[]{0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length + 1).filter(k -> k < raw.length && raw[k] >= 48
                ? (st[0] = st[0] * 10 + raw[k] - 48) >= 0 && (st[2] = 1) > 0
                : st[2] == 1 && (v[(int) (st[1]++)] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && Integer.valueOf(Long.bitCount(IntStream.range(0, n).mapToLong(i -> v[1 + 2 * i] ^ v[2 + 2 * i]).reduce(0L, (p, q) -> p | q))) instanceof Integer cap
            && new long[64] instanceof long[] bs && new long[]{0} instanceof long[] x && new int[]{0, 0} instanceof int[] rk
            && IntStream.range(0, n).filter(i -> rk[0] < cap && (x[0] = v[1 + 2 * i] ^ v[2 + 2 * i]) >= 0
                && IntStream.iterate(0, z -> x[0] != 0, z -> z + 1).filter(z -> (bs[63 - Long.numberOfLeadingZeros(x[0])] == 0 ? (bs[63 - Long.numberOfLeadingZeros(x[0])] = x[0]) != 0 & (x[0] = 0) == 0 & ++rk[0] > 0 : (x[0] ^= bs[63 - Long.numberOfLeadingZeros(x[0])]) >= 0)).count() >= 0).count() >= 0
            && (x[0] = IntStream.range(0, n).mapToLong(i -> v[1 + 2 * i]).reduce(0L, (p, q) -> p ^ q)) >= 0
            && IntStream.iterate(0, z -> x[0] != 0, z -> z + 1).filter(z -> (bs[63 - Long.numberOfLeadingZeros(x[0])] == 0 ? (rk[1] = 1) > 0 & (x[0] = 0) == 0 : (x[0] ^= bs[63 - Long.numberOfLeadingZeros(x[0])]) >= 0)).count() >= 0
            ? rk[1] == 0 ? ((1L << rk[0]) - 1) + "/" + (1L << rk[0]) : "1/1"
            : "");
    }
}
