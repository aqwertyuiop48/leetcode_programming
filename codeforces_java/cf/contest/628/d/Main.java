import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer d && sc.next() instanceof String a && sc.next() instanceof String b
            && Integer.valueOf(b.length()) instanceof Integer n && new int[2][m] instanceof int[][] buf && new int[]{0, 1, 0, 1} instanceof int[] ts && new int[m] instanceof int[] S && new int[m] instanceof int[] W
            && ((IntBinaryOperator) (x, y) -> x + y >= 1000000007 ? x + y - 1000000007 : x + y) instanceof IntBinaryOperator add
            && ((IntBinaryOperator) (x, y) -> x >= y ? x - y : x - y + 1000000007) instanceof IntBinaryOperator sub
            && IntStream.range(0, n).allMatch(i -> buf[i & 1] instanceof int[] src && buf[(i & 1) ^ 1] instanceof int[] tgt && Integer.valueOf(a.charAt(i) - 48) instanceof Integer sa && Integer.valueOf(b.charAt(i) - 48) instanceof Integer sb
                && ((IntPredicate) g -> i % 2 == 1 ? g == d : g != d && (i > 0 || g > 0)) instanceof IntPredicate ok
                && (i == 0 ? IntStream.range(0, m).filter(r -> (tgt[r] = 0) > 0).count() == 0
                    : IntStream.range(0, m).filter(u -> (S[u] = 0) > 0).count() == 0 && IntStream.range(0, m).filter(r -> Integer.valueOf(10 * r % m) instanceof Integer u && (S[u] = add.applyAsInt(S[u], src[r])) < 0).count() == 0
                        && (i % 2 == 1 ? IntStream.range(0, m).filter(u -> (tgt[(u + d) % m] = S[u]) < 0).count() == 0
                            : Integer.valueOf(IntStream.range(0, 10).reduce(0, (acc, g) -> add.applyAsInt(acc, S[(m - g % m) % m]))) instanceof Integer w0 && IntStream.range(0, m).filter(t -> (W[t] = t == 0 ? w0 : sub.applyAsInt(add.applyAsInt(W[t - 1], S[t]), S[(t + 10 * m - 10) % m])) >= 0 & (tgt[t] = sub.applyAsInt(W[t], S[(t + 10 * m - d) % m])) >= 0).count() == m))
                && IntStream.range(0, sb).filter(g -> ts[1] > 0 && ok.test(g) && Integer.valueOf((ts[0] * 10 + g) % m) instanceof Integer t && (tgt[t] = add.applyAsInt(tgt[t], 1)) < 0).count() == 0
                && IntStream.range(0, sa).filter(g -> ts[3] > 0 && ok.test(g) && Integer.valueOf((ts[2] * 10 + g) % m) instanceof Integer t && (tgt[t] = add.applyAsInt(tgt[t], 1000000006)) < 0).count() == 0
                && (ts[1] = ts[1] > 0 && ok.test(sb) ? 1 : 0) >= 0 && (ts[0] = (ts[0] * 10 + sb) % m) >= 0
                && (ts[3] = ts[3] > 0 && ok.test(sa) ? 1 : 0) >= 0 && (ts[2] = (ts[2] * 10 + sa) % m) >= 0)
            ? add.applyAsInt(buf[n & 1][0], ts[1] > 0 && ts[0] == 0 ? 1 : 0) : -1);
    }
}
