import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && n >= 2 * k + 1
            ? n * k + IntStream.rangeClosed(1, n).boxed().flatMap(i -> IntStream.rangeClosed(1, k).mapToObj(j -> "\n" + i + " " + ((i + j - 1) % n + 1))).collect(Collectors.joining()) : "-1");
    }
}
