import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new String[]{sc.next(), sc.next(), sc.next()}).ifPresent(arr ->
            System.out.println(
                ((Predicate<String>) s -> s.indexOf(arr[1]) >= 0 && s.indexOf(arr[2], s.indexOf(arr[1]) + arr[1].length()) >= 0) instanceof Predicate<String> can
                ? (can.test(arr[0]) && can.test(new StringBuilder(arr[0]).reverse().toString())) ? "both"
                    : can.test(arr[0]) ? "forward"
                    : can.test(new StringBuilder(arr[0]).reverse().toString()) ? "backward"
                    : "fantasy"
                : "")));
    }
}





