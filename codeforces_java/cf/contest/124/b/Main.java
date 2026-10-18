import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] w
            && IntStream.rangeClosed(0, k).map(i -> IntStream.rangeClosed(1, i).reduce(1, (a, b) -> a * b)).toArray() instanceof int[] f
            ? IntStream.range(0, f[k]).map(idx ->
                IntStream.range(0, k).boxed().collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> rem
                && IntStream.range(0, k).map(i -> rem.remove(idx / f[k - 1 - i] % (k - i))).toArray() instanceof int[] perm
                && Arrays.stream(w).mapToLong(x -> IntStream.range(0, k).mapToLong(i -> x.charAt(perm[i]) - '0').reduce(0L, (a, b) -> a * 10 + b))
                    .summaryStatistics() instanceof LongSummaryStatistics ss
                ? (int) (ss.getMax() - ss.getMin())
                : 0).min().getAsInt()
            : 0);
    }
}
