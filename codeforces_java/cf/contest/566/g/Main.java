import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m && Integer.valueOf(4 + 2 * n) instanceof Integer mb
            && new long[m] instanceof long[] keys && IntStream.range(0, m).filter(i -> (keys[i] = ((long) tok[mb + 2 * i] << 30) | tok[mb + 2 * i + 1]) < 0).count() == 0
            && Stream.of(0).peek(z -> Arrays.sort(keys)).findFirst().isPresent()
            && Integer.valueOf(IntStream.range(0, m).map(i -> tok[mb + 2 * i + 1]).max().getAsInt()) instanceof Integer maxd
            && new int[m + 2] instanceof int[] hx && new int[m + 2] instanceof int[] hy && new int[]{0} instanceof int[] sz
            && ((IntBinaryOperator) (px, py) -> (IntStream.range(0, sz[0]).allMatch(k -> sz[0] >= 2
                    && ((long) (hx[sz[0] - 1] - hx[sz[0] - 2])) * (py - hy[sz[0] - 2]) - ((long) (hy[sz[0] - 1] - hy[sz[0] - 2])) * (px - hx[sz[0] - 2]) >= 0
                    ? --sz[0] >= 0 : false) | true)
                && (hx[sz[0]] = px) >= 0 & (hy[sz[0]++] = py) >= 0 ? 1 : 0) instanceof IntBinaryOperator push
            && push.applyAsInt(0, maxd) >= 0
            && IntStream.range(0, m).filter(i -> (i == m - 1 || (keys[i] >> 30) != (keys[i + 1] >> 30)) && push.applyAsInt((int) (keys[i] >> 30), (int) (keys[i] & ((1 << 30) - 1))) < 0).count() == 0
            && Integer.valueOf(hx[sz[0] - 1]) instanceof Integer maxc
            ? (IntStream.range(0, n).allMatch(i -> Integer.valueOf(tok[4 + 2 * i]) instanceof Integer a && Integer.valueOf(tok[5 + 2 * i]) instanceof Integer b
                && a < maxc && Integer.valueOf(Arrays.binarySearch(hx, 0, sz[0], a)) instanceof Integer r && Integer.valueOf(r >= 0 ? r : -r - 2) instanceof Integer j
                && (long) (b - hy[j]) * (hx[j + 1] - hx[j]) < (long) (hy[j + 1] - hy[j]) * (a - hx[j])) ? "Min" : "Max") : "");
    }
}
