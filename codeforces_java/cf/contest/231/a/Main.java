import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).filter(i -> s.nextInt() + s.nextInt() + s.nextInt() >= 2).count() : "");
    }
}
