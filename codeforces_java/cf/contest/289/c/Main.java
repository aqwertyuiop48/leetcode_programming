import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? k > n || k > 26 || (k == 1 && n > 1) ? "-1"
                : IntStream.range(0, n).mapToObj(i -> String.valueOf((char) (k == 1 ? 'a' : i < n - (k - 2) ? 'a' + i % 2 : 'a' + 2 + i - (n - (k - 2))))).collect(Collectors.joining()) : "");
    }
}
