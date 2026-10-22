import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.next(), it.next()}).toArray(int[][]::new) instanceof int[][] qs
            && Integer.valueOf(Integer.highestOneBit(2 * n - 1)) instanceof Integer S
            && new int[2 * S] instanceof int[] pre && new int[2 * S] instanceof int[] suf && new long[2 * S] instanceof long[] sm && new long[m] instanceof long[] res
            && ((java.util.function.LongUnaryOperator) x -> x * (x + 1) / 2) instanceof java.util.function.LongUnaryOperator f
            && ((IntPredicate) i -> Integer.valueOf(2 * i) instanceof Integer l && Integer.valueOf(2 * i + 1) instanceof Integer r && Integer.valueOf(S >> (31 - Integer.numberOfLeadingZeros(l))) instanceof Integer ll
                && (pre[i] = pre[l] == ll ? ll + pre[r] : pre[l]) >= 0 && (suf[i] = suf[r] == ll ? ll + suf[l] : suf[r]) >= 0
                && (sm[i] = sm[l] + sm[r] - f.applyAsLong(suf[l]) - f.applyAsLong(pre[r]) + f.applyAsLong(suf[l] + pre[r])) >= 0) instanceof IntPredicate pull
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(Math.max(IntStream.of(a).max().getAsInt(), Arrays.stream(qs).mapToInt(q -> q[1]).max().orElse(0)))) instanceof Integer bits
            && IntStream.range(0, bits).allMatch(b -> IntStream.range(0, n).allMatch(i -> (pre[S + i] = suf[S + i] = (int) (sm[S + i] = a[i] >> b & 1)) >= 0)
                && IntStream.range(1, S).map(i -> S - i).allMatch(pull::test)
                && IntStream.range(0, m).allMatch(q -> (pre[S + qs[q][0] - 1] = suf[S + qs[q][0] - 1] = (int) (sm[S + qs[q][0] - 1] = qs[q][1] >> b & 1)) >= 0
                    && IntStream.iterate((S + qs[q][0] - 1) >> 1, i -> i >= 1, i -> i >> 1).allMatch(pull::test)
                    && (res[q] += sm[1] << b) >= 0))
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
