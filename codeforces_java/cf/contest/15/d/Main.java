import java.io.*;
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
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && Integer.valueOf(g0[2]) instanceof Integer a
            && Integer.valueOf(g0[3]) instanceof Integer b
            && Arrays.copyOfRange(g0, 4, 4 + n * m) instanceof int[] g
            && new long[(n + 1) * (m + 1)] instanceof long[] pre
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j ->
                (pre[i * (m + 1) + j] = g[(i - 1) * m + j - 1] + pre[(i - 1) * (m + 1) + j] + pre[i * (m + 1) + j - 1] - pre[(i - 1) * (m + 1) + j - 1]) >= 0))
            && Integer.valueOf(Math.max(0, m - b + 1)) instanceof Integer wc
            && Integer.valueOf(Math.max(0, n - a + 1)) instanceof Integer wr
            && new int[n * m] instanceof int[] pf
            && new int[n * m] instanceof int[] sf
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j ->
                (pf[i * m + j] = j % b == 0 ? g[i * m + j] : Math.min(pf[i * m + j - 1], g[i * m + j])) >= 0))
            && IntStream.range(0, n).allMatch(i -> IntStream.iterate(m - 1, j -> j >= 0, j -> j - 1).allMatch(j ->
                (sf[i * m + j] = j % b == b - 1 || j == m - 1 ? g[i * m + j] : Math.min(sf[i * m + j + 1], g[i * m + j])) >= 0))
            && new int[n * wc] instanceof int[] rm
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (rm[i * wc + j] = Math.min(sf[i * m + j], pf[i * m + j + b - 1])) >= 0))
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (pf[i * wc + j] = i % a == 0 ? rm[i * wc + j] : Math.min(pf[(i - 1) * wc + j], rm[i * wc + j])) >= 0))
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (sf[(n - 1 - i) * wc + j] = (n - 1 - i) % a == a - 1 || i == 0 ? rm[(n - 1 - i) * wc + j] : Math.min(sf[(n - i) * wc + j], rm[(n - 1 - i) * wc + j])) >= 0))
            && IntStream.range(0, wr).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (g[i * wc + j] = Math.min(sf[i * wc + j], pf[(i + a - 1) * wc + j])) >= 0))
            && IntStream.range(0, wr).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (pre[i * wc + j] = pre[(i + a) * (m + 1) + j + b] - pre[i * (m + 1) + j + b] - pre[(i + a) * (m + 1) + j] + pre[i * (m + 1) + j] - (long) g[i * wc + j] * a * b) >= 0))
            && Integer.valueOf(wr * wc) instanceof Integer len
            && (Boolean) (64 - Long.numberOfLeadingZeros(Arrays.stream(pre, 0, len).max().orElse(0)) <= 42) instanceof Boolean direct
            && (direct ? new long[0] : Arrays.stream(pre, 0, len).sorted().toArray()) instanceof long[] sc
            && (direct ? sc : IntStream.range(0, sc.length).filter(i -> i == 0 || sc[i] != sc[i - 1]).mapToLong(i -> sc[i]).toArray()) instanceof long[] uniq
            && IntStream.range(0, len).allMatch(k ->
                direct ? (pre[k] = pre[k] << 20 | k) >= 0 : (pre[k] = (long) Arrays.binarySearch(uniq, pre[k]) << 20 | k) >= 0)
            && Arrays.stream(pre, 0, len).sorted().toArray() instanceof long[] keys
            && Integer.valueOf(wc + 2 * (b - 1)) instanceof Integer w2
            && new boolean[(wr + 2 * (a - 1)) * w2] instanceof boolean[] blocked
            && IntStream.range(0, (2 * a - 1) * (2 * b - 1)).map(q -> q / (2 * b - 1) * w2 + q % (2 * b - 1)).toArray() instanceof int[] off
            && new int[1] instanceof int[] cnt
            && Arrays.stream(keys).allMatch(key ->
                (Integer) (int) (key & 1048575) instanceof Integer k
                && (Integer) (k / wc * w2 + k % wc) instanceof Integer base
                && (blocked[base + (a - 1) * w2 + b - 1]
                    || ((keys[cnt[0]++] = key) >= 0
                        && (off.length == 1 ? (blocked[base] = true) : IntStream.range(0, off.length).allMatch(q -> blocked[base + off[q]] = true)))))
            && new StringBuilder() instanceof StringBuilder sb
            && sb.append(cnt[0]).append('\n') != null
            && IntStream.range(0, cnt[0]).allMatch(x ->
                (Integer) (int) (keys[x] & 1048575) instanceof Integer k
                && sb.append(k / wc + 1).append(' ').append(k % wc + 1).append(' ').append(direct ? keys[x] >>> 20 : uniq[(int) (keys[x] >>> 20)]).append('\n') != null)
            ? sb.toString()
            : "");
    }
}


