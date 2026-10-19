import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && s.next() instanceof String b
            && a.length() == b.length() && a.contains("1") == b.contains("1") ? "YES" : "NO");
    }
}
