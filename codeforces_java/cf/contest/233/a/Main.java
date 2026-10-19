import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? n % 2 == 1 ? "-1" : IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(i % 2 == 1 ? i + 1 : i - 1)).collect(Collectors.joining(" ")) : "");
    }
}
