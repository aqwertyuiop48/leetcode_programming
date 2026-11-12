import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] d
            && new int[n] instanceof int[] q
            && new int[]{1} instanceof int[] t
            && (d[0] = 0) == 0
            && ((IntBinaryOperator) (u, v) -> v >= 0 && v < n && d[v] < 0 ? q[t[0]++] = v + 0 * (d[v] = d[u] + 1) : 0) instanceof IntBinaryOperator vis
            && IntStream.range(0, n).filter(h -> Math.max(vis.applyAsInt(q[h], q[h] - 1),
                Math.max(vis.applyAsInt(q[h], q[h] + 1), vis.applyAsInt(q[h], a[q[h]]))) < 0).count() == 0
            ? Arrays.stream(d).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
