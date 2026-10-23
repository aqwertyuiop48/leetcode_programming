import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer a
            && (Integer) sc.nextInt() instanceof Integer b
            && (Integer) sc.nextInt() instanceof Integer c
            ? IntStream.of(a + b + c, a * b * c, (a + b) * c, a * (b + c), a * b + c, a + b * c).max().getAsInt() : 0);
    }
}
