import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.print(s.nextInt() == 3 ? "YES\n0 0\n1 0\n0 2\n" : "NO\n")
        );
    }
}



