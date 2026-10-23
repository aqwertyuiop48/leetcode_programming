import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.print(sc.nextLong() % 2 == 0 ? "white\n1 2" : "black"));
    }
}
