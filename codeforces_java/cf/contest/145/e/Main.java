import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && tk.nextToken() instanceof String s
            && (Integer) Integer.highestOneBit(Math.max(n, 2) * 2 - 1) instanceof Integer sz && (Integer) Integer.numberOfTrailingZeros(sz) instanceof Integer lg
            && new int[8 * sz] instanceof int[] t && new int[4] instanceof int[] q
            && IntStream.range(0, n).allMatch(i -> (t[4 * (sz + i)] = s.charAt(i) == '4' ? 1 : 0) >= 0 && (t[4 * (sz + i) + 1] = 1 - t[4 * (sz + i)]) >= 0 && (t[4 * (sz + i) + 2] = 1) > 0 && (t[4 * (sz + i) + 3] = 1) > 0)
            && ((IntPredicate) i -> (t[4 * i] = t[8 * i] + t[8 * i + 4]) >= 0 && (t[4 * i + 1] = t[8 * i + 1] + t[8 * i + 5]) >= 0 && (t[4 * i + 2] = Math.max(t[8 * i + 2] + t[8 * i + 5], t[8 * i] + t[8 * i + 6])) >= 0
                && (t[4 * i + 3] = Math.max(t[8 * i + 3] + t[8 * i + 4], t[8 * i + 1] + t[8 * i + 7])) >= 0) instanceof IntPredicate pull
            && IntStream.range(1, sz).map(i -> sz - i).allMatch(pull)
            && new boolean[2 * sz] instanceof boolean[] lz
            && ((IntPredicate) i -> (t[4 * i] = t[4 * i] + t[4 * i + 1] - (t[4 * i + 1] = t[4 * i])) >= 0 && (t[4 * i + 2] = t[4 * i + 2] + t[4 * i + 3] - (t[4 * i + 3] = t[4 * i + 2])) >= 0 && (lz[i] = !lz[i]) | true) instanceof IntPredicate ap
            && ((IntPredicate) i -> !lz[i] || (ap.test(2 * i) && ap.test(2 * i + 1) && !(lz[i] = false))) instanceof IntPredicate push
            ? IntStream.range(0, m).mapToObj(qi -> tk.nextToken().equals("count") ? String.valueOf(t[4 + 2])
                : (q[0] = Integer.parseInt(tk.nextToken()) - 1 + sz) > 0 && (q[1] = Integer.parseInt(tk.nextToken()) + sz) > 0
                    && IntStream.range(0, lg).allMatch(u -> (((q[0] >> (lg - u)) << (lg - u)) == q[0] || push.test(q[0] >> (lg - u))) && (((q[1] >> (lg - u)) << (lg - u)) == q[1] || push.test((q[1] - 1) >> (lg - u))))
                    && (q[2] = q[0]) > 0 && (q[3] = q[1]) > 0
                    && IntStream.range(0, lg + 2).anyMatch(z -> q[2] >= q[3] || !(((q[2] & 1) == 0 || ap.test(q[2]++)) && ((q[3] & 1) == 0 || ap.test(--q[3])) && (q[2] >>= 1) >= 0 && (q[3] >>= 1) >= 0))
                    && IntStream.rangeClosed(1, lg).allMatch(i -> (((q[0] >> i) << i) == q[0] || pull.test(q[0] >> i)) && (((q[1] >> i) << i) == q[1] || pull.test((q[1] - 1) >> i))) ? "" : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}
