import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String a
            && sc.next() instanceof String b
            && IntStream.range(0, Math.min(a.length(), b.length())).filter(i -> a.charAt(i) != b.charAt(i)).toArray() instanceof int[] d
            ? a.length() == b.length() && (d.length == 2 && a.charAt(d[0]) == b.charAt(d[1]) && a.charAt(d[1]) == b.charAt(d[0])
                || d.length == 0 && a.chars().distinct().count() < a.length()) ? "YES" : "NO"
            : "");
    }
}
