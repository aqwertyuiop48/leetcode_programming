import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.next()).ifPresent(p -> Optional.of(sc.nextInt()).ifPresent(n ->
            System.out.println(Stream.generate(sc::next).limit(n).filter(w -> w.startsWith(p)).min(Comparator.naturalOrder()).orElse(p)))));
    }
}



