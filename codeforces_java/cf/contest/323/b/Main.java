import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            ? n == 4 ? "-1" : IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> i == j ? "0"
                : n % 2 == 1 ? (Integer.valueOf((j - i + n) % n) instanceof Integer d && d <= (n - 1) / 2 ? "1" : "0")
                : i == n - 1 ? (j % 2 == 0 ? "1" : "0")
                : j == n - 1 ? (i % 2 == 0 ? "0" : "1")
                : (Integer.valueOf((j - i + n - 1) % (n - 1)) instanceof Integer d && d <= (n - 2) / 2 ? "1" : "0")).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
