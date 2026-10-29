import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k && s.next() instanceof String road
            ? road.contains("#".repeat(k)) ? "NO" : "YES" : "");
    }
}

