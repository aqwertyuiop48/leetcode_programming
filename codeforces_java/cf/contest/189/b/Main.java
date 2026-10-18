import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer w
            && Integer.valueOf(s.nextInt()) instanceof Integer h
            ? IntStream.range(1, w).mapToLong(x -> Math.min(x, w - x)).sum() * IntStream.range(1, h).mapToLong(y -> Math.min(y, h - y)).sum()
            : 0);
    }
}
