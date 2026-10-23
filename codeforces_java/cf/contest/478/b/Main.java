import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Long) sc.nextLong() instanceof Long n
            && (Long) sc.nextLong() instanceof Long m
            && (Long) (n / m) instanceof Long q
            && (Long) (n % m) instanceof Long r
            ? (r * (q + 1) * q / 2 + (m - r) * q * (q - 1) / 2) + " " + (n - m + 1) * (n - m) / 2 : "");
    }
}
