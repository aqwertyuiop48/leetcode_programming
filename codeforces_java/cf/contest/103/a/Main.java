import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n ? IntStream.rangeClosed(1, n).mapToLong(i -> (s.nextLong() - 1) * i + 1).sum() : -1L).ifPresent(System.out::println);
    }
}
