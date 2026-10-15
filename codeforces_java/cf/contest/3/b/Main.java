import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nv ->
            System.out.println(
                IntStream.range(0, nv[0]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i + 1}).collect(Collectors.toList()) instanceof List<int[]> items
                && items.stream().filter(it -> it[0] == 1).sorted(Comparator.comparingInt((int[] it) -> -it[1])).collect(Collectors.toList()) instanceof List<int[]> l1
                && items.stream().filter(it -> it[0] == 2).sorted(Comparator.comparingInt((int[] it) -> -it[1])).collect(Collectors.toList()) instanceof List<int[]> l2
                && new long[l1.size() + 1] instanceof long[] pre1
                && new long[l2.size() + 1] instanceof long[] pre2
                && IntStream.range(0, l1.size()).allMatch(i -> (pre1[i + 1] = pre1[i] + l1.get(i)[1]) >= 0)
                && IntStream.range(0, l2.size()).allMatch(i -> (pre2[i + 1] = pre2[i] + l2.get(i)[1]) >= 0)
                && IntStream.rangeClosed(0, Math.min(l2.size(), nv[1] / 2)).boxed()
                    .max(Comparator.comparingLong(j -> pre2[j] + pre1[Math.min(l1.size(), nv[1] - 2 * j)])).get() instanceof Integer bestJ
                && new int[]{Math.min(l1.size(), nv[1] - 2 * bestJ)} instanceof int[] k1
                ? (pre2[bestJ] + pre1[k1[0]]) + "\n" + Stream.concat(
                        l2.subList(0, bestJ).stream().map(it -> it[2]),
                        l1.subList(0, k1[0]).stream().map(it -> it[2]))
                    .map(String::valueOf).collect(Collectors.joining(" "))
                : "")));
    }
}



