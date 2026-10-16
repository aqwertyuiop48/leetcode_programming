import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).toArray()).ifPresent(a ->
            System.out.println(
                new int[Arrays.stream(a).max().getAsInt() + 2] instanceof int[] c
                && Arrays.stream(a).allMatch(x -> ++c[x] > 0)
                && IntStream.rangeClosed(1, c.length - 2).allMatch(v -> c[v] >= c[v + 1] && c[v] > 0)
                ? c[1] + "\n" + IntStream.range(0, a.length).mapToObj(i -> String.valueOf(IntStream.range(0, i).filter(j -> a[j] == a[i]).count() + 1)).collect(Collectors.joining(" "))
                : "-1")));
    }
}




