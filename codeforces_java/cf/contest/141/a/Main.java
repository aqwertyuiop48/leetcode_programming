import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                (s.next() + s.next()).chars().sorted().boxed().toList().equals(s.next().chars().sorted().boxed().toList())
                    ? "YES"
                    : "NO"));
    }
}

