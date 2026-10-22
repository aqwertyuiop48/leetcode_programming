import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().filter(l -> !l.isBlank()).toList() instanceof List<String> L
            && Arrays.stream(L.get(0).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm && Integer.valueOf(nm[0]) instanceof Integer n && Integer.valueOf(nm[1]) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> Arrays.stream(L.get(i + 1).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new) instanceof int[][] op
            && IntStream.range(0, m).filter(i -> op[i][0] == 1).map(i -> op[i][4]).distinct().sorted().toArray() instanceof int[] xs
            && new int[xs.length + 1] instanceof int[] seen
            && ((IntUnaryOperator) p -> p == 0 ? 0 : p + 32 - Integer.numberOfLeadingZeros(p)) instanceof IntUnaryOperator S
            && IntStream.range(0, m).filter(q -> op[q][0] == 2).mapToObj(q -> new int[n + 2] instanceof int[] lo && new int[n + 2] instanceof int[] hi
                && (lo[0] = op[q][2]) > 0 && (hi[0] = op[q][2]) > 0
                && IntStream.range(0, n - op[q][1]).allMatch(d -> (lo[d + 1] = S.applyAsInt(lo[d] - 1) + 1) > 0 && (hi[d + 1] = S.applyAsInt(hi[d])) > 0)
                ? String.valueOf(IntStream.range(0, q).filter(j -> op[j][0] == 1 && op[j][1] >= op[q][1] && op[j][2] <= hi[op[j][1] - op[q][1]] && op[j][3] >= lo[op[j][1] - op[q][1]]
                    && seen[Arrays.binarySearch(xs, op[j][4])] != q + 1 && (seen[Arrays.binarySearch(xs, op[j][4])] = q + 1) > 0).count()) : "").collect(Collectors.joining("\n")) instanceof String res
            ? res : "");
    }
}
