import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).max().getAsInt()) instanceof Integer r1
            && Integer.valueOf(IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).max().getAsInt()) instanceof Integer p1
            && Integer.valueOf(IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).min().getAsInt()) instanceof Integer p2
            && Double.valueOf(s.nextInt()) instanceof Double A && Double.valueOf(s.nextInt()) instanceof Double B
            ? String.format("%.12f", r1 * Math.sqrt(B * p1 / (A * p2 + B * p1))) : "");
    }
}
