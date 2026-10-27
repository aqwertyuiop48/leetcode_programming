import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer x
            ? IntStream.range(0, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
                && a != x && a != 7 - x && b != x && b != 7 - x && a != b && a + b != 7) ? "YES" : "NO" : "");
    }
}

