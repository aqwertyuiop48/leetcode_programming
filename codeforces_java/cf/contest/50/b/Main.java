import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(t ->
            System.out.println(t.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().mapToLong(c -> c * c).sum())));
    }
}
