import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(((Integer) new Scanner(System.in).nextInt() instanceof Integer n
            && IntStream.rangeClosed(0, n / 1234567).anyMatch(a -> IntStream.rangeClosed(0, (n - a * 1234567) / 123456).anyMatch(b -> (n - a * 1234567 - b * 123456) % 1234 == 0))) ? "YES" : "NO");
    }
}
