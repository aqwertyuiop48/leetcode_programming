import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextLine().trim())).ifPresent(n ->
            Optional.of(sc.nextLine().trim()).ifPresent(s ->
                System.out.println(
                    new int[]{0, -1} instanceof int[] lr1
                    && new int[n] instanceof int[] d1
                    && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> go
                    && go.getAndSet((ii, kk) -> (ii - kk >= 0 && ii + kk < n && s.charAt(ii - kk) == s.charAt(ii + kk)) ? go.get().applyAsInt(ii, kk + 1) : kk) == null
                    && IntStream.range(0, n).allMatch(i ->
                        new int[]{(i > lr1[1]) ? 1 : Math.min(d1[lr1[0] + lr1[1] - i], lr1[1] - i + 1)} instanceof int[] k0
                        && new int[]{go.get().applyAsInt(i, k0[0])} instanceof int[] kArr
                        && (d1[i] = kArr[0]) >= 0
                        && (i + kArr[0] - 1 > lr1[1]
                            ? (lr1[0] = i - kArr[0] + 1) >= Integer.MIN_VALUE && (lr1[1] = i + kArr[0] - 1) >= Integer.MIN_VALUE
                            : true))
                    && new int[]{0, -1} instanceof int[] lr2
                    && new int[n] instanceof int[] d2
                    && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ge
                    && ge.getAndSet((ii, kk) -> (ii - kk - 1 >= 0 && ii + kk < n && s.charAt(ii - kk - 1) == s.charAt(ii + kk)) ? ge.get().applyAsInt(ii, kk + 1) : kk) == null
                    && IntStream.range(0, n).allMatch(i ->
                        new int[]{(i > lr2[1]) ? 0 : Math.min(d2[lr2[0] + lr2[1] - i + 1], lr2[1] - i + 1)} instanceof int[] k0
                        && new int[]{ge.get().applyAsInt(i, k0[0])} instanceof int[] kArr
                        && (d2[i] = kArr[0]) >= 0
                        && (i + kArr[0] - 1 > lr2[1]
                            ? (lr2[0] = i - kArr[0]) >= Integer.MIN_VALUE && (lr2[1] = i + kArr[0] - 1) >= Integer.MIN_VALUE
                            : true))
                    && new long[n + 2] instanceof long[] endDiff
                    && new long[n + 2] instanceof long[] startDiff
                    && new long[]{0} instanceof long[] total
                    && IntStream.range(0, n).allMatch(i ->
                        new int[]{d1[i]} instanceof int[] r1
                        && (r1[0] <= 0
                            ? true
                            : (endDiff[i] += 1) >= Long.MIN_VALUE && (endDiff[i + r1[0]] -= 1) >= Long.MIN_VALUE
                                && (startDiff[i - r1[0] + 1] += 1) >= Long.MIN_VALUE && (startDiff[i + 1] -= 1) >= Long.MIN_VALUE
                                && (total[0] += r1[0]) >= Long.MIN_VALUE)
                        && new int[]{d2[i]} instanceof int[] r2
                        && (r2[0] <= 0
                            ? true
                            : (endDiff[i] += 1) >= Long.MIN_VALUE && (endDiff[i + r2[0]] -= 1) >= Long.MIN_VALUE
                                && (startDiff[i - r2[0]] += 1) >= Long.MIN_VALUE && (startDiff[i] -= 1) >= Long.MIN_VALUE
                                && (total[0] += r2[0]) >= Long.MIN_VALUE))
                    && new long[n] instanceof long[] cntEnd
                    && new long[]{0} instanceof long[] run1
                    && IntStream.range(0, n).allMatch(i -> (run1[0] += endDiff[i]) >= Long.MIN_VALUE && (cntEnd[i] = run1[0]) >= Long.MIN_VALUE)
                    && new long[n] instanceof long[] cntStart
                    && new long[]{0} instanceof long[] run2
                    && IntStream.range(0, n).allMatch(i -> (run2[0] += startDiff[i]) >= Long.MIN_VALUE && (cntStart[i] = run2[0]) >= Long.MIN_VALUE)
                    && new long[n + 1] instanceof long[] suffCnt
                    && IntStream.range(0, n).allMatch(x -> new int[]{n - 1 - x} instanceof int[] ii && (suffCnt[ii[0]] = suffCnt[ii[0] + 1] + cntStart[ii[0]]) >= Long.MIN_VALUE)
                    && new long[]{0} instanceof long[] nonCrossing
                    && IntStream.range(0, n - 1).allMatch(i -> (nonCrossing[0] = (nonCrossing[0] + (cntEnd[i] % 51123987L) * (suffCnt[i + 1] % 51123987L)) % 51123987L) >= Long.MIN_VALUE)
                    && new long[]{total[0] % 51123987L} instanceof long[] totalMod
                    && new long[]{totalMod[0] * ((totalMod[0] - 1 + 51123987L) % 51123987L) % 51123987L * ((51123987L + 1) / 2) % 51123987L} instanceof long[] totalPairs
                    ? ((totalPairs[0] - nonCrossing[0]) % 51123987L + 51123987L) % 51123987L
                    : 0L))));
    }
}

