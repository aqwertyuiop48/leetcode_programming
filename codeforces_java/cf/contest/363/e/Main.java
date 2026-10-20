import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Integer.valueOf((int) it.nextLong()) instanceof Integer r
            ? n - 2 * r < 1 || m - 2 * r < 1 ? "0 0"
            : IntStream.range(0, n * m).mapToLong(i -> it.nextLong()).toArray() instanceof long[] v && new long[n * (m + 1)] instanceof long[] rp
            && IntStream.range(0, n * m).allMatch(x -> (rp[x / m * (m + 1) + x % m + 1] = rp[x / m * (m + 1) + x % m] + v[x]) != Long.MIN_VALUE)
            && IntStream.rangeClosed(0, r).map(t -> (int) Math.sqrt(r * r - t * t)).toArray() instanceof int[] h
            && IntStream.rangeClosed(0, 2 * r).map(dy -> IntStream.rangeClosed(dy - r, r).map(t -> h[Math.abs(t)] + h[Math.abs(t - dy)]).max().getAsInt()).toArray() instanceof int[] W
            && new long[n * m] instanceof long[] S
            && IntStream.rangeClosed(r, n - 1 - r).allMatch(i -> IntStream.rangeClosed(r, m - 1 - r).allMatch(j -> (S[i * m + j] = IntStream.rangeClosed(-r, r).mapToLong(t -> rp[(i + t) * (m + 1) + j + h[Math.abs(t)] + 1] - rp[(i + t) * (m + 1) + j - h[Math.abs(t)]]).sum()) != Long.MIN_VALUE))
            && new long[n * m] instanceof long[] PMv && new long[n * m] instanceof long[] PMc && new long[n * m] instanceof long[] SMv && new long[n * m] instanceof long[] SMc
            && new long[]{Long.MIN_VALUE, 0} instanceof long[] acc
            && ((LongBinaryOperator) (x, c) -> c == 0 ? 0L : x > acc[0] ? (acc[1] = c) * 0 + (acc[0] = x) * 0 : x == acc[0] ? (acc[1] += c) * 0 : 0L) instanceof LongBinaryOperator mg
            && IntStream.range(0, n).allMatch(i -> (acc[0] = Long.MIN_VALUE) != 0 & (acc[1] = 0) == 0
                && IntStream.range(0, m).allMatch(j -> (i < r || i > n - 1 - r || j < r || j > m - 1 - r || mg.applyAsLong(S[i * m + j], 1) == 0) && (PMv[i * m + j] = acc[0]) != 7 & (PMc[i * m + j] = (long) acc[1]) >= 0)
                && (acc[0] = Long.MIN_VALUE) != 0 & (acc[1] = 0) == 0
                && IntStream.range(0, m).map(jj -> m - 1 - jj).allMatch(j -> (i < r || i > n - 1 - r || j < r || j > m - 1 - r || mg.applyAsLong(S[i * m + j], 1) == 0) && (SMv[i * m + j] = acc[0]) != 7 & (SMc[i * m + j] = acc[1]) >= 0))
            && new long[n] instanceof long[] RPv && new long[n] instanceof long[] RPc && new long[n] instanceof long[] RSv && new long[n] instanceof long[] RSc
            && (acc[0] = Long.MIN_VALUE) != 0 & (acc[1] = 0) == 0
            && IntStream.range(0, n).allMatch(i -> mg.applyAsLong(PMv[i * m + m - 1], PMc[i * m + m - 1]) == 0 && (RPv[i] = acc[0]) != 7 & (RPc[i] = acc[1]) >= 0)
            && (acc[0] = Long.MIN_VALUE) != 0 & (acc[1] = 0) == 0
            && IntStream.range(0, n).map(ii -> n - 1 - ii).allMatch(i -> mg.applyAsLong(PMv[i * m + m - 1], PMc[i * m + m - 1]) == 0 && (RSv[i] = acc[0]) != 7 & (RSc[i] = acc[1]) >= 0)
            && new long[]{-1, 0} instanceof long[] g
            && IntStream.rangeClosed(r, n - 1 - r).allMatch(i -> IntStream.rangeClosed(r, m - 1 - r).allMatch(j -> (acc[0] = Long.MIN_VALUE) != 0 & (acc[1] = 0) == 0
                && IntStream.rangeClosed(Math.max(r, i - 2 * r), Math.min(n - 1 - r, i + 2 * r)).allMatch(i2 -> Integer.valueOf(W[Math.abs(i2 - i)]) instanceof Integer w
                    && (j - w - 1 < 0 || mg.applyAsLong(PMv[i2 * m + j - w - 1], PMc[i2 * m + j - w - 1]) == 0) && (j + w + 1 > m - 1 || mg.applyAsLong(SMv[i2 * m + j + w + 1], SMc[i2 * m + j + w + 1]) == 0))
                && (i - 2 * r - 1 < 0 || mg.applyAsLong(RPv[i - 2 * r - 1], RPc[i - 2 * r - 1]) == 0) && (i + 2 * r + 1 > n - 1 || mg.applyAsLong(RSv[i + 2 * r + 1], RSc[i + 2 * r + 1]) == 0)
                && (acc[1] == 0 || (S[i * m + j] + acc[0] > g[0] ? (g[0] = S[i * m + j] + acc[0]) != 0 & (g[1] = acc[1]) != 0 : S[i * m + j] + acc[0] == g[0] ? (g[1] += acc[1]) != 0 : true))))
            ? g[0] < 0 ? "0 0" : g[0] + " " + g[1] / 2 : "" : "");
    }
}
