import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer d
            && Integer.valueOf(s.nextInt()) instanceof Integer h
            ? (d > 2 * h || (d == 1 && n > 2) ? "-1"
                : IntStream.rangeClosed(2, n).mapToObj(i -> (i <= h + 1 ? i - 1 : i <= d + 1 ? (i == h + 2 ? 1 : i - 1) : d - h == 0 ? 2 : 1) + " " + i).collect(Collectors.joining("\n")))
            : "");
    }
}
