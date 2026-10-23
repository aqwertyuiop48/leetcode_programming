import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && IntStream.range(0, n).boxed().sorted((x, y) -> tk[1 + y] - tk[1 + x]).mapToInt(x -> x).toArray() instanceof int[] idx
            && (Integer) Math.min(n, 16) instanceof Integer k
            && new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29} instanceof int[] sp
            && new int[] {31, 37, 41, 43, 47, 53, 0} instanceof int[] bigp
            && new int[64] instanceof int[] pm
            && IntStream.range(0, 64).allMatch(b ->
                (pm[b] = b == 0 || b > 58 && b < 63 || b > 30 && IntStream.of(31, 37, 41, 43, 47, 53).anyMatch(x -> x == b) ? -1
                    : b == 63 ? 0 : IntStream.range(0, 10).map(i -> b % sp[i] == 0 ? 1 << i : 0).sum()) > -2)
            && new int[(k + 1) * 8192] instanceof int[] dp
            && new byte[(k + 1) * 8192] instanceof byte[] ch
            && IntStream.range(0, dp.length).allMatch(q -> (dp[q] = 1 << 29) > 0)
            && (dp[0] = 0) == 0
            && IntStream.range(0, k).allMatch(j ->
                (Integer) tk[1 + idx[j]] instanceof Integer av
                && IntStream.range(0, 7168 * 64).allMatch(q ->
                    pm[q & 63] < 0 || (pm[q & 63] & ((q >> 6) & 1023)) != 0 || (q & 63) == 63 && (q >> 6) >= 6144 || dp[j * 8192 + (q >> 6)] >= 1 << 29
                    || dp[j * 8192 + (q >> 6)] + ((q & 63) == 63 ? bigp[q >> 16] - av : Math.abs(av - (q & 63)))
                        >= dp[(j + 1) * 8192 + (q >> 6) + ((q & 63) == 63 ? 1024 : pm[q & 63])]
                    || ((dp[(j + 1) * 8192 + (q >> 6) + ((q & 63) == 63 ? 1024 : pm[q & 63])]
                        = dp[j * 8192 + (q >> 6)] + ((q & 63) == 63 ? bigp[q >> 16] - av : Math.abs(av - (q & 63)))) >= 0
                        && (ch[(j + 1) * 8192 + (q >> 6) + ((q & 63) == 63 ? 1024 : pm[q & 63])] = (byte) (q & 63)) > 0)))
            && IntStream.range(0, 7168).boxed().min(Comparator.comparingInt(sidx -> dp[k * 8192 + sidx])).get() instanceof Integer best
            && new int[n] instanceof int[] res
            && IntStream.range(0, n).allMatch(i -> (res[i] = 1) > 0)
            && new int[1] instanceof int[] cur
            && (cur[0] = best) >= 0
            && IntStream.range(0, k).allMatch(z ->
                (Integer) (int) ch[(k - z) * 8192 + cur[0]] instanceof Integer cc
                && (res[idx[k - 1 - z]] = cc == 63 ? bigp[(cur[0] >> 10) - 1] : cc) > 0
                && (cur[0] -= cc == 63 ? 1024 : pm[cc]) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining(" ")) : "");
    }
}
