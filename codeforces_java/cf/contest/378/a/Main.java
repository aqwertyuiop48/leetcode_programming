import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
            ? IntStream.rangeClosed(1, 6).filter(y -> Math.abs(a - y) < Math.abs(b - y)).count() + " "
                + IntStream.rangeClosed(1, 6).filter(y -> Math.abs(a - y) == Math.abs(b - y)).count() + " "
                + IntStream.rangeClosed(1, 6).filter(y -> Math.abs(a - y) > Math.abs(b - y)).count() : "");
    }
}
