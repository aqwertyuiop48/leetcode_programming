import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(Stream.of(s.next(), s.next(), s.next()).toList()).ifPresent(c ->
            System.out.println(Stream.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA")
                .filter(p -> c.stream().allMatch(t -> (t.charAt(1) == '>') == (p.indexOf(t.charAt(0)) > p.indexOf(t.charAt(2)))))
                .findFirst().orElse("Impossible"))));
    }
}




