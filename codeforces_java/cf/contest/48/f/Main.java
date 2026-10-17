import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && new BigDecimal[]{BigDecimal.ZERO} instanceof BigDecimal[] tot
            && IntStream.range(0, n).allMatch(day ->
                new long[65536] instanceof long[] hw
                && new long[65536] instanceof long[] hs
                && IntStream.range(0, m).filter(i ->
                    (hw[(int) (Double.doubleToLongBits((double) (t[3 + m + i] - (long) day * t[3 + 2 * m + i]) / t[3 + i]) >>> 47)] += t[3 + i]) < 0
                    || (hs[(int) (Double.doubleToLongBits((double) (t[3 + m + i] - (long) day * t[3 + 2 * m + i]) / t[3 + i]) >>> 47)] += t[3 + m + i] - (long) day * t[3 + 2 * m + i]) < 0).count() >= 0
                && new long[]{t[2], 0, -1} instanceof long[] st
                && IntStream.range(0, 65536).filter(b ->
                    st[2] < 0 && (hw[b] >= st[0] ? (st[2] = b) >= 0 : (st[0] -= hw[b]) >= 0 && (st[1] += hs[b]) >= 0) && false).count() >= 0
                && IntStream.range(0, m).filter(i ->
                    (Double.doubleToLongBits((double) (t[3 + m + i] - (long) day * t[3 + 2 * m + i]) / t[3 + i]) >>> 47) == st[2]).mapToLong(i ->
                        (Double.doubleToLongBits((double) (t[3 + m + i] - (long) day * t[3 + 2 * m + i]) / t[3 + i]) >>> 19 << 19) | i).sorted().toArray() instanceof long[] keys
                && IntStream.range(0, keys.length).allMatch(p ->
                    st[0] == 0
                    || (Integer) (int) (keys[p] & 524287) instanceof Integer idx
                    && (Long) (t[3 + m + idx] - (long) day * t[3 + 2 * m + idx]) instanceof Long si
                    && (t[3 + idx] <= st[0]
                        ? (st[1] += si) >= 0 && (st[0] -= t[3 + idx]) >= 0
                        : (st[1] += si * st[0] / t[3 + idx]) >= 0
                            && (tot[0] = tot[0].add(BigDecimal.valueOf(si * st[0] % t[3 + idx]).divide(BigDecimal.valueOf(t[3 + idx]), 30, RoundingMode.HALF_EVEN))) != null
                            && (st[0] = 0) == 0))
                && (tot[0] = tot[0].add(BigDecimal.valueOf(st[1]))) != null)
            ? tot[0].setScale(15, RoundingMode.HALF_EVEN).toPlainString() : "");
    }
}

