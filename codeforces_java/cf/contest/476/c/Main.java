import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Long) sc.nextLong() instanceof Long a
            && (Long) sc.nextLong() instanceof Long b
            ? (b * (b - 1) / 2 % 1000000007L) * ((b * (a * (a + 1) / 2 % 1000000007L) + a) % 1000000007L) % 1000000007L
            : 0);
    }
}
