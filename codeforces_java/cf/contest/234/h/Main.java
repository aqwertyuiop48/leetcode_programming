import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && Integer.valueOf(it.next()) instanceof Integer m && IntStream.range(0, m).map(i -> it.next()).toArray() instanceof int[] b
            && IntStream.range(0, n).filter(i -> i == 0 || a[i] != a[i - 1]).toArray() instanceof int[] sa
            && IntStream.range(0, m).filter(i -> i == 0 || b[i] != b[i - 1]).toArray() instanceof int[] sb
            && Integer.valueOf(sa.length) instanceof Integer p && Integer.valueOf(sb.length) instanceof Integer q
            && Integer.valueOf(a[0] != b[0] && p == q ? p + 1 : Math.max(p, q)) instanceof Integer L
            && Integer.valueOf(a[0] == b[0] || p > q ? a[0] : p < q ? b[0] : (L - 1) & 1) instanceof Integer s
            && new int[]{0, 0} instanceof int[] ptr
            && IntStream.range(0, L).boxed().flatMap(j -> Integer.valueOf(s ^ (j & 1)) instanceof Integer c
                ? Stream.concat(
                    ptr[0] < p && a[sa[ptr[0]]] == c && Integer.valueOf(ptr[0]++) instanceof Integer k ? IntStream.range(sa[k], k + 1 < p ? sa[k + 1] : n).map(i -> i + 1).boxed() : Stream.<Integer>empty(),
                    ptr[1] < q && b[sb[ptr[1]]] == c && Integer.valueOf(ptr[1]++) instanceof Integer k ? IntStream.range(sb[k], k + 1 < q ? sb[k + 1] : m).map(i -> n + i + 1).boxed() : Stream.<Integer>empty())
                : Stream.<Integer>empty()).mapToInt(x -> x).toArray() instanceof int[] ord
            && ((IntUnaryOperator) card -> card <= n ? a[card - 1] : b[card - n - 1]) instanceof IntUnaryOperator val
            && IntStream.rangeClosed(1, n + m).filter(i -> val.applyAsInt(ord[i - 1]) != (i < n + m ? val.applyAsInt(ord[i]) : 0)).toArray() instanceof int[] turns
            ? Arrays.stream(ord).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + turns.length + "\n" + Arrays.stream(turns).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
