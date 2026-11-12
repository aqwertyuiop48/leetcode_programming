import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && Long.valueOf(s.nextLong()) instanceof Long a
            && Long.valueOf(s.nextLong()) instanceof Long b
            ? Math.floorMod(a - 1 + b, n) + 1
            : "");
    }
}
