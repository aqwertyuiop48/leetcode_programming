import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).useDelimiter("[,\\s]+")).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(LongStream.generate(s::nextLong).limit(n).map(Math::abs).toArray()).ifPresent(a -> System.out.print(IntStream.range(0, n).allMatch(i -> IntStream.range(0, i).allMatch(j -> a[i] % a[j] == 0 || a[j] % a[i] == 0)) ? "FRIENDS" : "NOT FRIENDS"))));
    }
}






