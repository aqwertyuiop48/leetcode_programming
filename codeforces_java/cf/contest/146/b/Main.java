import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(a -> Optional.of(s.next()).ifPresent(b -> System.out.print(IntStream.iterate(a + 1, c -> c + 1).filter(c -> String.valueOf(c).replaceAll("[^47]", "").equals(b)).findFirst().getAsInt()))));
    }
}
