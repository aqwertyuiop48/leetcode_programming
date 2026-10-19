import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            ? t.chars().boxed().reduce(0, (p, c) -> p + (s.charAt(p) == c ? 1 : 0), Integer::sum) + 1 : "");
    }
}
