import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && s.next() instanceof String b
            && Long.valueOf(a.chars().filter(c -> c == '1').count()) instanceof Long ca && Long.valueOf(b.chars().filter(c -> c == '1').count()) instanceof Long cb
            ? cb <= ca + ca % 2 ? "YES" : "NO" : "");
    }
}
