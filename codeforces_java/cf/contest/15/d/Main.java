import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new BufferedReader(new InputStreamReader(System.in), 1 << 16) instanceof BufferedReader br
            && br.lines().iterator() instanceof Iterator<String> it
            && Arrays.stream(it.next().trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] d
            && Integer.valueOf(d[0]) instanceof Integer n
            && Integer.valueOf(d[1]) instanceof Integer m
            && Integer.valueOf(d[2]) instanceof Integer a
            && Integer.valueOf(d[3]) instanceof Integer b
            && new int[n * m] instanceof int[] g
            && new int[3] instanceof int[] ps
            && ((BooleanSupplier) () -> ps[2] == 0 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0 && (ps[2] = 0) == 0)) instanceof BooleanSupplier flush
            && Stream.iterate(0, x -> ps[1] < n * m && it.hasNext(), x -> x + 1).allMatch(x ->
                it.next().chars().allMatch(ch -> ch >= '0' && ch <= '9' ? (ps[0] = ps[0] * 10 + ch - '0') >= 0 && (ps[2] = 1) > 0 : flush.getAsBoolean())
                && flush.getAsBoolean())
            && new long[(n + 1) * (m + 1)] instanceof long[] pre
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j ->
                (pre[i * (m + 1) + j] = g[(i - 1) * m + j - 1] + pre[(i - 1) * (m + 1) + j] + pre[i * (m + 1) + j - 1] - pre[(i - 1) * (m + 1) + j - 1]) >= 0))
            && Integer.valueOf(Math.max(0, m - b + 1)) instanceof Integer wc
            && Integer.valueOf(Math.max(0, n - a + 1)) instanceof Integer wr
            && new int[n * m] instanceof int[] pf
            && new int[n * m] instanceof int[] sf
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j ->
                (pf[i * m + j] = j % b == 0 ? g[i * m + j] : Math.min(pf[i * m + j - 1], g[i * m + j])) > 0))
            && IntStream.range(0, n).allMatch(i -> IntStream.iterate(m - 1, j -> j >= 0, j -> j - 1).allMatch(j ->
                (sf[i * m + j] = j % b == b - 1 || j == m - 1 ? g[i * m + j] : Math.min(sf[i * m + j + 1], g[i * m + j])) > 0))
            && new int[n * wc] instanceof int[] rm
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (rm[i * wc + j] = Math.min(sf[i * m + j], pf[i * m + j + b - 1])) > 0))
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (pf[i * wc + j] = i % a == 0 ? rm[i * wc + j] : Math.min(pf[(i - 1) * wc + j], rm[i * wc + j])) > 0))
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (sf[(n - 1 - i) * wc + j] = (n - 1 - i) % a == a - 1 || i == 0 ? rm[(n - 1 - i) * wc + j] : Math.min(sf[(n - i) * wc + j], rm[(n - 1 - i) * wc + j])) > 0))
            && IntStream.range(0, wr).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (g[i * wc + j] = Math.min(sf[i * wc + j], pf[(i + a - 1) * wc + j])) > 0))
            && IntStream.range(0, wr).allMatch(i -> IntStream.range(0, wc).allMatch(j ->
                (pre[i * wc + j] = pre[(i + a) * (m + 1) + j + b] - pre[i * (m + 1) + j + b] - pre[(i + a) * (m + 1) + j] + pre[i * (m + 1) + j] - (long) g[i * wc + j] * a * b) >= 0))
            && Integer.valueOf(wr * wc) instanceof Integer len
            && (Boolean) (64 - Long.numberOfLeadingZeros(Arrays.stream(pre, 0, len).max().orElse(0)) <= 42) instanceof Boolean direct
            && (direct ? new long[0] : Arrays.stream(pre, 0, len).sorted().distinct().toArray()) instanceof long[] uniq
            && IntStream.range(0, len).allMatch(k ->
                direct ? (pre[k] = pre[k] << 20 | k) >= 0 : (pre[k] = (long) Arrays.binarySearch(uniq, pre[k]) << 20 | k) >= 0)
            && Arrays.stream(pre, 0, len).sorted().toArray() instanceof long[] keys
            && new boolean[len] instanceof boolean[] blocked
            && new int[1] instanceof int[] cnt
            && Arrays.stream(keys).allMatch(key ->
                (Integer) (int) (key & 1048575) instanceof Integer k
                && (blocked[k]
                    || ((keys[cnt[0]++] = key) >= 0
                        && (Integer) (k / wc) instanceof Integer r
                        && (Integer) (k % wc) instanceof Integer c
                        && IntStream.rangeClosed(Math.max(0, r - a + 1), Math.min(wr - 1, r + a - 1)).allMatch(i ->
                            IntStream.rangeClosed(Math.max(0, c - b + 1), Math.min(wc - 1, c + b - 1)).allMatch(j -> (blocked[i * wc + j] = true))))))
            && new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out), 1 << 16), false) instanceof PrintStream out
            && out.append(cnt[0] + "\n") != null
            && IntStream.range(0, cnt[0]).allMatch(x ->
                out.append(((int) (keys[x] & 1048575) / wc + 1) + " " + ((int) (keys[x] & 1048575) % wc + 1) + " " + (direct ? keys[x] >>> 20 : uniq[(int) (keys[x] >>> 20)]) + "\n") != null)
            && !out.checkError()
            ? ""
            : "");
    }
}
