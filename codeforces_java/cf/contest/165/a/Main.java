import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> p
            ? p.stream().filter(a -> p.stream().anyMatch(b -> b[1] == a[1] && b[0] < a[0]) && p.stream().anyMatch(b -> b[1] == a[1] && b[0] > a[0])
                && p.stream().anyMatch(b -> b[0] == a[0] && b[1] < a[1]) && p.stream().anyMatch(b -> b[0] == a[0] && b[1] > a[1])).count()
            : 0);
    }
}
