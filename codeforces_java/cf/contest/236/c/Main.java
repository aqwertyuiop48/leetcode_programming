import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            ? n <= 2 ? n : n % 2 == 1 ? n * (n - 1) * (n - 2) : n % 3 != 0 ? n * (n - 1) * (n - 3) : (n - 1) * (n - 2) * (n - 3) : "");
    }
}
