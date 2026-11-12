import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && IntStream.range(0, 3 * n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] t
            && IntStream.range(0, 3).map(p -> (int) IntStream.range(0, n).filter(i -> t[3 * i + p] < 0).count()).toArray() instanceof int[] Hh
            && IntStream.range(0, 3).map(p -> (int) IntStream.range(0, n).filter(i -> t[3 * i + p] != 0).count()).toArray() instanceof int[] S
            && Integer.valueOf(Hh[0] + Hh[1] + Hh[2]) instanceof Integer H
            ? H >= 90 ? "1"
                : ((IntUnaryOperator) k -> 2 * k > n ? 0 : 4 * k > n ? 1 : 8 * k > n ? 2 : 16 * k > n ? 3 : 32 * k > n ? 4 : 5) instanceof IntUnaryOperator lev
                && IntStream.range(0, 18).map(i -> -1).toArray() instanceof int[] hm
                && IntStream.range(0, 3).filter(p -> IntStream.rangeClosed(0, Hh[p]).filter(h -> (hm[p * 6 + lev.applyAsInt(S[p] - h)] = h) >= 0).count() >= 0).count() >= 0
                && IntStream.range(0, n).map(i -> (t[3 * i] < 0 ? 1 : 0) | (t[3 * i + 1] < 0 ? 2 : 0) | (t[3 * i + 2] < 0 ? 4 : 0)).toArray() instanceof int[] hbm
                && IntStream.range(1, n).filter(i -> hbm[i] != 0).toArray() instanceof int[] hk
                ? IntStream.range(0, 216).parallel().filter(c -> hm[c / 36] >= 0 && hm[6 + c / 6 % 6] >= 0 && hm[12 + c % 6] >= 0).map(c ->
                    new int[]{500 * (c / 36 + 1), 500 * (c / 6 % 6 + 1), 500 * (c % 6 + 1)} instanceof int[] sp
                    && new int[]{hm[c / 36], hm[6 + c / 6 % 6], hm[12 + c % 6]} instanceof int[] hp
                    && Integer.valueOf(IntStream.range(0, 3).map(p -> t[p] > 0 ? sp[p] * (250 - t[p]) / 250 : 0).sum() + 100 * (hp[0] + hp[1] + hp[2])) instanceof Integer mine
                    && Integer.valueOf(hp[0] + 1) instanceof Integer d1 && Integer.valueOf(hp[1] + 1) instanceof Integer d2 && Integer.valueOf(hp[2] + 1) instanceof Integer d3
                    && Integer.valueOf(d1 * d2 * d3) instanceof Integer tot
                    && Long.valueOf(IntStream.range(1, n).filter(i -> hbm[i] == 0 && IntStream.range(0, 3).map(p -> t[3 * i + p] == 0 ? 0 : sp[p] * (250 - Math.abs(t[3 * i + p])) / 250).sum() > mine).count()) instanceof Long fixed
                    && new int[1][] instanceof int[][] hold
                    && IntStream.range(0, tot).map(i -> i == 0 ? 0 : 1 << 29).toArray() instanceof int[] init && (hold[0] = init) != null
                    && IntStream.of(hk).filter(i -> IntStream.range(0, 8).map(mask -> IntStream.range(0, 3).map(p -> t[3 * i + p] == 0 || (mask >> p & 1) == 1 ? 0 : sp[p] * (250 - Math.abs(t[3 * i + p])) / 250).sum()).toArray() instanceof int[] sc
                        && IntStream.range(0, tot).map(x -> 1 << 29).toArray() instanceof int[] nx
                        && IntStream.range(0, tot).filter(idx -> hold[0][idx] < (1 << 29)
                            && IntStream.range(0, 8).filter(mask -> (mask & ~hbm[i]) == 0 && idx / (d2 * d3) + (mask & 1) < d1 && idx / d3 % d2 + (mask >> 1 & 1) < d2 && idx % d3 + (mask >> 2 & 1) < d3
                                && (nx[idx + (mask & 1) * d2 * d3 + (mask >> 1 & 1) * d3 + (mask >> 2 & 1)] = Math.min(nx[idx + (mask & 1) * d2 * d3 + (mask >> 1 & 1) * d3 + (mask >> 2 & 1)], hold[0][idx] + (sc[mask] > mine ? 1 : 0))) >= 0).count() >= 0).count() >= 0
                        && (hold[0] = nx) != null).count() >= 0
                    ? (int) (1 + fixed + hold[0][tot - 1]) : 1 << 29).min().getAsInt()
                : ""
            : "");
    }
}
