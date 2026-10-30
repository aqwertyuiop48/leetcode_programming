import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer m
            && IntStream.range(0, n + 1).toArray() instanceof int[] p && new int[n + 1] instanceof int[] w && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz && new int[]{n} instanceof int[] cs
            && (IntUnaryOperator) (x -> IntStream.iterate(x, v -> p[v]).filter(v -> p[v] == v).findFirst().getAsInt()) instanceof IntUnaryOperator root
            && (IntUnaryOperator) (x -> IntStream.iterate(x, v -> p[v] != v, v -> p[v]).map(v -> w[v]).reduce(0, (u, t) -> u ^ t)) instanceof IntUnaryOperator par
            ? (IntStream.range(0, m).allMatch(e -> (Integer) (int) tk[2 + 3 * e] instanceof Integer a && (Integer) (int) tk[3 + 3 * e] instanceof Integer b && (Integer) (int) (1 - tk[4 + 3 * e]) instanceof Integer wt
                && (Integer) root.applyAsInt(a) instanceof Integer ra && (Integer) root.applyAsInt(b) instanceof Integer rb && (Integer) (par.applyAsInt(a) ^ par.applyAsInt(b) ^ wt) instanceof Integer need
                && (ra.equals(rb) ? need == 0
                    : (Integer) (sz[ra] < sz[rb] ? ra : rb) instanceof Integer sm && (Integer) (sz[ra] < sz[rb] ? rb : ra) instanceof Integer lg
                        && (p[sm] = lg) >= 0 && (w[sm] = need) >= 0 && (sz[lg] += sz[sm]) > 0 && (cs[0] -= 1) > 0))
                ? BigInteger.TWO.modPow(BigInteger.valueOf(cs[0] - 1), BigInteger.valueOf(1000000007)).toString() : "0") : "0");
    }
}
