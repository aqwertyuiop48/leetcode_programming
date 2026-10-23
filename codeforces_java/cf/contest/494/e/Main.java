import java.util.*;
import java.util.function.*;
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
            && Integer.valueOf(31 - Integer.numberOfLeadingZeros(g0[2])) instanceof Integer tk
            && Integer.valueOf(g0[1]) instanceof Integer m
            && IntStream.concat(IntStream.range(0, m).map(i -> g0[4 + 4 * i]), IntStream.range(0, m).map(i -> g0[6 + 4 * i] + 1)).sorted().distinct().toArray() instanceof int[] ys
            && Integer.valueOf(ys.length - 1) instanceof Integer lv
            && Integer.valueOf(Integer.highestOneBit(2 * lv - 1)) instanceof Integer nn
            && new int[2 * nn] instanceof int[] full
            && new int[2 * nn] instanceof int[] len
            && new int[2 * nn] instanceof int[] cnt
            && IntStream.range(0, lv).allMatch(i -> (full[nn + i] = (ys[i + 1] - 1) ^ (ys[i] - 1)) >= 0)
            && IntStream.iterate(nn - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (full[i] = full[2 * i] ^ full[2 * i + 1]) >= 0)
            && ((IntPredicate) i -> (len[i] = cnt[i] > 0 ? full[i] : i >= nn ? 0 : len[2 * i] ^ len[2 * i + 1]) >= 0) instanceof IntPredicate rc
            && new int[5] instanceof int[] lr
            && ((BooleanSupplier) () ->
                IntStream.range(0, 19).allMatch(s2 ->
                    (lr[0] >= lr[1]
                        || (((lr[0] & 1) == 0 || ((cnt[lr[0]] += lr[2]) > -2 && rc.test(lr[0]) && ++lr[0] > 0))
                            && ((lr[1] & 1) == 0 || (--lr[1] > 0 && (cnt[lr[1]] += lr[2]) > -2 && rc.test(lr[1])))
                            && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0))
                    && ((lr[3] >> (s2 + 1)) < 1 || rc.test(lr[3] >> (s2 + 1)))
                    && ((lr[4] >> (s2 + 1)) < 1 || rc.test(lr[4] >> (s2 + 1))))) instanceof BooleanSupplier upd
            && IntStream.range(0, m).map(i -> nn + Arrays.binarySearch(ys, g0[4 + 4 * i])).toArray() instanceof int[] yl
            && IntStream.range(0, m).map(i -> nn + Arrays.binarySearch(ys, g0[6 + 4 * i] + 1)).toArray() instanceof int[] yr
            && IntStream.range(0, 2 * m).mapToLong(e ->
                e % 2 == 0 ? ((long) g0[3 + 4 * (e / 2)] << 18) | ((long) (e / 2) << 1)
                           : ((long) (g0[5 + 4 * (e / 2)] + 1) << 18) | ((long) (e / 2) << 1) | 1).sorted().toArray() instanceof long[] ev
            && new int[]{1, 0} instanceof int[] sw
            && Arrays.stream(ev).allMatch(key ->
                (sw[1] ^= len[1] & (((int) (key >> 18) - 1) ^ (sw[0] - 1))) == sw[1]
                && (lr[2] = (key & 1) == 0 ? 1 : -1) != 0
                && (lr[0] = yl[(int) (key >> 1 & 65535)]) > 0
                && (lr[1] = yr[(int) (key >> 1 & 65535)]) > 0
                && (lr[3] = lr[0]) > 0
                && (lr[4] = lr[1] - 1) > 0
                && upd.getAsBoolean()
                && (sw[0] = (int) (key >> 18)) > 0)
            && (sw[1] & ((1 << (tk + 1)) - 1)) != 0
            ? "Hamed"
            : "Malek");
    }
}
