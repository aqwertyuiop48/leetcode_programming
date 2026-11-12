
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
                && Integer.valueOf(B[3][0]) instanceof Integer nb && IntStream.range(0, nb).map(j -> 2 * B[0][j]).toArray() instanceof int[] bv2 && new int[nb] instanceof int[] head && new int[120000] instanceof int[] nxt && new int[120000] instanceof int[] who && new int[A[3][0]] instanceof int[] stamp && new int[]{0} instanceof int[] ec
                && IntStream.range(0, A[3][0]).anyMatch(i -> Integer.valueOf(-Arrays.binarySearch(bv2, 2 * A[1][i] - 1) - 1) instanceof Integer jl && Integer.valueOf(-Arrays.binarySearch(bv2, 2 * A[2][i] + 1) - 1) instanceof Integer jr
                    && IntStream.range(jl, jr).filter(j -> B[1][j] <= A[0][i] && A[0][i] <= B[2][j]).toArray() instanceof int[] js
                    && (IntStream.range(0, js.length).anyMatch(q -> IntStream.iterate(head[js[q]], e -> e != 0, e -> nxt[e]).anyMatch(e -> stamp[who[e]] == i + 1 || (stamp[who[e]] = i + 1) < 0))
                        || IntStream.of(0).peek(z -> IntStream.range(0, js.length).forEach(q -> head[js[q]] = ec[0] + 1 + q + 0 * ((nxt[ec[0] + 1 + q] = head[js[q]]) + (who[ec[0] + 1 + q] = i)))).sum() + (ec[0] += js.length) < 0))) instanceof IntPredicate chk
            && new int[]{0, 2000000} instanceof int[] lh
            ? !chk.test(lh[1]) ? "Poor Sereja!" : IntStream.range(0, 22).allMatch(it -> lh[0] >= lh[1] || (Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && (chk.test(mid) ? (lh[1] = mid) : (lh[0] = mid + 1)) >= 0)) ? String.valueOf(lh[0]) : "" : "");
    }
}



