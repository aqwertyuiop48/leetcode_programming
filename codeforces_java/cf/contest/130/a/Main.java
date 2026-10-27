import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLong()).ifPresent(n -> System.out.print(n * (2 * n - 1)));
    }
}

