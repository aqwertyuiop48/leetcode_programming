import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            ? LongStream.rangeClosed(1, n - 1).reduce(1L, (c, i) -> c * (n - 1 + i) / i) : 0);
    }
}
