import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] q
            && IntStream.range(0, n).mapToLong(i -> -1L).toArray() instanceof long[] val
            && new int[n] instanceof int[] prv
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> mp
            && IntStream.range(0, n).allMatch(i -> (Long.valueOf((q[i][1] + q[i][2] + q[i][3]) * 1000000L) instanceof Long base
                && (q[i][2] == 0 ? Integer.valueOf(-2) : mp.getOrDefault(base + q[i][2], -1)) instanceof Integer pi
                && pi != -1
                && (val[i] = (pi == -2 ? 0 : val[pi]) + q[i][0]) >= 0
                && (prv[i] = pi == -2 ? -1 : pi) >= -1
                && (!mp.containsKey(base + q[i][2] + q[i][1]) || val[mp.get(base + q[i][2] + q[i][1])] < val[i])
                && (mp.put(base + q[i][2] + q[i][1], i) == null || true)) | true)
            && IntStream.range(0, n).filter(i -> q[i][3] == 0 && val[i] >= 0).boxed()
                .max(Comparator.comparingLong((Integer i) -> val[i]).thenComparing(Comparator.reverseOrder())).orElse(-1) instanceof Integer best
            ? best < 0 ? "0"
                : Stream.iterate(best, i -> i >= 0, i -> prv[i]).toList() instanceof List<Integer> ch
                    && IntStream.range(0, ch.size()).mapToObj(i -> ch.get(ch.size() - 1 - i) + 1).toList() instanceof List<Integer> rv
                ? rv.size() + "\n" + rv.stream().map(String::valueOf).collect(Collectors.joining(" ")) : ""
            : ""));

    }
}




