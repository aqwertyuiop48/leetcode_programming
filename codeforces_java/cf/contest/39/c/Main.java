import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> s.nextInt()).toArray() instanceof int[] cr
            && IntStream.range(0, 2 * n).map(i -> i % 2 == 0 ? cr[i] - cr[i + 1] : cr[i - 1] + cr[i]).distinct().sorted().toArray() instanceof int[] xs
            && Integer.valueOf(xs.length) instanceof Integer N
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(k -> Arrays.binarySearch(xs, cr[2 * k] + cr[2 * k + 1]))).mapToInt(k -> k).toArray() instanceof int[] ord
            && Arrays.stream(ord).map(k -> Arrays.binarySearch(xs, cr[2 * k] - cr[2 * k + 1])).toArray() instanceof int[] oL
            && Arrays.stream(ord).map(k -> Arrays.binarySearch(xs, cr[2 * k] + cr[2 * k + 1])).toArray() instanceof int[] oR
            && Arrays.stream(oR).mapToLong(q -> 2L * q + 1).toArray() instanceof long[] keys
            && IntStream.rangeClosed(0, N).map(x -> -Arrays.binarySearch(keys, 2L * x) - 1).toArray() instanceof int[] st
            && new boolean[N] instanceof boolean[] isL
            && IntStream.of(oL).allMatch(l -> (isL[l] = true))
            && IntStream.range(0, N).mapToObj(i -> isL[i] ? new int[N] : null).toArray(int[][]::new) instanceof int[][] P
            && IntStream.range(0, N).flatMap(x -> IntStream.range(0, st[x + 1] - st[x] + 1).map(o -> x)).toArray() instanceof int[] itX
            && IntStream.range(0, N).flatMap(x -> IntStream.concat(IntStream.range(st[x], st[x + 1]), IntStream.of(-1))).toArray() instanceof int[] itT
            && IntStream.range(0, N + n).map(idx -> itT[idx] >= 0 ? oL[itT[idx]] : -1).toArray() instanceof int[] itL
            && IntStream.iterate(N - 1, i -> i >= 0, i -> i - 1).filter(i -> isL[i]).allMatch(i ->
                P[i] instanceof int[] row
                && new int[2] instanceof int[] acc
                && IntStream.range(st[i + 1] + i + 1, N + n).filter(idx ->
                    (itL[idx] >= 0
                        ? itL[idx] > i ? (acc[0] = Math.max(acc[0], row[itL[idx]] + P[itL[idx]][itX[idx]])) >= 0 : itL[idx] == i ? ++acc[1] > 0 : true
                        : (row[itX[idx]] = Math.max(row[itX[idx] - 1], acc[0]) + acc[1]) >= 0 && (acc[0] = 0) == 0 && (acc[1] = 0) == 0) && false).count() >= 0)
            && new int[4 * N + 4 * n + 16] instanceof int[] stI
            && new int[4 * N + 4 * n + 16] instanceof int[] stX
            && new int[]{1} instanceof int[] sp
            && (stX[0] = N - 1) >= 0
            && new ArrayList<Integer>() instanceof ArrayList<Integer> res
            && IntStream.range(0, 4 * N + 4 * n + 16).allMatch(step ->
                sp[0] == 0
                || (Integer) stI[--sp[0]] instanceof Integer i
                && (Integer) stX[sp[0]] instanceof Integer x
                && (x <= i
                    || (Integer) (int) IntStream.range(st[x], st[x + 1]).filter(t -> oL[t] == i).count() instanceof Integer hc
                    && IntStream.range(st[x], st[x + 1]).filter(t -> oL[t] == i).mapToObj(t -> ord[t] + 1).toList() instanceof List<Integer> ids
                    && (res.addAll(ids) || true)
                    && (Integer) (P[i][x] - hc) instanceof Integer target
                    && (P[i][x - 1] == target
                        ? (stI[sp[0]] = i) >= 0 && (stX[sp[0]++] = x - 1) >= 0
                        : (Integer) IntStream.range(st[x], st[x + 1]).filter(t -> oL[t] > i && P[i][oL[t]] + P[oL[t]][x] == target).findFirst().orElse(-1) instanceof Integer tt
                            && tt >= 0
                            && (stI[sp[0]] = i) >= 0 && (stX[sp[0]++] = oL[tt]) >= 0
                            && (stI[sp[0]] = oL[tt]) >= 0 && (stX[sp[0]++] = x) >= 0)))
            ? res.size() + "\n" + res.stream().sorted().map(String::valueOf).collect(Collectors.joining(" "))
            : ""));
    }
}
