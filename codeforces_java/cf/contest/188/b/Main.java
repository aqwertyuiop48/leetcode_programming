import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long a
            && Long.valueOf(new StringBuilder(sc.next()).reverse().toString()) instanceof Long b
            ? a + b : 0L);
    }
}

