import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            && !t.chars().distinct().anyMatch(c -> s.chars().filter(x -> x == c).count() < t.chars().filter(x -> x == c).count())
            ? new int[]{0} instanceof int[] p && s.chars().filter(c -> p[0] < t.length() && c == t.charAt(p[0]) && ++p[0] > 0).count() >= 0 && p[0] == t.length() ? "automaton" : s.length() == t.length() ? "array" : "both" : "need tree");
    }
}
