import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer d && Integer.valueOf(sc.nextInt()) instanceof Integer h
            ? d > 2 * h || n < d + 1 || d == 1 && n > 2 ? "-1"
                : IntStream.rangeClosed(2, n).mapToObj(i -> (i <= h + 1 ? i - 1 : i <= d + 1 ? (i == h + 2 ? 1 : i - 1) : d.equals(h) ? 2 : 1) + " " + i)
                    .collect(Collectors.joining("\n"))
            : "");
    }
}
