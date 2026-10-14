import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new String[]{sc.next(), sc.next()}).ifPresent(bn ->
            Optional.of(sc.nextLong()).ifPresent(c ->
                System.out.println(
                    new long[]{0} instanceof long[] bModC
                    && IntStream.range(0, bn[0].length()).allMatch(i -> (bModC[0] = (bModC[0] * 10 + (bn[0].charAt(i) - '0')) % c) >= 0)
                    && bn[1].toCharArray() instanceof char[] arr
                    && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> br
                    && br.getAndSet(i -> arr[i] == '0' ? (arr[i] = '9') + br.get().applyAsInt(i - 1) - '9' : i) == null
                    && new int[]{br.get().applyAsInt(arr.length - 1)} instanceof int[] bIdx
                    && (arr[bIdx[0]]-- != 0)
                    && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> str
                    && str.getAndSet(j -> (j < arr.length - 1 && arr[j] == '0') ? str.get().applyAsInt(j + 1) : j) == null
                    && new int[]{str.get().applyAsInt(0)} instanceof int[] startIdx
                    && new String(arr, startIdx[0], arr.length - startIdx[0]) instanceof String nm1
                    && new long[]{(bModC[0] - 1 + c) % c} instanceof long[] term1
                    && new long[]{1} instanceof long[] result
                    && new long[]{bModC[0] % c} instanceof long[] cur
                    && (c == 1
                        ? (result[0] = 0) >= 0
                        : IntStream.range(0, nm1.length()).allMatch(x ->
                            new int[]{nm1.length() - 1 - x} instanceof int[] ii
                            && new int[]{nm1.charAt(ii[0]) - '0'} instanceof int[] digit
                            && new long[]{1} instanceof long[] p
                            && IntStream.range(0, digit[0]).allMatch(d -> (p[0] = p[0] * cur[0] % c) >= 0)
                            && (result[0] = result[0] * p[0] % c) >= 0
                            && new long[]{1} instanceof long[] next
                            && IntStream.range(0, 10).allMatch(d -> (next[0] = next[0] * cur[0] % c) >= 0)
                            && (cur[0] = next[0]) >= 0))
                    && new long[]{term1[0] * result[0] % c} instanceof long[] totalModC
                    ? (totalModC[0] == 0 ? c : totalModC[0])
                    : 0L))));
    }
}
