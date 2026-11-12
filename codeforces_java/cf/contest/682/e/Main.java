import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] t && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (st[3] = 1) > 0
                : st[1] == 1 && (t[(int) st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) + (st[1] = 0) + (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && new long[n] instanceof long[] key && new long[2 * n + 2] instanceof long[] hx && new long[2 * n + 2] instanceof long[] hy && new int[]{0} instanceof int[] sz
            && IntStream.range(0, n).filter(i -> (key[i] = (t[2 + 2 * i] + 1000000000L) * 2000000001L + t[3 + 2 * i] + 1000000000L) >= 0).count() >= 0
            && Stream.of(0).peek(z -> Arrays.sort(key)).findFirst().isPresent()
            && IntStream.range(0, n).filter(i -> Long.valueOf(key[i] / 2000000001L - 1000000000L) instanceof Long px && Long.valueOf(key[i] % 2000000001L - 1000000000L) instanceof Long py
                && IntStream.generate(() -> 0).takeWhile(z -> sz[0] >= 2 && (hx[sz[0] - 1] - hx[sz[0] - 2]) * (py - hy[sz[0] - 2]) - (hy[sz[0] - 1] - hy[sz[0] - 2]) * (px - hx[sz[0] - 2]) <= 0 && --sz[0] >= 0).count() >= 0
                && (hx[sz[0]] = px) * 0 == 0 && (hy[sz[0]++] = py) * 0 == 0).count() >= 0
            && Integer.valueOf(sz[0] + 1) instanceof Integer lower
            && IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).filter(i -> Long.valueOf(key[i] / 2000000001L - 1000000000L) instanceof Long px && Long.valueOf(key[i] % 2000000001L - 1000000000L) instanceof Long py
                && IntStream.generate(() -> 0).takeWhile(z -> sz[0] >= lower && (hx[sz[0] - 1] - hx[sz[0] - 2]) * (py - hy[sz[0] - 2]) - (hy[sz[0] - 1] - hy[sz[0] - 2]) * (px - hx[sz[0] - 2]) <= 0 && --sz[0] >= 0).count() >= 0
                && (hx[sz[0]] = px) * 0 == 0 && (hy[sz[0]++] = py) * 0 == 0).count() >= 0
            && --sz[0] >= 0 && Integer.valueOf(sz[0]) instanceof Integer h && Integer.valueOf(h - 1) instanceof Integer hm && new long[h][] instanceof long[][] out
            && IntStream.range(0, h).parallel().filter(i -> new long[]{i + 1, i + 2, 0, 0, 0, 0} instanceof long[] s && (i + 2 >= h || (s[2] = (hx[i + 1] - hx[i]) * (hy[i + 2] - hy[i]) - (hy[i + 1] - hy[i]) * (hx[i + 2] - hx[i])) >= 0) && (out[i] = s) != null
                && IntStream.range(0, 2 * (h - i)).filter(z -> s[0] >= hm || ((s[1] + 1 < h && (s[4] = (hx[(int) s[0]] - hx[i]) * (hy[(int) s[1] + 1] - hy[i]) - (hy[(int) s[0]] - hy[i]) * (hx[(int) s[1] + 1] - hx[i])) > s[2]) ? (s[2] = s[4]) * 0 + ++s[1] > 0
                    : ((s[2] > s[3]) ? (s[3] = s[2]) * 0 + (s[5] = s[0] * 100000 + s[1]) >= 0 : true) && ++s[0] > 0 && (s[1] = Math.max(s[1], s[0] + 1)) > 0 && (s[0] >= hm || (s[2] = (hx[(int) s[0]] - hx[i]) * (hy[(int) s[1]] - hy[i]) - (hy[(int) s[0]] - hy[i]) * (hx[(int) s[1]] - hx[i])) != 0 || true))).count() >= 0).count() >= 0
            && Integer.valueOf(IntStream.range(0, h).reduce((x, y) -> out[x][3] >= out[y][3] ? x : y).getAsInt()) instanceof Integer bi0 && Integer.valueOf((int) (out[bi0][5] / 100000)) instanceof Integer bj0 && Integer.valueOf((int) (out[bi0][5] % 100000)) instanceof Integer bk0
            ? (hx[bj0] + hx[bk0] - hx[bi0]) + " " + (hy[bj0] + hy[bk0] - hy[bi0]) + "\n" + (hx[bi0] + hx[bk0] - hx[bj0]) + " " + (hy[bi0] + hy[bk0] - hy[bj0]) + "\n"
                + (hx[bi0] + hx[bj0] - hx[bk0]) + " " + (hy[bi0] + hy[bj0] - hy[bk0]) : "");
    }
}
