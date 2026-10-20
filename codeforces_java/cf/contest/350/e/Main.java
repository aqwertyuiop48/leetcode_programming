import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer k && IntStream.generate(ni).limit(k).toArray() instanceof int[] a && new boolean[n + 1] instanceof boolean[] mk && Arrays.stream(a).filter(i -> (mk[i] = true)).count() >= 0 && IntStream.rangeClosed(1, n).filter(i -> !mk[i]).toArray() instanceof int[] um)
            System.out.print(k == n || (k == 1 && n < 3) ? "-1" : Integer.valueOf(a[0]) instanceof Integer x && Integer.valueOf(k >= 2 ? a[1] : um[1]) instanceof Integer y && Integer.valueOf(um[0]) instanceof Integer u && Stream.concat(IntStream.rangeClosed(1, n).filter(v -> v != u).mapToObj(v -> new int[] {Math.min(u, v), Math.max(u, v)}), IntStream.rangeClosed(1, n).boxed().flatMap(p -> IntStream.rangeClosed(p + 1, n).filter(q -> p != u && q != u && !(p == x && q == y || p == y && q == x) && !(q == y && mk[p]) && !(p == y && mk[q])).mapToObj(q -> new int[] {p, q}))).limit(m).collect(Collectors.toList()) instanceof List<int[]> es && es.size() == m && m >= n - 1 ? es.stream().map(e -> e[0] + " " + e[1]).collect(Collectors.joining("\n")) : "-1");
    }
}
