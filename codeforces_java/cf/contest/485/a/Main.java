import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer a
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.iterate(a % m, r -> r * 2 % m).limit(40).anyMatch(r -> r == 0)
            ? "Yes"
            : "No");
    }
}
