import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(3).toArray() instanceof int[] p
            ? IntStream.rangeClosed(0, n / p[0]).flatMap(x -> IntStream.rangeClosed(0, (n - x * p[0]) / p[1]).filter(y -> (n - x * p[0] - y * p[1]) % p[2] == 0).map(y -> x + y + (n - x * p[0] - y * p[1]) / p[2])).max().getAsInt()
            : 0);
    }
}
