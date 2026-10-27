import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a
            && Integer.valueOf(s.nextInt()) instanceof Integer b
            && Integer.valueOf(s.nextInt()) instanceof Integer r
            ? 2 * r <= Math.min(a, b) ? "First" : "Second" : "");
    }
}

