import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.rangeClosed(1, s.nextInt()).filter(i -> IntStream.rangeClosed(2, i)
                .filter(p -> i % p == 0 && IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(q -> p % q == 0)).count() == 2).count()));
    }
}

