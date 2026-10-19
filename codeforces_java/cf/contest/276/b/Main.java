import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t
            && Long.valueOf(t.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())).values().stream().filter(c -> c % 2 == 1).count()) instanceof Long odd
            ? odd == 0 || odd % 2 == 1 ? "First" : "Second" : "");
    }
}
