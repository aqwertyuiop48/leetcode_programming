import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(s.nextInt()).toArray()).ifPresent(a -> System.out.print(Arrays.stream(a).filter(x -> (Arrays.stream(a).sum() - x) % 2 == 0).count())));
    }
}
