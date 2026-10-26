import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingInt((Integer i) -> a[i])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && new int[n + 1] instanceof int[] bit && new long[n + 1] instanceof long[] ans && new int[]{0} instanceof int[] ins
            && ((IntUnaryOperator) x -> IntStream.iterate(x, i -> i > 0, i -> i & (i - 1)).map(i -> bit[i]).sum()) instanceof IntUnaryOperator pre
            && IntStream.range(0, n).allMatch(t -> (Integer) ord[t] instanceof Integer p
                && Stream.generate(() -> 0).takeWhile(z -> ins[0] < n && a[ord[ins[0]]] < a[p]).allMatch(z -> IntStream.iterate(ord[ins[0]++], i -> i <= n, i -> i + (i & -i)).map(i -> bit[i]++).sum() >= 0)
                && IntStream.rangeClosed(1, p == 1 ? n - 1 : (n - 2) / (p - 1)).allMatch(k ->
                    (ans[k] += pre.applyAsInt(Math.min(n, k * p + 1)) - pre.applyAsInt(k * (p - 1) + 1)) >= 0))
            ? IntStream.range(1, n).mapToObj(k -> String.valueOf(ans[k])).collect(Collectors.joining(" ")) : "");
    }
}
