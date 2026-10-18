import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            ? LongStream.iterate(5, p -> p <= n, p -> p * 5).map(p -> n / p).sum()
            : 0);
    }
}
