import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer x && s.next() instanceof String o && s.next() instanceof String w
            ? (w.equals("week") ? 52 + (x >= 5 && x <= 6 ? 1 : 0) : x <= 29 ? 12 : x == 30 ? 11 : 7) : "");
    }
}
