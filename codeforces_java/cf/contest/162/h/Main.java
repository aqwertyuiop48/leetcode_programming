import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && s.nextLine() instanceof String t
            ? IntStream.range(0, t.length()).mapToObj(i -> String.valueOf(i % 2 == 0 ? Character.toUpperCase(t.charAt(i)) : Character.toLowerCase(t.charAt(i)))).collect(Collectors.joining())
            : "");
    }
}

