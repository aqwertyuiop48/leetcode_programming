import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(8 * s.nextInt() + 1).ifPresent(v ->
            System.out.println(Math.sqrt(v) % 1 == 0 ? "YES" : "NO")));
    }
}


