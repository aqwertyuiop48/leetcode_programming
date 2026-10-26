import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n] instanceof int[] xs && new int[n] instanceof int[] ys && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> map
            && IntStream.range(0, n).allMatch(i -> (xs[i] = Integer.parseInt(tk.nextToken())) > Integer.MIN_VALUE && (ys[i] = Integer.parseInt(tk.nextToken())) >= 0 && map.put((long) xs[i] * 2000000011L + ys[i], i) == null)
            && ((IntBinaryOperator) (x, y) -> map.getOrDefault((long) x * 2000000011L + y, -1)) instanceof IntBinaryOperator at
            && ((IntPredicate) i -> IntStream.rangeClosed(-1, 1).allMatch(dx -> (Integer) at.applyAsInt(xs[i] + dx, ys[i] + 1) instanceof Integer j
                && (j < 0 || IntStream.rangeClosed(-1, 1).filter(ex -> at.applyAsInt(xs[j] + ex, ys[j] - 1) >= 0).count() >= 2))) instanceof IntPredicate can
            && new TreeSet<Integer>(IntStream.range(0, n).filter(can).boxed().toList()) instanceof TreeSet<Integer> rem
            && new int[][]{{-2, 0}, {-1, 0}, {1, 0}, {2, 0}, {-1, -1}, {0, -1}, {1, -1}} instanceof int[][] offs && new long[]{0} instanceof long[] ans
            ? IntStream.range(0, n).allMatch(t -> (Integer) (t % 2 == 0 ? rem.pollLast() : rem.pollFirst()) instanceof Integer pick
                && (ans[0] = (ans[0] * n + pick) % 1000000009L) >= 0 && map.remove((long) xs[pick] * 2000000011L + ys[pick]) != null
                && Arrays.stream(offs).allMatch(o -> (Integer) at.applyAsInt(xs[pick] + o[0], ys[pick] + o[1]) instanceof Integer j
                    && (j < 0 || (can.test(j) ? rem.add(j) || true : rem.remove(j) || true)))) ? ans[0] : 0
            : 0);
    }
}
