import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
                Optional.of(IntStream.range(0, n).map(i -> s.nextInt()).toArray()).ifPresent(a ->
                    Optional.of(IntStream.range(0, n).boxed().max(Comparator.comparingInt((Integer i) -> a[i]).thenComparing(i -> -i)).get()).ifPresent(imax ->
                        Optional.of(IntStream.range(0, n).boxed().min(Comparator.comparingInt((Integer i) -> a[i]).thenComparing(i -> -i)).get()).ifPresent(imin ->
                            System.out.println(imax + (n - 1 - imin) - (imax > imin ? 1 : 0)))))));
    }
}
