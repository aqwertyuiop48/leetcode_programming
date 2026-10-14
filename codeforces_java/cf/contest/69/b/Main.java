import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(m ->
            Optional.of(IntStream.range(0, m).mapToObj(i -> IntStream.generate(s::nextInt).limit(4).toArray()).toArray(int[][]::new)).ifPresent(a ->
                System.out.print(IntStream.rangeClosed(1, n).map(x -> Arrays.stream(a).filter(t -> t[0] <= x && x <= t[1]).min(Comparator.comparingInt((int[] t) -> t[2])).map(t -> t[3]).orElse(0)).sum())))));
    }
}
