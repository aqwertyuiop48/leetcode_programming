import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken()) - 1).toArray() instanceof int[] p
            && new int[n] instanceof int[] ea && new int[n] instanceof int[] eb && new int[2] instanceof int[] ec && new boolean[n] instanceof boolean[] vis && new boolean[] {true} instanceof boolean[] ok
            && ((IntBinaryOperator) (x, y) -> ((ea[ec[0]] = x) >= 0 && (eb[ec[0]++] = y) >= 0) ? 0 : 1) instanceof IntBinaryOperator add
            && (Integer) IntStream.range(0, n).filter(i -> p[i] == i).findFirst().orElse(-1) instanceof Integer f
            && (Integer) IntStream.range(0, n).filter(i -> p[p[i]] == i).findFirst().orElse(-1) instanceof Integer a
            && (f >= 0 ? IntStream.range(0, n).filter(i -> i != f && add.applyAsInt(f, i) == 0).count() >= 0
                : a >= 0 && add.applyAsInt(a, p[a]) == 0 && IntStream.range(0, n).filter(u -> vis[u] || u == a || u == p[a] || ((vis[u] = true) && add.applyAsInt(u, a) == 0 && (ec[1] = 0) == 0
                    && IntStream.iterate(p[u], x -> x != u, x -> p[x]).filter(x -> (vis[x] = true) && add.applyAsInt(x, (++ec[1] & 1) == 1 ? p[a] : a) == 0).count() >= 0
                    && (ok[0] &= ((ec[1] + 1) & 1) == 0) | true)).count() >= 0) && ok[0]
            ? "YES\n" + IntStream.range(0, ec[0]).mapToObj(i -> (ea[i] + 1) + " " + (eb[i] + 1)).collect(Collectors.joining("\n")) : "NO");
    }
}
