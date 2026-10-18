import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? n - IntStream.generate(s::nextInt).limit(n).filter(v -> v <= n).distinct().count()
            : -1);
    }
}
