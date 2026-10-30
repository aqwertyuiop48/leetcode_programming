import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry(new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in, new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new Scanner(io.getKey()) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(sc.nextInt() - 1) instanceof Integer r1 && Integer.valueOf(sc.nextInt()) instanceof Integer c1
            && Integer.valueOf(sc.nextInt() - 1) instanceof Integer r2 && Integer.valueOf(sc.nextInt()) instanceof Integer c2
            && IntStream.concat(IntStream.of(1, c1, c2), Arrays.stream(a).map(x -> x + 1)).distinct().sorted().toArray() instanceof int[] cs
            && Integer.valueOf(cs.length) instanceof Integer K
            && new long[n * K] instanceof long[] d && IntStream.range(0, n * K).allMatch(i -> (d[i] = Long.MAX_VALUE) > 0)
            && new PriorityQueue<long[]>(Comparator.comparingLong(e -> e[0])) instanceof PriorityQueue<long[]> pq
            && ((BiPredicate<Integer, Long>) (v, nd) -> nd < d[v] && (d[v] = nd) >= 0 && pq.add(new long[]{nd, v})) instanceof BiPredicate<Integer, Long> relax
            && relax.test(r1 * K + Arrays.binarySearch(cs, c1), 0L)
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> e[0] == d[(int) e[1]]).allMatch(e -> Integer.valueOf((int) e[1] / K) instanceof Integer r && Integer.valueOf((int) e[1] % K) instanceof Integer j
                && ((j > 0 && relax.test(r * K + j - 1, e[0] + cs[j] - cs[j - 1]))
                    | (j + 1 < K && cs[j + 1] <= a[r] + 1 && relax.test(r * K + j + 1, e[0] + cs[j + 1] - cs[j]))
                    | (r > 0 && relax.test((r - 1) * K + Arrays.binarySearch(cs, Math.min(cs[j], a[r - 1] + 1)), e[0] + 1))
                    | (r + 1 < n && relax.test((r + 1) * K + Arrays.binarySearch(cs, Math.min(cs[j], a[r + 1] + 1)), e[0] + 1)) || true))
            ? d[r2 * K + Arrays.binarySearch(cs, c2)] : ""));
    }
}
