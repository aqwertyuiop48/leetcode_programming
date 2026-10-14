import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(w ->
            System.out.println(w % 2 == 0 && w > 2 ? "YES" : "NO")));
    }
}
