import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String w && s.next() instanceof String r && Integer.valueOf(w.indexOf('|')) instanceof Integer p
            && Integer.valueOf(w.length() - 1 + r.length()) instanceof Integer total && total % 2 == 0 && total / 2 >= Math.max(p, w.length() - 1 - p)
            ? w.substring(0, p) + r.substring(0, total / 2 - p) + "|" + w.substring(p + 1) + r.substring(total / 2 - p) : "Impossible");
    }
}
