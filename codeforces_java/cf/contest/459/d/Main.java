import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> (long) g[1 + i] << 20 | i).sorted().toArray() instanceof long[] ks
            && new int[n] instanceof int[] lc
            && new int[n] instanceof int[] rc
            && new int[2] instanceof int[] gs
            && IntStream.range(0, n).allMatch(q ->
                (q == 0 || ks[q] >> 20 != ks[q - 1] >> 20 ? (gs[0] = q) >= 0 : true)
                && (lc[(int) (ks[q] & 1048575)] = q - gs[0] + 1) > 0)
            && IntStream.range(0, n).map(q -> n - 1 - q).allMatch(q ->
                (q == n - 1 || ks[q] >> 20 != ks[q + 1] >> 20 ? (gs[1] = q) >= 0 : true)
                && (rc[(int) (ks[q] & 1048575)] = gs[1] - q + 1) > 0)
            && new int[(1 << 21) + 2] instanceof int[] bit
            && new long[1] instanceof long[] ans
            && IntStream.range(0, n).allMatch(j ->
                (Integer) rc[j] instanceof Integer r
                && (Integer) (lc[j] - 1) instanceof Integer y
                && (ans[0] += j - (bit[r >> 0 << 0] * (r >> 0 & 1) + bit[r >> 1 << 1] * (r >> 1 & 1) + bit[r >> 2 << 2] * (r >> 2 & 1) + bit[r >> 3 << 3] * (r >> 3 & 1) + bit[r >> 4 << 4] * (r >> 4 & 1) + bit[r >> 5 << 5] * (r >> 5 & 1) + bit[r >> 6 << 6] * (r >> 6 & 1) + bit[r >> 7 << 7] * (r >> 7 & 1) + bit[r >> 8 << 8] * (r >> 8 & 1) + bit[r >> 9 << 9] * (r >> 9 & 1) + bit[r >> 10 << 10] * (r >> 10 & 1) + bit[r >> 11 << 11] * (r >> 11 & 1) + bit[r >> 12 << 12] * (r >> 12 & 1) + bit[r >> 13 << 13] * (r >> 13 & 1) + bit[r >> 14 << 14] * (r >> 14 & 1) + bit[r >> 15 << 15] * (r >> 15 & 1) + bit[r >> 16 << 16] * (r >> 16 & 1) + bit[r >> 17 << 17] * (r >> 17 & 1) + bit[r >> 18 << 18] * (r >> 18 & 1) + bit[r >> 19 << 19] * (r >> 19 & 1))) >= 0
                && (bit[(y >> 0) + 1 << 0] += 1 - (y >> 0 & 1)) >= 0
                && (bit[(y >> 1) + 1 << 1] += 1 - (y >> 1 & 1)) >= 0
                && (bit[(y >> 2) + 1 << 2] += 1 - (y >> 2 & 1)) >= 0
                && (bit[(y >> 3) + 1 << 3] += 1 - (y >> 3 & 1)) >= 0
                && (bit[(y >> 4) + 1 << 4] += 1 - (y >> 4 & 1)) >= 0
                && (bit[(y >> 5) + 1 << 5] += 1 - (y >> 5 & 1)) >= 0
                && (bit[(y >> 6) + 1 << 6] += 1 - (y >> 6 & 1)) >= 0
                && (bit[(y >> 7) + 1 << 7] += 1 - (y >> 7 & 1)) >= 0
                && (bit[(y >> 8) + 1 << 8] += 1 - (y >> 8 & 1)) >= 0
                && (bit[(y >> 9) + 1 << 9] += 1 - (y >> 9 & 1)) >= 0
                && (bit[(y >> 10) + 1 << 10] += 1 - (y >> 10 & 1)) >= 0
                && (bit[(y >> 11) + 1 << 11] += 1 - (y >> 11 & 1)) >= 0
                && (bit[(y >> 12) + 1 << 12] += 1 - (y >> 12 & 1)) >= 0
                && (bit[(y >> 13) + 1 << 13] += 1 - (y >> 13 & 1)) >= 0
                && (bit[(y >> 14) + 1 << 14] += 1 - (y >> 14 & 1)) >= 0
                && (bit[(y >> 15) + 1 << 15] += 1 - (y >> 15 & 1)) >= 0
                && (bit[(y >> 16) + 1 << 16] += 1 - (y >> 16 & 1)) >= 0
                && (bit[(y >> 17) + 1 << 17] += 1 - (y >> 17 & 1)) >= 0
                && (bit[(y >> 18) + 1 << 18] += 1 - (y >> 18 & 1)) >= 0
                && (bit[(y >> 19) + 1 << 19] += 1 - (y >> 19 & 1)) >= 0
                && (bit[(y >> 20) + 1 << 20] += 1 - (y >> 20 & 1)) >= 0)
            ? String.valueOf(ans[0])
            : "");
    }
}
