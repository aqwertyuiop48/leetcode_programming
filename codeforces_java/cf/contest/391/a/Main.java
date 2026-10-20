import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            ? Pattern.compile("(.)\\1*").matcher(sc.next()).results().filter(r -> r.group().length() % 2 == 0).count() : "");
    }
}
