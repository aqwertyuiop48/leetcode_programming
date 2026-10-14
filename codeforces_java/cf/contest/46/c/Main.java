import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.next()).ifPresent(str ->
                System.out.println(Math.min(
                    (int) IntStream.range(0, n).filter(i -> str.charAt(i) != (i % 2 == 0 ? 'H' : 'T')).count(),
                    (int) IntStream.range(0, n).filter(i -> str.charAt(i) != (i % 2 == 0 ? 'T' : 'H')).count())))));
    }
}
