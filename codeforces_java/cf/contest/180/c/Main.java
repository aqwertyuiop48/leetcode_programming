import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && s.next() instanceof String t
            ? IntStream.rangeClosed(0, t.length()).map(p -> (int) (t.substring(0, p).chars().filter(Character::isLowerCase).count() + t.substring(p).chars().filter(Character::isUpperCase).count())).min().getAsInt()
            : 0);
    }
}
