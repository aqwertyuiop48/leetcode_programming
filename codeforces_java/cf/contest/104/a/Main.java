import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) (s.nextInt() - 10) instanceof Integer d ? d < 2 || d > 11 ? 0 : d == 10 ? 15 : 4 : -1).ifPresent(System.out::println);
    }
}
