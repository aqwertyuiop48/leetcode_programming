import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n
            ? Stream.iterate(3L, p -> p * 3).filter(p -> n % p != 0).findFirst().get() instanceof Long p ? n / p + 1 : "" : "");
    }
}
