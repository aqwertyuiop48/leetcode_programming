import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t
            && Long.valueOf(t.chars().filter(c -> c == 'x').count()) instanceof Long x && Long.valueOf(t.length() - x) instanceof Long y
            ? (x > y ? "x" : "y").repeat((int) Math.abs(x - y)) : "");
    }
}
