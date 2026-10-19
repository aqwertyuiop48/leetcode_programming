import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? n <= 2 ? "-1" : IntStream.iterate(n, i -> i >= 1, i -> i - 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
