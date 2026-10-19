import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && s.next() instanceof String c
            && Long.valueOf(c.chars().filter(x -> x == 'I').count()) instanceof Long i
            ? i == 0 ? c.chars().filter(x -> x == 'A').count() : i == 1 ? 1 : 0 : "");
    }
}
