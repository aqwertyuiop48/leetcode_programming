import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).mapToLong(i -> s.nextLong()).sum() % n == 0 ? n : n - 1 : "");
    }
}
