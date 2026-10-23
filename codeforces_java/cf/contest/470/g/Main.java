import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(a -> Optional.of(s.next()).ifPresent(b -> System.out.print(IntStream.range(0, Math.min(a.length(), b.length())).filter(i -> a.charAt(i) != b.charAt(i)).count()))));
    }
}
