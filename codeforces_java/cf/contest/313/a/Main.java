import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            ? Math.max(n, Math.max(n / 10, n / 100 * 10 + n % 10)) : "");
    }
}
