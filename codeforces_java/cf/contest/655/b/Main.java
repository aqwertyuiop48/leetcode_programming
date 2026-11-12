import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long n && Long.valueOf(Math.min(sc.nextLong(), n / 2)) instanceof Long k
            ? k * (2 * n + 1) - 2 * k * (k + 1) : "");
    }
}
