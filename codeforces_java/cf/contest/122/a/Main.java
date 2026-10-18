import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            (Integer) new Scanner(System.in).nextInt() instanceof Integer n
            && IntStream.rangeClosed(1, n).anyMatch(d -> n % d == 0 && String.valueOf(d).chars().allMatch(c -> c == '4' || c == '7'))
            ? "YES" : "NO");
    }
}
