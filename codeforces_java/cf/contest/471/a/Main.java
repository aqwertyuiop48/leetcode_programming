import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(6).sorted().toArray()).ifPresent(a -> System.out.print(!(a[0] == a[3] || a[1] == a[4] || a[2] == a[5]) ? "Alien" : (a[0] == a[3] ? a[4] == a[5] : a[1] == a[4] ? a[0] == a[5] : a[0] == a[1]) ? "Elephant" : "Bear")));
    }
}
