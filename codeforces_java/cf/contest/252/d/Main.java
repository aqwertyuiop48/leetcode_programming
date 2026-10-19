import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> sc.nextInt() - 1).toArray() instanceof int[] q
            && IntStream.range(0, n).map(i -> sc.nextInt() - 1).toArray() instanceof int[] s
            && IntStream.range(0, n).toArray() instanceof int[] id
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> q[i])).mapToInt(i -> i).toArray() instanceof int[] inv
            && ((Function<int[], Integer>) g -> Stream.iterate(id, p -> IntStream.range(0, n).map(i -> p[g[i]]).toArray()).limit(k + 1).toList() instanceof List<int[]> pw
                ? IntStream.rangeClosed(1, k).filter(t -> Arrays.equals(pw.get(t), s)).findFirst().orElse(-1) : -1) instanceof Function<int[], Integer> first
            && Boolean.valueOf(!Arrays.equals(IntStream.range(0, n).map(i -> q[q[i]]).toArray(), id)) instanceof Boolean big
            && ((IntPredicate) a -> a > 0 && (k - a) % 2 == 0 && (k == a || big)) instanceof IntPredicate ok
            ? !Arrays.equals(s, id) && (ok.test(first.apply(q)) || ok.test(first.apply(inv))) ? "YES" : "NO" : "");
    }
}
