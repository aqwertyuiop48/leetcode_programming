import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.next()).ifPresent(t ->
            System.out.println(IntStream.of(0, 1).map(p -> (int) IntStream.range(0, n).filter(i -> t.charAt(i) - '0' != (i + p) % 2).count()).min().getAsInt()))));
    }
}


