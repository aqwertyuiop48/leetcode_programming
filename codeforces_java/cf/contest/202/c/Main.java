import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer x
            ? x == 3 ? 5 : IntStream.iterate(1, n -> n + 2).filter(n -> (n * n + 1) / 2 >= x).findFirst().getAsInt() : "");
    }
}
