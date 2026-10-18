import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && new int[n] instanceof int[] x
            && new int[n] instanceof int[] y
            && IntStream.range(0, n).allMatch(i -> (x[i] = s.nextInt()) * 0 == (y[i] = s.nextInt()) * 0)
            && ((IntFunction<Integer>) d -> new int[n] instanceof int[] col
                && new int[]{0} instanceof int[] comps
                && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> q
                && IntStream.range(0, n).allMatch(st -> col[st] != 0
                    || (col[st] = 1) > 0 && comps[0]++ >= 0 && q.add(st)
                    && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.range(0, n).allMatch(v ->
                        Math.abs(x[u] - x[v]) + Math.abs(y[u] - y[v]) <= d
                        || (col[v] == 0 ? (col[v] = 3 - col[u]) > 0 && q.add(v) : col[v] != col[u]))))
                ? comps[0] : -1) instanceof IntFunction<Integer> chk
            && new int[]{0, 40001} instanceof int[] lh
            && IntStream.range(0, 17).allMatch(it -> lh[0] >= lh[1]
                || (chk.apply((lh[0] + lh[1]) / 2) >= 0 ? (lh[1] = (lh[0] + lh[1]) / 2) : (lh[0] = (lh[0] + lh[1]) / 2 + 1)) >= 0)
            && (Integer) chk.apply(lh[0]) instanceof Integer cc
            ? lh[0] + "\n" + BigInteger.TWO.modPow(BigInteger.valueOf(cc), BigInteger.valueOf(1000000007))
            : ""));
    }
}




