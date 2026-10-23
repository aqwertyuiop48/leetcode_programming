import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && s.next() instanceof String b
            && b.chars().distinct().allMatch(c -> a.indexOf(c) >= 0)
            ? b.chars().distinct().mapToLong(c -> Math.min(a.chars().filter(x -> x == c).count(), b.chars().filter(x -> x == c).count())).sum() : -1);
    }
}
