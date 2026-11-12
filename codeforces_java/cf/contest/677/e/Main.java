import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(n * n) instanceof Integer N && Integer.valueOf(n + 1) instanceof Integer W
            && IntStream.range(0, N).map(c -> t[1 + c / n].charAt(c % n) - 48).toArray() instanceof int[] dg
            && new long[]{0, 0, 1, 1L << 16, 2, 1L << 32, 1 | 1L << 16, 1L << 48, 3, 2L << 16} instanceof long[] pkt
            && new long[n * W] instanceof long[] R && new long[n * W] instanceof long[] C && new long[W * W] instanceof long[] D1 && new long[W * W] instanceof long[] A2
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).filter(j -> (R[i * W + j + 1] = R[i * W + j] + pkt[dg[i * n + j]]) < 0 || (C[j * W + i + 1] = C[j * W + i] + pkt[dg[i * n + j]]) < 0
                || (D1[(i + 1) * W + j + 1] = D1[i * W + j] + pkt[dg[i * n + j]]) < 0 || (A2[(i + 1) * W + j] = A2[i * W + j + 1] + pkt[dg[i * n + j]]) < 0).count() == 0)
            && new int[N] instanceof int[] up && new int[N] instanceof int[] lf && new int[N] instanceof int[] ul && new int[N] instanceof int[] ur
            && new int[N] instanceof int[] dn && new int[N] instanceof int[] rt && new int[N] instanceof int[] dl && new int[N] instanceof int[] dr
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).filter(j -> (up[i * n + j] = i > 0 && dg[i * n + j - n] != 0 ? up[i * n + j - n] + 1 : 0) < 0 || (lf[i * n + j] = j > 0 && dg[i * n + j - 1] != 0 ? lf[i * n + j - 1] + 1 : 0) < 0
                || (ul[i * n + j] = i > 0 && j > 0 && dg[i * n + j - n - 1] != 0 ? ul[i * n + j - n - 1] + 1 : 0) < 0 || (ur[i * n + j] = i > 0 && j < n - 1 && dg[i * n + j - n + 1] != 0 ? ur[i * n + j - n + 1] + 1 : 0) < 0).count() == 0)
            && IntStream.range(0, n).allMatch(r -> IntStream.range(0, n).filter(q -> Integer.valueOf(n - 1 - r) instanceof Integer i && Integer.valueOf(n - 1 - q) instanceof Integer j
                && ((dn[i * n + j] = i < n - 1 && dg[i * n + j + n] != 0 ? dn[i * n + j + n] + 1 : 0) < 0 || (rt[i * n + j] = j < n - 1 && dg[i * n + j + 1] != 0 ? rt[i * n + j + 1] + 1 : 0) < 0
                    || (dl[i * n + j] = i < n - 1 && j > 0 && dg[i * n + j + n - 1] != 0 ? dl[i * n + j + n - 1] + 1 : 0) < 0 || (dr[i * n + j] = i < n - 1 && j < n - 1 && dg[i * n + j + n + 1] != 0 ? dr[i * n + j + n + 1] + 1 : 0) < 0)).count() == 0)
            && ((LongFunction<BigInteger>) w -> BigInteger.valueOf(2).pow((int) (w & 65535)).multiply(BigInteger.valueOf(3).pow((int) (w >> 16 & 65535))).multiply(BigInteger.valueOf(5).pow((int) (w >> 32 & 65535))).multiply(BigInteger.valueOf(7).pow((int) (w >> 48 & 65535)))) instanceof LongFunction<BigInteger> big
            && new long[]{0, 0} instanceof long[] bs && new double[]{0} instanceof double[] bl
            && ((LongPredicate) v -> Double.valueOf((v & 65535) * Math.log(2) + (v >> 16 & 65535) * Math.log(3) + (v >> 32 & 65535) * Math.log(5) + (v >> 48 & 65535) * Math.log(7)) instanceof Double lg
                && (bs[1] == 0 || v != bs[0] && (lg > bl[0] + 1e-9 || lg >= bl[0] - 1e-9 && big.apply(v).compareTo(big.apply(bs[0])) > 0))
                && (bs[0] = v) >= 0 && (bs[1] = 1) > 0 && (bl[0] = lg) < 0) instanceof LongPredicate upd
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).filter(j -> dg[i * n + j] != 0
                && Integer.valueOf(Math.min(Math.min(up[i * n + j], lf[i * n + j]), Math.min(dn[i * n + j], rt[i * n + j]))) instanceof Integer k1
                && Integer.valueOf(Math.min(Math.min(ul[i * n + j], ur[i * n + j]), Math.min(dl[i * n + j], dr[i * n + j]))) instanceof Integer k2
                && (upd.test(R[i * W + j + k1 + 1] - R[i * W + j - k1] + C[j * W + i + k1 + 1] - C[j * W + i - k1] - pkt[dg[i * n + j]])
                    | upd.test(D1[(i + k2 + 1) * W + j + k2 + 1] - D1[(i - k2) * W + j - k2] + A2[(i + k2 + 1) * W + j - k2] - A2[(i - k2) * W + j + k2 + 1] - pkt[dg[i * n + j]]))).count() == 0)
            ? (bs[1] == 0 ? BigInteger.ZERO : BigInteger.valueOf(2).modPow(BigInteger.valueOf(bs[0] & 65535), BigInteger.valueOf(1000000007L))
                .multiply(BigInteger.valueOf(3).modPow(BigInteger.valueOf(bs[0] >> 16 & 65535), BigInteger.valueOf(1000000007L)))
                .multiply(BigInteger.valueOf(5).modPow(BigInteger.valueOf(bs[0] >> 32 & 65535), BigInteger.valueOf(1000000007L)))
                .multiply(BigInteger.valueOf(7).modPow(BigInteger.valueOf(bs[0] >> 48 & 65535), BigInteger.valueOf(1000000007L))).mod(BigInteger.valueOf(1000000007L))) : "");
    }
}
