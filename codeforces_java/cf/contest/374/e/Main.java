import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(1 << 22) instanceof Integer OFF
            && IntStream.range(0, n).mapToLong(i -> Long.valueOf(Integer.parseInt(t[2 + 2 * i]) + Integer.parseInt(t[3 + 2 * i]) + OFF) << 24 | (Integer.parseInt(t[2 + 2 * i]) - Integer.parseInt(t[3 + 2 * i]) + OFF)).sorted().toArray() instanceof long[] ka
            && IntStream.range(0, m).mapToLong(i -> Long.valueOf(Integer.parseInt(t[2 + 2 * n + 2 * i]) - Integer.parseInt(t[3 + 2 * n + 2 * i]) + OFF) << 24 | (Integer.parseInt(t[2 + 2 * n + 2 * i]) + Integer.parseInt(t[3 + 2 * n + 2 * i]) + OFF)).sorted().toArray() instanceof long[] kb
            && ((BiFunction<long[], Integer, int[][]>) (ks, tt) -> new int[ks.length] instanceof int[] mu && new int[ks.length] instanceof int[] mlo && new int[ks.length] instanceof int[] mhi && new int[]{0} instanceof int[] c
                && Arrays.stream(ks).allMatch(key -> Integer.valueOf((int) (key >> 24) - OFF) instanceof Integer u && Integer.valueOf((int) (key & 0xFFFFFF) - OFF - 2 * tt) instanceof Integer lo && Integer.valueOf(lo + 4 * tt) instanceof Integer hi
                    && (c[0] > 0 && mu[c[0] - 1] == u && lo <= mhi[c[0] - 1] ? (mhi[c[0] - 1] = Math.max(mhi[c[0] - 1], hi)) > Integer.MIN_VALUE
                        : (mu[c[0]] = u) > Integer.MIN_VALUE && (mlo[c[0]] = lo) > Integer.MIN_VALUE && (mhi[c[0]] = hi) > Integer.MIN_VALUE && ++c[0] > 0))
                ? new int[][]{mu, mlo, mhi, c} : null) instanceof BiFunction<long[], Integer, int[][]> merge
            && ((IntPredicate) tt -> merge.apply(ka, tt) instanceof int[][] A && merge.apply(kb, tt) instanceof int[][] B
                && Integer.valueOf(B[3][0]) instanceof Integer nb && new boolean[nb * nb] instanceof boolean[] seen
                && IntStream.range(0, A[3][0]).anyMatch(i -> IntStream.range(0, nb).filter(j -> B[1][j] <= A[0][i] && A[0][i] <= B[2][j] && A[1][i] <= B[0][j] && B[0][j] <= A[2][i]).toArray() instanceof int[] js
                    && IntStream.range(0, js.length).anyMatch(a -> IntStream.range(a + 1, js.length).anyMatch(b -> seen[js[a] * nb + js[b]] || !(seen[js[a] * nb + js[b]] = true))))) instanceof IntPredicate chk
            && new int[]{0, 5000000} instanceof int[] lh
            ? !chk.test(lh[1]) ? "-1" : IntStream.range(0, 24).allMatch(it -> lh[0] >= lh[1] || (Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && (chk.test(mid) ? (lh[1] = mid) : (lh[0] = mid + 1)) >= 0)) ? String.valueOf(lh[0]) : "" : "");
    }
}
