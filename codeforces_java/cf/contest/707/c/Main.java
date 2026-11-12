import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            ? n <= 2 ? "-1" : n % 2 == 1 ? (n * n - 1) / 2 + " " + (n * n + 1) / 2 : (n / 2) * (n / 2) - 1 + " " + ((n / 2) * (n / 2) + 1) : "");
    }
}
