import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> s.next() instanceof String t ? t.length() == 1 ? 0L : 1 + Stream.iterate(t.chars().map(c -> c - 48).sum(), x -> x >= 10, x -> String.valueOf(x).chars().map(c -> c - 48).sum()).count() : -1L).ifPresent(System.out::println);
    }
}

