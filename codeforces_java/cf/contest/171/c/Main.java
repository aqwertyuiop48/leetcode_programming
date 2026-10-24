import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.rangeClosed(1, n).mapToLong(i -> (long) i * s.nextInt()).sum()
            : 0);
    }
}
