import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new int[n] instanceof int[] ox && new int[n] instanceof int[] oy
            && IntStream.range(0, n).filter(i -> (ox[i] = Integer.parseInt(tk.nextToken())) > 1000000000
                || (oy[i] = Integer.parseInt(tk.nextToken())) > 1000000000).count() >= 0
            && IntStream.range(0, n).mapToLong(i -> ((long) (ox[i] + 100000000) << 17) | i).sorted().toArray() instanceof long[] k0
            && new int[2][n] instanceof int[][] X && new int[2][n] instanceof int[][] Y && new long[2][n] instanceof long[][] K
            && IntStream.range(0, n).filter(i -> (X[0][i] = (int) ((k0[i] >> 17) - 100000000)) > 1000000000
                || (Y[0][i] = oy[(int) (k0[i] & 131071)]) > 1000000000).count() >= 0
            && IntStream.range(0, n).filter(i -> (X[1][i] = -X[0][n - 1 - i]) > 1000000000 || (Y[1][i] = Y[0][n - 1 - i]) > 1000000000).count() >= 0
            && IntStream.range(0, 2 * n).filter(t -> (K[t / n][t % n] = ((long) (X[t / n][t % n] + 100000000) << 17) | (t % n)) < 0).count() >= 0
            && new int[2][n] instanceof int[][] e1
            && IntStream.range(0, 2 * n).filter(t -> Integer.valueOf(Arrays.binarySearch(K[t / n], (long) (-X[t / n][t % n] + 100000001) << 17)) instanceof Integer bs
                && (e1[t / n][t % n] = bs >= 0 ? bs : -bs - 1) < 0).count() >= 0
            && new int[2][n + 1] instanceof int[][] pmn && new int[2][n + 1] instanceof int[][] pmx
            && new int[2][n + 1] instanceof int[][] smn && new int[2][n + 1] instanceof int[][] smx
            && (pmn[0][0] = pmn[1][0] = smn[0][n] = smn[1][n] = Integer.MAX_VALUE) > 0
            && (pmx[0][0] = pmx[1][0] = smx[0][n] = smx[1][n] = Integer.MIN_VALUE) < 0
            && IntStream.range(0, 2 * n).filter(t -> (pmn[t / n][t % n + 1] = Math.min(pmn[t / n][t % n], Y[t / n][t % n])) < -1000000000
                || (pmx[t / n][t % n + 1] = Math.max(pmx[t / n][t % n], Y[t / n][t % n])) > 1000000000).count() >= 0
            && IntStream.range(0, 2 * n).filter(t -> (smn[t / n][n - 1 - t % n] = Math.min(smn[t / n][n - t % n], Y[t / n][n - 1 - t % n])) < -1000000000
                || (smx[t / n][n - 1 - t % n] = Math.max(smx[t / n][n - t % n], Y[t / n][n - 1 - t % n])) > 1000000000).count() >= 0
            && ((LongPredicate) (D -> Long.valueOf((long) Math.sqrt(D)) instanceof Long s0
                && Long.valueOf(s0 * s0 > D ? s0 - 1 : s0) instanceof Long s1
                && Long.valueOf((s1 + 1) * (s1 + 1) <= D ? s1 + 1 : s1) instanceof Long s
                && ((long) (pmx[0][n] - pmn[0][n]) * (pmx[0][n] - pmn[0][n]) <= D
                    || IntStream.range(0, 2).anyMatch(o -> IntStream.range(0, n).anyMatch(l -> X[o][l] <= 0
                            && Integer.valueOf(Arrays.binarySearch(K[o], (X[o][l] + s + 100000001) << 17)) instanceof Integer bs2
                            && Integer.valueOf(Math.min(e1[o][l], bs2 >= 0 ? bs2 : -bs2 - 1)) instanceof Integer re
                            && Integer.valueOf(Math.min(pmn[o][l], smn[o][re])) instanceof Integer mn
                            && Integer.valueOf(Math.max(pmx[o][l], smx[o][re])) instanceof Integer mx
                            && (mn == Integer.MAX_VALUE || (long) (mx - mn) * (mx - mn) <= D
                                && (long) X[o][l] * X[o][l] + Math.max((long) mx * mx, (long) mn * mn) <= D)))))) instanceof LongPredicate ck
            && new long[]{0, Math.min((long) (X[0][n - 1] - X[0][0]) * (X[0][n - 1] - X[0][0]), (long) (pmx[0][n] - pmn[0][n]) * (pmx[0][n] - pmn[0][n]))} instanceof long[] bsr
            && IntStream.range(0, 60).filter(it -> Long.valueOf((bsr[0] + bsr[1]) / 2) instanceof Long mid
                && (ck.test(mid) ? (bsr[1] = mid) < 0 : (bsr[0] = mid + 1) < 0)).count() >= 0
            ? bsr[0] : "");
    }
}
