import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long a
            && s.next() instanceof String b
            ? a + Long.parseLong(new StringBuilder(b).reverse().toString())
            : 0);
    }
}

