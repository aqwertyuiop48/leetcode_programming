
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && Arrays.stream(w).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1 + n]) instanceof Integer k
            && Arrays.copyOfRange(t, 1, 1 + n) instanceof long[] a
            && Arrays.stream(t, 2 + n, 2 + n + k).sorted().distinct().toArray() instanceof long[] bad
            && Integer.valueOf(n / 2) instanceof Integer nL && Integer.valueOf(n - nL) instanceof Integer nR
            && new long[26] instanceof long[] fact && (fact[0] = 1) == 1
            && IntStream.range(1, 26).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0)
            && ((Function<long[], long[]>) arr -> IntStream.range(0, 1 << arr.length).mapToLong(m -> IntStream.range(0, arr.length).filter(j -> (m >> j & 1) != 0).mapToLong(j -> arr[j]).sum()).toArray()) instanceof Function<long[], long[]> ss
            && Arrays.copyOfRange(a, 0, nL) instanceof long[] aL && Arrays.copyOfRange(a, nL, n) instanceof long[] aR
            && ss.apply(aL) instanceof long[] sL && ss.apply(aR) instanceof long[] sR
            && IntStream.range(0, 1 << nL).mapToLong(m -> (sL[m] << 4 | Integer.bitCount(m)) * 2).sorted().toArray() instanceof long[] L1
            && ((LongUnaryOperator) q -> -Arrays.binarySearch(L1, q) - 1) instanceof LongUnaryOperator ins1
            && ((LongUnaryOperator) b -> IntStream.range(0, 1 << nR).mapToLong(mr -> b - sR[mr] >= 0
                ? IntStream.rangeClosed(0, nL).mapToLong(c -> (ins1.applyAsLong(2 * ((b - sR[mr]) << 4 | c) + 1) - ins1.applyAsLong(2 * ((b - sR[mr]) << 4 | c) - 1)) % 1000000007L * fact[c + Integer.bitCount(mr)] % 1000000007L * fact[n - c - Integer.bitCount(mr)] % 1000000007L).sum()
                : 0L).sum() % 1000000007L) instanceof LongUnaryOperator f1
            ? (bad.length == 0 ? fact[n]
                : bad.length == 1 ? (fact[n] - f1.applyAsLong(bad[0]) + 1000000007L) % 1000000007L
                : ((Function<long[], long[][]>) arr -> new long[3][(int) Math.round(Math.pow(3, arr.length))] instanceof long[][] r
                    && IntStream.range(0, arr.length).allMatch(i -> Integer.valueOf((int) Math.round(Math.pow(3, i))) instanceof Integer p
                        && IntStream.range(0, p).allMatch(idx -> (r[0][idx + p] = r[0][idx] + arr[i]) >= 0 && (r[1][idx + p] = r[1][idx]) >= 0 && (r[2][idx + p] = r[2][idx] + 16) >= 0
                            && (r[0][idx + 2 * p] = r[0][idx]) >= 0 && (r[1][idx + 2 * p] = r[1][idx] + arr[i]) >= 0 && (r[2][idx + 2 * p] = r[2][idx] + 1) >= 0)) ? r : null) instanceof Function<long[], long[][]> build
                && build.apply(aL) instanceof long[][] bl && build.apply(aR) instanceof long[][] br
                && Arrays.stream(sL).sorted().distinct().toArray() instanceof long[] RX
                && IntStream.range(0, bl[0].length).mapToLong(s -> (long) Arrays.binarySearch(RX, bl[0][s]) << 20 | (long) Arrays.binarySearch(RX, bl[1][s]) << 8 | bl[2][s]).sorted().toArray() instanceof long[] Lk
                && IntStream.range(0, Lk.length).filter(i -> i == 0 || Lk[i] != Lk[i - 1]).toArray() instanceof int[] St
                && IntStream.range(0, St.length).mapToLong(j -> Lk[St[j]] * 2).toArray() instanceof long[] U2
                && IntStream.range(0, St.length).mapToLong(j -> (j + 1 < St.length ? St[j + 1] : Lk.length) - St[j]).toArray() instanceof long[] Uc
                && ((LongUnaryOperator) q -> -Arrays.binarySearch(U2, q) - 1) instanceof LongUnaryOperator insU
                && Long.valueOf(bad[1] - bad[0]) instanceof Long d
                && Long.valueOf(IntStream.range(0, br[0].length).mapToLong(s -> br[0][s] <= bad[0] && br[1][s] <= d
                    && Integer.valueOf(Arrays.binarySearch(RX, bad[0] - br[0][s])) instanceof Integer r1 && r1 >= 0
                    && Integer.valueOf(Arrays.binarySearch(RX, d - br[1][s])) instanceof Integer r2 && r2 >= 0
                    && Long.valueOf(insU.applyAsLong(2L * (r1 << 20 | r2 << 8) - 1)) instanceof Long lo
                    && Long.valueOf(insU.applyAsLong(2L * (r1 << 20 | r2 << 8 | 255) + 1)) instanceof Long hi
                    ? LongStream.range(lo, hi).map(j -> Integer.valueOf((int) (U2[(int) j] >> 1 & 255)) instanceof Integer cd
                        && Integer.valueOf((cd >> 4) + ((int) br[2][s] >> 4)) instanceof Integer c1
                        && Integer.valueOf((cd & 15) + ((int) br[2][s] & 15)) instanceof Integer c2
                        ? Uc[(int) j] % 1000000007L * fact[c1] % 1000000007L * fact[c2] % 1000000007L * fact[n - c1 - c2] % 1000000007L : 0L).sum() % 1000000007L
                    : 0L).sum() % 1000000007L) instanceof Long f2
                ? ((fact[n] - f1.applyAsLong(bad[0]) - f1.applyAsLong(bad[1]) + f2) % 1000000007L + 2000000014L) % 1000000007L : "")
            : "");
    }
}



