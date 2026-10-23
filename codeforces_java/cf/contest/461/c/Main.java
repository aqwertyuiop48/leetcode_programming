import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer q
            && new int[(1 << 19) + 2] instanceof int[] bit
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] val
            && ((IntBinaryOperator) (x, d) ->
                (Integer) (x - 1) instanceof Integer y
                && (bit[(y >> 0) + 1 << 0] += d * (1 - (y >> 0 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 1) + 1 << 1] += d * (1 - (y >> 1 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 2) + 1 << 2] += d * (1 - (y >> 2 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 3) + 1 << 3] += d * (1 - (y >> 3 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 4) + 1 << 4] += d * (1 - (y >> 4 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 5) + 1 << 5] += d * (1 - (y >> 5 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 6) + 1 << 6] += d * (1 - (y >> 6 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 7) + 1 << 7] += d * (1 - (y >> 7 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 8) + 1 << 8] += d * (1 - (y >> 8 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 9) + 1 << 9] += d * (1 - (y >> 9 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 10) + 1 << 10] += d * (1 - (y >> 10 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 11) + 1 << 11] += d * (1 - (y >> 11 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 12) + 1 << 12] += d * (1 - (y >> 12 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 13) + 1 << 13] += d * (1 - (y >> 13 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 14) + 1 << 14] += d * (1 - (y >> 14 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 15) + 1 << 15] += d * (1 - (y >> 15 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 16) + 1 << 16] += d * (1 - (y >> 16 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 17) + 1 << 17] += d * (1 - (y >> 17 & 1))) != Integer.MIN_VALUE
                && (bit[(y >> 18) + 1 << 18] += d * (1 - (y >> 18 & 1))) != Integer.MIN_VALUE
                ? 0 : 1) instanceof IntBinaryOperator upd
            && ((IntUnaryOperator) r -> bit[r >> 0 << 0] * (r >> 0 & 1) + bit[r >> 1 << 1] * (r >> 1 & 1) + bit[r >> 2 << 2] * (r >> 2 & 1) + bit[r >> 3 << 3] * (r >> 3 & 1) + bit[r >> 4 << 4] * (r >> 4 & 1) + bit[r >> 5 << 5] * (r >> 5 & 1) + bit[r >> 6 << 6] * (r >> 6 & 1) + bit[r >> 7 << 7] * (r >> 7 & 1) + bit[r >> 8 << 8] * (r >> 8 & 1) + bit[r >> 9 << 9] * (r >> 9 & 1) + bit[r >> 10 << 10] * (r >> 10 & 1) + bit[r >> 11 << 11] * (r >> 11 & 1) + bit[r >> 12 << 12] * (r >> 12 & 1) + bit[r >> 13 << 13] * (r >> 13 & 1) + bit[r >> 14 << 14] * (r >> 14 & 1) + bit[r >> 15 << 15] * (r >> 15 & 1) + bit[r >> 16 << 16] * (r >> 16 & 1) + bit[r >> 17 << 17] * (r >> 17 & 1)) instanceof IntUnaryOperator qry
            && IntStream.range(0, n).allMatch(i -> upd.applyAsInt(i + 1, 1) == 0)
            && new int[]{0, n, 0, 2} instanceof int[] s
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(z ->
                g[s[3]] == 1
                    ? (Integer) g[s[3] + 1] instanceof Integer p
                    && (Integer) (s[1] - s[0]) instanceof Integer w
                    && (s[3] += 2) > 0
                    && (p <= w - p
                        ? IntStream.range(0, p).allMatch(i ->
                            (Integer) (s[2] == 0 ? s[0] + p - 1 - i : s[1] - p + i) instanceof Integer a
                            && (Integer) (s[2] == 0 ? s[0] + p + i : s[1] - 1 - p - i) instanceof Integer b
                            && (val[b] += val[a]) > 0
                            && upd.applyAsInt(b + 1, val[a]) == 0)
                        && ((s[2] == 0 ? (s[0] += p) : (s[1] -= p)) >= 0)
                        : IntStream.range(0, w - p).allMatch(i ->
                            (Integer) (s[2] == 0 ? s[0] + p + i : s[1] - 1 - p - i) instanceof Integer a
                            && (Integer) (s[2] == 0 ? s[0] + p - 1 - i : s[1] - p + i) instanceof Integer b
                            && (val[b] += val[a]) > 0
                            && upd.applyAsInt(b + 1, val[a]) == 0)
                        && ((s[2] == 0 ? (s[1] = s[0] + p) : (s[0] = s[1] - p)) >= 0)
                        && (s[2] ^= 1) >= 0)
                    : (Integer) g[s[3] + 1] instanceof Integer l
                    && (Integer) g[s[3] + 2] instanceof Integer r2
                    && (s[3] += 3) > 0
                    && sb.append(s[2] == 0
                        ? qry.applyAsInt(s[0] + r2) - qry.applyAsInt(s[0] + l)
                        : qry.applyAsInt(s[1] - l) - qry.applyAsInt(s[1] - r2)).append((char) 10) != null)
            ? sb.toString()
            : "");
    }
}
