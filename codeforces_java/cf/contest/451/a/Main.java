import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(Math.min(sc.nextInt(), sc.nextInt()) % 2 == 1 ? "Akshat" : "Malvika"));
    }
}
