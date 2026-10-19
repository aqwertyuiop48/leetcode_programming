import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.nextInt() > 0 && sc.next() instanceof String s
            ? IntStream.range(1, s.length()).filter(i -> s.charAt(i) == s.charAt(i - 1)).count() : "");
    }
}
