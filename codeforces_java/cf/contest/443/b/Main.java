import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && (Integer) sc.nextInt() instanceof Integer k && (Integer) (s.length() + k) instanceof Integer L
            ? 2 * IntStream.rangeClosed(1, L / 2).map(l -> L / 2 + 1 - l).filter(l -> IntStream.rangeClosed(0, L - 2 * l).anyMatch(i -> IntStream.range(i, i + l).allMatch(j -> j + l >= s.length() || s.charAt(j) == s.charAt(j + l)))).findFirst().orElse(0) : 0);
    }
}
