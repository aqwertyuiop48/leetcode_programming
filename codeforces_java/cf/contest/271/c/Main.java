import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? n < 3 * k ? "-1" : IntStream.rangeClosed(1, n).map(i -> i <= 2 * k ? (i + 1) / 2 : i <= 3 * k ? i - 2 * k : 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
