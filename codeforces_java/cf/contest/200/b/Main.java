import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? String.format("%.12f", IntStream.range(0, n).mapToDouble(i -> s.nextInt()).sum() / n) : "");
    }
}
