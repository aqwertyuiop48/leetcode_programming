import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Long) sc.nextLong() instanceof Long n && (Long) sc.nextLong() instanceof Long m && (Long) sc.nextLong() instanceof Long k
            ? ((k - 1) / (2 * m) + 1) + " " + (((k - 1) % (2 * m)) / 2 + 1) + " " + (k % 2 == 1 ? "L" : "R") : "");
    }
}
