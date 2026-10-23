import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.print(Optional.of(s.nextInt()).map(n -> n + (n - 1) / (s.nextInt() - 1)).get()));
    }
}
