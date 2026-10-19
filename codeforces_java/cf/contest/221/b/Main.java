import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer x
            ? IntStream.rangeClosed(1, x).filter(d -> x % d == 0 && String.valueOf(d).chars().anyMatch(c -> String.valueOf(x).indexOf(c) >= 0)).count() : "");
    }
}
