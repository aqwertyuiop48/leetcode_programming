import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(Optional.of(new Scanner(System.in).nextLong()).map(n -> 3 * n * (n + 1) + 1).get());
    }
}
