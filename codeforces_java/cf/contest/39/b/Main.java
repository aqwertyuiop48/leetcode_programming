import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[]{1} instanceof int[] cur
            && IntStream.rangeClosed(1, n).filter(i -> a[i - 1] == cur[0] && cur[0]++ > 0).map(i -> 2000 + i).boxed().toList() instanceof List<Integer> l
            ? l.size() + (l.isEmpty() ? "" : "\n" + l.stream().map(String::valueOf).collect(Collectors.joining(" ")))
            : "")));
    }
}

