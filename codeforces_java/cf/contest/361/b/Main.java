import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? k == n ? "-1" : IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(i > n - k ? i : i == 1 ? n - k : i - 1)).collect(Collectors.joining(" ")) : "");
    }
}
