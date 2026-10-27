import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(a -> Optional.of(s.next()).ifPresent(b -> System.out.print(Math.max(IntStream.range(0, a.length()).filter(i -> a.charAt(i) == '4' && b.charAt(i) == '7').count(), IntStream.range(0, a.length()).filter(i -> a.charAt(i) == '7' && b.charAt(i) == '4').count())))));
    }
}

