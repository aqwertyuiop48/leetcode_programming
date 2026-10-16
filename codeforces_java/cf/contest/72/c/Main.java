import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(s.nextInt() % 4 == 2 ? "yes" : "no"));
    }
}



