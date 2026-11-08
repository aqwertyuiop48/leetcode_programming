import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long n && Long.valueOf(sc.nextLong()) instanceof Long b && Long.valueOf(sc.nextLong()) instanceof Long p
            ? (n - 1) * (2 * b + 1) + " " + n * p : "");
    }
}
