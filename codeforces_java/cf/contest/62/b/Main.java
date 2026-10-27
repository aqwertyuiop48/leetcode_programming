import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n -> Optional.of(sc.nextInt()).ifPresent(k ->
            System.out.println(
                sc.next() instanceof String s
                && IntStream.range(0, 26).mapToObj(c -> IntStream.range(0, s.length()).filter(i -> s.charAt(i) - 'a' == c).toArray()).toList() instanceof List<int[]> pos
                ? IntStream.range(0, n).mapToObj(q -> sc.next() instanceof String w
                    ? String.valueOf(IntStream.range(0, w.length()).mapToLong(i -> pos.get(w.charAt(i) - 'a') instanceof int[] p
                        ? (p.length == 0 ? w.length()
                            : Integer.valueOf(Arrays.binarySearch(p, i)) instanceof Integer r
                                ? (r >= 0 ? 0 : Math.min(-r - 1 < p.length ? p[-r - 1] - i : Integer.MAX_VALUE, -r - 2 >= 0 ? i - p[-r - 2] : Integer.MAX_VALUE))
                                : 0)
                        : 0).sum())
                    : "").collect(Collectors.joining("\n"))
                : ""))));
    }
}





