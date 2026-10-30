import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean fl
            && (fl ? new java.io.FileInputStream("input.txt") : System.in) instanceof java.io.InputStream inp
            && (fl ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && new java.io.BufferedReader(new java.io.InputStreamReader(inp)).lines().toList() instanceof List<String> ls
            && new StringTokenizer(ls.get(0)) instanceof StringTokenizer h0 && Integer.valueOf(h0.nextToken()) instanceof Integer n && Integer.valueOf(h0.nextToken()) instanceof Integer m
            && ls.get(1).trim() instanceof String s
            && new int[n + 2] instanceof int[] endAt && new int[n + 2] instanceof int[] letAt
            && new long[(n >> 6) + 2] instanceof long[] w0 && new long[(n >> 12) + 2] instanceof long[] w1 && new long[1] instanceof long[] w2
            && ((IntUnaryOperator) p -> (w0[p >> 6] |= 1L << (p & 63)) != 0 && (w1[p >> 12] |= 1L << ((p >> 6) & 63)) != 0 && (w2[0] |= 1L << (p >> 12)) != 0 ? 0 : 1) instanceof IntUnaryOperator setb
            && ((IntUnaryOperator) p -> (w0[p >> 6] &= ~(1L << (p & 63))) != 0 || (w1[p >> 12] &= ~(1L << ((p >> 6) & 63))) != 0 || (w2[0] &= ~(1L << (p >> 12))) == 0 || true ? 0 : 1) instanceof IntUnaryOperator clr
            && ((IntUnaryOperator) p -> Integer.valueOf(p >> 6) instanceof Integer i && Long.valueOf(w0[i] & (-1L >>> (63 - (p & 63)))) instanceof Long mm
                ? mm != 0 ? (i << 6) + 63 - Long.numberOfLeadingZeros(mm)
                    : Long.valueOf(w1[i >> 6] & ((1L << (i & 63)) - 1)) instanceof Long m1 && m1 != 0
                        ? Integer.valueOf((i >> 6 << 6) + 63 - Long.numberOfLeadingZeros(m1)) instanceof Integer wi ? (wi << 6) + 63 - Long.numberOfLeadingZeros(w0[wi]) : -1
                        : Integer.valueOf(63 - Long.numberOfLeadingZeros(w2[0] & ((1L << (i >> 6)) - 1))) instanceof Integer jj
                            && Integer.valueOf((jj << 6) + 63 - Long.numberOfLeadingZeros(w1[jj])) instanceof Integer wi2 ? (wi2 << 6) + 63 - Long.numberOfLeadingZeros(w0[wi2]) : -1
                : -1) instanceof IntUnaryOperator pred
            && ((IntUnaryOperator) p -> p >= n || (w0[p >> 6] >> (p & 63) & 1) == 1
                || Integer.valueOf(pred.applyAsInt(p)) instanceof Integer sp && (endAt[p] = endAt[sp]) >= 0 && (letAt[p] = letAt[sp]) >= 0 && (endAt[sp] = p - 1) >= 0 && setb.applyAsInt(p) == 0 ? 0 : 1) instanceof IntUnaryOperator split
            && new int[2] instanceof int[] cur
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (cur[0] = i == n - 1 || s.charAt(i + 1) != s.charAt(i) ? i : cur[0]) >= 0
                && (i != 0 && s.charAt(i - 1) == s.charAt(i) || (endAt[i] = cur[0]) >= 0 && (letAt[i] = s.charAt(i) - 'a') >= 0 && setb.applyAsInt(i) == 0))
            && new int[26] instanceof int[] cnt && new int[2] instanceof int[] pp
            && IntStream.range(0, m).allMatch(qi -> new StringTokenizer(ls.get(2 + qi)) instanceof StringTokenizer st && Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer l && Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer r
                && split.applyAsInt(l) == 0 && split.applyAsInt(r + 1) == 0
                && IntStream.range(0, 26).allMatch(c -> (cnt[c] = 0) == 0) && (pp[1] = 0) == 0
                && IntStream.iterate(l, c -> c <= r, c -> endAt[c] + 1).allMatch(c -> (cnt[letAt[c]] += endAt[c] - c + 1) > 0 && (pp[1] ^= (endAt[c] - c + 1 & 1) << letAt[c]) >= 0)
                && (Integer.bitCount(pp[1]) > 1
                    || IntStream.iterate(l, c -> c <= r, c -> endAt[c] + 1).allMatch(c -> clr.applyAsInt(c) == 0) && (pp[0] = l) >= 0
                    && IntStream.range(0, 78).allMatch(t -> Integer.valueOf(t % 26) instanceof Integer c0 && Integer.valueOf(t / 26 == 2 ? 25 - c0 : c0) instanceof Integer c
                        && Integer.valueOf(t / 26 == 1 ? cnt[c] & 1 : cnt[c] / 2) instanceof Integer len
                        && (len == 0 || (endAt[pp[0]] = pp[0] + len - 1) >= 0 && (letAt[pp[0]] = c) >= 0 && setb.applyAsInt(pp[0]) == 0 && (pp[0] += len) > 0))))
            && out.append(IntStream.iterate(0, c -> c < n, c -> endAt[c] + 1).mapToObj(c -> String.valueOf((char) ('a' + letAt[c])).repeat(endAt[c] - c + 1)).collect(Collectors.joining()) + "\n").checkError());
    }
}
