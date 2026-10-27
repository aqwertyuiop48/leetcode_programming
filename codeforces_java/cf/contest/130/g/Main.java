import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine()).ifPresent(s -> System.out.print(s.toUpperCase()));
    }
}

