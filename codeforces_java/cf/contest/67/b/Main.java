import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(k ->
            Optional.of(IntStream.concat(IntStream.of(0), IntStream.generate(s::nextInt).limit(n)).toArray()).ifPresent(b ->
                System.out.print(IntStream.range(0, n).map(it ->
                    Optional.of(IntStream.rangeClosed(1, n).filter(i -> b[i] == 0).findFirst().getAsInt()).filter(x ->
                        IntStream.rangeClosed(1, x - k).map(j -> b[j]--).sum() > Integer.MIN_VALUE && (b[x] = 1 << 25) > 0).get())
                    .mapToObj(String::valueOf).collect(Collectors.joining(" ")))))));
    }
}


