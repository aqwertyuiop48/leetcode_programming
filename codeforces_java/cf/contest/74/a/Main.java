import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                IntStream.range(0, s.nextInt())
                    .mapToObj(i -> new Object[]{s.next(), s.nextInt() * 100 - s.nextInt() * 50 + IntStream.range(0, 5).map(j -> s.nextInt()).sum()})
                    .max(Comparator.comparingInt(o -> (Integer) o[1]))
                    .get()[0]));
    }
}
