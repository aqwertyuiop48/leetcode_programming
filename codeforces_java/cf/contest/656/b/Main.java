import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] r
            ? String.format(Locale.US, "%.6f", IntStream.range(0, 720720).filter(x -> IntStream.range(0, n).anyMatch(i -> x % m[i] == r[i])).count() / 720720.0)
            : "");
    }
}
