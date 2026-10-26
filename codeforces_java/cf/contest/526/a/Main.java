import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && sc.next() instanceof String s
            ? IntStream.range(0, n).anyMatch(i -> IntStream.rangeClosed(1, n).anyMatch(d -> i + 4 * d < n && IntStream.range(0, 5).allMatch(j -> s.charAt(i + j * d) == '*'))) ? "yes" : "no" : "");
    }
}
