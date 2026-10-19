import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t
            && Integer.valueOf(t.indexOf('0') >= 0 ? t.indexOf('0') : t.length() - 1) instanceof Integer i
            ? t.substring(0, i) + t.substring(i + 1) : "");
    }
}
