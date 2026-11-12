import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(100000) instanceof Integer M
            && new int[M + 1] instanceof int[] mn && new int[M + 1] instanceof int[] mx
            && Stream.of(0).peek(z -> Arrays.fill(mn, Integer.MAX_VALUE)).peek(z -> Arrays.fill(mx, -1)).findFirst().isPresent()
            && ((IntBinaryOperator) (ax, ay) -> (mn[ax] = Math.min(mn[ax], ay)) >= 0 & (mx[ax] = Math.max(mx[ax], ay)) >= 0 ? 0 : 0) instanceof IntBinaryOperator add
            && IntStream.range(0, n).filter(i -> Integer.valueOf(tok[1 + 3 * i]) instanceof Integer x0 && Integer.valueOf(tok[2 + 3 * i]) instanceof Integer y0 && Integer.valueOf(tok[3 + 3 * i]) instanceof Integer v
                && ((x0 - v < 0 || add.applyAsInt(x0 - v, y0) >= 0) & (x0 + v > M || add.applyAsInt(x0 + v, y0) >= 0) & (y0 - v < 0 || add.applyAsInt(x0, y0 - v) >= 0) & (y0 + v > M || add.applyAsInt(x0, y0 + v) >= 0)
                    & IntStream.of(0, M).filter(c -> Math.abs(c - x0) <= v && Integer.valueOf(v - Math.abs(c - x0)) instanceof Integer h
                        && add.applyAsInt(c, Math.max(0, y0 - h)) >= 0 & add.applyAsInt(c, Math.min(M, y0 + h)) >= 0).count() >= 0
                    & IntStream.of(0, M).filter(c -> Math.abs(c - y0) <= v && Integer.valueOf(v - Math.abs(c - y0)) instanceof Integer h
                        && add.applyAsInt(Math.max(0, x0 - h), c) >= 0 & add.applyAsInt(Math.min(M, x0 + h), c) >= 0).count() >= 0)).count() >= 0
            && new int[2 * M + 8] instanceof int[] hx && new int[2 * M + 8] instanceof int[] hy && new int[]{0} instanceof int[] sz
            && ((IntBinaryOperator) (px, py) -> (IntStream.range(0, sz[0]).allMatch(k -> sz[0] >= st[0] && ((long) (hx[sz[0] - 1] - hx[sz[0] - 2])) * (py - hy[sz[0] - 2]) - ((long) (hy[sz[0] - 1] - hy[sz[0] - 2])) * (px - hx[sz[0] - 2]) <= 0
                    ? --sz[0] >= 0 : false) | true) && (hx[sz[0]] = px) >= 0 & (hy[sz[0]++] = py) >= 0 ? 1 : 0) instanceof IntBinaryOperator push
            && (st[0] = 2) > 0
            && IntStream.rangeClosed(0, M).filter(x -> mx[x] >= 0 && push.applyAsInt(x, mn[x]) < 0).count() == 0
            && (st[0] = sz[0] + 1) > 0
            && IntStream.rangeClosed(0, M).map(i -> M - i).filter(x -> mx[x] >= 0 && !(sz[0] > 0 && hx[sz[0] - 1] == x && hy[sz[0] - 1] == mx[x]) && push.applyAsInt(x, mx[x]) < 0).count() == 0
            && (sz[0] -= hx[sz[0] - 1] == hx[0] && hy[sz[0] - 1] == hy[0] ? 1 : 0) >= 0
            && new double[]{-1} instanceof double[] best && new int[]{0} instanceof int[] bi
            && IntStream.range(0, sz[0]).filter(i -> Integer.valueOf((i + sz[0] - 1) % sz[0]) instanceof Integer a && Integer.valueOf((i + 1) % sz[0]) instanceof Integer c
                && Double.valueOf(((double) ((long) (hx[a] - hx[i]) * (hx[a] - hx[i]) + (long) (hy[a] - hy[i]) * (hy[a] - hy[i]))) * ((long) (hx[c] - hx[i]) * (hx[c] - hx[i]) + (long) (hy[c] - hy[i]) * (hy[c] - hy[i]))
                    * ((long) (hx[a] - hx[c]) * (hx[a] - hx[c]) + (long) (hy[a] - hy[c]) * (hy[a] - hy[c]))
                    / Math.pow((double) ((long) (hx[i] - hx[a]) * (hy[c] - hy[a]) - (long) (hy[i] - hy[a]) * (hx[c] - hx[a])), 2)) instanceof Double r2
                && r2 > best[0] && (best[0] = r2) > 0 && (bi[0] = i) >= 0).count() >= 0
            ? hx[(bi[0] + sz[0] - 1) % sz[0]] + " " + hy[(bi[0] + sz[0] - 1) % sz[0]] + "\n" + hx[bi[0]] + " " + hy[bi[0]] + "\n" + hx[(bi[0] + 1) % sz[0]] + " " + hy[(bi[0] + 1) % sz[0]] : "");
    }
}
