import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long k
            ? (k <= (n + 1) / 2 ? 2 * k - 1 : 2 * (k - (n + 1) / 2)) : "");
    }
}
