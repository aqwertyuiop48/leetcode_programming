import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(n - IntStream.generate(s::nextInt).limit(n).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().max(Long::compare).get())));
    }
}
