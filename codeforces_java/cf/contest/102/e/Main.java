import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> IntStream.range(0, 6).mapToLong(i -> s.nextLong()).toArray() instanceof long[] v && IntStream.range(0, 4).anyMatch(k -> (Long) (v[2] - new long[] {v[0], v[1], -v[0], -v[1]}[k]) instanceof Long dx && (Long) (v[3] - new long[] {v[1], -v[0], -v[1], v[0]}[k]) instanceof Long dy && (Long) (v[4] * v[4] + v[5] * v[5]) instanceof Long den && (den == 0 ? dx == 0 && dy == 0 : (dx * v[4] + dy * v[5]) % den == 0 && (dx * v[5] - dy * v[4]) % den == 0)) ? "YES" : "NO").ifPresent(System.out::println);
    }
}
