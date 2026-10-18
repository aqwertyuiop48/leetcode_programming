import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (int) Math.signum(s.next().compareToIgnoreCase(s.next()))).ifPresent(System.out::println);
    }
}
