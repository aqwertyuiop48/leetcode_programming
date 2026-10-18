import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Long) s.nextLong() instanceof Long n && (Long) s.nextLong() instanceof Long k && (Integer) s.nextInt() instanceof Integer p && (Long) (n - n % 2) instanceof Long nn && (Long) (k - n % 2) instanceof Long kk && (Long) (nn / 2) instanceof Long h ? IntStream.range(0, p).mapToObj(i -> (Long) s.nextLong() instanceof Long q && k > 0 && (n % 2 == 1 && q.equals(n) || q <= nn && (kk <= h ? q % 2 == 0 && q >= nn - 2 * kk + 2 : q % 2 == 0 || q >= nn - 2 * (kk - h) + 1)) ? "X" : ".").collect(Collectors.joining()) : "").ifPresent(System.out::println);
    }
}
