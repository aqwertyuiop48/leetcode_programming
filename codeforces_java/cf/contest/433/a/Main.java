import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] w
            && (Long) IntStream.of(w).filter(x -> x == 100).count() instanceof Long a && (Long) IntStream.of(w).filter(x -> x == 200).count() instanceof Long b
            && a % 2 == 0 && (a > 0 || b % 2 == 0) ? "YES" : "NO");
    }
}
