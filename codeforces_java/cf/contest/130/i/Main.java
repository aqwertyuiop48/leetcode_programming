import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.print(IntStream.generate(s::nextInt).limit(s.nextInt()).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" "))));
    }
}
